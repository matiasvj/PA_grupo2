package Ventanas;

import Clases.Date;
import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AltaPartidoIndividual extends javax.swing.JDialog {

    private int seleccion_competicion=0;
    
    public AltaPartidoIndividual(java.awt.Frame parent, boolean modal) {
        super(parent,"Alta Partido Individual", modal);
        initComponents();
        listarCompInd();
    }
    List <Integer> lista_ids =  new ArrayList<>();
    ManejadorBD mbd = ManejadorBD.getInstancia();
    Statement st2 = mbd.getStatement();
    
    private void listarCompInd(){
        String tip ="Individual";
        
        DefaultListModel modelo = new DefaultListModel();
        list_comp.setModel(modelo);
        
        try {
             ResultSet ress = st2.executeQuery("select id_competicion, nombre from competiciones where tipo ='Individual'");
             while(ress.next()){
                 Object iten = ress.getObject("nombre");
                 lista_ids.add(Integer.parseInt(ress.getObject("id_competicion").toString()));
                 modelo.addElement(iten);
             }
             ress.close();
        
        } catch (SQLException ex) {
            System.out.println("aca"+ex.toString());
        }
        
    }
    
    private boolean validarFecha(int d, int m, int a){
        int diasDelMes[]={31,29,31,30,31,30,31,31,30,31,30,31};
        
        if(a<=0) {
            return false;
        }
        if(d<=0 || d>31) {
            return false;
        }
        if(m<=0 || m>12) {
            return false;
        }
        if(d>diasDelMes[m-1]) {
            return false;
        }
        if(m==2 && d==29 && !anioBisiesto(a)) {
            return false;
        }
        return true;
    }
    
    private boolean anioBisiesto(int a){
        if ((a%4==0) || (a%400==0) && (a%100!=0))
            return true;
        else
            return false;
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
        text_lugar = new javax.swing.JTextField();
        boton_donfirmar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        texto_dia = new javax.swing.JTextField();
        text_mes = new javax.swing.JTextField();
        texto_anio = new javax.swing.JTextField();
        text_hora = new javax.swing.JTextField();
        text_minutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label_visita = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_comp = new javax.swing.JList();
        boton_seleccionar_comp = new javax.swing.JButton();
        label_local = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_competicion.setText("Competicion");

        label1.setText("Local");

        label2.setText("Visitante");

        label3.setText("Fecha:         Dia");

        label4.setText("Mes");

        label5.setText("Año");

        lebel6.setText("Hora");

        label7.setText("Lugar");

        boton_donfirmar.setText("Confirmar");
        boton_donfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_donfirmarActionPerformed(evt);
            }
        });

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(":");

        label_visita.setText("No Seleccionado");

        jScrollPane1.setViewportView(list_comp);

        boton_seleccionar_comp.setText("Seleccionar");
        boton_seleccionar_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_seleccionar_compActionPerformed(evt);
            }
        });

        label_local.setText("No Seleccionado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(label_competicion)
                            .addComponent(label7)
                            .addComponent(label2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lebel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(text_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(label4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton_seleccionar_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label_local, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton_donfirmar)
                                        .addGap(36, 36, 36)
                                        .addComponent(boton_cancelar))
                                    .addComponent(label_visita, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_competicion)
                    .addComponent(boton_seleccionar_comp)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(label_local))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(label_visita))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5)
                    .addComponent(texto_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(text_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_donfirmar)
                    .addComponent(boton_cancelar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_seleccionar_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_seleccionar_compActionPerformed
        seleccion_competicion++;
        try{
            ResultSet res2= st2.executeQuery("select * from competiciones c, equipos el, equipos ev, partidos p where p.id_comp=c.id_competicion and el.id_equipos=p.equipolocal and ev.id_equipos=p.equipovisita and c.nombre='"+list_comp.getSelectedValue().toString()+"'");
            while (res2.next()){
                label_local.setText(res2.getObject("el.nombre").toString());
                label_visita.setText(res2.getObject("ev.nombre").toString());
            }
        
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_boton_seleccionar_compActionPerformed

    private void boton_donfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_donfirmarActionPerformed
        if (seleccion_competicion!=0){
        
        int dia=0, mes=0, anio=-5, hora=25, minuto=90;
        int flag=1;
        
        if (flag==1){
            Date fecha = null;
            try{
                if(!"".equals(texto_dia.getText()) && !"".equals(text_mes.getText()) && !"".equals(texto_anio.getText())){
                    dia = Integer.parseInt(texto_dia.getText());
                    mes = Integer.parseInt(text_mes.getText());
                    anio = Integer.parseInt(texto_anio.getText());
                    if (validarFecha(dia, mes, anio)) {
                        fecha = new Date(dia, mes, anio);
                    } else {
                        JOptionPane.showMessageDialog(this, "La fecha ingresada no es valida!", "Error", JOptionPane.ERROR_MESSAGE);
                        flag=0;
                    }
            }
            else{
                JOptionPane.showMessageDialog(this, "La fecha no puede ser vacia", "Error", JOptionPane.ERROR_MESSAGE);
                flag=0;
            }
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "La fecha ingresada es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                flag=0;
                System.out.println("esa aca"+e.toString());
            }
            if (flag ==1){
                try{
                    hora = Integer.parseInt(text_hora.getText());
                    minuto = Integer.parseInt(text_minutos.getText());
                    if (hora >23 || hora<0 || minuto<0 || minuto>59){
                        flag=0;
                        JOptionPane.showMessageDialog(this, "La hora ingresada es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(this, "La hora ingresada es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    flag=0;
                    System.out.println("error hora"+e.toString());
                }
            }
            if (flag==1){
                if (text_lugar.getText().equals("")){
                JOptionPane.showMessageDialog(this, "El campo lugar no fue modificado", "Error", JOptionPane.ERROR_MESSAGE);
                flag=0;
                } else {
                    try{
                    System.out.println("id = "+lista_ids.get(list_comp.getSelectedIndex()));
                    System.out.println("HOLA");
                    String horaa, minutoo;
                    if (hora<10) {
                            horaa="0"+hora;
                        }
                    else {
                            horaa = hora+"";
                        }
                    if (minuto<10) {
                            minutoo="0"+minuto+"00";
                        }
                    else {
                            minutoo = minuto+"00";
                        }
                    String hour = horaa+minutoo;
                    System.out.println("hora"+hour+" fecha"+fecha.DateToString()+" lugar"+text_lugar.getText());
                    mbd.setPartidoIndividual(lista_ids.get(list_comp.getSelectedIndex()), hour, fecha, text_lugar.getText());
                    JOptionPane.showMessageDialog(this, "Datos cargados correctamente!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    } catch(Exception e){
                        System.out.println("dsfgdsg"+e.toString());
                    }
                }
            }
        
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una competicion antes de setearla!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_donfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_donfirmar;
    private javax.swing.JButton boton_seleccionar_comp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JList list_comp;
    private javax.swing.JTextField text_hora;
    private javax.swing.JTextField text_lugar;
    private javax.swing.JTextField text_mes;
    private javax.swing.JTextField text_minutos;
    private javax.swing.JTextField texto_anio;
    private javax.swing.JTextField texto_dia;
    // End of variables declaration//GEN-END:variables
}
