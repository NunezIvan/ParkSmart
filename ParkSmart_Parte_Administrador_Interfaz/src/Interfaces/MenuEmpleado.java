package Interfaces;

import java.awt.Color;
/**
 *
 * @author Luis Bizarro
 */

//Para el reloj
import java.util.*;

public class MenuEmpleado extends javax.swing.JFrame implements Runnable{

    int xMouse, yMouse;
    
    String hora,minutos,segundos, ampm;
    Calendar calendario;
    Thread h1;
    
    public MenuEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        // Iniciar el hilo para el reloj
        h1 = new Thread(this);
        h1.start();

        // Mostrar el nombre de usuario (simulado en este caso)
        AdminInSesion_1 ventanaAdminSesion = new AdminInSesion_1();
        labelNombreMostrar.setText(ventanaAdminSesion.nombreDeUsuario + "!");
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
        panelRound2 = new Interfaces.PanelRound();
        panelVerEstacionamiento = new Interfaces.PanelRound();
        labelVerEstacionamiento = new javax.swing.JLabel();
        labelBienvenidos = new javax.swing.JLabel();
        imagenPuntosSuspensivos = new javax.swing.JLabel();
        labelNombreMostrar = new javax.swing.JLabel();
        labelReloj = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 804, Short.MAX_VALUE)
                .addComponent(panelBotonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVerEstacionamiento.setBackground(new java.awt.Color(0, 0, 0));
        panelVerEstacionamiento.setRoundBottomLeft(25);
        panelVerEstacionamiento.setRoundBottomRight(25);
        panelVerEstacionamiento.setRoundTopLeft(25);
        panelVerEstacionamiento.setRoundTopRight(25);

        labelVerEstacionamiento.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        labelVerEstacionamiento.setForeground(new java.awt.Color(255, 255, 255));
        labelVerEstacionamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVerEstacionamiento.setText("VER ESTACIONAMIENTO");
        labelVerEstacionamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVerEstacionamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVerEstacionamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelVerEstacionamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelVerEstacionamientoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelVerEstacionamientoLayout = new javax.swing.GroupLayout(panelVerEstacionamiento);
        panelVerEstacionamiento.setLayout(panelVerEstacionamientoLayout);
        panelVerEstacionamientoLayout.setHorizontalGroup(
            panelVerEstacionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerEstacionamientoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(labelVerEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelVerEstacionamientoLayout.setVerticalGroup(
            panelVerEstacionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerEstacionamientoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelVerEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelRound2.add(panelVerEstacionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 420, 200));

        labelBienvenidos.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        labelBienvenidos.setText("!BIENVENIDO/A,");
        panelRound2.add(labelBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        imagenPuntosSuspensivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Imagenes/puntosSuspensivos.png"))); // NOI18N
        panelRound2.add(imagenPuntosSuspensivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        labelNombreMostrar.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        labelNombreMostrar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombreMostrar.setText("NombreApellido!");
        panelRound2.add(labelNombreMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 80, 470, -1));

        labelReloj.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        labelReloj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelReloj.setText("HORA: XX:XX:XX");
        panelRound2.add(labelReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 340, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

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

    private void labelVerEstacionamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVerEstacionamientoMouseEntered
        
        labelVerEstacionamiento.setForeground(Color.orange);
        
    }//GEN-LAST:event_labelVerEstacionamientoMouseEntered

    private void labelVerEstacionamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVerEstacionamientoMouseExited
        // TODO add your handling code here:
        labelVerEstacionamiento.setForeground(Color.white);
    }//GEN-LAST:event_labelVerEstacionamientoMouseExited

    private void labelVerEstacionamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVerEstacionamientoMouseClicked
        VerEstacionamiento ventana = new VerEstacionamiento("Empleado");
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelVerEstacionamientoMouseClicked
    
    //Funcion calcula del reloj
    private void calcula() {
        calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY)
                    : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }

        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE)
                : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND)
                : "0" + calendario.get(Calendar.SECOND);
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenPuntosSuspensivos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBienvenidos;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelNombreMostrar;
    private javax.swing.JLabel labelPark;
    private javax.swing.JLabel labelReloj;
    private javax.swing.JLabel labelSmart;
    private javax.swing.JLabel labelVerEstacionamiento;
    private javax.swing.JPanel panelBotonExit;
    private Interfaces.PanelRound panelRound2;
    private Interfaces.PanelRound panelVerEstacionamiento;
    // End of variables declaration//GEN-END:variables
    
    
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();

        while (currentThread == h1) {
            calcula(); // Actualiza el cálculo de la hora
            labelReloj.setText(hora + ":" + minutos + ":" + segundos + " " + ampm); // Actualiza el texto del label
            try {
                Thread.sleep(1000); // Pausa 1 segundo antes de actualizar nuevamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
