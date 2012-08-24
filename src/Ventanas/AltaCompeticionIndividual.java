
package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class AltaCompeticionIndividual extends javax.swing.JDialog {

    public AltaCompeticionIndividual(java.awt.Frame parent, boolean modal) {
        super(parent,"Alta Competicion Individual", modal);
        initComponents();
        llenarLista();
    }
    
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    
    private void llenarLista(){
        Statement st = mbd.getStatement();
        ResultSet res;
        Object nombre;
        
        
        try {
             res = st.executeQuery("select ID_Equipo, Nombre from equipos");
             while(res.next()){
                 nombre = res.getObject(2);
                 combobox_loca.addItem(nombre);
                 combobox_visitante.addItem(nombre);
                 
             }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
    }
    
    
    private void crearCompeticion(){
        Statement st = mbd.getStatement();
        ResultSet res2, res3;
        
        try{
        Integer fila_local = ((Integer)combobox_loca.getSelectedIndex())+1;
        Integer fila_visitante = ((Integer)combobox_visitante.getSelectedIndex())+1;
        res2 = st.executeQuery("select ID_Equipo from equipos");
        for (int i=1; i<fila_local; i++){
            res2.next();
        }
        Object local = res2.getObject(1);
        int id_local = Integer.parseInt(local.toString());
        
        res3 = st.executeQuery("select ID_Equipo from equipos");
        for (int i=1; i<fila_visitante; i++){
            res3.next();
        }
        Object visitante = res3.getObject(1);
        int id_visitante = Integer.parseInt(visitante.toString());
        
        
        int id_p = mbd.insertPartido(id_local, id_visitante);
        int id_c = mbd.insertCompeticion(textfield_nombre.getText(), "Individual");
        if (id_p != 0 && id_c != 0){
            mbd.insertCompIndiv(id_c, id_p);
            JOptionPane.showMessageDialog(this, "Operacion exitosa. ID: "+id_c , "Competicion Creada!", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la operacion!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        } catch (SQLException e){
            System.out.println("aca es la cosa "+e.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_local = new javax.swing.JLabel();
        label_visitante = new javax.swing.JLabel();
        combobox_loca = new javax.swing.JComboBox();
        combobox_visitante = new javax.swing.JComboBox();
        label_nombre = new javax.swing.JLabel();
        textfield_nombre = new javax.swing.JTextField();
        boton_aceptar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_local.setText("Local");

        label_visitante.setText("Visitante");

        label_nombre.setText("Nombre");

        textfield_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_nombreActionPerformed(evt);
            }
        });

        boton_aceptar.setText("Aceptar");
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_local)
                            .addComponent(label_visitante)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_nombre)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combobox_loca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_visitante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textfield_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(boton_aceptar)
                        .addGap(34, 34, 34)
                        .addComponent(boton_cancelar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(textfield_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_local)
                    .addComponent(combobox_loca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_visitante)
                    .addComponent(combobox_visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_aceptar)
                    .addComponent(boton_cancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_nombreActionPerformed
        String nombre = textfield_nombre.getText();
        if (nombre.equals("")){
            
            JOptionPane.showMessageDialog(this, "El campo nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //FIJARSE LAS OTRAS COSAS... :'(
        }
    }//GEN-LAST:event_textfield_nombreActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        crearCompeticion();
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_aceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JComboBox combobox_loca;
    private javax.swing.JComboBox combobox_visitante;
    private javax.swing.JLabel label_local;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_visitante;
    private javax.swing.JTextField textfield_nombre;
    // End of variables declaration//GEN-END:variables
}
