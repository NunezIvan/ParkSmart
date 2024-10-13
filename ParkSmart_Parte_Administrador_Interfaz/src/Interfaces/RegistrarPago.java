package Interfaces;

import java.awt.Color;
import Configuracion.Tarifa;
import ManejoArchivos.Archivo;
import Modelo.Vehiculo;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Luis Bizarro
 */
public class RegistrarPago extends javax.swing.JFrame {
    
    private javax.swing.JButton[][] espaciosEstacionamiento;
    private Vehiculo[][] vehiculosEstacionamiento;
    private Archivo archivo = new Archivo();
    private Timer timer;
    private String nombreRecurso = "C:\\Users\\USER\\Desktop\\Gestor_Estacionamiento\\data\\vehiculos.txt";

    private Vehiculo vehiculoSeleccionado;

    /**
     * Creates new form Plantilla_ParkMain
     */
    
    int xMouse,

    /**
     * Creates new form Plantilla_ParkMain
     */
    yMouse;
    
    public RegistrarPago() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializarEstacionamiento();
        cargarVehiculosDesdeArchivo();
        
        timer = new Timer(3000, e -> cargarVehiculosDesdeArchivo());  // 3000 ms = 3 segundos
        timer.start(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelPark = new javax.swing.JLabel();
        labelSmart = new javax.swing.JLabel();
        panelBotonExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelRound1 = new Interfaces.PanelRound();
        panelRound2 = new Interfaces.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        labelPagar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTiempoEstacionado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelPrecioPagar = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        panelRound3 = new Interfaces.PanelRound();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        labelPark.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelPark.setForeground(new java.awt.Color(255, 255, 255));
        labelPark.setText("Park");

        labelSmart.setBackground(new java.awt.Color(41, 239, 130));
        labelSmart.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelSmart.setForeground(new java.awt.Color(41, 239, 130));
        labelSmart.setText("Smart");

        panelBotonExit.setBackground(new java.awt.Color(204, 204, 204));
        panelBotonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBotonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBotonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBotonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBotonExitMouseExited(evt);
            }
        });

        labelExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");

        javax.swing.GroupLayout panelBotonExitLayout = new javax.swing.GroupLayout(panelBotonExit);
        panelBotonExit.setLayout(panelBotonExitLayout);
        panelBotonExitLayout.setHorizontalGroup(
            panelBotonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        panelBotonExitLayout.setVerticalGroup(
            panelBotonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSmart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 811, Short.MAX_VALUE)
                .addComponent(panelBotonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelSmart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(labelPark, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(243, 243, 243));
        panelRound2.setRoundBottomLeft(35);
        panelRound2.setRoundBottomRight(35);
        panelRound2.setRoundTopLeft(35);
        panelRound2.setRoundTopRight(35);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Seleccione vehiculo para ver detalles");

        labelPagar.setText("PAGAR");
        labelPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPagarMouseExited(evt);
            }
        });

        labelTiempoEstacionado.setText("Tiempo estacionado:");
        labelTiempoEstacionado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelPrecioPagar.setText("Precio a pagar:");

        jLabelMatricula.setText("Matricula: ");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(72, 181, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound2Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(labelPagar))
                        .addGroup(panelRound2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelTiempoEstacionado, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(jLabelPrecioPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(labelTiempoEstacionado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrecioPagar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMatricula)
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(labelPagar)
                .addGap(10, 10, 10))
        );

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
            .addGap(0, 370, Short.MAX_VALUE)
        );

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 680, 370));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 450));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 980, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void panelBotonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_panelBotonExitMouseClicked

    private void panelBotonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonExitMouseEntered
        // TODO add your handling code here:
        panelBotonExit.setBackground(Color.red);
    }//GEN-LAST:event_panelBotonExitMouseEntered

    private void panelBotonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonExitMouseExited
        // TODO add your handling code here:
        panelBotonExit.setBackground(new Color(243,243,243));
    }//GEN-LAST:event_panelBotonExitMouseExited

    private void labelPagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPagarMouseExited
        labelPagar.setForeground(Color.black);
    }//GEN-LAST:event_labelPagarMouseExited

    private void labelPagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPagarMouseEntered
        labelPagar.setForeground(Color.green);
    }//GEN-LAST:event_labelPagarMouseEntered

    private void labelPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPagarMouseClicked
        if (vehiculoSeleccionado != null) {
            // Calcular tiempo de estadía y el total a pagar
            double tiempoEstadia = vehiculoSeleccionado.calcularTiempoEstadia();
            double tarifa = Tarifa.getTarifa();  // Obtener la tarifa
            double totalPago = tiempoEstadia * tarifa;

            // Mostrar el tiempo y el costo en los labels
            labelTiempoEstacionado.setText("Tiempo estacionado: " + tiempoEstadia + " horas");

            // Actualizar y eliminar el vehículo del archivo
            eliminarVehiculoDelArchivo(vehiculoSeleccionado, nombreRecurso);

            // Desocupar el espacio en la matriz y actualizar el botón
            int fila = vehiculoSeleccionado.getFila();
            int columna = vehiculoSeleccionado.getColumna();
            vehiculosEstacionamiento[fila][columna] = null;  // Eliminar el vehículo de la matriz
            espaciosEstacionamiento[fila][columna].setText((char) ('A' + fila) + Integer.toString(columna + 1));  // Cambiar el texto del botón
            espaciosEstacionamiento[fila][columna].setBackground(Color.GREEN);  // Cambiar el color a verde para indicar que está vacío

            // Notificar al usuario
            JOptionPane.showMessageDialog(this, "El pago ha sido registrado con éxito. El vehículo ha sido eliminado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_labelPagarMouseClicked

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        MenuAdministrador ventanaMenuAdministrador = new MenuAdministrador();
        ventanaMenuAdministrador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Plantilla_ParkMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantilla_ParkMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantilla_ParkMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantilla_ParkMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelPrecioPagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelPagar;
    private javax.swing.JLabel labelPark;
    private javax.swing.JLabel labelSmart;
    private javax.swing.JLabel labelTiempoEstacionado;
    private javax.swing.JPanel panelBotonExit;
    private Interfaces.PanelRound panelRound1;
    private Interfaces.PanelRound panelRound2;
    private Interfaces.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables
    

    private void cargarVehiculosDesdeArchivo() {
        List<Vehiculo> vehiculos = archivo.listar(nombreRecurso);  // Cargar vehículos desde el archivo

        // Recorrer la lista de vehículos
        for (Vehiculo vehiculo : vehiculos) {
            int fila = vehiculo.getFila();
            int columna = vehiculo.getColumna();

            // Asignar el vehículo al espacio correspondiente en la matriz
            vehiculosEstacionamiento[fila][columna] = vehiculo;

            // Cambiar el texto y el color del botón para indicar que el espacio está ocupado
            String nombreEspacio = (char) ('A' + fila) + Integer.toString(columna + 1);
            espaciosEstacionamiento[fila][columna].setText(nombreEspacio + " (Ocupado)");
            espaciosEstacionamiento[fila][columna].setBackground(Color.RED); // Espacios ocupados en rojo
        }
    }

    private void inicializarEstacionamiento() {
        int filas = 5;  // Ajustar según la capacidad de tu estacionamiento
        int columnas = 6;

        // Inicializamos la matriz de espacios y de vehículos
        espaciosEstacionamiento = new javax.swing.JButton[filas][columnas];
        vehiculosEstacionamiento = new Vehiculo[filas][columnas];

        // Establecer el layout del panel
        panelRound3.setLayout(new java.awt.GridLayout(filas, columnas, 5, 5));

        // Recorrer filas y columnas para crear botones de espacio
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                espaciosEstacionamiento[i][j] = new javax.swing.JButton();

                // Nombrar los espacios, por ejemplo, A1, B2...
                String nombreEspacio = (char) ('A' + i) + Integer.toString(j + 1);
                espaciosEstacionamiento[i][j].setText(nombreEspacio);
                espaciosEstacionamiento[i][j].setBackground(Color.GREEN); // Espacios vacíos en verde

                final int fila = i;
                final int columna = j;

                // Añadir acción para cuando se haga clic en el botón
                espaciosEstacionamiento[i][j].addActionListener(evt -> espacioClicado(fila, columna));

                // Añadir los botones al panel
                panelRound3.add(espaciosEstacionamiento[i][j]);
            }
        }

        // Cargar los vehículos desde el archivo y actualizar la interfaz
        cargarVehiculosDesdeArchivo();
    }

    private void espacioClicado(int fila, int columna) {
        Vehiculo vehiculo = vehiculosEstacionamiento[fila][columna];

        if (vehiculo != null) {
            vehiculoSeleccionado = vehiculo;
            
            vehiculo.registrarSalida();
            // Calcular el tiempo de estadía y el costo total
            double tiempoEstadia = vehiculo.calcularTiempoEstadia();
            double tarifa = Tarifa.getTarifa();
            double totalPago = tiempoEstadia * tarifa;

            // Actualizar los labels con la información correspondiente
            jLabelMatricula.setText("Matrícula: " + vehiculo.getMatricula());
            labelTiempoEstacionado.setText("Tiempo estacionado: " + tiempoEstadia + " horas");
            jLabelPrecioPagar.setText("Precio a pagar: " + totalPago + " soles");

        } else {
            // Si no hay un vehículo en ese espacio, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El espacio está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarVehiculoDelArchivo(Vehiculo vehiculo, String nombreRecurso) {
        List<Vehiculo> vehiculos = archivo.listar(nombreRecurso);  // Cargamos todos los vehículos del archivo

        try (PrintWriter escritura = new PrintWriter(new FileWriter(nombreRecurso, false))) {
            for (Vehiculo v : vehiculos) {
                if (!v.getMatricula().equals(vehiculo.getMatricula())) {
                    escritura.println(v.toString());  // Escribir de nuevo solo los vehículos que no se eliminan
                }
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
}
