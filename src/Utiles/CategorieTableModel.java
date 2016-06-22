package Utiles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import JavaBeans.Categorie;
import JavaBeans.Vehicule;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Moustaid
 */
public class CategorieTableModel extends AbstractTableModel {

    private String[] columns = new String[]{"Numero", "Nom Catégorie"};
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
    public void loadData(List<Categorie> lc) {
        rows = new Vector<String[]>();
        for (Categorie c : lc) {
            rows.add(new String[]{String.valueOf(c.getIdCategorie()), c.getNomCategorie()});   
        } 
        fireTableChanged(null);

    }
}
