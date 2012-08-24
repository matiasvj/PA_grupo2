
package Ventanas;
import Clases.Equipo;
import Clases.ManejadorBD;
import javax.swing.*;

public class AltaEquipo extends javax.swing.JDialog {

    public AltaEquipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        boton_confirmar = new javax.swing.JButton();
        panel_imagen = new javax.swing.JPanel();
        boton_imagen = new javax.swing.JButton();
        texto_nombre1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta Equipo");
        setResizable(false);

        texto_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_nombre.setText("Nombre");

        boton_confirmar.setText("Confirmar");
        boton_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_alta(evt);
            }
        });

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

        boton_imagen.setText("Seleccionar Imagen");

        texto_nombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_nombre1.setText("Imagen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_imagen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_confirmar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_nombre1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto_nombre)
                                .addGap(18, 18, 18)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boton_confirmar, boton_imagen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(texto_nombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_imagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_confirmar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmar_alta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_alta
        String nombre = campo_nombre.getText();
        if (nombre.equals("")){
            JOptionPane.showMessageDialog(this, "El campo nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Equipo eq = new Equipo(nombre);
            mbd.insertEquipo(eq);
            JOptionPane.showMessageDialog(this, "Se creo el equipo con id: "+eq.getId(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_confirmar_alta

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JButton boton_imagen;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JPanel panel_imagen;
    private javax.swing.JLabel texto_nombre;
    private javax.swing.JLabel texto_nombre1;
    // End of variables declaration//GEN-END:variables
}
