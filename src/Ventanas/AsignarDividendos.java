
package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;


public class AsignarDividendos extends javax.swing.JDialog {

   ManejadorBD mbd = ManejadorBD.getInstancia();
    public AsignarDividendos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try{
                DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
                ResultSet part  = mbd.dividendos();
                String Local, Visita;
                
                while (part.next()) {
                  Local = part.getObject("E.nombre").toString();
                  Visita = part.getObject("E1.nombre").toString();
                  String concat = Local+" vs "+Visita;
                  modeloCombo.addElement(concat);
             }         ComboPartidos.setModel(modeloCombo);
        } catch (SQLException ex) {
           System.out.println(ex.toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        LPartido = new javax.swing.JLabel();
        ComboPartidos = new javax.swing.JComboBox();
        LID = new javax.swing.JLabel();
        ShowID = new javax.swing.JLabel();
        LLocal = new javax.swing.JLabel();
        EquipoLocal = new javax.swing.JLabel();
        LVisitante = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Local = new javax.swing.JTextField();
        Visitante = new javax.swing.JTextField();
        Lempate = new javax.swing.JLabel();
        Empate = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LPartido.setText("Partido: ");

        ComboPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPartidosActionPerformed(evt);
            }
        });

        LID.setText("Partido ID: ");

        ShowID.setText("...");

        LLocal.setText("Local:");

        EquipoLocal.setText("...");

        LVisitante.setText("Visitante: ");

        jLabel1.setText("...");

        Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitanteActionPerformed(evt);
            }
        });

        Lempate.setText("Empate:");

        Confirmar.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LPartido)
                    .addComponent(LID)
                    .addComponent(LLocal)
                    .addComponent(LVisitante)
                    .addComponent(Lempate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(EquipoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Local, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Visitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboPartidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Empate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Confirmar, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShowID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LID, LLocal, LPartido, LVisitante, Lempate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPartido)
                    .addComponent(ComboPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LID)
                    .addComponent(ShowID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLocal)
                    .addComponent(EquipoLocal)
                    .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LVisitante)
                    .addComponent(Visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lempate)
                    .addComponent(Empate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Confirmar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisitanteActionPerformed

    private void ComboPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPartidosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboPartidosActionPerformed

    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboPartidos;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Empate;
    private javax.swing.JLabel EquipoLocal;
    private javax.swing.JLabel LID;
    private javax.swing.JLabel LLocal;
    private javax.swing.JLabel LPartido;
    private javax.swing.JLabel LVisitante;
    private javax.swing.JLabel Lempate;
    private javax.swing.JTextField Local;
    private javax.swing.JLabel ShowID;
    private javax.swing.JTextField Visitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
