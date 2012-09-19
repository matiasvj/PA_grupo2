package Ventanas;

import Clases.ManejadorBD;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VerEquipo extends javax.swing.JDialog {

    JFileChooser fileChooser = new JFileChooser();
    String inicio="", ubicacion="";
    
    private Integer id;
    private List <Integer> ids;
    
    public VerEquipo(java.awt.Frame parent, boolean modal) {
        super(parent,"Ver Equipo", modal);
        initComponents();
        ids = new ArrayList();
        llenarLista();
    }
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    String url="";
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
        label_equipos = new javax.swing.JLabel();
        texto_id = new javax.swing.JLabel();
        texto_imagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        texto_jugadores = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();
        boton_cambiar_imagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lista_equipos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_equipos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                filaSeleccionada(evt);
            }
        });
        jScrollPane1.setViewportView(lista_equipos);

        boton_cancelar.setText("salir");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });

        label_equipos.setText("Equipos:");

        texto_id.setText("ID:");

        texto_imagen.setText("Imagen");

        lista_jugadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lista_jugadores);

        texto_jugadores.setText("Jugadores");

        texto_nombre.setText("Nombre:");

        label_imagen.setBackground(new java.awt.Color(255, 255, 255));
        label_imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        boton_cambiar_imagen.setText("Cambiar");
        boton_cambiar_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarImagen(evt);
            }
        });

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
                        .addComponent(label_equipos)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 103, Short.MAX_VALUE))
                                            .addComponent(texto_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(137, 137, 137))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(texto_imagen)
                                        .addGap(55, 55, 55))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(boton_cambiar_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(boton_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_equipos)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_imagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto_nombre))
                            .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_cambiar_imagen)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(texto_jugadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addComponent(boton_cancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        dispose();
    }//GEN-LAST:event_cancelar

    private void filaSeleccionada(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_filaSeleccionada
        try {
            int lugar_lista = lista_equipos.getSelectedIndex();
            if(lugar_lista == -1){
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun equipo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                String fila;
                label_imagen.setIcon(null);
                id = ids.get(lugar_lista);
                ResultSet resultado = mbd.selectEquipo(id);
                resultado.next();
                url = resultado.getString(3);
                if(url!=null){
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
                else{
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
                            }
        } catch (SQLException ex) { 
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_filaSeleccionada

    private void cambiarImagen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarImagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".JPG, .GIF & .PNG","png", "jpg", "gif");
        fileChooser.setFileFilter(filtro);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            File name= fileChooser.getSelectedFile();
            ImageIcon image = new ImageIcon(fileChooser.getSelectedFile().getPath());
            if(image.getIconHeight() > 400 || image.getIconWidth() > 250){
                ImageIcon imageResize = new ImageIcon(image.getImage().getScaledInstance(90, 100, 100));
                inicio = fileChooser.getSelectedFile().getPath();
                label_imagen.setIcon(imageResize);
            }
            else{
                label_imagen.setIcon(image);
            }
        }
        
        if(!inicio.equals("")){
            String nombre_imagen = fileChooser.getSelectedFile().getName();
            ubicacion = "////192.168.56.101//Archivos//Equipos//"+nombre_imagen;
            mbd.ActualizarFotoEquipo(ubicacion, id);
        }
    }//GEN-LAST:event_cambiarImagen

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cambiar_imagen;
    private javax.swing.JButton boton_cancelar;
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
