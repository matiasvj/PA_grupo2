package Ventanas;
import Clases.*;
import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir(evt);
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
                verEquipo(evt);
            }
        });
        menu_equipo.add(ver_equipo);

        barra_menu.add(menu_equipo);

        menu_jugador.setText("Jugador");

        crear_jugador.setText("Crear Jugador");
        crear_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaJugador(evt);
            }
        });
        menu_jugador.add(crear_jugador);

        ver_jugador.setText("Ver Informacion");
        ver_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verJugador(evt);
            }
        });
        menu_jugador.add(ver_jugador);

        modificar_jugador.setText("Modificar Informacion");
        modificar_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarJugador(evt);
            }
        });
        menu_jugador.add(modificar_jugador);

        eliminar_jugador.setText("Eliminar Jugador");
        eliminar_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJugador(evt);
            }
        });
        menu_jugador.add(eliminar_jugador);

        barra_menu.add(menu_jugador);

        menu_comp.setText("Competicion");

        nueva_competicion.setText("Nueva Competicion");

        individual.setText("Individual");
        individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaCompIndividual(evt);
            }
        });
        nueva_competicion.add(individual);

        liga.setText("Liga");
        liga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaLiga(evt);
            }
        });
        nueva_competicion.add(liga);

        menu_comp.add(nueva_competicion);

        ver_informacion.setText("Ver Informacion");
        ver_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInformacion(evt);
            }
        });
        menu_comp.add(ver_informacion);

        partido.setText("Partido");

        partido_individual.setText("Individual");
        partido_individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidoIndividual(evt);
            }
        });
        partido.add(partido_individual);

        partido_liga.setText("De Liga");
        partido_liga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidoLiga(evt);
            }
        });
        partido.add(partido_liga);

        menu_comp.add(partido);

        dividendos.setText("Dividendos");
        dividendos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarDividendos(evt);
            }
        });
        menu_comp.add(dividendos);

        barra_menu.add(menu_comp);

        menu_ayuda.setText("Ayuda");
        barra_menu.add(menu_ayuda);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearEquipo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEquipo
        
    }//GEN-LAST:event_crearEquipo

    private void verEquipo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEquipo
        // TODO add your handling code here:
    }//GEN-LAST:event_verEquipo

    private void verJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verJugador
        VerJugador vj = new VerJugador();
        vj.setVisible(true);
        vj.setLocation(300,200);
    }//GEN-LAST:event_verJugador

    private void salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir
        System.exit(0);
    }//GEN-LAST:event_salir

    private void partidoLiga(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidoLiga
        // TODO add your handling code here:
    }//GEN-LAST:event_partidoLiga

    private void partidoIndividual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidoIndividual
        // TODO add your handling code here:
    }//GEN-LAST:event_partidoIndividual

    private void verInformacion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInformacion
        // TODO add your handling code here:
    }//GEN-LAST:event_verInformacion

    private void altaJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaJugador
        AltaJugador aj = new AltaJugador();
        aj.setLocation(300,200);
        aj.setVisible(true);
    }//GEN-LAST:event_altaJugador

    private void modificarJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJugador
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarJugador

    private void eliminarJugador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJugador
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarJugador

    private void nuevaCompIndividual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaCompIndividual
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaCompIndividual

    private void nuevaLiga(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaLiga
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaLiga

    private void asignarDividendos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarDividendos
        // TODO add your handling code here:
    }//GEN-LAST:event_asignarDividendos

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        ManejadorBD bd = new ManejadorBD();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JMenuItem crear_equipo;
    private javax.swing.JMenuItem crear_jugador;
    private javax.swing.JMenuItem dividendos;
    private javax.swing.JMenuItem eliminar_jugador;
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
