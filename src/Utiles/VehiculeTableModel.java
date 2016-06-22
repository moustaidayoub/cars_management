/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import JavaBeans.Vehicule;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Moustaid
 */
public class VehiculeTableModel extends AbstractTableModel {

    private String[] columns = new String[]{"Matricule", "Categorie", "Marque", "Kilométrage", "Lieu", "Division", "Couleur", "Date Ajout"};
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
    public void loadData(List<Vehicule> lv) {
        rows = new Vector<String[]>();
        for (Vehicule v : lv) {
            rows.add(new String[]{v.getMatricule(), v.getCategorie().getNomCategorie(), v.getMarque().getNomMarque(), String.valueOf(v.getKilometrage()),
                v.getLieu().getNomLieu(), v.getLieu().getDivision().getNomDivision(), v.getCouleur(), String.valueOf(v.getDateAjout())}
            );
        } 
        fireTableChanged(null);

    }
}
