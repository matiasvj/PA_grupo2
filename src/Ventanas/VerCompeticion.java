package Ventanas;

import Clases.ManejadorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VerCompeticion extends javax.swing.JDialog {

    public VerCompeticion(java.awt.Frame parent, boolean modal) {
        super(parent,"Ver Competicion", modal);
        initComponents();
        listarCompeticiones();
        
    }

    ManejadorBD mbd = ManejadorBD.getInstancia();
    Statement st = mbd.getStatement();
    List <Integer> ids = new ArrayList<>();
    
    private void listarCompeticiones(){
        ResultSet res;
        Object compet;
        
        DefaultListModel modelo = new DefaultListModel();
        lista_comp.setModel(modelo);
        
        
        try {
             res = st.executeQuery("select ID_Competicion, Nombre from competiciones");
             while(res.next()){
                 compet = res.getObject(2);
                 modelo.addElement(compet);
             }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    
    }
    
    private void llenarPartidos(){
        ResultSet res;
        ResultSet res2;
        ResultSet res3;
        
        DefaultListModel modelo = new DefaultListModel();
        lista_part.setModel(modelo);
        int id=0;
        try {
             String nomb = lista_comp.getSelectedValue().toString();
             res2 = st.executeQuery("select ID_Competicion from competiciones where Nombre='"+nomb+"'");
             while(res2.next()){
                id = (int)res2.getObject(1);
             }
             System.out.println("id="+id);
             ResultSet part = mbd.selectPartidosCompeticion(id);
             
             while(part.next()){
                 String item = part.getObject("E.nombre").toString()+" vs "+part.getObject("E1.nombre").toString();
                 ids.add((Integer)part.getObject("p.id_partido"));
                 modelo.addElement(item);
             }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_competicion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_comp = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        label_tipo = new javax.swing.JLabel();
        label_anio = new javax.swing.JLabel();
        boton_competicion = new javax.swing.JButton();
        nombre_comp = new javax.swing.JLabel();
        tipo_comp = new javax.swing.JLabel();
        anio_comp = new javax.swing.JLabel();
        id_comp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_part = new javax.swing.JList();
        boton_partido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo_competicion.setText("Elija una competicion:");

        jScrollPane1.setViewportView(lista_comp);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Detalles:");

        label_nombre.setText("Nombre:");

        label_id.setText("ID:");

        label_tipo.setText("Tipo:");

        label_anio.setText("Año:");

        boton_competicion.setText("Ver Detalles");
        boton_competicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_competicionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Partidos:");

        jScrollPane2.setViewportView(lista_part);

        boton_partido.setText("Detalles Partido");
        boton_partido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_partidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo_competicion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel2)
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(id_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nombre_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(anio_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tipo_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_competicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_partido)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_competicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_competicion)
                            .addComponent(boton_partido)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_nombre)
                                    .addComponent(nombre_comp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_tipo)
                                    .addComponent(tipo_comp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_anio)
                                    .addComponent(anio_comp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_id)
                                    .addComponent(id_comp)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_competicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_competicionActionPerformed
        
        
        Object nombre = lista_comp.getSelectedValue();
        ResultSet res;
        
        try {
             llenarPartidos();
             res = st.executeQuery("select ID_Competicion, Nombre, Tipo, anio from competiciones where Nombre='"+nombre.toString()+"'");
             res.next();
             String id = res.getObject(1).toString();
             id_comp.setText(id);
             String nom = res.getObject(2).toString();
             nombre_comp.setText(nom);
             String anio = res.getObject(4).toString();
             anio_comp.setText(anio);
             String tipo = res.getObject(3).toString();
             tipo_comp.setText(tipo);
        } catch (SQLException ex) {
            System.out.println("Error"+ex);
        }
        
    }//GEN-LAST:event_boton_competicionActionPerformed

    private void boton_partidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_partidoActionPerformed
        try{
        System.out.println(ids.get(lista_part.getSelectedIndex()));
        DetallesPartido dp = new DetallesPartido(null, true, ids.get(lista_part.getSelectedIndex()), lista_part.getSelectedValue().toString());
        dp.setLocation(250, 180);
        dp.setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Debe seleccionar partido para ver detalles", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_partidoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anio_comp;
    private javax.swing.JButton boton_competicion;
    private javax.swing.JButton boton_partido;
    private javax.swing.JLabel id_comp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_anio;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_tipo;
    private javax.swing.JList lista_comp;
    private javax.swing.JList lista_part;
    private javax.swing.JLabel nombre_comp;
    private javax.swing.JLabel tipo_comp;
    private javax.swing.JLabel titulo_competicion;
    // End of variables declaration//GEN-END:variables
}
