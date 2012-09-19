
package Ventanas;

import Clases.Date;
import Clases.Jugador;
import Clases.ManejadorBD;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestionJugadores extends javax.swing.JDialog {

    private ManejadorBD mbd;
    private List ids;
    DefaultListModel modelo = new DefaultListModel();
    int lugar_lista;
    int id;
    
    
    public GestionJugadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mbd = ManejadorBD.getInstancia();
        ids = new ArrayList();
        lista_jugadores.setModel(modelo);
        llenarLista();
        
        boton_aceptar.setVisible(false);
        boton_cancelar.setVisible(false);
        boton_imagen.setVisible(false);
    }
    
    private void llenarLista(){
        Statement st = mbd.getStatement();
        ResultSet res;
        String nombre;
        
        try {
             res = st.executeQuery("select ID_Jugador, NombreCompleto from jugadores");
             while(res.next()){
                 nombre = res.getString(2);
                 modelo.addElement(nombre);
                 ids.add(res.getInt(1));
             }
             
             if(res.first()){
                 lista_jugadores.setSelectedIndex(0);
             }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void ocultarBotonesYactivarTextFields(){
        //desactivar el resto de los botones
        boton_eliminar.setVisible(false);
        boton_nuevo.setVisible(false);
        boton_modificar.setVisible(false);
        boton_salir.setVisible(false);
        
        //activar el boton cambiar imagen
        boton_imagen.setVisible(true);
        
        //hacer visibles los botones aceptar y cancelar
        boton_aceptar.setVisible(true);
        boton_cancelar.setVisible(true);
        
        //hacer editables los textfields
        tf_nombre.setEditable(true);
        tf_nom_comp.setEditable(true);
        tf_dia.setEditable(true);
        tf_mes.setEditable(true);
        tf_anio.setEditable(true);
        tf_pais.setEditable(true);
        tf_pos.setEditable(true);
        tf_altura.setEditable(true);
        tf_peso.setEditable(true);
        
        //desactivar la lista
        lista_jugadores.setEnabled(false);
    }
    
    public void limpiarTextFields(){
        tf_nombre.setText("");
        tf_nom_comp.setText("");
        tf_dia.setText("");
        tf_mes.setText("");
        tf_anio.setText("");
        tf_pais.setText("");
        tf_pos.setText("");
        tf_altura.setText("");
        tf_peso.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_lista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_nom_comp = new javax.swing.JTextField();
        tf_anio = new javax.swing.JTextField();
        tf_mes = new javax.swing.JTextField();
        tf_dia = new javax.swing.JTextField();
        tf_pais = new javax.swing.JTextField();
        tf_pos = new javax.swing.JTextField();
        tf_altura = new javax.swing.JTextField();
        tf_peso = new javax.swing.JTextField();
        panel_imagen = new javax.swing.JPanel();
        boton_imagen = new javax.swing.JButton();
        boton_nuevo = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        boton_modificar = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        boton_aceptar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Jugadores");
        setIconImage(null);
        setResizable(false);

        titulo_lista.setText("Jugadores Disponibles");

        lista_jugadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_jugadores.setToolTipText("");
        lista_jugadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                filaSeleccionada(evt);
            }
        });
        jScrollPane1.setViewportView(lista_jugadores);

        jLabel1.setText("Informacion del Jugador");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Nombre Completo:");

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("Nacionalidad:");

        jLabel6.setText("Posicion:");

        jLabel7.setText("Altura:");

        jLabel8.setText("Peso:");

        tf_nombre.setEditable(false);
        tf_nombre.setText("jTextField1");
        tf_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validacionLetras(evt);
            }
        });

        tf_nom_comp.setEditable(false);
        tf_nom_comp.setText("jTextField2");
        tf_nom_comp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_nom_comp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validacionLetras(evt);
            }
        });

        tf_anio.setEditable(false);
        tf_anio.setText("jTextField3");
        tf_anio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_anio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarNumeros(evt);
            }
        });

        tf_mes.setEditable(false);
        tf_mes.setText("jTextField3");
        tf_mes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarNumeros(evt);
            }
        });

        tf_dia.setEditable(false);
        tf_dia.setText("jTextField3");
        tf_dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarNumeros(evt);
            }
        });

        tf_pais.setEditable(false);
        tf_pais.setText("jTextField6");
        tf_pais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_pais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validacionLetras(evt);
            }
        });

        tf_pos.setEditable(false);
        tf_pos.setText("jTextField7");
        tf_pos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_pos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validacionLetras(evt);
            }
        });

        tf_altura.setEditable(false);
        tf_altura.setText("jTextField8");
        tf_altura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validacioDouble(evt);
            }
        });

        tf_peso.setEditable(false);
        tf_peso.setText("jTextField9");
        tf_peso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focus(evt);
            }
        });
        tf_peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validacioDouble(evt);
            }
        });

        panel_imagen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_imagenLayout = new javax.swing.GroupLayout(panel_imagen);
        panel_imagen.setLayout(panel_imagenLayout);
        panel_imagenLayout.setHorizontalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_imagenLayout.setVerticalGroup(
            panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        boton_imagen.setText("seleccionar");

        boton_nuevo.setText("Crear Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJugador(evt);
            }
        });

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJugador(evt);
            }
        });

        boton_modificar.setText("Modificar");
        boton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar(evt);
            }
        });

        boton_salir.setText("Salir");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir(evt);
            }
        });

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

        jLabel9.setText(" Dia       Mes     Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_modificar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo_lista)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(boton_nuevo)))
                            .addComponent(boton_eliminar))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_nombre)
                                            .addComponent(tf_nom_comp)
                                            .addComponent(tf_pais)
                                            .addComponent(tf_pos)
                                            .addComponent(tf_altura)
                                            .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(tf_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tf_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton_aceptar)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton_cancelar)
                                        .addGap(87, 87, 87)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(panel_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(boton_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGap(0, 21, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boton_eliminar, boton_modificar, boton_nuevo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_dia, tf_mes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_lista)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_nom_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tf_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_imagen)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_salir)
                            .addComponent(boton_aceptar)
                            .addComponent(boton_cancelar))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(boton_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_eliminar)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        boton_aceptar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar
        //seteo como seleccionado
        boton_modificar.setSelected(true);
        ocultarBotonesYactivarTextFields();
    }//GEN-LAST:event_modificar

    private void filaSeleccionada(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_filaSeleccionada
        lugar_lista = lista_jugadores.getSelectedIndex();
        if(lugar_lista != -1){
            id = (int) ids.get(lugar_lista);
            String fecha = "";
            try{
                ResultSet res = mbd.selectJugador(id);
                res.next();
                
                tf_nombre.setText(res.getString(2));
                tf_nom_comp.setText(res.getString(3));
                
                fecha = res.getString(4);
                tf_dia.setText(fecha.substring(8, 10));
                tf_mes.setText(fecha.substring(5, 7));
                tf_anio.setText(fecha.substring(0, 4));
                
                tf_pais.setText(res.getString(5));
                tf_pos.setText(res.getString(6));
                tf_altura.setText(res.getString(7)+" m");
                tf_peso.setText(res.getString(8)+" Kg");
            }
            catch(SQLException ex){
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_filaSeleccionada

    private void salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir
        dispose();
    }//GEN-LAST:event_salir

    private void eliminarJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJugador
        Statement st = mbd.getStatement();
        ResultSet res = null;
        String nombre = lista_jugadores.getSelectedValue().toString();
        
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar a "+nombre+"?", "Confirmacion", JOptionPane.OK_CANCEL_OPTION);
        
        if(confirmacion == 0){
            try{
                res = st.executeQuery("select * from jugador_partido where id_jugador="+id+" ");
                res.next();
                if(res.first()){
                    JOptionPane.showMessageDialog(this, "No se puede eliminar jugadores que hayan jugado partidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    st.executeUpdate("delete from jugadores_equipos where jugador="+id+" ");
                    st.executeUpdate("delete from jugadores where id_jugador="+id+" ");
                    modelo.remove(lugar_lista);
                    JOptionPane.showMessageDialog(this, "El jugador fue eliminado correctamente!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(SQLException ex){
                System.out.println(ex.toString());
            }
        }   
    }//GEN-LAST:event_eliminarJugador

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        //activar y hacer visibles salir, nuevo y eliminar. desativar el boton de la imagen
        boton_eliminar.setVisible(true);
        boton_salir.setVisible(true);
        boton_nuevo.setVisible(true);
        boton_imagen.setVisible(false);
        boton_modificar.setVisible(true);
        
        //hacer invisibles los botones aceptar y cancelar
        boton_aceptar.setVisible(false);
        boton_cancelar.setVisible(false);
        
        //hacer no editables los textfields
        tf_nombre.setEditable(false);
        tf_nom_comp.setEditable(false);
        tf_dia.setEditable(false);
        tf_mes.setEditable(false);
        tf_anio.setEditable(false);
        tf_pais.setEditable(false);
        tf_pos.setEditable(false);
        tf_altura.setEditable(false);
        tf_peso.setEditable(false);
        
        //activar la lista
        lista_jugadores.setEnabled(true);
        
        limpiarTextFields();
        
        boton_nuevo.setSelected(false);
        boton_modificar.setSelected(false);
    }//GEN-LAST:event_cancelar

    private void aceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar
        
        if(boton_nuevo.isSelected()){
            boolean alta_correcta;
            alta_correcta = altaJugador();
            
            if(alta_correcta){
                boton_nuevo.setSelected(false);
            }
        }
        if(boton_modificar.isSelected()){
            boolean modificacion_correcta;
            modificacion_correcta = modificarJugador();
            
            if(modificacion_correcta){
                boton_modificar.setSelected(false);
            }
        }
    }//GEN-LAST:event_aceptar

    private void nuevoJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJugador
        //seteo boton como seleccionado
        boton_nuevo.setSelected(true);
        ocultarBotonesYactivarTextFields();
        limpiarTextFields();
    }//GEN-LAST:event_nuevoJugador

    private void focus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focus
        if(boton_nuevo.isSelected() || boton_modificar.isSelected()){
            JTextField campo = (JTextField) evt.getSource();
            campo.selectAll();
        }
    }//GEN-LAST:event_focus

    private void validacionLetras(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validacionLetras
        char caracter = evt.getKeyChar();
        if(caracter >= '0' && caracter <= '9' && caracter != KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_validacionLetras

    private void validarNumeros(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validarNumeros
        char caracter = evt.getKeyChar();
        if((caracter < '0' || caracter > '9') && caracter != KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_validarNumeros

    private void validacioDouble(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validacioDouble
        char caracter = evt.getKeyChar();
        if((caracter < '0' || caracter > '9') && caracter != KeyEvent.VK_BACK_SPACE){
            if(caracter != ',' && caracter != '.'){
                evt.consume();
                JOptionPane.showMessageDialog(this, "Solo se permiten enteros y decimales", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_validacioDouble

    
    public boolean altaJugador(){
        String nom, nom_c, nac, pos;
        double altura, peso;
        int dia, mes, anio;
        Date fecha_nac = null;
        boolean alta_correcto = false;
        
        if(tf_nom_comp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo nombre completo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            nom = tf_nombre.getText();
            nom_c = tf_nom_comp.getText();
            Jugador jugador = new Jugador(nom_c);
            jugador.setNombre(nom);
            
            try{
                if(!"".equals(tf_dia.getText()) && !"".equals(tf_mes.getText()) && !"".equals(tf_anio.getText())){
                    dia = Integer.parseInt(tf_dia.getText());
                    mes = Integer.parseInt(tf_mes.getText());
                    anio = Integer.parseInt(tf_anio.getText());
                    fecha_nac = new Date(dia, mes, anio);
                    if( Date.esCorrecta(dia, mes, dia) ){
                        jugador.setF_nac(fecha_nac);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "La Fecha Ingresada No es Correcta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Ninguno de los campos de fecha puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Los campos de la fecha deben ser enteros", "Error", JOptionPane.ERROR_MESSAGE);
            }
            nac = tf_pais.getText();
            jugador.setNacionalidad(nac);
            pos = tf_pos.getText();
            jugador.setPosicion(pos);
            try{
                if(!"".equals(tf_altura.getText())) {
                    altura = Double.parseDouble(tf_altura.getText());
                }
                else{
                    altura = 0;
                }
                jugador.setAltura(altura);
                
                if(!"".equals(tf_peso.getText())) {
                    peso = Double.parseDouble(tf_peso.getText());
                }
                else{
                    peso = 0;
                }
                jugador.setPeso(peso);
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Los campos altura y peso deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            int id_generado = mbd.insertJugador(jugador);
            if(id_generado != 0){
                JOptionPane.showMessageDialog(this, "Se creo el jugador con id: "+id_generado, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                alta_correcto = true;
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo crear el jugador, intentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return alta_correcto;
    }
    public boolean modificarJugador(){
       String nom, nom_c, nac, pos;
        double altura, peso;
        int dia, mes, anio;
        Date fecha_nac = null;
        boolean modificacion_correcta = false;
        
        if(tf_nom_comp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo nombre completo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            nom = tf_nombre.getText();
            nom_c = tf_nom_comp.getText();
            Jugador jugador = new Jugador(nom_c);
            jugador.setNombre(nom);
            
            try{
                if(!"".equals(tf_dia.getText()) && !"".equals(tf_mes.getText()) && !"".equals(tf_anio.getText())){
                    dia = Integer.parseInt(tf_dia.getText());
                    mes = Integer.parseInt(tf_mes.getText());
                    anio = Integer.parseInt(tf_anio.getText());
                    fecha_nac = new Date(dia, mes, anio);
                    if( Date.esCorrecta(dia, mes, dia) ){
                        jugador.setF_nac(fecha_nac);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "La Fecha Ingresada No es Correcta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Ninguno de los campos de fecha puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Los campos de la fecha deben ser enteros", "Error", JOptionPane.ERROR_MESSAGE);
            }
            nac = tf_pais.getText();
            jugador.setNacionalidad(nac);
            pos = tf_pos.getText();
            jugador.setPosicion(pos);
            try{
                if(!"".equals(tf_altura.getText())) {
                    altura = Double.parseDouble(tf_altura.getText());
                }
                else{
                    altura = 0;
                }
                jugador.setAltura(altura);
                
                if(!"".equals(tf_peso.getText())) {
                    peso = Double.parseDouble(tf_peso.getText());
                }
                else{
                    peso = 0;
                }
                jugador.setPeso(peso);
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Los campos altura y peso deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            mbd.modificarJugador(jugador);
            JOptionPane.showMessageDialog(this, "El jugador fue modificado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            modificacion_correcta = true;
        }
       return modificacion_correcta;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_imagen;
    private javax.swing.JButton boton_modificar;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JButton boton_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista_jugadores;
    private javax.swing.JPanel panel_imagen;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_anio;
    private javax.swing.JTextField tf_dia;
    private javax.swing.JTextField tf_mes;
    private javax.swing.JTextField tf_nom_comp;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pais;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_pos;
    private javax.swing.JLabel titulo_lista;
    // End of variables declaration//GEN-END:variables
}
