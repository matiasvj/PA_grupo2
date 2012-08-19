package Ventanas;
import Clases.*;

public class AltaJugador extends javax.swing.JInternalFrame {

    public AltaJugador() {
        initComponents();
        Jugador jug = new Jugador(campo_nombre.getText(), campo_nombre_completo.getText(), campo_nacionalidad.getText(),
                new Date(16,3,1991), campo_posicion.getText(), 1.93, 75.0);
        //falta terminar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab_nombre = new javax.swing.JLabel();
        lab_nom_completo = new javax.swing.JLabel();
        lab_nacionalidad = new javax.swing.JLabel();
        lab_posicion = new javax.swing.JLabel();
        lab_fecha_nacimiento = new javax.swing.JLabel();
        lab_altura = new javax.swing.JLabel();
        lab_peso = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_nombre_completo = new javax.swing.JTextField();
        campo_fecha = new javax.swing.JTextField();
        campo_nacionalidad = new javax.swing.JTextField();
        campo_posicion = new javax.swing.JTextField();
        campo_altura = new javax.swing.JTextField();
        campo_peso = new javax.swing.JTextField();
        boton_confirmar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boton_sel_imagen = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alta Jugador");

        lab_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_nombre.setText("Nombre");

        lab_nom_completo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_nom_completo.setText("Nombre Completo");

        lab_nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_nacionalidad.setText("Nacionalidad");

        lab_posicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_posicion.setText("Posicion");

        lab_fecha_nacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_fecha_nacimiento.setText("Fecha de Nacimiento");

        lab_altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_altura.setText("Altura");

        lab_peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_peso.setText("Peso");

        campo_nombre.setColumns(15);
        campo_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_nombre.setToolTipText("");

        campo_nombre_completo.setColumns(15);
        campo_nombre_completo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_nombre_completo.setToolTipText("");

        campo_fecha.setColumns(15);
        campo_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_fecha.setToolTipText("");

        campo_nacionalidad.setColumns(15);
        campo_nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_nacionalidad.setToolTipText("");

        campo_posicion.setColumns(15);
        campo_posicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_posicion.setToolTipText("");

        campo_altura.setColumns(15);
        campo_altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_altura.setToolTipText("");

        campo_peso.setColumns(15);
        campo_peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_peso.setToolTipText("");

        boton_confirmar.setText("Confirmar");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        boton_sel_imagen.setText("Seleccionar imagen...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_nom_completo)
                            .addComponent(lab_nacionalidad)
                            .addComponent(lab_posicion)
                            .addComponent(lab_altura)
                            .addComponent(lab_peso)
                            .addComponent(lab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_nombre_completo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_nacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_posicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_altura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_peso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lab_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(boton_sel_imagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_confirmar)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_nombre)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_nom_completo)
                            .addComponent(campo_nombre_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_fecha_nacimiento)
                            .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_nacionalidad)
                            .addComponent(campo_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_posicion)
                            .addComponent(campo_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_altura)
                            .addComponent(campo_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_peso)
                            .addComponent(campo_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_sel_imagen)
                    .addComponent(boton_confirmar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JButton boton_sel_imagen;
    private javax.swing.JTextField campo_altura;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_nacionalidad;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_nombre_completo;
    private javax.swing.JTextField campo_peso;
    private javax.swing.JTextField campo_posicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab_altura;
    private javax.swing.JLabel lab_fecha_nacimiento;
    private javax.swing.JLabel lab_nacionalidad;
    private javax.swing.JLabel lab_nom_completo;
    private javax.swing.JLabel lab_nombre;
    private javax.swing.JLabel lab_peso;
    private javax.swing.JLabel lab_posicion;
    // End of variables declaration//GEN-END:variables
}
