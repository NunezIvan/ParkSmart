
package Menu;

import conexion.conexion_DB;
import static datos.Estacionamientos.listarEstacionamientos;
import dominio.Estacionamiento;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxEditor;


/**
 *
 * @author USER
 */
public class Inicio_Programa_Usuario extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    Estacionamiento Estacionamiento_Seleccionado;
    
    public Inicio_Programa_Usuario() {
        
        initComponents();
        cargar_Estacionamientos();
        timer = new Timer(10000, e->conexion_DB.getConexion());
        timer.start();  
        this.setLocationRelativeTo(null);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Paneles_Botones = new javax.swing.JPanel();
        labelPark1 = new javax.swing.JLabel();
        labelSmart = new javax.swing.JLabel();
        Panel_Boton_Salir = new Menu.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logo_Label = new javax.swing.JLabel();
        ComboBox_Estacionamientos = new javax.swing.JComboBox<>();
        Direccion_Label = new javax.swing.JLabel();
        Piso_Label = new javax.swing.JLabel();
        Filas_Label1 = new javax.swing.JLabel();
        Columna_Label2 = new javax.swing.JLabel();
        Dir_ResultadoLabel = new javax.swing.JLabel();
        Piso_Resultado_Label = new javax.swing.JLabel();
        Columna_Resultado_Label = new javax.swing.JLabel();
        Fila_Resultado_Label = new javax.swing.JLabel();
        Confirmar_Panel = new Menu.PanelRound();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Paneles_Botones.setBackground(new java.awt.Color(0, 0, 0));
        Paneles_Botones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Paneles_BotonesMouseDragged(evt);
            }
        });
        Paneles_Botones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Paneles_BotonesMousePressed(evt);
            }
        });

        labelPark1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelPark1.setForeground(new java.awt.Color(255, 255, 255));
        labelPark1.setText("Park");

        labelSmart.setBackground(new java.awt.Color(41, 239, 130));
        labelSmart.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelSmart.setForeground(java.awt.Color.green);
        labelSmart.setText("Smart");

        Panel_Boton_Salir.setBackground(new java.awt.Color(255, 51, 51));
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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Boton_SalirMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");

        javax.swing.GroupLayout Panel_Boton_SalirLayout = new javax.swing.GroupLayout(Panel_Boton_Salir);
        Panel_Boton_Salir.setLayout(Panel_Boton_SalirLayout);
        Panel_Boton_SalirLayout.setHorizontalGroup(
            Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
        Panel_Boton_SalirLayout.setVerticalGroup(
            Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Paneles_BotonesLayout = new javax.swing.GroupLayout(Paneles_Botones);
        Paneles_Botones.setLayout(Paneles_BotonesLayout);
        Paneles_BotonesLayout.setHorizontalGroup(
            Paneles_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Paneles_BotonesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelPark1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        Paneles_BotonesLayout.setVerticalGroup(
            Paneles_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPark1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(labelSmart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Paneles_BotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Panel_Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO ESCOJA UNO DE LOS ESTACIONAMIENTOS");

        Logo_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_ParkSmart1.png"))); // NOI18N

        ComboBox_Estacionamientos.setBackground(new java.awt.Color(204, 255, 153));
        ComboBox_Estacionamientos.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        ComboBox_Estacionamientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_Estacionamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_EstacionamientosActionPerformed(evt);
            }
        });

        Direccion_Label.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Direccion_Label.setText("DIRECCIÓN:");

        Piso_Label.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Piso_Label.setText("PISOS:");

        Filas_Label1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Filas_Label1.setText("FILAS:");

        Columna_Label2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Columna_Label2.setText("COLUMNAS:");

        Dir_ResultadoLabel.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Dir_ResultadoLabel.setForeground(new java.awt.Color(51, 153, 0));
        Dir_ResultadoLabel.setText("XXXX");

        Piso_Resultado_Label.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Piso_Resultado_Label.setForeground(new java.awt.Color(51, 153, 0));
        Piso_Resultado_Label.setText("XXXX");

        Columna_Resultado_Label.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Columna_Resultado_Label.setForeground(new java.awt.Color(51, 153, 0));
        Columna_Resultado_Label.setText("XXXX");

        Fila_Resultado_Label.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Fila_Resultado_Label.setForeground(new java.awt.Color(51, 153, 0));
        Fila_Resultado_Label.setText("XXXX");

        Confirmar_Panel.setBackground(new java.awt.Color(153, 255, 102));
        Confirmar_Panel.setRoundBottomLeft(7);
        Confirmar_Panel.setRoundBottomRight(7);
        Confirmar_Panel.setRoundTopLeft(7);
        Confirmar_Panel.setRoundTopRight(7);
        Confirmar_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Confirmar_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Confirmar_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Confirmar_PanelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setText("CONFIRMAR");

        javax.swing.GroupLayout Confirmar_PanelLayout = new javax.swing.GroupLayout(Confirmar_Panel);
        Confirmar_Panel.setLayout(Confirmar_PanelLayout);
        Confirmar_PanelLayout.setHorizontalGroup(
            Confirmar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Confirmar_PanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        Confirmar_PanelLayout.setVerticalGroup(
            Confirmar_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Confirmar_PanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paneles_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Piso_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Piso_Resultado_Label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Columna_Label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Columna_Resultado_Label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Filas_Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fila_Resultado_Label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Direccion_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dir_ResultadoLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(ComboBox_Estacionamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(Confirmar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(Logo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Paneles_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Logo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ComboBox_Estacionamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion_Label)
                    .addComponent(Dir_ResultadoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Piso_Label)
                    .addComponent(Piso_Resultado_Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fila_Resultado_Label)
                    .addComponent(Filas_Label1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Columna_Label2)
                    .addComponent(Columna_Resultado_Label))
                .addGap(26, 26, 26)
                .addComponent(Confirmar_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

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

    private void configurarRenderizadorComboBox() {
        ComboBox_Estacionamientos.setBackground(new Color(204, 255, 153));
        ComboBox_Estacionamientos.setForeground(Color.BLACK);

        ComboBox_Estacionamientos.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (isSelected) {
                    setBackground(new Color(153, 204, 0));
                    setForeground(Color.BLACK);
                } else {
                    setBackground(new Color(204, 255, 153));
                    setForeground(Color.BLACK);
                }
                return this;
            }
        });
    }
    
    
    private void cargar_Estacionamientos(){
        configurarRenderizadorComboBox();
        ComboBox_Estacionamientos.removeAllItems();
        List<Estacionamiento> estacionamientos = listarEstacionamientos();
        for (Estacionamiento estacionamiento : estacionamientos) {
            ComboBox_Estacionamientos.addItem(estacionamiento.getNombre());
        }
        ComboBox_Estacionamientos.setSelectedIndex(-1);
    }
    private void Paneles_BotonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Paneles_BotonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Paneles_BotonesMouseDragged

    private void Paneles_BotonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Paneles_BotonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Paneles_BotonesMousePressed

    private void Panel_Boton_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseClicked
        timer.stop();
        System.exit(0);
    }//GEN-LAST:event_Panel_Boton_SalirMouseClicked

    private void Panel_Boton_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseEntered
        Panel_Boton_Salir.setBackground(new Color(255, 0, 0, 200));
        Panel_Boton_Salir.setForeground(Color.white);
    }//GEN-LAST:event_Panel_Boton_SalirMouseEntered

    private void Panel_Boton_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseExited
        Panel_Boton_Salir.setBackground(Color.red);
        Panel_Boton_Salir.setForeground(Color.black);
    }//GEN-LAST:event_Panel_Boton_SalirMouseExited

    private void ComboBox_EstacionamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_EstacionamientosActionPerformed
        String estacionamientoSeleccionado = (String) ComboBox_Estacionamientos.getSelectedItem();
        List<Estacionamiento> estacionamientos = listarEstacionamientos();
        if (estacionamientoSeleccionado != null) {
            for (Estacionamiento estacionamiento : estacionamientos) {
                if (estacionamiento.getNombre().equals(estacionamientoSeleccionado)) {
                    
                    this.Estacionamiento_Seleccionado = estacionamiento;
                    
                    // Actualizar los labels con la información del estacionamiento seleccionado
                    Dir_ResultadoLabel.setText(estacionamiento.getDireccion());
                    Piso_Resultado_Label.setText(String.valueOf(estacionamiento.getPisosTotales()));
                    Fila_Resultado_Label.setText(String.valueOf(estacionamiento.getFilasTotales()));
                    Columna_Resultado_Label.setText(String.valueOf(estacionamiento.getColumnasTotales()));
                    break;
                }
                
            }
        } else {
            Dir_ResultadoLabel.setText("");
            Piso_Resultado_Label.setText("");
            Fila_Resultado_Label.setText("");
            Columna_Resultado_Label.setText("");
            Estacionamiento_Seleccionado = null;
        }
    }//GEN-LAST:event_ComboBox_EstacionamientosActionPerformed

    private void Confirmar_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Confirmar_PanelMouseEntered
        Confirmar_Panel.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Confirmar_PanelMouseEntered

    private void Confirmar_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Confirmar_PanelMouseExited
        Confirmar_Panel.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_Confirmar_PanelMouseExited

    private void Confirmar_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Confirmar_PanelMouseClicked
        if (Estacionamiento_Seleccionado != null) {
            Seleccionar_Lugar seleccionarLugarFrame = new Seleccionar_Lugar(Estacionamiento_Seleccionado);

            this.setVisible(false); // Oculta el JFrame actual

            // Mostrar el nuevo JFrame
            seleccionarLugarFrame.setVisible(true);
            seleccionarLugarFrame.setLocationRelativeTo(null); // Centrar el nuevo JFrame en la pantalla
        } else {
            // Mensaje si no se ha seleccionado un estacionamiento
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estacionamiento antes de confirmar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Confirmar_PanelMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio_Programa_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Columna_Label2;
    private javax.swing.JLabel Columna_Resultado_Label;
    private javax.swing.JComboBox<String> ComboBox_Estacionamientos;
    private Menu.PanelRound Confirmar_Panel;
    private javax.swing.JLabel Dir_ResultadoLabel;
    private javax.swing.JLabel Direccion_Label;
    private javax.swing.JLabel Fila_Resultado_Label;
    private javax.swing.JLabel Filas_Label1;
    private javax.swing.JLabel Logo_Label;
    private Menu.PanelRound Panel_Boton_Salir;
    private javax.swing.JPanel Paneles_Botones;
    private javax.swing.JLabel Piso_Label;
    private javax.swing.JLabel Piso_Resultado_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPark1;
    private javax.swing.JLabel labelSmart;
    // End of variables declaration//GEN-END:variables
}
