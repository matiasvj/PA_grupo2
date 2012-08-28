
package Ventanas;

import Clases.ManejadorBD;
import Clases.Partido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class AsignarDividendos extends javax.swing.JDialog {
    String partidos;
    ManejadorBD mbd = ManejadorBD.getInstancia();
    List <Integer> Idselect = new ArrayList<>();
    Partido p = new Partido();
    
    public AsignarDividendos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Object Id, local, visita;
        try{
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            ResultSet part  = mbd.dividendos();
            
            while (part.next()) {
                Id = part.getObject("ID_Partido");
                local = part.getObject("E.nombre");
                visita = part.getObject("E1.nombre");
                String concat =Id+" - "+ local+" vs "+visita;
                Idselect.add((Integer)part.getObject(2));
                modeloCombo.addElement(concat);
                this.p.setId(Id.toString());
            }  ComboPartidos.setModel(modeloCombo);
        } catch (SQLException ex) {
            System.out.println("Error"+ex.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        LPartido = new javax.swing.JLabel();
        ComboPartidos = new javax.swing.JComboBox();
        LID = new javax.swing.JLabel();
        ShowID = new javax.swing.JLabel();
        LLocal = new javax.swing.JLabel();
        EquipoLocal = new javax.swing.JLabel();
        LVisitante = new javax.swing.JLabel();
        EquipoVisita = new javax.swing.JLabel();
        Local = new javax.swing.JTextField();
        Visitante = new javax.swing.JTextField();
        Lempate = new javax.swing.JLabel();
        Empate = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LPartido.setText("Partido: ");

        ComboPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPartidosActionPerformed(evt);
            }
        });

        LID.setText("Partido ID: ");

        ShowID.setText("...");

        LLocal.setText("Local:");

        EquipoLocal.setText("...");

        LVisitante.setText("Visitante: ");

        EquipoVisita.setText("...");

        Lempate.setText("Empate:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(LLocal)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LID)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lempate)
                                        .addComponent(LVisitante)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(Confirmar))
                                    .addComponent(EquipoVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EquipoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Local, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Visitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Empate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(ShowID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(LPartido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPartido)
                    .addComponent(ComboPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LID)
                    .addComponent(ShowID))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLocal)
                    .addComponent(EquipoLocal)
                    .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EquipoVisita)
                    .addComponent(LVisitante)
                    .addComponent(Visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lempate)
                    .addComponent(Empate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Confirmar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPartidosActionPerformed
        try {
            int Lugar = ComboPartidos.getSelectedIndex();
            Integer id = Idselect.get(Lugar);
            ResultSet resultado = mbd.selectPartidos(id);
            resultado.next();
            ShowID.setText(resultado.getString(2));
            EquipoLocal.setText(resultado.getString(13));
            EquipoVisita.setText(resultado.getString(15));
        } catch (SQLException ex) {
            System.out.println("Error: "+ex);
        }
        
    }//GEN-LAST:event_ComboPartidosActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        String empate = Empate.getText(), visita = Visitante.getText(),local = Local.getText(), ID = ShowID.getText() ;
        
        if(ID.equals("")){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un partido", "Error", JOptionPane.ERROR_MESSAGE);}
        else if(Visitante.equals("")) {
            try{
                double num =Double.parseDouble(Visitante.getText());
            }catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(this, "Caracter no valido", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        }
        else if(Local.equals("")){
            try{
                double num = Double.parseDouble(Local.getText());
            }catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(this, "Caracter no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        else if(Empate.equals("")){
            try{
                double num =Double.parseDouble(Empate.getText());
            }catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(this, "Caracter no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }  
        }
        else if(local.equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor en el Campo Local", "Error", JOptionPane.ERROR_MESSAGE);}
        else if(visita.equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor en el Campo Visitante", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(empate.equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor en el Campo Empate", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double l = Double.parseDouble(Local.getText()), v = Double.parseDouble(Visitante.getText()), e = Double.parseDouble(Empate.getText());
            int id = Integer.parseInt(p.getId()); 
            
            mbd.asignarDividendo(id,l,v,e);
            JOptionPane.showMessageDialog(this,"Se ha realizado la operacion exito", "",JOptionPane.INFORMATION_MESSAGE);
            LLocal.setText("");
            LVisitante.setText("");
            ShowID.setText("");
            Local.setText("");
            Visitante.setText("");
            Empate.setText("");
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboPartidos;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Empate;
    private javax.swing.JLabel EquipoLocal;
    private javax.swing.JLabel EquipoVisita;
    private javax.swing.JLabel LID;
    private javax.swing.JLabel LLocal;
    private javax.swing.JLabel LPartido;
    private javax.swing.JLabel LVisitante;
    private javax.swing.JLabel Lempate;
    private javax.swing.JTextField Local;
    private javax.swing.JLabel ShowID;
    private javax.swing.JTextField Visitante;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
