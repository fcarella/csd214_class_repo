package csd214.intellij_gui_designer_example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiApp {
    private JButton addButton;
    private JPanel panel1;

    public GuiApp() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiApp");
        frame.setContentPane(new GuiApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
