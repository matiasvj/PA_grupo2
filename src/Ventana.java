
public class Ventana extends javax.swing.JFrame {


    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_equipo = new javax.swing.JMenu();
        menu_jugador = new javax.swing.JMenu();
        menu_comp = new javax.swing.JMenu();
        menu_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_archivo.setText("Archivo");
        jMenuBar1.add(menu_archivo);

        menu_equipo.setText("Equipo");
        jMenuBar1.add(menu_equipo);

        menu_jugador.setText("Jugador");
        jMenuBar1.add(menu_jugador);

        menu_comp.setText("Competicion");
        jMenuBar1.add(menu_comp);

        menu_ayuda.setText("Ayuda");
        jMenuBar1.add(menu_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_comp;
    private javax.swing.JMenu menu_equipo;
    private javax.swing.JMenu menu_jugador;
    // End of variables declaration//GEN-END:variables
}
