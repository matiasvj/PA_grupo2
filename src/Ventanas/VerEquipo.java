package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VerEquipo extends javax.swing.JDialog {

    public VerEquipo(java.awt.Frame parent, boolean modal) {
        super(parent,"Ver Equipo", modal);
        initComponents();
        llenarLista();
    }
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    List <Integer> ids = new ArrayList<>();
    String url;
    private void llenarLista(){
        Statement st = mbd.getStatement();
        ResultSet res;
        Object nombre;
        
        DefaultListModel modelo_equipos = new DefaultListModel();
        lista_equipos.setModel(modelo_equipos);
        
        try {
            res = st.executeQuery("select ID_Equipos, Nombre from equipos");
            while(res.next()){
                nombre = res.getObject("nombre");
                modelo_equipos.addElement(nombre);
                ids.add(res.getInt("id_equipos"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
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
        texto_id = new javax.swing.JLabel();
        texto_imagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        texto_jugadores = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lista_equipos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lista_equipos);

        boton_cancelar.setText("salir");
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

        texto_id.setText("ID:");

        texto_imagen.setText("Imagen");

        lista_jugadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lista_jugadores);

        texto_jugadores.setText("Jugadores");

        texto_nombre.setText("Nombre:");

        label_imagen.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_jugadores)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_equipos)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(texto_imagen)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_equipos)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texto_imagen)
                            .addComponent(texto_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto_nombre)
                                .addGap(63, 63, 63)
                                .addComponent(boton_seleccionar))
                            .addComponent(label_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(texto_jugadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_cancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        dispose();
    }//GEN-LAST:event_cancelar

    private void seleccionar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar
        try {
            int lugar_lista = lista_equipos.getSelectedIndex();
            if(lugar_lista == -1){
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun equipo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                String fila;
                Integer id = ids.get(lugar_lista);
                ResultSet resultado = mbd.selectEquipo(id);
                resultado.next();
                ImageIcon image = new ImageIcon(resultado.getString(3));
                ImageIcon imageResize = new ImageIcon(image.getImage().getScaledInstance(90, 100, 100));
                label_imagen.setIcon(imageResize);
                texto_id.setText("ID: "+resultado.getString(1));
                texto_nombre.setText("Nombre: "+resultado.getString(2));
                
                DefaultListModel modelo_jugadores = new DefaultListModel();
                lista_jugadores.setModel(modelo_jugadores);
                modelo_jugadores.clear();
                
                ResultSet jug = mbd.selectJugadoresEquipo(id);
                while(jug.next()){
                    fila = jug.getString(1);
                    modelo_jugadores.addElement(fila);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_seleccionar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_seleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_equipos;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JList lista_equipos;
    private javax.swing.JList lista_jugadores;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_imagen;
    private javax.swing.JLabel texto_jugadores;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
