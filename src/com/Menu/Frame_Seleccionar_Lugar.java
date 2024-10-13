package com.Menu;

import com.src.Vehiculo;
import com.src.Archivos_Vehiculos;
import static com.src.Vehiculo.leerMatricula;
import java.awt.Color;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.Timer;
public class Frame_Seleccionar_Lugar extends javax.swing.JFrame {
    private javax.swing.JButton[][] espaciosEstacionamiento;
    private Vehiculo[][] vehiculosEstacionamiento;
    private final Archivos_Vehiculos archivo = new Archivos_Vehiculos();
    private final String NOMBRE_ARCHIVO = "vehiculos.txt";
    private Timer timer;
    private Vehiculo vehiculoSeleccionado;
    private final DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.nnnnnnnnn");
    int xMouse,yMouse;
    private int filaSeleccionada;
    private int columnaSeleccionada;
    private final String matricula_escaneada = leerMatricula();
    

    public Frame_Seleccionar_Lugar() {
        initComponents();
        archivo.crearArchivo(NOMBRE_ARCHIVO);
        this.setLocationRelativeTo(null);
        inicializarEstacionamiento(); 
        cargarVehiculosDesdeArchivo();
        Lista_Tipos_Vehiculos.setVisible(false);
        Boton_Confirmar.setVisible(false);
        Boton_Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarVehiculo(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_Botones = new javax.swing.JPanel();
        Panel_Boton_Salir = new com.Menu.PanelRound();
        Txt_Salir = new javax.swing.JLabel();
        labelPark1 = new javax.swing.JLabel();
        labelSmart = new javax.swing.JLabel();
        panelRound2 = new com.Menu.PanelRound();
        jSeparator5 = new javax.swing.JSeparator();
        labelTiempoEstimado1 = new javax.swing.JLabel();
        labeltxtTiempoEstimado1 = new javax.swing.JLabel();
        labelTiempoEstimado = new javax.swing.JLabel();
        labeltxtTiempoEstimado = new javax.swing.JLabel();
        labelTipoDeVehiculo = new javax.swing.JLabel();
        labeltxtTipoVehiculo = new javax.swing.JLabel();
        labeltxtPlaca = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labelEspacio = new javax.swing.JLabel();
        Boton_Confirmar = new com.Menu.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        Lista_Tipos_Vehiculos = new javax.swing.JComboBox<>();
        panelRound3 = new com.Menu.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 540));

        Panel_Botones.setBackground(new java.awt.Color(0, 0, 0));
        Panel_Botones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Botones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_BotonesMouseDragged(evt);
            }
        });
        Panel_Botones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_BotonesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_BotonesMousePressed(evt);
            }
        });

        Panel_Boton_Salir.setBackground(new java.awt.Color(255, 0, 51));
        Panel_Boton_Salir.setRoundBottomLeft(5);
        Panel_Boton_Salir.setRoundBottomRight(5);
        Panel_Boton_Salir.setRoundTopLeft(5);
        Panel_Boton_Salir.setRoundTopRight(5);
        Panel_Boton_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Boton_SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Boton_SalirMouseEntered(evt);
            }
        });

        Txt_Salir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Txt_Salir.setText("X");

        javax.swing.GroupLayout Panel_Boton_SalirLayout = new javax.swing.GroupLayout(Panel_Boton_Salir);
        Panel_Boton_Salir.setLayout(Panel_Boton_SalirLayout);
        Panel_Boton_SalirLayout.setHorizontalGroup(
            Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Boton_SalirLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Txt_Salir)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Panel_Boton_SalirLayout.setVerticalGroup(
            Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_Boton_SalirLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Txt_Salir)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        labelPark1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelPark1.setForeground(new java.awt.Color(255, 255, 255));
        labelPark1.setText("Park");

        labelSmart.setBackground(new java.awt.Color(41, 239, 130));
        labelSmart.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelSmart.setForeground(java.awt.Color.green);
        labelSmart.setText("Smart");

        javax.swing.GroupLayout Panel_BotonesLayout = new javax.swing.GroupLayout(Panel_Botones);
        Panel_Botones.setLayout(Panel_BotonesLayout);
        Panel_BotonesLayout.setHorizontalGroup(
            Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BotonesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelPark1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSmart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 793, Short.MAX_VALUE)
                .addComponent(Panel_Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        Panel_BotonesLayout.setVerticalGroup(
            Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BotonesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Panel_Boton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BotonesLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSmart)
                    .addComponent(labelPark1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 162, -1));

        labelTiempoEstimado1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelTiempoEstimado1.setForeground(new java.awt.Color(102, 255, 102));
        labelTiempoEstimado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempoEstimado1.setText("xx:xx:xx");
        panelRound2.add(labelTiempoEstimado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 371, 166, -1));

        labeltxtTiempoEstimado1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltxtTiempoEstimado1.setText("Tiempo estacionado:");
        panelRound2.add(labeltxtTiempoEstimado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 174, -1));

        labelTiempoEstimado.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelTiempoEstimado.setForeground(new java.awt.Color(253, 194, 33));
        labelTiempoEstimado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempoEstimado.setText("XX horas");
        panelRound2.add(labelTiempoEstimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 174, -1));

        labeltxtTiempoEstimado.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltxtTiempoEstimado.setText("Tiempo estimado:");
        panelRound2.add(labeltxtTiempoEstimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        labelTipoDeVehiculo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelTipoDeVehiculo.setForeground(new java.awt.Color(160, 170, 247));
        labelTipoDeVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipoDeVehiculo.setText("XXXXXXX");
        panelRound2.add(labelTipoDeVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 174, -1));

        labeltxtTipoVehiculo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltxtTipoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltxtTipoVehiculo.setText("Tipo de vehículo");
        panelRound2.add(labeltxtTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        labeltxtPlaca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltxtPlaca.setText("PLACA");
        panelRound2.add(labeltxtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        labelPlaca.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(160, 170, 247));
        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("XXX-XXX");
        panelRound2.add(labelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 104, -1));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 174, -1));

        labelEspacio.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelEspacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEspacio.setText("Espacio N°: XX");
        panelRound2.add(labelEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        Boton_Confirmar.setBackground(new java.awt.Color(51, 255, 51));
        Boton_Confirmar.setRoundBottomLeft(30);
        Boton_Confirmar.setRoundBottomRight(30);
        Boton_Confirmar.setRoundTopLeft(30);
        Boton_Confirmar.setRoundTopRight(30);
        Boton_Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_ConfirmarMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setText("CONFIRMAR");

        javax.swing.GroupLayout Boton_ConfirmarLayout = new javax.swing.GroupLayout(Boton_Confirmar);
        Boton_Confirmar.setLayout(Boton_ConfirmarLayout);
        Boton_ConfirmarLayout.setHorizontalGroup(
            Boton_ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton_ConfirmarLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        Boton_ConfirmarLayout.setVerticalGroup(
            Boton_ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_ConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound2.add(Boton_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        Lista_Tipos_Vehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        Lista_Tipos_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_Tipos_VehiculosActionPerformed(evt);
            }
        });
        panelRound2.add(Lista_Tipos_Vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 108, -1));

        panelRound3.setPreferredSize(new java.awt.Dimension(680, 408));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_Boton_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Panel_Boton_SalirMouseClicked

    private void Panel_Boton_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseEntered
        Panel_Boton_Salir.setBackground(new Color(255, 0, 0, 200));
        Panel_Boton_Salir.setForeground(Color.white);
    }//GEN-LAST:event_Panel_Boton_SalirMouseEntered

    private void Panel_BotonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y- yMouse);
    }//GEN-LAST:event_Panel_BotonesMouseDragged

    private void Panel_BotonesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMouseExited
        Panel_Boton_Salir.setBackground(Color.red);
        Panel_Boton_Salir.setForeground(Color.black);
    }//GEN-LAST:event_Panel_BotonesMouseExited

    private void Panel_BotonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Panel_BotonesMousePressed

    private void Lista_Tipos_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_Tipos_VehiculosActionPerformed

    }//GEN-LAST:event_Lista_Tipos_VehiculosActionPerformed

    private void Boton_ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ConfirmarMouseEntered
        Boton_Confirmar.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Boton_ConfirmarMouseEntered

    private void Boton_ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ConfirmarMouseExited
        Boton_Confirmar.setBackground(Color.green);
    }//GEN-LAST:event_Boton_ConfirmarMouseExited

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
            java.util.logging.Logger.getLogger(Frame_Seleccionar_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Seleccionar_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Seleccionar_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Seleccionar_Lugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame_Seleccionar_Lugar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Menu.PanelRound Boton_Confirmar;
    private javax.swing.JComboBox<String> Lista_Tipos_Vehiculos;
    private com.Menu.PanelRound Panel_Boton_Salir;
    private javax.swing.JPanel Panel_Botones;
    private javax.swing.JLabel Txt_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelEspacio;
    private javax.swing.JLabel labelPark1;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelSmart;
    private javax.swing.JLabel labelTiempoEstimado;
    private javax.swing.JLabel labelTiempoEstimado1;
    private javax.swing.JLabel labelTipoDeVehiculo;
    private javax.swing.JLabel labeltxtPlaca;
    private javax.swing.JLabel labeltxtTiempoEstimado;
    private javax.swing.JLabel labeltxtTiempoEstimado1;
    private javax.swing.JLabel labeltxtTipoVehiculo;
    private com.Menu.PanelRound panelRound2;
    private com.Menu.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables

    private void inicializarEstacionamiento() {
        
        int filas = 5;
        int columnas = 6;
        
        espaciosEstacionamiento = new javax.swing.JButton[filas][columnas];
        vehiculosEstacionamiento = new Vehiculo[filas][columnas];
        
        panelRound3.setLayout(new java.awt.GridLayout(filas, columnas, 5, 5));

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                espaciosEstacionamiento[i][j] = new javax.swing.JButton();
                
                // Asigna el nombre del espacio, por ejemplo, A1, B2
                String nombreEspacio = (char) ('A' + i) + Integer.toString(j + 1);
                espaciosEstacionamiento[i][j].setText(nombreEspacio);
                espaciosEstacionamiento[i][j].setBackground(Color.GREEN);

                final int fila = i;
                final int columna = j;
                espaciosEstacionamiento[i][j].addActionListener(evt -> espacioClicado(fila, columna));

                panelRound3.add(espaciosEstacionamiento[i][j]);
            }
        }
    }
    
    private void cargarVehiculosDesdeArchivo() {
        List<Vehiculo> vehiculos = archivo.listar(NOMBRE_ARCHIVO);
        
        for (Vehiculo vehiculo : vehiculos) {
            int fila = vehiculo.getFila();
            int columna = vehiculo.getColumna();
            
            vehiculosEstacionamiento[fila][columna] = vehiculo;
            // Cambia el color del botón si el espacio está ocupado
            String nombreEspacio = (char) ('A' + fila) + Integer.toString(columna + 1);
            espaciosEstacionamiento[fila][columna].setText(nombreEspacio + " (Ocupado)");
            espaciosEstacionamiento[fila][columna].setBackground(Color.RED);
        }
    }
    
    private void espacioClicado(int fila, int columna) {
        
    filaSeleccionada = fila;
    columnaSeleccionada = columna;
    if (timer != null) {
        timer.stop();
    }

    vehiculoSeleccionado = vehiculosEstacionamiento[fila][columna];

    if (vehiculoSeleccionado != null) {
        
        actualizarTiempoEstacionado();
        labelPlaca.setText(vehiculoSeleccionado.getMatricula());
        labelTipoDeVehiculo.setText(convertirTipo(vehiculoSeleccionado.getTipo()));
        labelTiempoEstimado.setText("2 horas");
        labeltxtTiempoEstimado1.setText("Tiempo Estimado:");

        timer = new Timer(1000, e -> actualizarTiempoEstacionado());
        timer.start();

        labelEspacio.setText("FILA " + (char) ('A' + fila) + ", COLUMNA " + (columna + 1));

        Lista_Tipos_Vehiculos.setVisible(false);  // Ocultar ComboBox
        Boton_Confirmar.setVisible(false);        // Ocultar botón Confirmar
    } else {
        // Si el espacio está vacío
        labelPlaca.setText(matricula_escaneada);  // Limpiar texto de placa
        labelTipoDeVehiculo.setText("");  // Limpiar texto de tipo de vehículo
        labelTiempoEstimado1.setText("");  // Limpiar texto de tiempo estacionado
        labelTiempoEstimado.setText("2 horas");
        labeltxtTiempoEstimado1.setText("");
        labelEspacio.setText("Espacio N°: " + (char) ('A' + fila) + (columna + 1));

        // Mostrar el ComboBox y el botón Confirmar
        Lista_Tipos_Vehiculos.setVisible(true);
        Boton_Confirmar.setVisible(true);
    }
}

    
    private String convertirTipo(char tipo) {
        return switch (tipo) {
            case 'c' -> "Carro";
            case 'm' -> "Moto";
            default -> "Desconocido";
        };
    }
    
    private void actualizarTiempoEstacionado() {
        if (vehiculoSeleccionado != null && vehiculoSeleccionado.getHoraEntrada() != null) {
            LocalDateTime horaEntrada = vehiculoSeleccionado.getHoraEntrada();  // Hora leída del archivo
            LocalDateTime horaActual = LocalDateTime.now();  // Hora actual del sistema
            Duration duracion = Duration.between(horaEntrada, horaActual);

            long horas = duracion.toHours();
            long minutos = duracion.toMinutesPart();
            long segundos = duracion.toSecondsPart();

            String tiempoEstacionado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
            labelTiempoEstimado1.setText(tiempoEstacionado);
        } else {
            labelTiempoEstimado1.setText("00:00:00"); // Si no hay vehículo seleccionado
        }
    }
    
    private void confirmarVehiculo(java.awt.event.MouseEvent evt) {
        String tipoVehiculo = (String) Lista_Tipos_Vehiculos.getSelectedItem();
        char tipo = tipoVehiculo.equals("Carro") ? 'c' : 'm';

        Vehiculo nuevoVehiculo = new Vehiculo(matricula_escaneada, tipo, filaSeleccionada, columnaSeleccionada, LocalDateTime.now(), null);

        vehiculosEstacionamiento[filaSeleccionada][columnaSeleccionada] = nuevoVehiculo;
        espaciosEstacionamiento[filaSeleccionada][columnaSeleccionada].setBackground(Color.RED);
        espaciosEstacionamiento[filaSeleccionada][columnaSeleccionada].setText((char) ('A' + filaSeleccionada) + Integer.toString(columnaSeleccionada + 1) + " (Ocupado)");
        
        archivo.escribir(nuevoVehiculo, NOMBRE_ARCHIVO, rootPaneCheckingEnabled);
        Lista_Tipos_Vehiculos.setVisible(false);
        Boton_Confirmar.setVisible(false);
    }
}


