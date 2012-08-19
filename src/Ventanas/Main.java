package Ventanas;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barra_menu = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        menu_equipo = new javax.swing.JMenu();
        crear_equipo = new javax.swing.JMenuItem();
        ver_equipo = new javax.swing.JMenuItem();
        menu_jugador = new javax.swing.JMenu();
        crear_jugador = new javax.swing.JMenuItem();
        ver_jugador = new javax.swing.JMenuItem();
        modificar_jugador = new javax.swing.JMenuItem();
        eliminar_jugador = new javax.swing.JMenuItem();
        menu_comp = new javax.swing.JMenu();
        nueva_competicion = new javax.swing.JMenu();
        individual = new javax.swing.JMenuItem();
        liga = new javax.swing.JMenuItem();
        ver_informacion = new javax.swing.JMenuItem();
        partido = new javax.swing.JMenu();
        partido_individual = new javax.swing.JMenuItem();
        partido_liga = new javax.swing.JMenuItem();
        dividendos = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Administrador");
        setBounds(new java.awt.Rectangle(200, 100, 800, 600));
        setName("ventana"); // NOI18N
        setResizable(false);

        menu_archivo.setText("Archivo");
        menu_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_archivoActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu_archivo.add(salir);

        barra_menu.add(menu_archivo);

        menu_equipo.setText("Equipo");

        crear_equipo.setText("Crear Equipo");
        crear_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEquipo(evt);
            }
        });
        menu_equipo.add(crear_equipo);

        ver_equipo.setText("Ver  Equipo");
        ver_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_equipoActionPerformed(evt);
            }
        });
        menu_equipo.add(ver_equipo);

        barra_menu.add(menu_equipo);

        menu_jugador.setText("Jugador");

        crear_jugador.setText("Crear Jugador");
        crear_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_jugadorActionPerformed(evt);
            }
        });
        menu_jugador.add(crear_jugador);

        ver_jugador.setText("Ver Informacion");
        ver_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_jugadorActionPerformed(evt);
            }
        });
        menu_jugador.add(ver_jugador);

        modificar_jugador.setText("Modificar Informacion");
        menu_jugador.add(modificar_jugador);

        eliminar_jugador.setText("Eliminar Jugador");
        menu_jugador.add(eliminar_jugador);

        barra_menu.add(menu_jugador);

        menu_comp.setText("Competicion");

        nueva_competicion.setText("Nueva Competicion");

        individual.setText("Individual");
        nueva_competicion.add(individual);

        liga.setText("Liga");
        nueva_competicion.add(liga);

        menu_comp.add(nueva_competicion);

        ver_informacion.setText("Ver Informacion");
        ver_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_informacionActionPerformed(evt);
            }
        });
        menu_comp.add(ver_informacion);

        partido.setText("Partido");

        partido_individual.setText("Individual");
        partido_individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partido_individualActionPerformed(evt);
            }
        });
        partido.add(partido_individual);

        partido_liga.setText("De Liga");
        partido_liga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partido_ligaActionPerformed(evt);
            }
        });
        partido.add(partido_liga);

        menu_comp.add(partido);

        dividendos.setText("Dividendos");
        menu_comp.add(dividendos);

        barra_menu.add(menu_comp);

        menu_ayuda.setText("Ayuda");
        barra_menu.add(menu_ayuda);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearEquipo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEquipo
        // TODO add your handling code here:
    }//GEN-LAST:event_crearEquipo

    private void ver_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_equipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_equipoActionPerformed

    private void ver_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_jugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_jugadorActionPerformed

    private void menu_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_archivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_archivoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void partido_ligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partido_ligaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partido_ligaActionPerformed

    private void partido_individualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partido_individualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partido_individualActionPerformed

    private void ver_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_informacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ver_informacionActionPerformed

    private void crear_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_jugadorActionPerformed
        AltaJugador aj = new AltaJugador();
        escritorio.add(aj);
        aj.show();
    }//GEN-LAST:event_crear_jugadorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JMenuItem crear_equipo;
    private javax.swing.JMenuItem crear_jugador;
    private javax.swing.JMenuItem dividendos;
    private javax.swing.JMenuItem eliminar_jugador;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem individual;
    private javax.swing.JMenuItem liga;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_comp;
    private javax.swing.JMenu menu_equipo;
    private javax.swing.JMenu menu_jugador;
    private javax.swing.JMenuItem modificar_jugador;
    private javax.swing.JMenu nueva_competicion;
    private javax.swing.JMenu partido;
    private javax.swing.JMenuItem partido_individual;
    private javax.swing.JMenuItem partido_liga;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem ver_equipo;
    private javax.swing.JMenuItem ver_informacion;
    private javax.swing.JMenuItem ver_jugador;
    // End of variables declaration//GEN-END:variables
}
