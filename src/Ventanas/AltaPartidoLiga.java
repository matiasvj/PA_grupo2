
package Ventanas;

import Clases.Date;
import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class AltaPartidoLiga extends javax.swing.JDialog {

    String Lig = "";
    Object  ID_C,ID,loc, visita;
    List <Integer> Idselect = new ArrayList<>();
    List <Integer> IdComp = new ArrayList<>();
    ManejadorBD mbd = ManejadorBD.getInstancia();
    public AltaPartidoLiga(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try{
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            ResultSet rs = mbd.selectLigas();
            while (rs.next()) {
                IdComp.add((Integer)rs.getObject("ID_Competicion"));
                 modeloCombo.addElement(rs.getObject("nombre"));
            }
            ComboLigas.setModel(modeloCombo);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPartidos = new javax.swing.JList();
        LabLigas = new javax.swing.JLabel();
        ComboLigas = new javax.swing.JComboBox();
        Agregar = new javax.swing.JButton();
        LigaSeleccionada = new javax.swing.JLabel();
        Lid = new javax.swing.JLabel();
        Lid2 = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JLabel();
        label_visitante = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        label_local = new javax.swing.JLabel();
        visitante = new javax.swing.JLabel();
        text_dia = new javax.swing.JTextField();
        text_mes = new javax.swing.JTextField();
        text_anio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        text_minutos = new javax.swing.JTextField();
        text_hora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_lugar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AltaPartidoLiga");

        jScrollPane1.setViewportView(ListaPartidos);

        LabLigas.setText("Liga: ");

        ComboLigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLigasActionPerformed(evt);
            }
        });

        Agregar.setText(">");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Lid.setText("Partido Id:");

        Fecha1.setText("Fecha:");

        label_visitante.setText("Local: ");

        label_local.setText("Visitante: ");

        jLabel1.setText("Hora: ");

        jLabel2.setText(":");

        text_lugar.setToolTipText("Lugar del encuentro");

        jLabel3.setText("Lugar:");

        jLabel4.setText("-");

        jLabel5.setText("-");

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabLigas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboLigas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lid2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LigaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_local)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(visitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_visitante)
                                        .addGap(23, 23, 23)
                                        .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Fecha1)
                                        .addGap(18, 18, 18)
                                        .addComponent(text_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabLigas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboLigas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(LigaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_visitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_local)
                            .addComponent(visitante, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(text_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Confirmar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboLigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLigasActionPerformed
        try{
            int Lugar = ComboLigas.getSelectedIndex();
            Integer id = IdComp.get(Lugar);
            DefaultListModel modelo = new DefaultListModel();
            ResultSet ps = mbd.selectPartidosNoFinalizados(id);
            while (ps.next()) {
                Idselect.add((Integer)ps.getObject("ID_partido"));
                ID = ps.getObject("ID_partido");
                loc = ps.getObject("e1.nombre");
                visita = ps.getObject("e2.nombre");
                String concat =  ID +" - "+loc+" vs "+visita;
                modelo.addElement(concat);
                }
            ListaPartidos.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_ComboLigasActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            // TODO add your handling code here:
            int Lugar = ListaPartidos.getSelectedIndex();
            Integer id = Idselect.get(Lugar);
            Lid2.setText(id.toString());
            ResultSet psp = mbd.selectPartidos(id);
            psp.next();
            visitante.setText(psp.getObject("e2.nombre").toString());
            local.setText(psp.getObject("e1.nombre").toString());
        } catch (SQLException ex) {
            Logger.getLogger(AltaPartidoLiga.class.getName()).log(Level.SEVERE, null, ex);
        }
        Lig = ComboLigas.getSelectedItem().toString();
        LigaSeleccionada.setText(Lig);
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // TODO add your handling code here:
        if (!Lid2.getText().equals("")){
        
        int dia=0, mes=0, anio=-5, hora=25, minuto=90;
        int flag=1;
        
        if (flag==1){
            Date fecha = null;
            try{
                if(!"".equals(text_dia.getText()) && !"".equals(text_mes.getText()) && !"".equals(text_anio.getText())){
                    dia = Integer.parseInt(text_dia.getText());
                    mes = Integer.parseInt(text_mes.getText());
                    anio = Integer.parseInt(text_anio.getText());
                    if (validarFecha(dia, mes, anio)) {
                        fecha = new Date(dia, mes, anio);
                    } else {
                        text_dia.setText("");
                        text_mes.setText("");
                        text_anio.setText("");
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
                    mbd.PartidoLiga(IdComp.get(ComboLigas.getSelectedIndex()), hour, fecha, text_lugar.getText(),Lid2.getText());
                    JOptionPane.showMessageDialog(this, "Datos cargados correctamente!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    } catch(Exception e){
                        System.out.println("Error"+e.toString());
                    }
                }
            }
        
        }
    } else {
        JOptionPane.showMessageDialog(this, "Primero seleccione una Liga", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

   
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox ComboLigas;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel LabLigas;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Lid2;
    private javax.swing.JLabel LigaSeleccionada;
    private javax.swing.JList ListaPartidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_local;
    private javax.swing.JLabel label_visitante;
    private javax.swing.JLabel local;
    private javax.swing.JTextField text_anio;
    private javax.swing.JTextField text_dia;
    private javax.swing.JTextField text_hora;
    private javax.swing.JTextField text_lugar;
    private javax.swing.JTextField text_mes;
    private javax.swing.JTextField text_minutos;
    private javax.swing.JLabel visitante;
    // End of variables declaration//GEN-END:variables
}
