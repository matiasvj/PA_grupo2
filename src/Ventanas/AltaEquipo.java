
package Ventanas;
import Clases.Equipo;

import javax.swing.JOptionPane;

public class AltaEquipo extends javax.swing.JDialog {

    public AltaEquipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        boton_confirmar = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_nombre)
                .addGap(31, 31, 31)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(boton_confirmar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_confirmar))
                .addContainerGap(35, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(this, "Se creo el equipo con id: ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();            
        }
    }//GEN-LAST:event_confirmar_alta

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
