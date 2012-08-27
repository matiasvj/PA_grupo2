package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class VerJugador extends javax.swing.JDialog {

    public VerJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        lista_jugadores.setModel(modelo);
        
        try {
             res = st.executeQuery("select ID_Jugador, Nombre from jugadores");
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

        titulo_lista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        boton_seleccionar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        etiqueta_nombre = new javax.swing.JLabel();
        etiqueta_nombre_comp = new javax.swing.JLabel();
        etiqueta_fecha_nac = new javax.swing.JLabel();
        etiqueta_lugar_nac = new javax.swing.JLabel();
        etiqueta_posicion = new javax.swing.JLabel();
        etiqueta_altura = new javax.swing.JLabel();
        etiqueta_peso = new javax.swing.JLabel();
        valor_nombre = new javax.swing.JLabel();
        valor_nom_comp = new javax.swing.JLabel();
        valor_fecha_nac = new javax.swing.JLabel();
        valor_lugar_nac = new javax.swing.JLabel();
        valor_posicion = new javax.swing.JLabel();
        valor_altura = new javax.swing.JLabel();
        valor_peso = new javax.swing.JLabel();
        valor_id = new javax.swing.JLabel();
        panel_imagen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion de Jugadores");
        setResizable(false);

        titulo_lista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        etiqueta_nombre.setBackground(java.awt.Color.white);
        etiqueta_nombre.setText("Nombre");

        etiqueta_nombre_comp.setBackground(java.awt.Color.white);
        etiqueta_nombre_comp.setText("Nombre Completo");

        etiqueta_fecha_nac.setBackground(java.awt.Color.white);
        etiqueta_fecha_nac.setText("Fecha de Nacimiento");

        etiqueta_lugar_nac.setBackground(java.awt.Color.white);
        etiqueta_lugar_nac.setText("Lugar de Nacimiento");

        etiqueta_posicion.setBackground(java.awt.Color.white);
        etiqueta_posicion.setText("Posicion");

        etiqueta_altura.setBackground(java.awt.Color.white);
        etiqueta_altura.setText("Altura");

        etiqueta_peso.setBackground(java.awt.Color.white);
        etiqueta_peso.setText("Peso");

        valor_nombre.setBackground(new java.awt.Color(255, 255, 255));
        valor_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_nom_comp.setBackground(new java.awt.Color(255, 255, 255));
        valor_nom_comp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_fecha_nac.setBackground(new java.awt.Color(255, 255, 255));
        valor_fecha_nac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_lugar_nac.setBackground(new java.awt.Color(255, 255, 255));
        valor_lugar_nac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_posicion.setBackground(new java.awt.Color(255, 255, 255));
        valor_posicion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_altura.setBackground(new java.awt.Color(255, 255, 255));
        valor_altura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_peso.setBackground(new java.awt.Color(255, 255, 255));
        valor_peso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        valor_id.setText("ID:");

        panel_imagen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_imagenLayout = new javax.swing.GroupLayout(panel_imagen);
        panel_imagen.setLayout(panel_imagenLayout);
        panel_imagenLayout.setHorizontalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        panel_imagenLayout.setVerticalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_altura)
                            .addComponent(etiqueta_posicion)
                            .addComponent(etiqueta_lugar_nac)
                            .addComponent(etiqueta_fecha_nac)
                            .addComponent(etiqueta_nombre_comp)
                            .addComponent(etiqueta_nombre)
                            .addComponent(etiqueta_peso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_nom_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_lugar_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_lista)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_seleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {valor_altura, valor_fecha_nac, valor_id, valor_lugar_nac, valor_nom_comp, valor_nombre, valor_peso, valor_posicion});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {etiqueta_altura, etiqueta_fecha_nac, etiqueta_lugar_nac, etiqueta_nombre, etiqueta_nombre_comp, etiqueta_peso, etiqueta_posicion});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo_lista)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etiqueta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(valor_nom_comp)
                            .addComponent(etiqueta_nombre_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etiqueta_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_fecha_nac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etiqueta_lugar_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_lugar_nac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etiqueta_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_posicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etiqueta_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_altura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etiqueta_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_peso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_seleccionar)
                            .addComponent(boton_cancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_id)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {valor_altura, valor_fecha_nac, valor_id, valor_lugar_nac, valor_nom_comp, valor_nombre, valor_peso, valor_posicion});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {etiqueta_altura, etiqueta_fecha_nac, etiqueta_lugar_nac, etiqueta_nombre, etiqueta_nombre_comp, etiqueta_peso, etiqueta_posicion});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verInformacionJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInformacionJugador
        try {
            int lugar_lista = lista_jugadores.getSelectedIndex();
            Integer id = ids.get(lugar_lista);
            ResultSet resultado = mbd.selectJugador(id);
            resultado.next();
            
            valor_id.setText("ID: "+resultado.getString(1));
            valor_nombre.setText(resultado.getString(2));
            valor_nom_comp.setText(resultado.getString(3));
            valor_fecha_nac.setText(resultado.getString(4));
            valor_lugar_nac.setText(resultado.getString(5));
            valor_posicion.setText(resultado.getString(6));
            valor_altura.setText(resultado.getString(7)+" m");
            valor_peso.setText(resultado.getString(8)+" Kg");
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_verInformacionJugador

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        dispose();
    }//GEN-LAST:event_cancelar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_seleccionar;
    private javax.swing.JLabel etiqueta_altura;
    private javax.swing.JLabel etiqueta_fecha_nac;
    private javax.swing.JLabel etiqueta_lugar_nac;
    private javax.swing.JLabel etiqueta_nombre;
    private javax.swing.JLabel etiqueta_nombre_comp;
    private javax.swing.JLabel etiqueta_peso;
    private javax.swing.JLabel etiqueta_posicion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista_jugadores;
    private javax.swing.JPanel panel_imagen;
    private javax.swing.JLabel titulo_lista;
    private javax.swing.JLabel valor_altura;
    private javax.swing.JLabel valor_fecha_nac;
    private javax.swing.JLabel valor_id;
    private javax.swing.JLabel valor_lugar_nac;
    private javax.swing.JLabel valor_nom_comp;
    private javax.swing.JLabel valor_nombre;
    private javax.swing.JLabel valor_peso;
    private javax.swing.JLabel valor_posicion;
    // End of variables declaration//GEN-END:variables
}
