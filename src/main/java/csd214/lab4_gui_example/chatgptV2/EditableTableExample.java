/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab4_gui_example.chatgptV2;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

abstract class Publication {
    private String title;
    private double price;
    private int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    // Abstract method for initializing a Publication
    public abstract void initialize(String title, double price, int copies);

    // Abstract method for editing a Publication
    public abstract void edit(String title, double price, int copies);
}

class Book extends Publication {
    public Book(String title, double price, int copies) {
        super(title, price, copies);
    }

    @Override
    public void initialize(String title, double price, int copies) {
        setTitle(title);
        setPrice(price);
        setCopies(copies);
    }

    @Override
    public void edit(String title, double price, int copies) {
        setTitle(title);
        setPrice(price);
        setCopies(copies);
    }
}

public class EditableTableExample {
    public static void main(String[] args) {
        List<Publication> publicationList = new ArrayList<>();
        publicationList.add(new Book("Java Programming", 29.99, 100));
        publicationList.add(new Book("Design Patterns", 39.99, 50));

        PublicationTableModel model = new PublicationTableModel(publicationList);

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JButton deleteButton = new JButton("Delete Selected Row");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                }
            }
        });

        JFrame frame = new JFrame("Editable Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(deleteButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}

class PublicationTableModel extends AbstractTableModel {
    private List<Publication> publicationList;
    private String[] columnNames = {"Title", "Price", "Copies", "Delete"};

    public PublicationTableModel(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

    @Override
    public int getRowCount() {
        return publicationList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Publication publication = publicationList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return publication.getTitle();
            case 1:
                return publication.getPrice();
            case 2:
                return publication.getCopies();
            case 3:
                return "Delete";
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Publication publication = publicationList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                publication.setTitle((String) value);
                break;
            case 1:
                publication.setPrice((Double) value);
                break;
            case 2:
                publication.setCopies((Integer) value);
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1) return Double.class;
        if (columnIndex == 2) return Integer.class;
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 3; // Allow editing for all columns except the "Delete" column
    }

    public void removeRow(int rowIndex) {
        publicationList.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
