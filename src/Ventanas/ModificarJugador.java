package Ventanas;

public class ModificarJugador extends javax.swing.JDialog {

    public ModificarJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_jugadores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_jugadores = new javax.swing.JList();
        boton_seleccionar = new javax.swing.JButton();
        label_nombre = new javax.swing.JLabel();
        label_nomCompleto = new javax.swing.JLabel();
        label_fNac = new javax.swing.JLabel();
        label_posi = new javax.swing.JLabel();
        label_nacionalidad = new javax.swing.JLabel();
        label_altura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_peso = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_nomComp = new javax.swing.JTextField();
        txt_fnac = new javax.swing.JTextField();
        txt_pos = new javax.swing.JTextField();
        txt_nacionalidad = new javax.swing.JTextField();
        txt_altura = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        buton_guardar = new javax.swing.JButton();
        label_modificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_jugadores.setText("Jugadores:");

        list_jugadores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_jugadores);

        boton_seleccionar.setText("Seleccionar");

        label_nombre.setText("Nombre:");

        label_nomCompleto.setText("Nombre Completo:");

        label_fNac.setText("Fecha Nacimiento:");

        label_posi.setText("Posicion:");

        label_nacionalidad.setText("Nacionalidad:");

        label_altura.setText("Altura:");

        label_peso.setText("Peso:");

        buton_guardar.setText("Guardar");

        label_modificar.setText("Modificar");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(label_modificar)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(label_jugadores)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(4, 4, 4)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(layout.createSequentialGroup()
                                                .add(label_nombre)
                                                .add(56, 56, 56)
                                                .add(txt_nombre))
                                            .add(layout.createSequentialGroup()
                                                .add(label_nomCompleto)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(txt_nomComp))
                                            .add(layout.createSequentialGroup()
                                                .add(label_fNac)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(txt_fnac))
                                            .add(layout.createSequentialGroup()
                                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                    .add(label_posi)
                                                    .add(label_peso)
                                                    .add(label_altura)
                                                    .add(label_nacionalidad))
                                                .add(34, 34, 34)
                                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                    .add(txt_pos)
                                                    .add(txt_nacionalidad)
                                                    .add(txt_altura)
                                                    .add(layout.createSequentialGroup()
                                                        .add(10, 10, 10)
                                                        .add(jLabel7)
                                                        .add(0, 0, Short.MAX_VALUE))
                                                    .add(txt_peso)))))
                                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(boton_seleccionar)
                                    .add(buton_guardar))))
                        .add(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(label_jugadores)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(boton_seleccionar)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(8, 8, 8)
                .add(label_modificar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_nombre)
                    .add(txt_nombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_nomCompleto)
                    .add(txt_nomComp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_fNac)
                    .add(txt_fnac, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(label_posi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txt_pos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label_nacionalidad)
                    .add(txt_nacionalidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label_altura)
                    .add(txt_altura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label_peso)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(txt_peso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(buton_guardar)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_seleccionar;
    private javax.swing.JButton buton_guardar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_fNac;
    private javax.swing.JLabel label_jugadores;
    private javax.swing.JLabel label_modificar;
    private javax.swing.JLabel label_nacionalidad;
    private javax.swing.JLabel label_nomCompleto;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_peso;
    private javax.swing.JLabel label_posi;
    private javax.swing.JList list_jugadores;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_fnac;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nomComp;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_pos;
    // End of variables declaration//GEN-END:variables
}
