package csd214.lab4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * A frame that shows the growth of an investment with variable interest.
 */
public class CarLotFrame extends JFrame {

//    private static final int FRAME_WIDTH = 450;
//    private static final int FRAME_HEIGHT = 100;
    private JScrollPane scrollPane;
    private JButton button;
    private final CarDialog carDialog;
    private List<Car> carList;
    private String[] columnNames = {"Make", "Model", "Year"};
    private JTable table;
    private DefaultTableModel model;

    public CarLotFrame() {
        createTable();
        createButton();
        carDialog = new CarDialog(this, true);
        // use an adaptor its less verbose
        carDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent arg0) {
                // Handle setVisble(true)
                System.out.println("Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent arg0) {
                // Handle setVisble(false)
                System.out.println("Deactivated");
                // get the car data from dialog
                System.out.println(carDialog.getMake());
                System.out.println(carDialog.getModel());
                System.out.println(carDialog.getYear());
                carList.add(new Car(carDialog.getMake(), carDialog.getModel(), carDialog.getYear()));

                Object[][] data = new Object[carList.size()][3];

                for (int i = 0; i < carList.size(); i++) {
                    Car car = carList.get(i);
                    data[i][0] = car.getMake();
                    data[i][1] = car.getModel();
                    data[i][2] = car.getYear();
                }
                model.setDataVector(data, columnNames);
                
                // display the new table data
                model.fireTableDataChanged();
            }
        });
        // if you use a listener you have to handle all events
        carDialog.addWindowListener(new WindowListener() {

            @Override
            public void windowActivated(WindowEvent arg0) {
                // Do nothing
                System.out.println("1");
            }

            @Override
            public void windowClosed(WindowEvent arg0) {
//                    closed = true;
//                    if(buttonClicked) {
//                    //They cliked the button to close it.
//                    } else {
//                    // They didn't click the button, they clicked exit in the top right corner of screen.
//                    }
                System.out.println("2");
            }

            @Override
            public void windowClosing(WindowEvent arg0) {
                // Do nothing
                System.out.println("3");
            }

            @Override
            public void windowDeactivated(WindowEvent arg0) {
                // Do nothing
                System.out.println("4");

            }

            @Override
            public void windowDeiconified(WindowEvent arg0) {
                // Do nothing
                System.out.println("5");
            }

            @Override
            public void windowIconified(WindowEvent arg0) {
                // Do nothing
                System.out.println("6");
            }

            @Override
            public void windowOpened(WindowEvent arg0) {
                // Do nothing
                System.out.println("7");
            }

        });

        add(button, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
//        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        pack();

    }

    private void createButton() {
        button = new JButton("Add Car");

        ActionListener listener = new AddCarListener();
        button.addActionListener(listener);
    }

    /**
     * Adds interest to the balance and updates the display.
     */
    class AddCarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            carDialog.setVisible(true);
        }
    }

    private void createTable() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2019));

//        String[] columnNames = {"Make", "Model", "Year"};
        Object[][] data = new Object[carList.size()][3];

        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            data[i][0] = car.getMake();
            data[i][1] = car.getModel();
            data[i][2] = car.getYear();
        }

        model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 2) {
                    return Integer.class;
                }
                return String.class;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return true; // Make all cells editable
            }
        };
        // listen for changes to the table (edits)
        // see https://docs.oracle.com/javase/tutorial/uiswing/events/tablemodellistener.html
        model.addTableModelListener(new TableModelListener(){
            @Override
            public void tableChanged(TableModelEvent e) {
                Object obj = e.getSource();
                System.out.println("class: "+obj.getClass());
                int fr=e.getFirstRow();
                int lr=e.getFirstRow();
                int c=e.getColumn();

                switch(e.getType()){
                    case TableModelEvent.INSERT:
                        // insert row or column
                        break;
                    case TableModelEvent.DELETE:
                        // remove row or column
                        break;
                    case TableModelEvent.UPDATE:
                        // Identifies a change to existing data
                        
                        break;
                }
                
            }
        });
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
    }
}
