package Ventanas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaYhora extends javax.swing.JDialog {
    
    private Calendar cal = new GregorianCalendar();
    private String s_fecha, s_time;

    public FechaYhora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void obtenerFechaHora(){
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1;
        int anio = cal.get(Calendar.YEAR);
        
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_configurar;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel valor_fecha;
    private javax.swing.JLabel valor_hora;
    // End of variables declaration//GEN-END:variables
}
