package Ventanas;

import Clases.ManejadorBD;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

public class FechaYhora extends javax.swing.JDialog {
    
    private Calendar cal = new GregorianCalendar();
    private Calendar actual = new GregorianCalendar();
    private String s_fecha, s_time;
    private int dia_resta, mes_resta, anio_resta, hora_resta, min_resta;
    private int new_dia=1, new_mes=8, new_anio=2010, new_hora=15, new_min=0;

    public FechaYhora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        label.setVisible(false);
        dia_text.setVisible(false);
        mes_text.setVisible(false);
        anio_text.setVisible(false);
        hora_text.setVisible(false);
        min_text.setVisible(false);
        boton_aplicar.setVisible(false);
        
    }
    
    public void obtenerFechaHora(){
        ManejadorBD Li=ManejadorBD.getInstancia();
        List Lista= new ArrayList();
        Lista=Li.ObtenerFechaHora();
        dia_resta=Integer.valueOf(Lista.get(0).toString());
        mes_resta=Integer.valueOf(Lista.get(1).toString());
        anio_resta=Integer.valueOf(Lista.get(2).toString());
        hora_resta=Integer.valueOf(Lista.get(3).toString());
        min_resta=Integer.valueOf(Lista.get(4).toString());
        int dia = actual.get(Calendar.DAY_OF_MONTH) + dia_resta;
        int mes = actual.get(Calendar.MONTH) + mes_resta + 1;
        int anio = actual.get(Calendar.YEAR) + anio_resta;
        
        int hora = actual.get(Calendar.HOUR_OF_DAY) + hora_resta;
        int min = actual.get(Calendar.MINUTE) + min_resta;
        if(min<0)
        {
            min=min+60;
            hora=hora-1;
        } else if (min>59){
            min=min-60;
            hora=hora+1;
            }
        
        if(hora<0)
        {
            dia=dia-1;
            hora=hora+24;
        } else if (hora>23){
            hora=hora-24;
            dia=dia+1;
            }
        
        if(dia<1)
        {
            mes=mes-1;
            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
            {
                dia=dia+31;
            }
            if(mes==2)
            {
                dia=dia+29;
            }
            if(mes==4 || mes==6 || mes==9 || mes==11)
            {
                dia=dia+30;
            }
        } else if (dia>28){
            if (mes==2){
                if (!((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                        dia=dia-28;
                        mes=mes+1;
                    } else if (dia>29){
                        dia=dia-29;
                        mes=mes+1;
                        }
                } else if((dia>30) && (mes==4 || mes==6 || mes==9 || mes==11)){
                        dia=dia-30;
                        mes=mes+1;
                    } else if (dia>31){
                            dia=dia-31;
                            mes=mes+1;
                        }
            }
        if(mes<1)
        {
            mes=mes+12;
            anio=anio-1;
        } else if (mes>12){
            mes=mes-12;
            anio=anio+1;
        }
        String diaa=dia+"", mess=mes+"", anioo=anio+"";
        if (dia<10){
            diaa="0"+diaa;
        }
        if (mes<10){
            mess="0"+mess;
        }
        
        s_fecha = diaa+"/"+mess+"/"+anioo;
        this.construirHora(hora, min);
        
        valor_fecha.setText(s_fecha);
        valor_hora.setText(s_time);
    }
    
    public void construirHora(int h, int m){
        String H = ""+h, M = ""+m;
        if(h < 10){
            H = "0"+h;
        }
        if(m < 10){
            M = "0"+m;
        }
        s_time = H+":"+M;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_fecha = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        valor_fecha = new javax.swing.JLabel();
        valor_hora = new javax.swing.JLabel();
        boton_iniciar_sistema = new javax.swing.JButton();
        cambiar_hora_fecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dia_text = new javax.swing.JTextField();
        mes_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        anio_text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hora_text = new javax.swing.JTextField();
        min_text = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        boton_aplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fecha y hora");

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_fecha.setText("Fecha:");

        label_hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_hora.setText("Hora:");

        valor_fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor_fecha.setText("dd/mm/aaaa");

        valor_hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor_hora.setText("hh:mm");

        boton_iniciar_sistema.setText("Iniciar Sistema");
        boton_iniciar_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniciar_sistemaActionPerformed(evt);
            }
        });

        cambiar_hora_fecha.setText("Configurar Fecha Y Hora");
        cambiar_hora_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_hora_fechaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Fecha Nueva:");

        jLabel2.setText("Día");

        mes_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes_textActionPerformed(evt);
            }
        });

        jLabel3.setText("Mes");

        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hora:");

        label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label.setText(":");

        boton_aplicar.setText("Aplicar");
        boton_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor_hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(boton_iniciar_sistema)
                                .addGap(18, 18, 18)
                                .addComponent(cambiar_hora_fecha)
                                .addGap(18, 18, 18)
                                .addComponent(boton_aplicar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(dia_text, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(mes_text, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(anio_text, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel5)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hora_text, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(min_text, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fecha)
                    .addComponent(valor_fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_hora)
                    .addComponent(valor_hora))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dia_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(mes_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(anio_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_iniciar_sistema)
                    .addComponent(cambiar_hora_fecha)
                    .addComponent(boton_aplicar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iniciar_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniciar_sistemaActionPerformed
        // TODO add your handling code here:
        new_dia=1; 
        new_mes=8; 
        new_anio=2010; 
        new_hora=15; 
        new_min=0;
        ManejadorBD Li=ManejadorBD.getInstancia();
        cal.set(new_anio, new_mes, new_dia);
        cal.set(Calendar.HOUR_OF_DAY, new_hora);
        cal.set(Calendar.MINUTE, new_min);
        
        dia_resta = cal.get(Calendar.DAY_OF_MONTH) - actual.get(Calendar.DAY_OF_MONTH);
        mes_resta = cal.get(Calendar.MONTH) - actual.get(Calendar.MONTH);
        anio_resta = cal.get(Calendar.YEAR) - actual.get(Calendar.YEAR);
        
        hora_resta = cal.get(Calendar.HOUR_OF_DAY) - actual.get(Calendar.HOUR_OF_DAY);
        min_resta = cal.get(Calendar.MINUTE) - actual.get(Calendar.MINUTE);
        Li.InsertarFechaHora(dia_resta,mes_resta,anio_resta,hora_resta,min_resta);
        System.out.println("Se Guardo");
        this.dispose();
    }//GEN-LAST:event_boton_iniciar_sistemaActionPerformed

    private void mes_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mes_textActionPerformed

    private void cambiar_hora_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_hora_fechaActionPerformed
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        label.setVisible(true);
        dia_text.setVisible(true);
        mes_text.setVisible(true);
        anio_text.setVisible(true);
        hora_text.setVisible(true);
        min_text.setVisible(true);
        boton_aplicar.setVisible(true);
        cambiar_hora_fecha.setVisible(false);
        boton_iniciar_sistema.setVisible(false);
    }//GEN-LAST:event_cambiar_hora_fechaActionPerformed

    private void boton_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aplicarActionPerformed
        if (!dia_text.getText().equals("") && !mes_text.getText().equals("") && !anio_text.getText().equals("") && !hora_text.getText().equals("") && !min_text.getText().equals("")){  
            new_dia=Integer.parseInt(dia_text.getText()); 
            new_mes=Integer.parseInt(mes_text.getText()); 
            new_anio=Integer.parseInt(anio_text.getText()); 
            new_hora=Integer.parseInt(hora_text.getText()); 
            new_min=Integer.parseInt(min_text.getText());

            ManejadorBD Li=ManejadorBD.getInstancia();
            cal.set(new_anio, new_mes-1, new_dia);
            cal.set(Calendar.HOUR_OF_DAY, new_hora);
            cal.set(Calendar.MINUTE, new_min);

            dia_resta = cal.get(Calendar.DAY_OF_MONTH) - actual.get(Calendar.DAY_OF_MONTH);
            mes_resta = cal.get(Calendar.MONTH) - actual.get(Calendar.MONTH);
            anio_resta = cal.get(Calendar.YEAR) - actual.get(Calendar.YEAR);

            hora_resta = cal.get(Calendar.HOUR_OF_DAY) - actual.get(Calendar.HOUR_OF_DAY);
            min_resta = cal.get(Calendar.MINUTE) - actual.get(Calendar.MINUTE);
            Li.InsertarFechaHora(dia_resta,mes_resta,anio_resta,hora_resta,min_resta);
            System.out.println("Se Guardo");
            this.dispose();
        } else {
                JOptionPane.showMessageDialog(this, "No puede dejar campos sin rellenar...", "Error", JOptionPane.ERROR_MESSAGE);
            
            }
        
    }//GEN-LAST:event_boton_aplicarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio_text;
    private javax.swing.JButton boton_aplicar;
    private javax.swing.JButton boton_iniciar_sistema;
    private javax.swing.JButton cambiar_hora_fecha;
    private javax.swing.JTextField dia_text;
    private javax.swing.JTextField hora_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JTextField mes_text;
    private javax.swing.JTextField min_text;
    private javax.swing.JLabel valor_fecha;
    private javax.swing.JLabel valor_hora;
    // End of variables declaration//GEN-END:variables
}
