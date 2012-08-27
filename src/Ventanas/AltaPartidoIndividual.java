
package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class AltaPartidoIndividual extends javax.swing.JDialog {

    public AltaPartidoIndividual(java.awt.Frame parent, boolean modal) {
        super(parent,"Alta Partido Individual", modal);
        initComponents();
        listarCompInd();
    }
    
    ManejadorBD mbd = ManejadorBD.getInstancia();
    Statement st = mbd.getStatement();
    
    private void listarCompInd(){
        
        
        ResultSet res;
        Object nombre;
        String tip ="Individual";
                
        try {
             res = st.executeQuery("select id_competicion, nombre from competiciones where tipo = '"+tip+"'");
             while(res.next()){
                 combo_comp.addItem(res.getObject("Nombre").toString());
             }
        
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_competicion = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        lebel6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        combo_comp = new javax.swing.JComboBox();
        boton_donfirmar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        texto_fecha = new javax.swing.JTextField();
        text_mes = new javax.swing.JTextField();
        texto_anio = new javax.swing.JTextField();
        text_hora = new javax.swing.JTextField();
        text_minutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        div_visitante = new javax.swing.JTextField();
        div_local = new javax.swing.JTextField();
        label_local = new javax.swing.JLabel();
        label_visita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_competicion.setText("Competicion");

        label1.setText("Local");

        label2.setText("Visitante");

        label3.setText("Fecha");

        label4.setText("Mes");

        label5.setText("Año");

        lebel6.setText("Hora");

        label7.setText("Lugar");

        combo_comp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        combo_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_compActionPerformed(evt);
            }
        });

        boton_donfirmar.setText("Confirmar");

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });

        texto_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_fechaActionPerformed(evt);
            }
        });

        text_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_horaActionPerformed(evt);
            }
        });

        text_minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_minutosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(":");

        jLabel2.setText("Paga");

        jLabel3.setText("Paga");

        div_visitante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        div_visitante.setText("1,00");

        div_local.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        div_local.setText("1,00");
        div_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_localActionPerformed(evt);
            }
        });

        label_local.setText("jLabel4");

        label_visita.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_competicion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(text_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addGap(18, 18, 18)
                                    .addComponent(texto_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 86, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(text_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(label4)
                                            .addGap(18, 18, 18)
                                            .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(label5)
                                            .addGap(18, 18, 18)
                                            .addComponent(texto_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(div_local, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(div_visitante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_donfirmar)
                                .addGap(36, 36, 36)
                                .addComponent(boton_cancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lebel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label1)
                                        .addComponent(label2))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_local, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_visita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_competicion)
                    .addComponent(combo_comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(jLabel2)
                    .addComponent(div_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_local))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(jLabel3)
                    .addComponent(div_visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_visita))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5)
                    .addComponent(texto_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lebel6)
                    .addComponent(text_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_donfirmar)
                    .addComponent(boton_cancelar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void texto_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_fechaActionPerformed

    private void text_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_horaActionPerformed

    private void text_minutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_minutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_minutosActionPerformed

    private void div_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div_localActionPerformed

    private void combo_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_compActionPerformed
        try{
        ResultSet partid = st.executeQuery("select * from partidos p, competiciones c, equipos el, equipos ev "+
                "where p.id_comp = c.id_competicion and el.id_equipos = p.EquipoLocal and p.EquipoVisita = ev.id_equipos "+
                "and c.nombre = '"+combo_comp.getSelectedObjects().toString()+"'");
        
        
        
        while (partid.next()){
            label_visita.setText(partid.getObject("ev.nombre").toString());
            label_local.setText(partid.getObject("el.nombre").toString());
        }
        } catch(SQLException e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_combo_compActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_donfirmar;
    private javax.swing.JComboBox combo_comp;
    private javax.swing.JTextField div_local;
    private javax.swing.JTextField div_visitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label_competicion;
    private javax.swing.JLabel label_local;
    private javax.swing.JLabel label_visita;
    private javax.swing.JLabel lebel6;
    private javax.swing.JTextField text_hora;
    private javax.swing.JTextField text_mes;
    private javax.swing.JTextField text_minutos;
    private javax.swing.JTextField texto_anio;
    private javax.swing.JTextField texto_fecha;
    // End of variables declaration//GEN-END:variables
}
