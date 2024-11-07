
package Menu;

import conexion.conexion_DB;
import dominio.Estacionamiento;
import java.awt.Color;
import javax.swing.Timer;

public class Seleccionar_Lugar1 extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    private Estacionamiento estacionamientoSeleccionado;
    
    
    public Seleccionar_Lugar1(Estacionamiento estacionamientoSeleccionado) {
        initComponents();
        this.estacionamientoSeleccionado = estacionamientoSeleccionado;
        
        Nombre_Estacionamiento_Label.setText(estacionamientoSeleccionado.getNombre()); 

        timer = new Timer(10000, e -> conexion_DB.getConexion());
        timer.start(); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_Botones = new javax.swing.JPanel();
        labelPark1 = new javax.swing.JLabel();
        labelSmart = new javax.swing.JLabel();
        Panel_Boton_Salir = new Menu.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre_Estacionamiento_Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Panel_Estacionamiento_Espacios = new Menu.PanelRound();
        Boton_Retroceder_Label = new Menu.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        Boton_Avanzar_Label = new Menu.PanelRound();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Panel_Botones.setBackground(new java.awt.Color(0, 0, 0));
        Panel_Botones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_BotonesMouseDragged(evt);
            }
        });
        Panel_Botones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_BotonesMousePressed(evt);
            }
        });

        labelPark1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelPark1.setForeground(new java.awt.Color(255, 255, 255));
        labelPark1.setText("Park");

        labelSmart.setBackground(new java.awt.Color(41, 239, 130));
        labelSmart.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelSmart.setForeground(java.awt.Color.green);
        labelSmart.setText("Smart");

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Boton_SalirMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout Panel_Boton_SalirLayout = new javax.swing.GroupLayout(Panel_Boton_Salir);
        Panel_Boton_Salir.setLayout(Panel_Boton_SalirLayout);
        Panel_Boton_SalirLayout.setHorizontalGroup(
            Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Boton_SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_Boton_SalirLayout.setVerticalGroup(
            Panel_Boton_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_BotonesLayout = new javax.swing.GroupLayout(Panel_Botones);
        Panel_Botones.setLayout(Panel_BotonesLayout);
        Panel_BotonesLayout.setHorizontalGroup(
            Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelPark1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        Panel_BotonesLayout.setVerticalGroup(
            Panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPark1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelSmart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_BotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Panel_Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_ParkSmart1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("BIENVENIDO AL ESTACIONAMIENTO");

        Nombre_Estacionamiento_Label.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Estacionamiento_Label.setForeground(new java.awt.Color(51, 153, 0));
        Nombre_Estacionamiento_Label.setText("XXXXXXX");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setText("ESCOJA UNO DE LOS LUGARES DISPONIBLES");

        Panel_Estacionamiento_Espacios.setBackground(new java.awt.Color(233, 249, 233));
        Panel_Estacionamiento_Espacios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout Panel_Estacionamiento_EspaciosLayout = new javax.swing.GroupLayout(Panel_Estacionamiento_Espacios);
        Panel_Estacionamiento_Espacios.setLayout(Panel_Estacionamiento_EspaciosLayout);
        Panel_Estacionamiento_EspaciosLayout.setHorizontalGroup(
            Panel_Estacionamiento_EspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        Panel_Estacionamiento_EspaciosLayout.setVerticalGroup(
            Panel_Estacionamiento_EspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        Boton_Retroceder_Label.setBackground(new java.awt.Color(153, 255, 102));
        Boton_Retroceder_Label.setRoundBottomLeft(10);
        Boton_Retroceder_Label.setRoundBottomRight(10);
        Boton_Retroceder_Label.setRoundTopLeft(10);
        Boton_Retroceder_Label.setRoundTopRight(10);
        Boton_Retroceder_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_Retroceder_LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_Retroceder_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_Retroceder_LabelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<-");

        javax.swing.GroupLayout Boton_Retroceder_LabelLayout = new javax.swing.GroupLayout(Boton_Retroceder_Label);
        Boton_Retroceder_Label.setLayout(Boton_Retroceder_LabelLayout);
        Boton_Retroceder_LabelLayout.setHorizontalGroup(
            Boton_Retroceder_LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        Boton_Retroceder_LabelLayout.setVerticalGroup(
            Boton_Retroceder_LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        Boton_Avanzar_Label.setBackground(new java.awt.Color(153, 255, 102));
        Boton_Avanzar_Label.setRoundBottomLeft(10);
        Boton_Avanzar_Label.setRoundBottomRight(10);
        Boton_Avanzar_Label.setRoundTopLeft(10);
        Boton_Avanzar_Label.setRoundTopRight(10);
        Boton_Avanzar_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_Avanzar_LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_Avanzar_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_Avanzar_LabelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("->");

        javax.swing.GroupLayout Boton_Avanzar_LabelLayout = new javax.swing.GroupLayout(Boton_Avanzar_Label);
        Boton_Avanzar_Label.setLayout(Boton_Avanzar_LabelLayout);
        Boton_Avanzar_LabelLayout.setHorizontalGroup(
            Boton_Avanzar_LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        Boton_Avanzar_LabelLayout.setVerticalGroup(
            Boton_Avanzar_LabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nombre_Estacionamiento_Label)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Boton_Retroceder_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_Avanzar_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Panel_Estacionamiento_Espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Nombre_Estacionamiento_Label)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addComponent(Boton_Retroceder_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Boton_Avanzar_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Panel_Estacionamiento_Espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void Panel_BotonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Panel_BotonesMouseDragged

    private void Panel_BotonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Panel_BotonesMousePressed

    private void Boton_Retroceder_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Retroceder_LabelMouseClicked
        //Funcion para retroceder de piso
    }//GEN-LAST:event_Boton_Retroceder_LabelMouseClicked

    private void Boton_Retroceder_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Retroceder_LabelMouseEntered
        Boton_Retroceder_Label.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Boton_Retroceder_LabelMouseEntered

    private void Boton_Retroceder_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Retroceder_LabelMouseExited
        Boton_Retroceder_Label.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_Boton_Retroceder_LabelMouseExited

    private void Boton_Avanzar_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Avanzar_LabelMouseClicked
        //Funcion para avanzar piso
    }//GEN-LAST:event_Boton_Avanzar_LabelMouseClicked

    private void Boton_Avanzar_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Avanzar_LabelMouseEntered
        Boton_Avanzar_Label.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Boton_Avanzar_LabelMouseEntered

    private void Boton_Avanzar_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Avanzar_LabelMouseExited
        Boton_Avanzar_Label.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_Boton_Avanzar_LabelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu.PanelRound Boton_Avanzar_Label;
    private Menu.PanelRound Boton_Retroceder_Label;
    private javax.swing.JLabel Nombre_Estacionamiento_Label;
    private Menu.PanelRound Panel_Boton_Salir;
    private javax.swing.JPanel Panel_Botones;
    private Menu.PanelRound Panel_Estacionamiento_Espacios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPark1;
    private javax.swing.JLabel labelSmart;
    private Menu.PanelRound panelRound2;
    private Menu.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables
}
