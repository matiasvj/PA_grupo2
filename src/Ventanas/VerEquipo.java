package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class VerEquipo extends javax.swing.JDialog {

    public VerEquipo(java.awt.Frame parent, boolean modal) {
        super(parent,"Ver Equipo", modal);
        initComponents();
        llenarLista();
        
    }
        ManejadorBD mbd = ManejadorBD.getInstancia();
        List <Integer> ids = new ArrayList<>();
    
    private void llenarLista(){
        Statement st = mbd.getStatement();
        ResultSet res;
        Object nombre;
        
        DefaultListModel modelo = new DefaultListModel();
        lista_equipos.setModel(modelo);
        
        try {
            res = st.executeQuery("select ID_Equipo, Nombre from equipos");
            while(res.next()){
                nombre = res.getObject(2);
                modelo.addElement(nombre);
                ids.add((Integer)res.getObject(1));
            }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista_equipos = new javax.swing.JList();
        boton_cancelar = new javax.swing.JButton();
        boton_seleccionar = new javax.swing.JButton();
        label_equipos = new javax.swing.JLabel();
        valor_nombre = new javax.swing.JLabel();
        valor_id = new javax.swing.JLabel();
        valor_dividendo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lista_equipos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lista_equipos);

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });

        boton_seleccionar.setText("Seleccionar");
        boton_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar(evt);
            }
        });

        label_equipos.setText("Equipos:");

        valor_nombre.setText("Nombre:");

        valor_id.setText("ID:");

        valor_dividendo.setText("Dividendo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_seleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                        .addComponent(boton_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_equipos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valor_nombre)
                                    .addComponent(valor_id)
                                    .addComponent(valor_dividendo))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_equipos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(valor_id)
                        .addGap(29, 29, 29)
                        .addComponent(valor_nombre)
                        .addGap(36, 36, 36)
                        .addComponent(valor_dividendo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_seleccionar)
                    .addComponent(boton_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        dispose();
    }//GEN-LAST:event_cancelar

    private void seleccionar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar
        try {
            Integer id = ((Integer)lista_equipos.getSelectedIndex());
            ResultSet resultado = mbd.selectEquipo(id);
            resultado.next();
            valor_id.setText("ID: "+resultado.getString(1));
            valor_nombre.setText(resultado.getString(2));
            //valor_dividendo.setText(resultado.getString(3));
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_seleccionar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_seleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_equipos;
    private javax.swing.JList lista_equipos;
    private javax.swing.JLabel valor_dividendo;
    private javax.swing.JLabel valor_id;
    private javax.swing.JLabel valor_nombre;
    // End of variables declaration//GEN-END:variables
}
