
public class Ventana extends javax.swing.JFrame {


    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra_menu = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_equipo = new javax.swing.JMenu();
        menu_jugador = new javax.swing.JMenu();
        menu_comp = new javax.swing.JMenu();
        menu_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Administrador");
        setBounds(new java.awt.Rectangle(200, 100, 500, 500));
        setName("ventana"); // NOI18N

        menu_archivo.setText("Archivo");
        barra_menu.add(menu_archivo);

        menu_equipo.setText("Equipo");
        barra_menu.add(menu_equipo);

        menu_jugador.setText("Jugador");
        barra_menu.add(menu_jugador);

        menu_comp.setText("Competicion");
        barra_menu.add(menu_comp);

        menu_ayuda.setText("Ayuda");
        barra_menu.add(menu_ayuda);

        setJMenuBar(barra_menu);

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
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_comp;
    private javax.swing.JMenu menu_equipo;
    private javax.swing.JMenu menu_jugador;
    // End of variables declaration//GEN-END:variables
}
