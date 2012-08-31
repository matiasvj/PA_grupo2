package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class EliminarJugador extends javax.swing.JDialog {

    public EliminarJugador(java.awt.Frame parent, boolean modal) {
        super(parent,"Eliminar Jugador", modal);
        initComponents();
        llenarListaDisponibles();
    }
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    List <Integer> ids = new ArrayList<>();
    DefaultListModel modelo = new DefaultListModel();
    
    private void llenarListaDisponibles(){
        Statement st = mbd.getStatement();
        ResultSet res;
        Object nombre;
        
        
        lista_jug.setModel(modelo);
        
        
        try {
             res = st.executeQuery("select ID_Jugador, nombrecompleto from jugadores");
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_jug = new javax.swing.JList();
        boton_eliminar = new javax.swing.JButton();
        boton_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Jugadores");

        lista_jug.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista_jug);

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        boton_cancel.setText("Cancelar");
        boton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(boton_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_cancel)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_eliminar)
                    .addComponent(boton_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_cancelActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        if (lista_jug.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un jugador a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int id_j = ids.get(lista_jug.getSelectedIndex());
            int flag=0;
            Statement st = mbd.getStatement();
            try {
                ResultSet res = st.executeQuery("select * from jugador_partido where id_jugador="+id_j+" ");
                while (res.next()){
                    if (res.first()){
                        flag=1;
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            if (flag==0){
                try {
                    st.executeUpdate("delete from jugadores_equipos where jugador="+id_j+" ");
                    st.executeUpdate("delete from jugadores where id_jugador="+id_j+" ");
                    modelo.remove(lista_jug.getSelectedIndex());
                    JOptionPane.showMessageDialog(this, "El jugador fue eliminado correctamente!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El jugador esta relacionado a un partido. NO PUEDE SER ELIMINADO!", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancel;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista_jug;
    // End of variables declaration//GEN-END:variables
}
