package Ventanas;

import Clases.ManejadorBD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class DetallesPartido extends javax.swing.JDialog {

    ManejadorBD Li = ManejadorBD.getInstancia();
    public DetallesPartido(java.awt.Frame parent, boolean modal,List datos) {
        super(parent,"Detalles de Partido", modal);        
        initComponents();
        setearDatos(datos);
    }
    
    int idPart;
    String partido;
    
    private void AgregarJugadores(List datos)
    {
        DefaultTableModel modeloLocal=(DefaultTableModel) ListaLocal.getModel();
        DefaultTableModel modeloVisitante=(DefaultTableModel) ListaVisitante.getModel();
        List Nueva= new ArrayList();        
        ManejadorBD Li = ManejadorBD.getInstancia();
        Nueva=Li.ObtenerJugadores(datos.get(0).toString(), datos.get(3).toString());
        for(int i=0;i<Nueva.size();i++)
        {
            modeloLocal.addRow(new Object[0]); 
            ListaLocal.setValueAt(Nueva.get(i),i , 0);
        }
        Nueva=Li.ObtenerJugadores(datos.get(1).toString(), datos.get(3).toString());
        for(int i=0;i<Nueva.size();i++)
        {
            modeloVisitante.addRow(new Object[0]); 
            ListaVisitante.setValueAt(Nueva.get(i),i , 0);
        }
    }
    private void setearDatos(List datos){
        Fecha.setText(datos.get(2).toString());
        Lugar.setText(datos.get(10).toString());
        Nombre.setText(datos.get(0).toString()+" Vs "+datos.get(1).toString());
        DivLocal.setText("--");
        DivEmpate.setText("--");
        DivVisitante.setText("--");
        
        if("false".equals(datos.get(9).toString()))
        {
            Resultado.setText("No se Ha Jugado el Partido");
        }
        else
        {
            this.AgregarJugadores(datos);
            DivLocal.setText(datos.get(6).toString());
            DivEmpate.setText(datos.get(8).toString());
            DivVisitante.setText(datos.get(7).toString());
            Nombre.setText(datos.get(4).toString()+" "+datos.get(0).toString()+" Vs "+datos.get(1).toString()+" "+datos.get(5).toString());
            if(datos.get(4)==datos.get(5))
            {
                Resultado.setText("Empate");
            }
            else
            {
                if(Integer.valueOf(datos.get(4).toString()) < Integer.valueOf(datos.get(5).toString()))
                {
                    Resultado.setText("Gano "+datos.get(1).toString());
                }
                else
                {
                    Resultado.setText("Gano "+datos.get(0).toString());
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DivLocal = new javax.swing.JLabel();
        DivEmpate = new javax.swing.JLabel();
        DivVisitante = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Lugar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaVisitante = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaLocal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nombre.setText("jLabel1");

        jLabel1.setText("Resultado");

        jLabel2.setText("Fecha");

        jLabel3.setText("Lugar");

        jLabel4.setText("Dividendo");

        lab.setText("Local");

        lab2.setText("Empate");

        jLabel9.setText("Visitante");

        DivLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DivLocal.setText("-");

        DivEmpate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DivEmpate.setText("-");

        DivVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DivVisitante.setText("-");

        Resultado.setText("Sin definir");

        Fecha.setText("Sin definir");

        Lugar.setText("Sin definir");

        jLabel5.setText("Plantel Local");

        jLabel7.setText("Plantel Visitante");

        ListaVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ListaVisitante);

        ListaLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(ListaLocal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(DivLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(DivEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(DivVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Resultado)
                                    .addComponent(Fecha)
                                    .addComponent(Lugar))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nombre)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(68, 68, 68))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Resultado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Fecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lugar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lab)
                    .addComponent(DivLocal)
                    .addComponent(lab2)
                    .addComponent(DivEmpate)
                    .addComponent(jLabel9)
                    .addComponent(DivVisitante))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DivEmpate;
    private javax.swing.JLabel DivLocal;
    private javax.swing.JLabel DivVisitante;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTable ListaLocal;
    private javax.swing.JTable ListaVisitante;
    private javax.swing.JLabel Lugar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab2;
    // End of variables declaration//GEN-END:variables
}
