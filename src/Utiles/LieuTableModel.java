package Utiles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import JavaBeans.Categorie;
import JavaBeans.Lieu;
import JavaBeans.Vehicule;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Moustaid
 */
public class LieuTableModel extends AbstractTableModel {

    private String[] columns = new String[]{"Numero", "Nom Lieu","Ville","Nom Division"};
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
    public void loadData(List<Lieu> ll) {
        rows = new Vector<String[]>();
        for (Lieu l : ll) {
            rows.add(new String[]{String.valueOf(l.getIdLieu()),
                                    l.getNomLieu(),
                                    l.getVille(),
                                    l.getDivision().getNomDivision()});   
        } 
        fireTableChanged(null);

    }
}
