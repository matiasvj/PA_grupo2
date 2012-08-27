
package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class AltaCompeticionIndividual extends javax.swing.JDialog {
    
    int posicion_local, posicion_visitante;
    
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
             res = st.executeQuery("select ID_Equipos, Nombre from equipos");
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
        int fila_local = combobox_loca.getSelectedIndex();
        int fila_visitante = combobox_visitante.getSelectedIndex();
        
        if (fila_local != fila_visitante){
        res2 = st.executeQuery("select ID_Equipos from equipos");
        res2.next();
        for (int i=0; i<fila_local; i++){
            res2.next();
        }
        Integer local = res2.getInt(1);
        res3 = st.executeQuery("select ID_Equipos from equipos");
        res3.next();
        for (int i=0; i<fila_visitante; i++){
            res3.next();
        }
        Integer visitante = res3.getInt(1);

        int id_c = mbd.insertCompeticion(textfield_nombre.getText(), "Individual");
       
        if (id_c != 0){
            int id_p = mbd.insertPartido(local, visitante, id_c);
            JOptionPane.showMessageDialog(this, "Operacion exitosa. ID: "+id_c , "Competicion Creada!", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la operacion!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(this, "El equipo local y el visitante no pueden ser los mismos", "Error", JOptionPane.ERROR_MESSAGE);
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

        boton_aceptar.setText("Aceptar");
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar(evt);
            }
        });

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_local)
                    .addComponent(label_visitante)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(boton_aceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_cancelar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(label_nombre)
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combobox_loca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combobox_visitante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textfield_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        this.dispose();
    }//GEN-LAST:event_cancelar

    private void aceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar
        String nombre = textfield_nombre.getText();
        if (nombre.equals("")){
            
            JOptionPane.showMessageDialog(this, "El campo nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            crearCompeticion();
        }
    }//GEN-LAST:event_aceptar

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
