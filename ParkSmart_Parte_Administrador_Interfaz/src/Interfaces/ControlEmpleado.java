package Interfaces;

import java.awt.Color;
import java.util.List;
import Main.Empleado;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Bizarro
 */
public class ControlEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Plantilla_ParkMain
     */
    
    int xMouse,
 
    /**
     * Creates new form Plantilla_ParkMain
     */
    yMouse;
    private List<Empleado> empleados = new ArrayList<>();
    public ControlEmpleado() {
        initComponents();
        cargarEmpleadosEnTabla();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelPark = new javax.swing.JLabel();
        labelSmart = new javax.swing.JLabel();
        panelBotonExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        boxApellido = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        ComboCategoria = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        boxNombre = new javax.swing.JTextField();
        jAgregarE = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jEliminar = new javax.swing.JButton();
        jActualizar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jLabel48.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel48.setText("Control de Empleados");

        jLabel47.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel47.setText("Agregar Empleado");

        jLabel46.setText("Apellido");

        boxApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                boxApellidoFocusGained(evt);
            }
        });
        boxApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxApellidoActionPerformed(evt);
            }
        });

        jLabel50.setText("Categoria");

        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Observador", "Coordinador", "Administrador" }));
        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        jLabel51.setText("Nombre");

        boxNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                boxNombreFocusGained(evt);
            }
        });
        boxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNombreActionPerformed(evt);
            }
        });

        jAgregarE.setBackground(new java.awt.Color(0, 0, 0));
        jAgregarE.setForeground(new java.awt.Color(255, 255, 255));
        jAgregarE.setText("Agregar Empleado");
        jAgregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarEActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel52.setText("Lista Empleados");

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);

        jEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jEliminar.setText("Eliminar Empleado");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jActualizar.setText("Actualizar Empleado");
        jActualizar.setToolTipText("");
        jActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(132, 132, 132)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel47))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jAgregarE, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel52)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRegresar)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel52))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(boxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jAgregarE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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
private void cargarEmpleadosEnTabla() {
    empleados = Empleado.leerEmpleados(); // Leer empleados del archivo
    String[][] data = new String[empleados.size()][6];
    
    // Rellenar los datos
    for (int i = 0; i < empleados.size(); i++) {
        Empleado emp = empleados.get(i);
        data[i][0] = emp.getApellido();
        data[i][1] = emp.getNombre();
        data[i][2] = emp.getNom_Usuario();
        data[i][3] = emp.getContr_Usuario();
        data[i][4] = emp.getId_usuario();
        data[i][5] = emp.getCategoria();
    }

    // Crear un modelo de tabla
    String[] columnNames = {"Apellido", "Nombre", "Username", "Contraseña", "ID Usuario", "Categoría"};
    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    jTableEmpleados.setModel(model); // Asegúrate de que jTableEmpleados sea tu JTable
}
 

    private void jAgregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarEActionPerformed
     String apellido = boxApellido.getText();
    String nombre = boxNombre.getText();
    String categoria = (String) ComboCategoria.getSelectedItem(); // Obtener categoría seleccionada

    // Crear un nuevo objeto Empleado usando el constructor adecuado
    Empleado nuevoEmpleado = new Empleado(apellido, nombre, categoria);

    // Agregar empleado al archivo
    Empleado.agregarEmpleado(nuevoEmpleado);

    // Limpiar los campos después de agregar
    boxApellido.setText("");
    boxNombre.setText("");

    cargarEmpleadosEnTabla(); // Actualizar la tabla

    }//GEN-LAST:event_jAgregarEActionPerformed

    private void boxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNombreActionPerformed

    private void boxNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_boxNombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNombreFocusGained

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void boxApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxApellidoActionPerformed

    private void boxApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_boxApellidoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_boxApellidoFocusGained

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
    // TODO add your handling code here:
      int filaSeleccionada = jTableEmpleados.getSelectedRow(); // Obtener la fila seleccionada

    if (filaSeleccionada != -1) { // Verificar que se haya seleccionado una fila
        // Obtener el ID del empleado que se va a eliminar
        String idUsuario = empleados.get(filaSeleccionada).getId_usuario(); // ID del empleado seleccionado
        
        // Confirmar la eliminación con el usuario
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este empleado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Llamar al método para eliminar el empleado en el archivo
            Empleado.eliminarEmpleado(idUsuario);

            // Recargar la tabla para mostrar los cambios
            cargarEmpleadosEnTabla(); // Método que ya tienes implementado

            // Opcional: limpiar los campos de texto después de la eliminación
            boxApellido.setText("");
            boxNombre.setText("");
            ComboCategoria.setSelectedItem(null); // Resetear el JComboBox
        }
    } else {
        // Mostrar un mensaje si no se ha seleccionado ninguna fila
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un empleado para eliminar.");
    }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarActionPerformed
        int filaSeleccionada = jTableEmpleados.getSelectedRow(); // Obtener la fila seleccionada

        if (filaSeleccionada != -1) { // Verificar que se haya seleccionado una fila
            // Obtener el ID del empleado que se va a actualizar
            String idUsuario = empleados.get(filaSeleccionada).getId_usuario(); // ID del empleado seleccionado

            // Obtener los nuevos datos de los campos de texto y el combobox
            String nuevoApellido = boxApellido.getText();
            String nuevoNombre = boxNombre.getText();
            String nuevaCategoria = (String) ComboCategoria.getSelectedItem(); // Obtener el valor seleccionado del JComboBox

            // Crear un nuevo objeto Empleado con los datos actualizados
            Empleado empleadoActualizado = new Empleado(nuevoApellido, nuevoNombre, nuevaCategoria);
            empleadoActualizado.setId_usuario(idUsuario); // Asegúrate de mantener el ID original

            // Llamar al método para actualizar el empleado en el archivo
            Empleado.actualizarEmpleado(idUsuario, empleadoActualizado);

            // Recargar la tabla para mostrar los cambios
            cargarEmpleadosEnTabla(); // Método que ya tienes implementado

            // Opcional: limpiar los campos de texto después de la actualización
            boxApellido.setText("");
            boxNombre.setText("");
            ComboCategoria.setSelectedItem(null); // Resetear el JComboBox
        } else {
            // Mostrar un mensaje si no se ha seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un empleado para actualizar.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarActionPerformed

    private void jTableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadosMouseClicked
        // TODO add your handling code here
        int filaSeleccionada = jTableEmpleados.getSelectedRow(); // Obtener la fila seleccionada

        if (filaSeleccionada != -1) { // Verificar que se haya seleccionado una fila
            // Obtener el empleado de la fila seleccionada
            Empleado empleadoSeleccionado = empleados.get(filaSeleccionada); // Acceso a la lista de empleados

            // Llenar los campos de texto y el combobox con la información del empleado
            boxApellido.setText(empleadoSeleccionado.getApellido());
            boxNombre.setText(empleadoSeleccionado.getNombre());
            ComboCategoria.setSelectedItem(empleadoSeleccionado.getCategoria());
        }

    }//GEN-LAST:event_jTableEmpleadosMouseClicked

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        MenuAdministrador ventanaMenuAdministrador = new MenuAdministrador();
        ventanaMenuAdministrador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed
    
    /**
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JTextField boxApellido;
    private javax.swing.JTextField boxNombre;
    private javax.swing.JButton jActualizar;
    private javax.swing.JButton jAgregarE;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelPark;
    private javax.swing.JLabel labelSmart;
    private javax.swing.JPanel panelBotonExit;
    // End of variables declaration//GEN-END:variables
}