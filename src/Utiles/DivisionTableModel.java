package Utiles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import JavaBeans.Categorie;
import JavaBeans.Division;
import JavaBeans.Vehicule;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Moustaid
 */
public class DivisionTableModel extends AbstractTableModel {

    private String[] columns = new String[]{"Numero", "Nom Division"};
    private Vector<String[]> rows = new Vector();

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex];
    }
    @Override
 public String getColumnName(int col){
    return this.columns[col];
  }
    public void loadData(List<Division> ld) {
        rows = new Vector<String[]>();
        for (Division d : ld) {
            rows.add(new String[]{String.valueOf(d.getIdDivision()), d.getNomDivision()});   
        } 
        fireTableChanged(null);

    }
}
