
package Interfaces;

import static Main.Empleado.crearArchivoConEmpleadosPorDefecto;
import java.awt.Color;
import Main.LoginLogica; 
import javax.swing.JOptionPane;
import java.io.IOException;

/**
 *
 * @author Luis Bizarro
 */
public class AdminInSesion_1 extends javax.swing.JFrame {

    /**
     * Creates new form AdminInSesion
     */
    
    int xMouse, yMouse;
    
    public AdminInSesion_1() {
        initComponents();
        crearArchivoConEmpleadosPorDefecto();
        this.setLocationRelativeTo(null);
    }
    
    public static String nombreDeUsuario = "";
    
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
        labelIniciaSesion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        txtFieldUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelContrasenia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passFieldContrasenia = new javax.swing.JPasswordField();
        panelRound1 = new Interfaces.PanelRound();
        labelIngresar = new javax.swing.JLabel();

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

        labelIniciaSesion.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        labelIniciaSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIniciaSesion.setText("INICIA SESIÓN");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(550, 200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelUsuario.setText("Usuario:");
        jPanel4.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtFieldUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldUsuario.setText("Ingresa tu nombre de usuario");
        txtFieldUsuario.setBorder(null);
        txtFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFieldUsuarioMousePressed(evt);
            }
        });
        txtFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(txtFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 40, 360, 29));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 360, 10));

        labelContrasenia.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelContrasenia.setText("Contraseña:");
        jPanel4.add(labelContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 360, 10));

        passFieldContrasenia.setForeground(new java.awt.Color(153, 153, 153));
        passFieldContrasenia.setText("********");
        passFieldContrasenia.setBorder(null);
        passFieldContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passFieldContraseniaMousePressed(evt);
            }
        });
        jPanel4.add(passFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 360, -1));

        panelRound1.setBackground(new java.awt.Color(0, 0, 0));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        labelIngresar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelIngresar.setForeground(new java.awt.Color(255, 255, 255));
        labelIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngresar.setText("INGRESAR");
        labelIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(labelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIniciaSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelIniciaSesion)
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel4.getAccessibleContext().setAccessibleDescription("");

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

    private void txtFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsuarioActionPerformed

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
        // CUANDO EL MOUSE ENTRA AL PANEL
        panelBotonExit.setBackground(Color.red);
    }//GEN-LAST:event_panelBotonExitMouseEntered

    private void panelBotonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonExitMouseExited
        // TODO add your handling code here:
        panelBotonExit.setBackground(new Color(243,243,243));
    }//GEN-LAST:event_panelBotonExitMouseExited

    private void labelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseClicked
   // Aquí al hacer click debería mandarme a otra ventana
    
    // Esto es para guardar el nombre del usuario
    nombreDeUsuario = txtFieldUsuario.getText();    
    String password = new String(passFieldContrasenia.getPassword()); // Convertir el campo de password a String

    // Crear una instancia de la clase Login
    LoginLogica login = new LoginLogica();

    // Intentar logear al usuario
    try {
        // Obtener la categoría del usuario (Administrador o cualquier otra categoría)
        String categoria = login.logearUsuarioYObtenerCategoria(nombreDeUsuario, password);
        
        if (categoria != null) {
            // Si la categoría es 'Administrador', abrir la ventana del menú de administrador
            if (categoria.equalsIgnoreCase("Administrador")) {
                MenuAdministrador ventanaMenuAdministrador = new MenuAdministrador();
                ventanaMenuAdministrador.setVisible(true);
                this.dispose(); // Cerrar la ventana actual
            } 
            // Cualquier otra categoría abrirá la ventana del menú de empleado
            else {
                MenuEmpleado ventanaMenuEmpleado = new MenuEmpleado();
                ventanaMenuEmpleado.setVisible(true);
                this.dispose(); // Cerrar la ventana actual
            }
        } else {
            // Si el inicio de sesión falla, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Error, usuario o contraseña incorrectos.");
        }
    } catch (Exception e) {
        // Manejar cualquier error de lectura de archivo u otro problema
        JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + e.getMessage());
    }
        
    }//GEN-LAST:event_labelIngresarMouseClicked

    private void labelIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseExited
        // TODO add your handling code here:
        labelIngresar.setForeground(Color.white);
    }//GEN-LAST:event_labelIngresarMouseExited

    private void labelIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseEntered
        // TODO add your handling code here:
        labelIngresar.setForeground(new Color(41,239,130));
        
    }//GEN-LAST:event_labelIngresarMouseEntered

    private void txtFieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldUsuarioMousePressed
        if(txtFieldUsuario.getText().equals("Ingresa tu nombre de usuario")){
            txtFieldUsuario.setText("");
            txtFieldUsuario.setForeground(Color.black);
        }
        if(String.valueOf(passFieldContrasenia.getPassword()).isEmpty()){
            passFieldContrasenia.setText("********");
            passFieldContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFieldUsuarioMousePressed

    private void passFieldContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldContraseniaMousePressed
        if(txtFieldUsuario.getText().equals("")){
            txtFieldUsuario.setText("Ingresa tu nombre de usuario");
            txtFieldUsuario.setForeground(Color.gray);
        }
        if(String.valueOf(passFieldContrasenia.getPassword()).equals("********")){
            passFieldContrasenia.setText("");
            passFieldContrasenia.setForeground(Color.black);
        }
    }//GEN-LAST:event_passFieldContraseniaMousePressed

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
            java.util.logging.Logger.getLogger(AdminInSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInSesion_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelContrasenia;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelIngresar;
    private javax.swing.JLabel labelIniciaSesion;
    private javax.swing.JLabel labelPark;
    private javax.swing.JLabel labelSmart;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelBotonExit;
    private Interfaces.PanelRound panelRound1;
    private javax.swing.JPasswordField passFieldContrasenia;
    private javax.swing.JTextField txtFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
