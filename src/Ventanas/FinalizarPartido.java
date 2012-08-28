
package Ventanas;

import Clases.ManejadorBD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FinalizarPartido extends javax.swing.JDialog {

    List Datos = new ArrayList();
    String ID_Actual;

    public FinalizarPartido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Competicion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Partido = new javax.swing.JTable();
        Lugar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EquipoVisitante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EquipoLocal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        BuscarC = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        NoJugaronVisitante = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GolesLocal = new javax.swing.JTextField();
        GolesVisitante = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NoJugaronLocal = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        BotonNoJugaronVisitante = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JugaronLocal = new javax.swing.JTable();
        BotonJugaronVisitante = new javax.swing.JButton();
        BotonNoJugaronLocal = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        JugaronVisitante = new javax.swing.JTable();
        BotonJugaronLocal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Competicion");

        Partido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Local", "Equipo Visitante", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Partido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PartidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Partido);

        Lugar.setText("Ejemplo3");

        jLabel4.setText("Fecha:");

        EquipoVisitante.setText("Ejemplo2");

        jLabel3.setText("Lugar:");

        EquipoLocal.setText("Ejemplo1");

        jLabel2.setText("Equipo Visitante:");

        jLabel5.setText("Equipo Local:");

        Fecha.setText("Ejemplo4");

        jLabel6.setText("Hora");

        Hora.setText("Ejemplo5");

        BuscarC.setText("Buscar");
        BuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel7.setText("No Jugaron");

        jLabel8.setText("Goles Local:");

        NoJugaronVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(NoJugaronVisitante);

        jLabel9.setText("Goles Visitante");

        jLabel10.setText("No Jugaron");

        jLabel11.setText("Jugaron");

        NoJugaronLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NoJugaronLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoJugaronLocalMouseClicked(evt);
            }
        });
        NoJugaronLocal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NoJugaronLocalFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(NoJugaronLocal);

        jLabel12.setText("Jugaron");

        BotonNoJugaronVisitante.setText("<<");
        BotonNoJugaronVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNoJugaronVisitanteActionPerformed(evt);
            }
        });

        JugaronLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JugaronLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JugaronLocalMouseClicked(evt);
            }
        });
        JugaronLocal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JugaronLocalFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(JugaronLocal);

        BotonJugaronVisitante.setText(">>");
        BotonJugaronVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugaronVisitanteActionPerformed(evt);
            }
        });

        BotonNoJugaronLocal.setText("<<");
        BotonNoJugaronLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNoJugaronLocalActionPerformed(evt);
            }
        });

        JugaronVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(JugaronVisitante);

        BotonJugaronLocal.setText(">>");
        BotonJugaronLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugaronLocalActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Hora, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Lugar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EquipoVisitante, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EquipoLocal, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Competicion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(BuscarC)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonJugaronLocal)
                                            .addComponent(BotonNoJugaronLocal))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(GolesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GolesVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(60, 60, 60))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonJugaronVisitante)
                                            .addComponent(BotonNoJugaronVisitante))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Guardar)
                        .addContainerGap(212, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Competicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuscarC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(EquipoLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(EquipoVisitante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Lugar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Hora))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(GolesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(GolesVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BotonJugaronLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonNoJugaronLocal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(BotonJugaronVisitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonNoJugaronVisitante)))
                .addGap(38, 38, 38)
                .addComponent(Guardar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PartidoMouseClicked
       
        ManejadorBD Li= ManejadorBD.getInstancia();
        DefaultTableModel modeloLocal=(DefaultTableModel) NoJugaronLocal.getModel();
        DefaultTableModel modeloVisitante=(DefaultTableModel) NoJugaronVisitante.getModel();
        DefaultTableModel modeloLocal2=(DefaultTableModel) JugaronLocal.getModel();
        DefaultTableModel modeloVisitante2=(DefaultTableModel) JugaronVisitante.getModel();
        List Lista= new ArrayList();
        List ListaLoc= new ArrayList();
        List ListaVis= new ArrayList();
        Lista=this.Datos;
        int valor=0;
        valor=Partido.getSelectedRow()*6;
        EquipoLocal.setText(String.valueOf(Lista.get(valor)));
        valor=(Partido.getSelectedRow()*6)+1;
        EquipoVisitante.setText(String.valueOf(Lista.get(valor)));
        valor=(Partido.getSelectedRow()*6)+2;
        Fecha.setText(String.valueOf(Lista.get(valor)));
        valor=(Partido.getSelectedRow()*6)+3;
        Hora.setText(String.valueOf(Lista.get(valor)));
        valor=(Partido.getSelectedRow()*6)+4;
        Lugar.setText(String.valueOf(Lista.get(valor)));
        valor=(Partido.getSelectedRow()*6)+5;
        this.ID_Actual=String.valueOf(Lista.get(valor));
        
         for(int b=0;b<modeloLocal.getRowCount();b++){
           modeloLocal.removeRow(0); 
        }
         for(int b=0;b<modeloLocal.getRowCount();b++){
           modeloLocal.removeRow(0); 
        }
         for(int b=0;b<modeloVisitante.getRowCount();b++){
           modeloVisitante.removeRow(0); 
        }
         for(int b=0;b<modeloVisitante.getRowCount();b++){
           modeloVisitante.removeRow(0); 
        }
         for(int b=0;b<modeloLocal2.getRowCount();b++){
           modeloLocal2.removeRow(0); 
        }
         for(int b=0;b<modeloLocal2.getRowCount();b++){
           modeloLocal2.removeRow(0); 
        }
         for(int b=0;b<modeloVisitante2.getRowCount();b++){
           modeloVisitante2.removeRow(0); 
        }
         for(int b=0;b<modeloVisitante2.getRowCount();b++){
           modeloVisitante2.removeRow(0); 
        }
       
        ListaLoc=Li.ObtenerJugador(EquipoLocal.getText());
        ListaVis=Li.ObtenerJugador(EquipoVisitante.getText());
        
        for(int i=0; i < ListaLoc.size(); i++){
            modeloLocal.addRow(new Object[1]);
            NoJugaronLocal.setValueAt(ListaLoc.get(i),i , 0);
        }
        for(int i=0; i < ListaVis.size(); i++){
            modeloVisitante.addRow(new Object[1]);
            NoJugaronVisitante.setValueAt(ListaVis.get(i),i , 0);
        }
    }//GEN-LAST:event_PartidoMouseClicked

    private void BuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCActionPerformed

        List Lista = new ArrayList();
	DefaultTableModel modelo=(DefaultTableModel) Partido.getModel(); 
	ManejadorBD Li = ManejadorBD.getInstancia();
        int filas=Partido.getRowCount();
        int count=0;
        
        Lista=Li.ListarPartidosCompeticion(Competicion.getText());  
        this.Datos=Lista;
        
        for(int b=0;b<filas;b++){
           modelo.removeRow(0); 
        }
        
        for(int i=0; i < Lista.size(); i++){
            modelo.addRow(new Object[filas]);
            Partido.setValueAt(Lista.get(i),count , 0);
            i++;
            Partido.setValueAt(Lista.get(i),count , 1);
            i++;
            Partido.setValueAt(Lista.get(i),count , 2);
            i++;
            i++;
            i++;
            count++;
        }
    }//GEN-LAST:event_BuscarCActionPerformed

    private void BotonJugaronLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugaronLocalActionPerformed
        if(NoJugaronLocal.getSelectedRow()!=-1){
            DefaultTableModel modeloJugaron=(DefaultTableModel) JugaronLocal.getModel(); 
            DefaultTableModel modeloNoJugaron=(DefaultTableModel) NoJugaronLocal.getModel();
            int fila=0;
            int cantjugaronloc=0;
            
            cantjugaronloc=JugaronLocal.getRowCount();
            fila=NoJugaronLocal.getSelectedRow();
            
            modeloJugaron.addRow(new Object[1]);
            JugaronLocal.setValueAt(NoJugaronLocal.getValueAt(fila, 0), cantjugaronloc, 0);
            modeloNoJugaron.removeRow(fila);
        }
    }//GEN-LAST:event_BotonJugaronLocalActionPerformed

    private void BotonNoJugaronLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNoJugaronLocalActionPerformed
        if(JugaronLocal.getSelectedRow()!=-1){
            DefaultTableModel modeloJugaron=(DefaultTableModel) JugaronLocal.getModel(); 
            DefaultTableModel modeloNoJugaron=(DefaultTableModel) NoJugaronLocal.getModel();
            
            int fila=0;
            int cantjugaronloc=0;
            
            cantjugaronloc=NoJugaronLocal.getRowCount();
            fila=JugaronLocal.getSelectedRow();
            
            modeloNoJugaron.addRow(new Object[1]);
            NoJugaronLocal.setValueAt(JugaronLocal.getValueAt(fila, 0), cantjugaronloc, 0);
            modeloJugaron.removeRow(fila);
        }
    }//GEN-LAST:event_BotonNoJugaronLocalActionPerformed

    private void BotonNoJugaronVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNoJugaronVisitanteActionPerformed
        if(JugaronVisitante.getSelectedRow()!=-1){
            DefaultTableModel modeloJugaron=(DefaultTableModel) JugaronVisitante.getModel(); 
            DefaultTableModel modeloNoJugaron=(DefaultTableModel) NoJugaronVisitante.getModel();
            
            int fila=0;
            int cantjugaronloc=0;
            
            cantjugaronloc=NoJugaronVisitante.getRowCount();
            fila=JugaronVisitante.getSelectedRow();
            
            modeloNoJugaron.addRow(new Object[1]);
            NoJugaronVisitante.setValueAt(JugaronVisitante.getValueAt(fila, 0), cantjugaronloc, 0);
            modeloJugaron.removeRow(fila);
        }
    }//GEN-LAST:event_BotonNoJugaronVisitanteActionPerformed

    private void BotonJugaronVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugaronVisitanteActionPerformed
        if(NoJugaronVisitante.getSelectedRow()!=-1){
            DefaultTableModel modeloJugaron=(DefaultTableModel) JugaronVisitante.getModel(); 
            DefaultTableModel modeloNoJugaron=(DefaultTableModel) NoJugaronVisitante.getModel();
            int fila=0;
            int cantjugaronloc=0;
            
            cantjugaronloc=JugaronVisitante.getRowCount();
            fila=NoJugaronVisitante.getSelectedRow();
            
            modeloJugaron.addRow(new Object[1]);
            JugaronVisitante.setValueAt(NoJugaronVisitante.getValueAt(fila, 0), cantjugaronloc, 0);
            modeloNoJugaron.removeRow(fila);
        }
    }//GEN-LAST:event_BotonJugaronVisitanteActionPerformed
    public boolean controlar(String check1, String check2)
    {
        if(check1.equalsIgnoreCase("") && check2.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this, "El Campo goles no peude estar vacio","Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }        
        if(this.isNumeric(check1) && this.isNumeric(check2))
        {
            if(Integer.valueOf(check1)<50 && Integer.valueOf(check2)<50)
            {
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Los goles no puede ser mayor a 50","Error", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Goles debe ser un numero","Error", JOptionPane.INFORMATION_MESSAGE);
             return false;
        }
    }
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
    private void NoJugaronLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoJugaronLocalMouseClicked
 
    }//GEN-LAST:event_NoJugaronLocalMouseClicked

    private void NoJugaronLocalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NoJugaronLocalFocusLost
      
    }//GEN-LAST:event_NoJugaronLocalFocusLost

    private void JugaronLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugaronLocalMouseClicked
  
    }//GEN-LAST:event_JugaronLocalMouseClicked

    private void JugaronLocalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JugaronLocalFocusLost
        
    }//GEN-LAST:event_JugaronLocalFocusLost

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        DefaultTableModel modeloJugaronLocal=(DefaultTableModel) JugaronLocal.getModel(); 
        DefaultTableModel modeloJugaronVis=(DefaultTableModel) JugaronVisitante.getModel();
        DefaultTableModel modeloPartido=(DefaultTableModel) Partido.getModel();
        if(Partido.getSelectedRow()!=-1)
        {
            if(modeloJugaronLocal.getRowCount() != 0 && modeloJugaronVis.getRowCount() != 0)
            {
                if(controlar(GolesLocal.getText(), GolesVisitante.getText())== true)
                {                
                List Local = new ArrayList();
                List Vis = new ArrayList();
                ManejadorBD Li = ManejadorBD.getInstancia();
                for(int i=0; i<JugaronLocal.getRowCount();i++){
                    Local.add(modeloJugaronLocal.getValueAt(i, 0));
                }
                for(int i=0; i<JugaronVisitante.getRowCount();i++){
                    Vis.add(modeloJugaronVis.getValueAt(i, 0));
                }
            
                Li.AgregarFinalizarPartido(Integer.parseInt(GolesLocal.getText()), Integer.parseInt(GolesVisitante.getText()), Local, Vis, this.ID_Actual);
                JOptionPane.showMessageDialog(this, "Se Finalizo Exitosamente","Informacion", JOptionPane.INFORMATION_MESSAGE);
                
                modeloPartido.removeRow(Partido.getSelectedRow());
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe Agregar Almenos 1 Jugador por Equipo","Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Seleccione un Partido","Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJugaronLocal;
    private javax.swing.JButton BotonJugaronVisitante;
    private javax.swing.JButton BotonNoJugaronLocal;
    private javax.swing.JButton BotonNoJugaronVisitante;
    private javax.swing.JButton BuscarC;
    private javax.swing.JTextField Competicion;
    private javax.swing.JLabel EquipoLocal;
    private javax.swing.JLabel EquipoVisitante;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTextField GolesLocal;
    private javax.swing.JTextField GolesVisitante;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Hora;
    private javax.swing.JTable JugaronLocal;
    private javax.swing.JTable JugaronVisitante;
    private javax.swing.JLabel Lugar;
    private javax.swing.JTable NoJugaronLocal;
    private javax.swing.JTable NoJugaronVisitante;
    private javax.swing.JTable Partido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
