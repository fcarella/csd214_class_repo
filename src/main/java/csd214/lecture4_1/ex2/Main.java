/* 
https://www.logicbig.com/tutorials/java-swing/jtable-as-editable-list.html
*/

package csd214.lecture4_1.ex2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Fred
 */
public class Main {

    public static void main(String[] args) {
        TableAsEditableList table = new TableAsEditableList();
        JLabel listDisplayLabel = new JLabel();
        initDisplayLabel(table, listDisplayLabel);
        JFrame frame = createFrame();
        frame.add(new JScrollPane(table));
        frame.add(listDisplayLabel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void initDisplayLabel(TableAsEditableList table, JLabel displayLabel) {
        table.getModel().addTableModelListener((event) -> {
            List<String> list = table.getDataAsStringList();
            displayLabel.setText("List: " + list);
        });
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("JTable As Editable List Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 400));
        return frame;
    }
}

