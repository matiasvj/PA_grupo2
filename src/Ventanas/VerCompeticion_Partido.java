/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author claudio
 */
public class VerCompeticion_Partido extends javax.swing.JDialog {

    /**
     * Creates new form VerCompeticion_Partido
     */
    public VerCompeticion_Partido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    VerCompeticion_Partido(VerCompeticion aThis, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EquipoLocal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EquipoVisitante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lugar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Finalizado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GolesLocal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GolesVisitante = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DividendoLocal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DividendoEmpate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DividendoVisitante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JugadorLocal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JugadorVisitante = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Equipo Local:");

        EquipoLocal.setText("Ejemplo1");

        jLabel2.setText("Equipo Visitante:");

        EquipoVisitante.setText("Ejemplo2");

        jLabel3.setText("Lugar:");

        Lugar.setText("Ejemplo3");

        jLabel4.setText("Fecha:");

        Fecha.setText("Ejemplo4");

        jLabel5.setText("Hora");

        Hora.setText("Ejemplo5");

        jLabel6.setText("Finalizado:");

        Finalizado.setText("Ejemplo6");

        jLabel7.setText("Goles Local:");

        GolesLocal.setText("Ejemplo7");

        jLabel8.setText("Goles Visitante:");

        GolesVisitante.setText("Ejemplo8");

        jLabel9.setText("Dividendo Local:");

        DividendoLocal.setText("Ejemplo9");

        jLabel10.setText("Dividendo Empate:");

        DividendoEmpate.setText("Ejemplo10");

        jLabel11.setText("Dividendo Visitante:");

        DividendoVisitante.setText("Ejemplo11");

        JugadorLocal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JugadorLocal);

        JugadorVisitante.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JugadorVisitante);

        jLabel12.setText("Jugadores Visitant");

        jLabel13.setText("Jugadores Local");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(30, 30, 30)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DividendoLocal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Finalizado)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(GolesLocal)
                                .addComponent(Hora, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Lugar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EquipoVisitante, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EquipoLocal, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(GolesVisitante)))
                    .addComponent(DividendoEmpate)
                    .addComponent(DividendoVisitante))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
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
                                .addComponent(jLabel5)
                                .addComponent(Hora))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(Finalizado))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(GolesLocal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(GolesVisitante, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(DividendoLocal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(DividendoEmpate))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(DividendoVisitante)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DividendoEmpate;
    private javax.swing.JLabel DividendoLocal;
    private javax.swing.JLabel DividendoVisitante;
    private javax.swing.JLabel EquipoLocal;
    private javax.swing.JLabel EquipoVisitante;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Finalizado;
    private javax.swing.JLabel GolesLocal;
    private javax.swing.JLabel GolesVisitante;
    private javax.swing.JLabel Hora;
    private javax.swing.JTable JugadorLocal;
    private javax.swing.JTable JugadorVisitante;
    private javax.swing.JLabel Lugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    // End of variables declaration//GEN-END:variables
}
