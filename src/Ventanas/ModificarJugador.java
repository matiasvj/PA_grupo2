package Ventanas;

public class ModificarJugador extends javax.swing.JDialog {

    public ModificarJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo_lista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_jugadores = new javax.swing.JList();
        label_nombre = new javax.swing.JLabel();
        label_nom_comp = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_pos = new javax.swing.JLabel();
        label_nac = new javax.swing.JLabel();
        label_altura = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_nom_comp = new javax.swing.JTextField();
        campo_fecha = new javax.swing.JTextField();
        campo_pos = new javax.swing.JTextField();
        campo_nac = new javax.swing.JTextField();
        campo_altura = new javax.swing.JTextField();
        label_peso = new javax.swing.JLabel();
        campo_peso = new javax.swing.JTextField();
        boton_confirmar = new javax.swing.JButton();
        boton_selec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_titulo_lista.setText("Jugadores");

        jScrollPane2.setViewportView(lista_jugadores);

        label_nombre.setText("Nombre");

        label_nom_comp.setText("Nombre Completo");

        label_fecha.setText("Fecha Nacimiento");

        label_pos.setText("Posicion");

        label_nac.setText("Nacionalidad");

        label_altura.setText("Altura");

        campo_nom_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nom_compActionPerformed(evt);
            }
        });

        campo_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nacActionPerformed(evt);
            }
        });

        campo_altura.setText("     ");

        label_peso.setText("Peso");

        campo_peso.setText("     ");

        boton_confirmar.setText("Confirmar");

        boton_selec.setText("Seleccionar");
        boton_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_selecActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(label_titulo_lista)
                            .add(layout.createSequentialGroup()
                                .add(label_altura)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(campo_altura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(label_peso)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(campo_peso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(59, 59, 59)
                                .add(boton_confirmar))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(label_nac)
                                    .add(label_pos)
                                    .add(label_fecha)
                                    .add(label_nombre)
                                    .add(label_nom_comp))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(campo_nombre)
                                    .add(campo_nac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(campo_pos)
                                    .add(campo_fecha)
                                    .add(campo_nom_comp))))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(boton_selec)
                        .add(52, 52, 52))))
        );

        layout.linkSize(new java.awt.Component[] {campo_fecha, campo_nac, campo_nom_comp, campo_nombre, campo_pos}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.linkSize(new java.awt.Component[] {label_fecha, label_nac, label_nom_comp, label_nombre, label_pos}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(label_titulo_lista)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(label_nombre)
                            .add(campo_nombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(label_nom_comp)
                            .add(campo_nom_comp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(label_fecha)
                            .add(campo_fecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(label_pos)
                            .add(campo_pos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(label_nac)
                            .add(campo_nac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(label_altura)
                            .add(campo_altura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(label_peso)
                            .add(campo_peso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(boton_confirmar)))
                    .add(boton_selec))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {campo_fecha, campo_nac, campo_nom_comp, campo_nombre, campo_pos}, org.jdesktop.layout.GroupLayout.VERTICAL);

        layout.linkSize(new java.awt.Component[] {label_fecha, label_nac, label_nom_comp, label_nombre, label_pos}, org.jdesktop.layout.GroupLayout.VERTICAL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_selecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_selecActionPerformed

    private void campo_nom_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nom_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nom_compActionPerformed

    private void campo_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nacActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JButton boton_selec;
    private javax.swing.JTextField campo_altura;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_nac;
    private javax.swing.JTextField campo_nom_comp;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_peso;
    private javax.swing.JTextField campo_pos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_nac;
    private javax.swing.JLabel label_nom_comp;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_peso;
    private javax.swing.JLabel label_pos;
    private javax.swing.JLabel label_titulo_lista;
    private javax.swing.JList lista_jugadores;
    // End of variables declaration//GEN-END:variables
}
