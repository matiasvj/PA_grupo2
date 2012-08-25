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
            res = st.executeQuery("select ID_Equipos, Nombre from equipos");
            while(res.next()){
                nombre = res.getObject(2);
                modelo.addElement(nombre);
                ids.add(res.getInt(1));
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
        texto_dividendo = new javax.swing.JLabel();
        texto_imagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        panel_imagen = new javax.swing.JPanel();
        texto_jugadores = new javax.swing.JLabel();

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

        texto_dividendo.setText("Dividendo:");

        texto_imagen.setText("Imagen");

        jScrollPane2.setViewportView(lista_jugadores);

        panel_imagen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_imagenLayout = new javax.swing.GroupLayout(panel_imagen);
        panel_imagen.setLayout(panel_imagenLayout);
        panel_imagenLayout.setHorizontalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel_imagenLayout.setVerticalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        texto_jugadores.setText("Jugadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_equipos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_dividendo)
                            .addComponent(texto_id)))
                    .addComponent(texto_imagen)
                    .addComponent(boton_cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(texto_jugadores)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_seleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {texto_dividendo, texto_id});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boton_cancelar, boton_seleccionar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_equipos)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_seleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_imagen)
                    .addComponent(texto_jugadores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_dividendo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_cancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        dispose();
    }//GEN-LAST:event_cancelar

    private void seleccionar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar
        try {
            int lugar_lista = lista_equipos.getSelectedIndex();
            Integer id = ids.get(lugar_lista);
            ResultSet resultado = mbd.selectEquipo(id);
            System.out.println(id);
            resultado.next();
            texto_id.setText("ID: "+resultado.getString(1));
            texto_dividendo.setText("Dividendo:"+resultado.getString(2));
            //valor_dividendo.setText(resultado.getString(3));

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
    private javax.swing.JList lista_equipos;
    private javax.swing.JList lista_jugadores;
    private javax.swing.JPanel panel_imagen;
    private javax.swing.JLabel texto_dividendo;
    private javax.swing.JLabel texto_id;
    private javax.swing.JLabel texto_imagen;
    private javax.swing.JLabel texto_jugadores;
    // End of variables declaration//GEN-END:variables
}
