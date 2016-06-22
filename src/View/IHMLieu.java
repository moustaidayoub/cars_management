/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.CategorieDAO;
import DAO.DivisionDAO;
import DAO.LieuDAO;
import DAO.SingletonConnexion;
import DAO.VehiculeDAO;
import JavaBeans.Categorie;
import JavaBeans.Division;
import JavaBeans.Lieu;
import JavaBeans.Vehicule;
import Utiles.CategorieTableModel;
import Utiles.DateGetter;
import Utiles.LieuTableModel;
import Utiles.VehiculeTableModel;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Moustaid
 */
public class IHMLieu extends javax.swing.JFrame {
private DateGetter dateGetter=new DateGetter();
private LieuTableModel lieuTableModel=new LieuTableModel();
private LieuDAO lDAO=new LieuDAO(SingletonConnexion.getInstance());
private JTable tableLieux;
private JScrollPane jsp=new JScrollPane();
private List<Lieu> ll=new ArrayList();
    /**
     * Creates new form Accueil
     */
    public IHMLieu() {
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
        setTitle("Gestion Véhicules OCP - Lieux");
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
        labRechercherPar.setText("Rechercher un lieu par : ");
        panelRecherche.add(labRechercherPar);

        comboRecherche.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NOMLieu", "Ville", "NOMDivision" }));
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
        tableLieux=new JTable(lieuTableModel);
     tableLieux.setVisible(true);
     tableLieux.setAutoCreateRowSorter(true);
      tableLieux.setShowGrid(true);
     tableLieux.setGridColor(Color.GRAY);
          jsp.setBorder(null);
     jsp.setViewportView(tableLieux);
     jsp.getViewport().setOpaque(false);
jsp.setOpaque(false);
     panelTable.add(jsp);
              setTableLieuEvent();
        ll=lDAO.readAll(); 
lieuTableModel=(LieuTableModel) tableLieux.getModel();
lieuTableModel.loadData(ll);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
  JTextField txtNom = new JTextField(5);
      JTextField txtVille = new JTextField(5);
      JComboBox comboDivision=new JComboBox();
      List<Division> dd=new ArrayList();
      DivisionDAO dDAO=new DivisionDAO(SingletonConnexion.getInstance());
      dd=dDAO.readAll();

if(dd.size()!=0){
          for(Division d:dd)
comboDivision.addItem(d.getIdDivision()+":"+d.getNomDivision());
comboDivision.setSelectedIndex(0);
        JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Nom Lieu : "));
      myPanel.add(txtNom);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Ville :"));
      myPanel.add(txtVille);
      myPanel.add(new JLabel("Division :"));
      myPanel.add(comboDivision);
        int j=JOptionPane.showConfirmDialog(tableLieux,myPanel,"Ajout d'un Lieu",1);
if(j==0 && lDAO.findByPartOf(txtNom.getText(), "NOMLieu").size()==0){
Lieu l=new Lieu();
l.setNomLieu(txtNom.getText());
l.setVille(txtVille.getText());
Division d=new Division();
d.setIdDivision(Integer.parseInt(String.valueOf(comboDivision.getSelectedItem()).split(":")[0]));
l.setDivision(d);
lDAO.create(l);
JOptionPane.showMessageDialog(tableLieux,"Lieu Ajouté !" );
ll=lDAO.readAll(); 
lieuTableModel=(LieuTableModel) tableLieux.getModel();
lieuTableModel.loadData(ll);
}
else
    JOptionPane.showMessageDialog(tableLieux, "Nom lieu exist déja", "Attention", 0);

}
else
    JOptionPane.showMessageDialog(tableLieux, "Il n'y a aucune Division dans votre Base de données !", "Attention", 0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
int s=tableLieux.getSelectedRow();
if(s!=-1)
{
    int i=JOptionPane.showConfirmDialog
        (this, "Attention tous les objets liés à ce Lieu seront supprimés ! \n Voulez-vous vraiment supprimer le Lieu : "+tableLieux.getValueAt(s, 0).toString()+"?");
    if(i==0){
lDAO.delete(Integer.parseInt(String.valueOf(tableLieux.getValueAt(s, 0))));
        ll=lDAO.readAll();
        lieuTableModel=(LieuTableModel) tableLieux.getModel();
lieuTableModel.loadData(ll);
 JOptionPane.showMessageDialog(this,"Suppression effectuée !" );
    }
}
else
{
 JOptionPane.showMessageDialog(this,"Veuillez sélectionner le Lieu à supprimer dans le tableau" );
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
int s=tableLieux.getSelectedRow();
JTextField txtNom = new JTextField(20);
      JTextField txtVille = new JTextField(20);
           JComboBox comboDivision=new JComboBox();
      List<Division> dd=new ArrayList();
      DivisionDAO dDAO=new DivisionDAO(SingletonConnexion.getInstance());
      dd=dDAO.readAll();
      for(Division d:dd)
comboDivision.addItem(d.getIdDivision()+":"+d.getNomDivision());
comboDivision.setSelectedIndex(0);
        JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Nom Lieu : "));
      myPanel.add(txtNom);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Ville :"));
      myPanel.add(txtVille);
            myPanel.add(new JLabel("Division :"));
      myPanel.add(comboDivision);
if(s!=-1){
    Lieu l=new Lieu();
    l=lDAO.read(Integer.parseInt(String.valueOf(tableLieux.getValueAt(s, 0))));
    txtNom.setText(l.getNomLieu());
        txtVille.setText(l.getVille());
        comboDivision.setSelectedItem(l.getDivision().getIdDivision()+":"+l.getDivision().getNomDivision());
        int j=JOptionPane.showConfirmDialog(tableLieux,myPanel,"Modification d'un Lieu",1);

if(j==0 && lDAO.findByPartOf(txtNom.getText(), "NOMLieu").size()==0 ){
l.setIdLieu(Integer.parseInt(String.valueOf(tableLieux.getValueAt(s, 0))));
l.setNomLieu(txtNom.getText());
l.setVille(txtVille.getText());
lDAO.update(l);
JOptionPane.showMessageDialog(tableLieux,"Lieu Modifiée !" );
ll=lDAO.readAll(); 
lieuTableModel=(LieuTableModel) tableLieux.getModel();
lieuTableModel.loadData(ll);
}
else
 JOptionPane.showMessageDialog(tableLieux, "Nom lieu exist déja", "Attention", 0);

}
else
{
 JOptionPane.showMessageDialog(this,"Veuillez sélectionner le Lieu à modifier dans le tableau" );
}
    }//GEN-LAST:event_btnUpdateActionPerformed

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
     {lieuTableModel.loadData(lDAO.findByPartOf(txtRecherche.getText(),choice));  
     }
    else
     {
   lieuTableModel.loadData(lDAO.findByPartOf(txtRecherche.getText()+evt.getKeyChar(),choice));  
  
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
                        tableLieux.print();
                    } catch (PrinterException ex) {
                        Logger.getLogger(IHMLieu.class.getName()).log(Level.SEVERE, null, ex);
                    }        // TODO add your handling code here:        // TODO add your handling code here:        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void comboRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRechercheActionPerformed
public void setTableLieuEvent() {
        tableLieux.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(tableLieux.getSelectedRow()!=-1)
                {
                    Lieu l=new Lieu();
                    l=lDAO.read(Integer.parseInt(String.valueOf(tableLieux.getValueAt(tableLieux.getSelectedRow(), 0))));
                    JOptionPane.showMessageDialog(tableLieux, "<html></body><h1>Informations Lieu</h1><table>"
                            + "<tr><td>Numero   :</td><td><b>"+l.getIdLieu()+"</b></td></tr>"
                            + "<tr><td>Nom Lieu :</td><td><b>"+l.getNomLieu()+"</b></td></tr>"
                            + "<tr><td>Ville    :</td><td><b>"+l.getVille()+"</b></td></tr>"
                            + "<tr><td>Division :</td><td><b>"+l.getDivision().getNomDivision()+"</b></td></tr>"
                            +"</table><br/></body></html>", "Informations Lieu", 1);
                    
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
