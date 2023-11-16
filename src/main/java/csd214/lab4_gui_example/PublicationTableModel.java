/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab4_gui_example;

import java.util.List;
import javax.swing.table.AbstractTableModel;

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