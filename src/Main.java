
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Enriquez
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearMaestro = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        tf_nomMas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_apeMas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_sueldo = new javax.swing.JTextField();
        spin_edadMas = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        popMaestros = new javax.swing.JPopupMenu();
        opAgregarClase = new javax.swing.JMenuItem();
        opModificarMas = new javax.swing.JMenuItem();
        opEliminarMas = new javax.swing.JMenuItem();
        jd_crearClase = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        tf_nomClase = new javax.swing.JTextField();
        tf_seccion = new javax.swing.JTextField();
        tf_edificio = new javax.swing.JTextField();
        tf_salon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rb_aire = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        popEstudiantes = new javax.swing.JPopupMenu();
        opArbolar = new javax.swing.JMenuItem();
        jd_crearEstudiante = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        elArbol = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_maestros = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_clases = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_estudiantes = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("Crear maestro");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Sueldo:");

        spin_edadMas.setModel(new javax.swing.SpinnerNumberModel(25, 25, 65, 1));

        jLabel8.setText("Edad:");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearMaestroLayout = new javax.swing.GroupLayout(jd_crearMaestro.getContentPane());
        jd_crearMaestro.getContentPane().setLayout(jd_crearMaestroLayout);
        jd_crearMaestroLayout.setHorizontalGroup(
            jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nomMas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tf_apeMas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spin_edadMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton2)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jd_crearMaestroLayout.setVerticalGroup(
            jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearMaestroLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nomMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_apeMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jd_crearMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spin_edadMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addGap(43, 43, 43))
        );

        opAgregarClase.setText("Agregar Clase");
        opAgregarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAgregarClaseActionPerformed(evt);
            }
        });
        popMaestros.add(opAgregarClase);

        opModificarMas.setText("Modificar maestro");
        popMaestros.add(opModificarMas);

        opEliminarMas.setText("Eliminar maestro");
        opEliminarMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEliminarMasActionPerformed(evt);
            }
        });
        popMaestros.add(opEliminarMas);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setText("Crear clase:");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Seccion:");

        jLabel12.setText("Edificio:");

        jLabel13.setText("Salon:");

        rb_aire.setText("Aire acondicionado");

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearClaseLayout = new javax.swing.GroupLayout(jd_crearClase.getContentPane());
        jd_crearClase.getContentPane().setLayout(jd_crearClaseLayout);
        jd_crearClaseLayout.setHorizontalGroup(
            jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearClaseLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearClaseLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearClaseLayout.createSequentialGroup()
                        .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_seccion)
                            .addComponent(tf_nomClase)))
                    .addGroup(jd_crearClaseLayout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_salon, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearClaseLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_edificio)))
                .addGap(18, 18, 18)
                .addComponent(rb_aire)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearClaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(76, 76, 76))
        );
        jd_crearClaseLayout.setVerticalGroup(
            jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearClaseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nomClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rb_aire))
                .addGap(18, 18, 18)
                .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_edificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jd_crearClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(38, 38, 38))
        );

        opArbolar.setText("Agregar al arbol");
        opArbolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArbolarActionPerformed(evt);
            }
        });
        popEstudiantes.add(opArbolar);

        jLabel16.setText("Crear estudiante");

        jLabel17.setText("Nombre:");

        jLabel18.setText("Apellido:");

        jLabel19.setText("Edad:");

        jLabel20.setText("Genero:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Pokemon", "Avenger", "Otro" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(18, 16, 100, 1));

        javax.swing.GroupLayout jd_crearEstudianteLayout = new javax.swing.GroupLayout(jd_crearEstudiante.getContentPane());
        jd_crearEstudiante.getContentPane().setLayout(jd_crearEstudianteLayout);
        jd_crearEstudianteLayout.setHorizontalGroup(
            jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                        .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(31, 31, 31)
                        .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jd_crearEstudianteLayout.setVerticalGroup(
            jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearEstudianteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_crearEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE ADMINISTACION DE UNITEC");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carreras");
        elArbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(elArbol);

        lista_maestros.setModel(new DefaultListModel());
        lista_maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_maestrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista_maestros);

        lista_clases.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(lista_clases);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        jLabel2.setText("Maestros");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        jLabel3.setText("Clases");

        jButton1.setText("Agregar Maestro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("*Haga click derecho en un maestro para agregar");

        jLabel15.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        jLabel15.setText("Estudiantes");

        lista_estudiantes.setModel(new DefaultListModel());
        lista_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_estudiantesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lista_estudiantes);

        jButton4.setText("Agregar Estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton4)))
                                .addGap(168, 168, 168))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton1))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(75, 75, 75)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jd_crearMaestro.setLocationRelativeTo(this);
        jd_crearMaestro.pack();
        jd_crearMaestro.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{  
            DefaultListModel modelo = (DefaultListModel) lista_maestros.getModel();
            String nom = tf_nomMas.getText();
            String ape = tf_apeMas.getText();
            Double sal = Double.parseDouble(tf_sueldo.getText());
            int edad = (int) spin_edadMas.getValue();

            modelo.addElement(new Maestro(nom,ape,sal,edad));

            tf_nomMas.setText("");
            tf_apeMas.setText("");
            tf_sueldo.setText("");
            spin_edadMas.setValue(25);

            lista_maestros.setModel(modelo);

            jd_crearMaestro.setVisible(false);
        }
        catch (Exception e) {
            jd_crearMaestro.setVisible(false);
            tf_nomMas.setText("");
            tf_apeMas.setText("");
            tf_sueldo.setText("");
            spin_edadMas.setValue(25);
            JOptionPane.showMessageDialog(this,"Hubo un error! No se guardaron los cambios!" );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lista_maestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_maestrosMouseClicked
        if (evt.isMetaDown()) {
            popMaestros.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lista_maestrosMouseClicked

    private void opAgregarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAgregarClaseActionPerformed
        jd_crearClase.setLocationRelativeTo(this);
        jd_crearClase.pack();
        jd_crearClase.setVisible(true);
    }//GEN-LAST:event_opAgregarClaseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {    
            String nom = tf_nomClase.getText();
            int sec = Integer.parseInt(tf_seccion.getText());
            int ed = Integer.parseInt(tf_edificio.getText());
            int sal = Integer.parseInt(tf_salon.getText());
            boolean aire = rb_aire.isSelected();

            Clase c = new Clase(nom,sec,ed,sal,aire);
            
            tf_nomClase.setText("");
            tf_seccion.setText("");
            tf_edificio.setText("");
            tf_salon.setText("");
            rb_aire.setSelected(false);

            int pos = lista_maestros.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) lista_maestros.getModel();
            ((Maestro) modelo.getElementAt(pos)).getClases().add(c);
            DefaultListModel modelo2 = (DefaultListModel) lista_clases.getModel();
            modelo2.addElement(c);
            
            jd_crearClase.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Hubo un error! No se guardaron los cambios!" );
            tf_nomClase.setText("");
            tf_seccion.setText("");
            tf_edificio.setText("");
            tf_salon.setText("");
            rb_aire.setSelected(false);
            jd_crearClase.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lista_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_estudiantesMouseClicked
        if (evt.isMetaDown()) {
            popEstudiantes.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lista_estudiantesMouseClicked

    private void opEliminarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEliminarMasActionPerformed
        int pos = lista_maestros.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) lista_maestros.getModel();
        modelo.removeElementAt(pos);
    }//GEN-LAST:event_opEliminarMasActionPerformed

    private void opArbolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArbolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opArbolarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree elArbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JDialog jd_crearClase;
    private javax.swing.JDialog jd_crearEstudiante;
    private javax.swing.JDialog jd_crearMaestro;
    private javax.swing.JList<String> lista_clases;
    private javax.swing.JList<String> lista_estudiantes;
    private javax.swing.JList<String> lista_maestros;
    private javax.swing.JMenuItem opAgregarClase;
    private javax.swing.JMenuItem opArbolar;
    private javax.swing.JMenuItem opEliminarMas;
    private javax.swing.JMenuItem opModificarMas;
    private javax.swing.JPopupMenu popEstudiantes;
    private javax.swing.JPopupMenu popMaestros;
    private javax.swing.JRadioButton rb_aire;
    private javax.swing.JSpinner spin_edadMas;
    private javax.swing.JTextField tf_apeMas;
    private javax.swing.JTextField tf_edificio;
    private javax.swing.JTextField tf_nomClase;
    private javax.swing.JTextField tf_nomMas;
    private javax.swing.JTextField tf_salon;
    private javax.swing.JTextField tf_seccion;
    private javax.swing.JTextField tf_sueldo;
    // End of variables declaration//GEN-END:variables
}
