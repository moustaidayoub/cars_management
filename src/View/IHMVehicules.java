/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.SingletonConnexion;
import DAO.VehiculeDAO;
import JavaBeans.Vehicule;
import Utiles.DateGetter;
import Utiles.VehiculeTableModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Moustaid
 */
public class IHMVehicules extends javax.swing.JFrame {
private DateGetter dateGetter=new DateGetter();
private VehiculeTableModel vehiculeTableModel=new VehiculeTableModel();
private VehiculeDAO vDAO=new VehiculeDAO(SingletonConnexion.getInstance());
private JTable tableVehicules;
private JScrollPane jsp=new JScrollPane();
private List<Vehicule> lv=new ArrayList();
    /**
     * Creates new form Accueil
     */
    public IHMVehicules() {
        initComponents();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        panelCenter = new javax.swing.JPanel();
        labName = new javax.swing.JLabel();
        labDate = new javax.swing.JLabel();
        panelRecherche = new javax.swing.JPanel();
        labRechercherPar = new javax.swing.JLabel();
        comboRecherche = new javax.swing.JComboBox();
        txtRecherche = new javax.swing.JTextField();
        panelBtn = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnAccueil = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        labBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Véhicules OCP - Véhicules");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        containerPanel.setBackground(new java.awt.Color(255, 102, 102));
        containerPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        containerPanel.setLayout(new java.awt.BorderLayout());

        panelCenter.setBackground(new java.awt.Color(255, 255, 0));
        panelCenter.setOpaque(false);
        panelCenter.setPreferredSize(new java.awt.Dimension(800, 500));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labName.setForeground(new java.awt.Color(53, 83, 65));
        labName.setPreferredSize(new java.awt.Dimension(34, 20));
        panelCenter.add(labName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 25, 280, 33));

        labDate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labDate.setForeground(new java.awt.Color(53, 83, 65));
        labDate.setPreferredSize(new java.awt.Dimension(220, 33));
        panelCenter.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 25, -1, -1));

        panelRecherche.setOpaque(false);

        labRechercherPar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labRechercherPar.setText("Rechercher une véhicule par : ");
        panelRecherche.add(labRechercherPar);

        comboRecherche.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MATRICULE", "CATEGORIE", "MARQUE", "KILOMETRAGE", "LIEU", "COULEUR", "DATEAJOUT" }));
        comboRecherche.setOpaque(false);
        comboRecherche.setPreferredSize(new java.awt.Dimension(150, 30));
        comboRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRechercheActionPerformed(evt);
            }
        });
        panelRecherche.add(comboRecherche);

        txtRecherche.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRecherche.setText("Entrez valeur ...");
        txtRecherche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 83, 65)));
        txtRecherche.setPreferredSize(new java.awt.Dimension(170, 30));
        txtRecherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRechercheFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRechercheFocusLost(evt);
            }
        });
        txtRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRechercheKeyTyped(evt);
            }
        });
        panelRecherche.add(txtRecherche);

        panelCenter.add(panelRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 100, 560, 50));

        panelBtn.setOpaque(false);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnAdd.png"))); // NOI18N
        btnAdd.setToolTipText("Ajouter");
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setFocusPainted(false);
        btnAdd.setPreferredSize(new java.awt.Dimension(106, 102));
        btnAdd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelBtn.add(btnAdd);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdate.png"))); // NOI18N
        btnUpdate.setToolTipText("Modifier");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setPreferredSize(new java.awt.Dimension(106, 102));
        btnUpdate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelBtn.add(btnUpdate);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDelete.png"))); // NOI18N
        btnDelete.setToolTipText("Supprimer");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setPreferredSize(new java.awt.Dimension(106, 102));
        btnDelete.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelBtn.add(btnDelete);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnPrint.png"))); // NOI18N
        btnPrint.setToolTipText("Imprimer la liste");
        btnPrint.setBorderPainted(false);
        btnPrint.setContentAreaFilled(false);
        btnPrint.setFocusPainted(false);
        btnPrint.setPreferredSize(new java.awt.Dimension(106, 102));
        btnPrint.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelBtn.add(btnPrint);

        btnAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnAccueil.png"))); // NOI18N
        btnAccueil.setToolTipText("Accueil");
        btnAccueil.setBorderPainted(false);
        btnAccueil.setContentAreaFilled(false);
        btnAccueil.setFocusPainted(false);
        btnAccueil.setPreferredSize(new java.awt.Dimension(106, 102));
        btnAccueil.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAccueil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccueilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccueilMouseExited(evt);
            }
        });
        btnAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccueilActionPerformed(evt);
            }
        });
        panelBtn.add(btnAccueil);

        panelCenter.add(panelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 720, 100));

        panelTable.setOpaque(false);
        panelTable.setLayout(new java.awt.BorderLayout());
        panelCenter.add(panelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 192, 670, 270));

        containerPanel.add(panelCenter, java.awt.BorderLayout.LINE_START);

        labBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg2.png"))); // NOI18N
        containerPanel.add(labBG, java.awt.BorderLayout.LINE_END);

        getContentPane().add(containerPanel, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnAdd2.png"))); // NOI18N
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdate2.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDelete2.png"))); // NOI18N
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnAccueilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccueilMouseEntered
        btnAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnAccueil2.png"))); // NOI18N
    }//GEN-LAST:event_btnAccueilMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnAdd.png"))); // NOI18N
    }//GEN-LAST:event_btnAddMouseExited

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdate.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDelete.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnAccueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccueilMouseExited
        btnAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnAccueil.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccueilMouseExited

    private void btnAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccueilActionPerformed
IHMAccueil ihmAccueil=new IHMAccueil();   
this.dispose();
ihmAccueil.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccueilActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
labDate.setText(dateGetter.getDayName()+", "+dateGetter.getDateNow());
labName.setText(IHMLogin.user.getNomUser().toUpperCase()+" "+IHMLogin.user.getPrenomUser());
        tableVehicules=new JTable(vehiculeTableModel);
     tableVehicules.setVisible(true);
     tableVehicules.setAutoCreateRowSorter(true);
      tableVehicules.setShowGrid(true);
     tableVehicules.setGridColor(Color.GRAY);
          jsp.setBorder(null);
     jsp.setViewportView(tableVehicules);
     jsp.getViewport().setOpaque(false);
jsp.setOpaque(false);
     panelTable.add(jsp);
              setTableVehiculeEvent();
        lv=vDAO.readAll(); 
vehiculeTableModel=(VehiculeTableModel) tableVehicules.getModel();
vehiculeTableModel.loadData(lv);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
IHMAddVehicule ihmAddVehicule=new IHMAddVehicule();
this.dispose();
ihmAddVehicule.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
int s=tableVehicules.getSelectedRow();
if(s!=-1)
{
    int i=JOptionPane.showConfirmDialog
        (this, "Attention tous les objets liés à cet véhicule seront supprimés ! \n Voulez-vous vraiment supprimer le véhicule : "+tableVehicules.getValueAt(s, 0).toString()+"?");
    if(i==0){
vDAO.delete(tableVehicules.getValueAt(s, 0).toString());
        lv=vDAO.readAll();
        vehiculeTableModel=(VehiculeTableModel) tableVehicules.getModel();
vehiculeTableModel.loadData(lv);
 JOptionPane.showMessageDialog(this,"Suppression effectuée !" );
    }
}
else
{
 JOptionPane.showMessageDialog(this,"Veuillez sélectionner le véhicule à supprimer dans le tableau" );
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
int s=tableVehicules.getSelectedRow();
if(s!=-1){
 IHMUpdateVehicule ihmUpdateVehicule=new IHMUpdateVehicule(tableVehicules.getValueAt(s, 0).toString());
 this.dispose();
 ihmUpdateVehicule.setVisible(true);
}
 else
{
 JOptionPane.showMessageDialog(this,"Veuillez sélectionner le Véhicule à modifier dans le tableau" );
}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void comboRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRechercheActionPerformed

    private void txtRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRechercheFocusGained
txtRecherche.setText("");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRechercheFocusGained

    private void txtRechercheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRechercheFocusLost
txtRecherche.setText("Entrez valeur ...");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRechercheFocusLost

    private void txtRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRechercheKeyTyped
String choice=String.valueOf(comboRecherche.getSelectedItem());

     if(String.valueOf(evt.paramString()).contains("Backspace")||String.valueOf(evt.paramString()).contains("Delete"))
     {vehiculeTableModel.loadData(vDAO.findByPartOf(txtRecherche.getText(),choice));
         
     }
    else
     {
    vehiculeTableModel.loadData(vDAO.findByPartOf(txtRecherche.getText()+evt.getKeyChar(),choice));  
  
     }        // TODO add your handling code here:
    }//GEN-LAST:event_txtRechercheKeyTyped

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
                btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnPrint2.png"))); 
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
                btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnPrint.png"))); 
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
try {
                        tableVehicules.print();
                    } catch (PrinterException ex) {
                        Logger.getLogger(IHMVehicules.class.getName()).log(Level.SEVERE, null, ex);
                    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed
public void setTableVehiculeEvent() {
        tableVehicules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(tableVehicules.getSelectedRow()!=-1)
                {
                    Vehicule v=new Vehicule();
                    v=vDAO.read(tableVehicules.getValueAt(tableVehicules.getSelectedRow(), 0).toString());
                    JOptionPane.showMessageDialog(tableVehicules, "<html></body><h1>Informations Véhicule</h1><table>"
                            + "<tr><td>Matricule :</td><td><b>"+v.getMatricule()+"</b></td></tr>"
                            + "<tr><td>Categorie :</td><td><b>"+v.getCategorie().getNomCategorie()+"</b></td></tr>"
                            + "<tr><td>Marque :</td><td><b>"+v.getMarque().getNomMarque()+"</b></td></tr>"
                            + "<tr><td>Kilométrage :</td><td><b>"+v.getKilometrage()+"</b></td></tr>"
                            + "<tr><td>Lieu :</td><td><b>"+v.getLieu().getNomLieu()+"</b></td></tr>"
                            + "<tr><td>Division :</td><td><b>"+v.getLieu().getDivision().getNomDivision()+"</b></td></tr>"
                            + "<tr><td>Couleur :</td><td><b>"+v.getCouleur()+"</b></td></tr>"
                            + "<tr><td>Date d'ajout :</td><td><b>"+v.getDateAjout()+"</b></td></tr>"
                            +"</table><br/></body></html>", "Informations Véhicule", 1);
                    
                }
            }
        });
    }
 

     
       


    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccueil;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comboRecherche;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel labBG;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labRechercherPar;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelRecherche;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables

   
}
