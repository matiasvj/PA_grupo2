
package Ventanas;

import Clases.ManejadorBD;
import Clases.Partido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class AsignarDividendos extends javax.swing.JDialog {
    String partidos;
   ManejadorBD mbd = ManejadorBD.getInstancia();
   List <Integer> Idselect = new ArrayList<>();
   Partido P = new Partido();
    public AsignarDividendos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Object Id, Local, Visita;
        try{
                DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
                ResultSet part  = mbd.dividendos();
                
                
                while (part.next()) {
                    Id = part.getObject("ID_Partido");
                    Local = part.getObject("E.nombre");
                    Visita = part.getObject("E1.nombre");
                    String concat =Id+" - "+ Local+" vs "+Visita;
                    Idselect.add((Integer)part.getObject(2));
                    modeloCombo.addElement(concat);
                    P.setId(Id.toString());
                }
                ComboPartidos.setModel(modeloCombo);
        } catch (SQLException ex) {
            System.out.println("Error"+ex.toString());
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
        EquipoVisita = new javax.swing.JLabel();
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

        LLocal.setText("Local:");

        LVisitante.setText("Visitante: ");

        Local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalActionPerformed(evt);
            }
        });

        Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitanteActionPerformed(evt);
            }
        });

        Lempate.setText("Empate:");

        Empate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpateActionPerformed(evt);
            }
        });

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LVisitante)
                            .addComponent(LLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EquipoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EquipoVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Visitante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LID)
                        .addGap(18, 18, 18)
                        .addComponent(ShowID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Confirmar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LPartido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboPartidos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lempate)
                        .addGap(148, 148, 148)
                        .addComponent(Empate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPartido)
                    .addComponent(ComboPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LID)
                    .addComponent(ShowID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLocal)
                    .addComponent(EquipoLocal)
                    .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LVisitante)
                    .addComponent(EquipoVisita)
                    .addComponent(Visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lempate))
                .addGap(18, 18, 18)
                .addComponent(Confirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitanteActionPerformed
        try{
            double num =Double.parseDouble(Visitante.getText());
            P.setDiv_visita(num);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Caracter no valido");
        }  
    }//GEN-LAST:event_VisitanteActionPerformed

    private void ComboPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPartidosActionPerformed
        try {
            int Lugar = ComboPartidos.getSelectedIndex();
            Integer id = Idselect.get(Lugar);
            ResultSet resultado = mbd.selectPartidos(id);
            resultado.next();
            ShowID.setText(resultado.getString(2));
            EquipoLocal.setText(resultado.getString(13));
            EquipoVisita.setText(resultado.getString(15));
        } catch (SQLException ex) {
            System.out.println("Error: "+ex);
        }
                    
    }//GEN-LAST:event_ComboPartidosActionPerformed

    private void LocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalActionPerformed
       
        try{
            double num =Double.parseDouble(Local.getText());
            P.setDiv_local(num);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Caracter no valido");
        }   
    }//GEN-LAST:event_LocalActionPerformed

    private void EmpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpateActionPerformed
        try{
            P.setDiv_empate(4.5);
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Caracter no valido");
        }  
    }//GEN-LAST:event_EmpateActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        
        String empate = Empate.getText(), visita = Visitante.getText(),local = Local.getText();
        if(local.equals("")){
            JOptionPane.showMessageDialog(null, "Error: El campo Local no puede estar vacio");}
        else if(visita.equals("")){
            JOptionPane.showMessageDialog(null, "Error: El campo Visita no puede estar vacio");
        }
        else if(empate.equals("")){
            JOptionPane.showMessageDialog(null, "Error: El campo Empate no puede estar vacio");
        }
        else{
            //double l=P.getDiv_local(), v = P.getDiv_visita(), e = P.getDiv_empate();
            int id = Integer.parseInt(P.getId()); 
            JOptionPane.showMessageDialog(null,P.getDiv_empate());
            mbd.asignarDividendo(id,P.getDiv_local(),P.getDiv_visita(),P.getDiv_empate());
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboPartidos;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Empate;
    private javax.swing.JLabel EquipoLocal;
    private javax.swing.JLabel EquipoVisita;
    private javax.swing.JLabel LID;
    private javax.swing.JLabel LLocal;
    private javax.swing.JLabel LPartido;
    private javax.swing.JLabel LVisitante;
    private javax.swing.JLabel Lempate;
    private javax.swing.JTextField Local;
    private javax.swing.JLabel ShowID;
    private javax.swing.JTextField Visitante;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
