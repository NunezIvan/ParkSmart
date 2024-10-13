package com.Menu;

import java.awt.Color;

public class Menu_Usuario extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Menu_Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPark = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        Panel_Botones = new javax.swing.JPanel();
        Panel_Boton_Salir = new com.Menu.PanelRound();
        Txt_Salir = new javax.swing.JLabel();
        labelPark1 = new javax.swing.JLabel();
        labelSmart = new javax.swing.JLabel();
        Label_Logo = new javax.swing.JLabel();
        Panel_Confirmar = new com.Menu.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        Panel_Seleccionar_Lugar1 = new com.Menu.PanelRound();
        Label_Seleccionar_Lugar = new javax.swing.JLabel();
        Label_Sele_Opciones = new javax.swing.JLabel();

        labelPark.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelPark.setForeground(new java.awt.Color(255, 255, 255));
        labelPark.setText("Park");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        bg.add(Panel_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));
        Panel_Botones.getAccessibleContext().setAccessibleDescription("");

        Label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Menu_Imagenes/Logo_ParkSmart1.png"))); // NOI18N
        bg.add(Label_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 470, 110));

        Panel_Confirmar.setBackground(new java.awt.Color(102, 255, 102));
        Panel_Confirmar.setRoundBottomLeft(10);
        Panel_Confirmar.setRoundBottomRight(10);
        Panel_Confirmar.setRoundTopLeft(10);
        Panel_Confirmar.setRoundTopRight(10);
        Panel_Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ConfirmarMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setText("CONFIRMAR SALIDA");

        javax.swing.GroupLayout Panel_ConfirmarLayout = new javax.swing.GroupLayout(Panel_Confirmar);
        Panel_Confirmar.setLayout(Panel_ConfirmarLayout);
        Panel_ConfirmarLayout.setHorizontalGroup(
            Panel_ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ConfirmarLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
        Panel_ConfirmarLayout.setVerticalGroup(
            Panel_ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ConfirmarLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        bg.add(Panel_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 260, 160));

        Panel_Seleccionar_Lugar1.setBackground(new java.awt.Color(102, 255, 102));
        Panel_Seleccionar_Lugar1.setRoundBottomLeft(10);
        Panel_Seleccionar_Lugar1.setRoundBottomRight(10);
        Panel_Seleccionar_Lugar1.setRoundTopLeft(10);
        Panel_Seleccionar_Lugar1.setRoundTopRight(10);
        Panel_Seleccionar_Lugar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Seleccionar_Lugar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Seleccionar_Lugar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Seleccionar_Lugar1MouseExited(evt);
            }
        });

        Label_Seleccionar_Lugar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Label_Seleccionar_Lugar.setText("SELECCIONAR LUGAR");

        javax.swing.GroupLayout Panel_Seleccionar_Lugar1Layout = new javax.swing.GroupLayout(Panel_Seleccionar_Lugar1);
        Panel_Seleccionar_Lugar1.setLayout(Panel_Seleccionar_Lugar1Layout);
        Panel_Seleccionar_Lugar1Layout.setHorizontalGroup(
            Panel_Seleccionar_Lugar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Seleccionar_Lugar1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Label_Seleccionar_Lugar)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Panel_Seleccionar_Lugar1Layout.setVerticalGroup(
            Panel_Seleccionar_Lugar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Seleccionar_Lugar1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Label_Seleccionar_Lugar)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        bg.add(Panel_Seleccionar_Lugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 260, 160));

        Label_Sele_Opciones.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Label_Sele_Opciones.setText("BIENVENIDO, SELECCIONE UNA DE LAS OPCIONES");
        Label_Sele_Opciones.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg.add(Label_Sele_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 560, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_BotonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Panel_BotonesMousePressed

    private void Panel_BotonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y- yMouse);
    }//GEN-LAST:event_Panel_BotonesMouseDragged

    private void Panel_Boton_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Panel_Boton_SalirMouseClicked

    private void Panel_Boton_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Boton_SalirMouseEntered
        Panel_Boton_Salir.setBackground(new Color(255, 0, 0, 200));
        Panel_Boton_Salir.setForeground(Color.white);
    }//GEN-LAST:event_Panel_Boton_SalirMouseEntered

    private void Panel_BotonesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BotonesMouseExited
        Panel_Boton_Salir.setBackground(Color.red);
        Panel_Boton_Salir.setForeground(Color.black);
    }//GEN-LAST:event_Panel_BotonesMouseExited

    private void Panel_Seleccionar_Lugar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Seleccionar_Lugar1MouseEntered
        Panel_Seleccionar_Lugar1.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Panel_Seleccionar_Lugar1MouseEntered

    private void Panel_Seleccionar_Lugar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Seleccionar_Lugar1MouseExited
        Panel_Seleccionar_Lugar1.setBackground(Color.green);
    }//GEN-LAST:event_Panel_Seleccionar_Lugar1MouseExited

    private void Panel_ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ConfirmarMouseEntered
        Panel_Confirmar.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Panel_ConfirmarMouseEntered

    private void Panel_ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ConfirmarMouseExited
        Panel_Confirmar.setBackground(Color.green);
    }//GEN-LAST:event_Panel_ConfirmarMouseExited

    private void Panel_Seleccionar_Lugar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Seleccionar_Lugar1MouseClicked
        Frame_Seleccionar_Lugar seleccionar_lugar = new Frame_Seleccionar_Lugar();
        seleccionar_lugar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Panel_Seleccionar_Lugar1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel Label_Sele_Opciones;
    private javax.swing.JLabel Label_Seleccionar_Lugar;
    private com.Menu.PanelRound Panel_Boton_Salir;
    private javax.swing.JPanel Panel_Botones;
    private com.Menu.PanelRound Panel_Confirmar;
    private com.Menu.PanelRound Panel_Seleccionar_Lugar1;
    private javax.swing.JLabel Txt_Salir;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPark;
    private javax.swing.JLabel labelPark1;
    private javax.swing.JLabel labelSmart;
    // End of variables declaration//GEN-END:variables
}
