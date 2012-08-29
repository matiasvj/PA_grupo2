package Ventanas;

import Clases.ManejadorBD;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class FechaYhora extends javax.swing.JDialog {
    
    private Calendar cal = new GregorianCalendar();
    private Calendar actual = new GregorianCalendar();
    private String s_fecha, s_time;
    private int dia_resta, mes_resta, anio_resta, hora_resta, min_resta;

    public FechaYhora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
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
        }
        if(hora<0)
        {
            dia=dia-1;
        }
        if(dia<1)
        {
            mes=mes-1;
            if(mes==1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10 && mes==12)
            {
                dia=dia+31;
            }
            if(mes==2)
            {
                dia=dia+29;
            }
            if(mes==4 && mes==6 && mes==9 && mes==11)
            {
                dia=dia+30;
            }
        }
        if(mes<1)
        {
            mes=mes+12;
            anio=anio-1;
        }
        
        s_fecha = dia+"/"+mes+"/"+anio;
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
        boton_configurar = new javax.swing.JButton();

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

        boton_configurar.setText("Configurar Fecha y hora");
        boton_configurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_configurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valor_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor_hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_configurar)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(boton_configurar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_configurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_configurarActionPerformed
        // TODO add your handling code here:
        
        ManejadorBD Li=ManejadorBD.getInstancia();
        cal.set(2010, 8, 1);
        cal.set(Calendar.HOUR_OF_DAY, 15);
        cal.set(Calendar.MINUTE, 00);
        
        dia_resta = cal.get(Calendar.DAY_OF_MONTH) - actual.get(Calendar.DAY_OF_MONTH);
        mes_resta = cal.get(Calendar.MONTH) - actual.get(Calendar.MONTH);
        anio_resta = cal.get(Calendar.YEAR) - actual.get(Calendar.YEAR);
        
        hora_resta = cal.get(Calendar.HOUR_OF_DAY) - actual.get(Calendar.HOUR_OF_DAY);
        min_resta = cal.get(Calendar.MINUTE) - actual.get(Calendar.MINUTE);
        Li.InsertarFechaHora(dia_resta,mes_resta,anio_resta,hora_resta,min_resta);
        System.out.println("Se Guardo");
    }//GEN-LAST:event_boton_configurarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_configurar;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel valor_fecha;
    private javax.swing.JLabel valor_hora;
    // End of variables declaration//GEN-END:variables
}
