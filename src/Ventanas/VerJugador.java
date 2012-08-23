package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class VerJugador extends javax.swing.JDialog {

    public VerJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarLista();
    }
    ManejadorBD mbd = ManejadorBD.getInstancia();
    
    private void llenarLista(){
        Statement st = mbd.getStatement();
        ResultSet res;
        Object nombre;
        
        DefaultListModel modelo = new DefaultListModel();
        lista_jugadores.setModel(modelo);
        
        try {
             res = st.executeQuery("select Nombre_Jugador from jugadores");
             while(res.next()){
                 nombre = res.getObject(1);
                 modelo.addElement(nombre);
             }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_lista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        boton_seleccionar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion de Jugadores");
        setResizable(false);

        titulo_lista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titulo_lista.setText("Jugadores:");

        lista_jugadores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista_jugadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_jugadores.setVisibleRowCount(10);
        jScrollPane1.setViewportView(lista_jugadores);

        boton_seleccionar.setText("Seleccionar Jugador");
        boton_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInformacionJugador(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_lista)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titulo_lista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_seleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_cancelar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verInformacionJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInformacionJugador
        
    }//GEN-LAST:event_verInformacionJugador

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        dispose();
    }//GEN-LAST:event_cancelar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_seleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista_jugadores;
    private javax.swing.JLabel titulo_lista;
    // End of variables declaration//GEN-END:variables
}
