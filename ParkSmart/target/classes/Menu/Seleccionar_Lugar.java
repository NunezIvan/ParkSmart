
package Menu;

import conexion.conexion_DB;
import static datos.Vehiculos.Agregar_Vehiculo;
import static datos.Vehiculos.leerMatricula;
import static datos.ubicaciones.listarUbicacionesPorEstacionamiento;
import dominio.Estacionamiento;
import dominio.Vehiculo;
import dominio.ubicacion;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.Timer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static datos.ubicaciones.ModificarUbicacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seleccionar_Lugar extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    private Estacionamiento estacionamientoSeleccionado;
    private javax.swing.JButton[][] espaciosEstacionamiento;
    private List<ubicacion> ubicaciones;
    private ubicacion ubicacion_Seleccionada;
    private String matricula_escaneada = leerMatricula();
    private int filaSeleccionado;
    private int columnaSeleccionado;
    private int pisoSeleccionado;
    private int pisoActual = 1;
    
    
    public Seleccionar_Lugar(Estacionamiento estacionamientoSeleccionado) {
        initComponents();
        renderizar_Combobox();
        this.estacionamientoSeleccionado = estacionamientoSeleccionado;
        Piso_Label.setText("1");
        Nombre_Estacionamiento_Label.setText(estacionamientoSeleccionado.getNombre()); 
        Inicializar_Estacionamiento(estacionamientoSeleccionado);
        timer = new Timer(3000, e -> conexion_DB.getConexion());
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
        jLabel7 = new javax.swing.JLabel();
        Piso_Label = new javax.swing.JLabel();
        panelRound4 = new Menu.PanelRound();
        jSeparator5 = new javax.swing.JSeparator();
        labeltxtTipoVehiculo = new javax.swing.JLabel();
        labeltxtPlaca = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labelEspacio = new javax.swing.JLabel();
        Boton_Confirmar = new Menu.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        Lista_Tipos_Vehiculos = new javax.swing.JComboBox<>();
        LabelSitio_Ocupadotxt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 703));

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
        jLabel5.setText("PISO:");

        Panel_Estacionamiento_Espacios.setBackground(new java.awt.Color(220, 249, 220));
        Panel_Estacionamiento_Espacios.setPreferredSize(new java.awt.Dimension(620, 430));
        Panel_Estacionamiento_Espacios.setRoundBottomLeft(10);
        Panel_Estacionamiento_Espacios.setRoundBottomRight(10);
        Panel_Estacionamiento_Espacios.setRoundTopLeft(10);
        Panel_Estacionamiento_Espacios.setRoundTopRight(10);

        javax.swing.GroupLayout Panel_Estacionamiento_EspaciosLayout = new javax.swing.GroupLayout(Panel_Estacionamiento_Espacios);
        Panel_Estacionamiento_Espacios.setLayout(Panel_Estacionamiento_EspaciosLayout);
        Panel_Estacionamiento_EspaciosLayout.setHorizontalGroup(
            Panel_Estacionamiento_EspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        Panel_Estacionamiento_EspaciosLayout.setVerticalGroup(
            Panel_Estacionamiento_EspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
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
            .addGroup(Boton_Retroceder_LabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setText("ESCOJA UNO DE LOS LUGARES DISPONIBLES");

        Piso_Label.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Piso_Label.setForeground(new java.awt.Color(51, 153, 0));
        Piso_Label.setText("XX");

        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 174, -1));

        labeltxtTipoVehiculo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltxtTipoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltxtTipoVehiculo.setText("Tipo de vehículo");
        panelRound4.add(labeltxtTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        labeltxtPlaca.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labeltxtPlaca.setText("PLACA: ");
        panelRound4.add(labeltxtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        labelPlaca.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(160, 170, 247));
        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("XXX-XXX");
        panelRound4.add(labelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, -1));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 174, -1));

        labelEspacio.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelEspacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEspacio.setText("Espacio N°: XX");
        panelRound4.add(labelEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        Boton_Confirmar.setBackground(new java.awt.Color(51, 255, 51));
        Boton_Confirmar.setRoundBottomLeft(30);
        Boton_Confirmar.setRoundBottomRight(30);
        Boton_Confirmar.setRoundTopLeft(30);
        Boton_Confirmar.setRoundTopRight(30);
        Boton_Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_ConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_ConfirmarMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel9.setText("CONFIRMAR");

        javax.swing.GroupLayout Boton_ConfirmarLayout = new javax.swing.GroupLayout(Boton_Confirmar);
        Boton_Confirmar.setLayout(Boton_ConfirmarLayout);
        Boton_ConfirmarLayout.setHorizontalGroup(
            Boton_ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton_ConfirmarLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(61, 61, 61))
        );
        Boton_ConfirmarLayout.setVerticalGroup(
            Boton_ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_ConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound4.add(Boton_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        Lista_Tipos_Vehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        Lista_Tipos_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_Tipos_VehiculosActionPerformed(evt);
            }
        });
        panelRound4.add(Lista_Tipos_Vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 108, -1));

        LabelSitio_Ocupadotxt.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        LabelSitio_Ocupadotxt.setForeground(new java.awt.Color(160, 170, 247));
        LabelSitio_Ocupadotxt.setText("SITIO OCUPADO");
        panelRound4.add(LabelSitio_Ocupadotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 49));

        jLabel8.setText("XX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nombre_Estacionamiento_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel_Estacionamiento_Espacios, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Boton_Retroceder_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Piso_Label)
                        .addGap(228, 228, 228)
                        .addComponent(Boton_Avanzar_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jLabel7))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_Retroceder_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(Piso_Label))))
                    .addComponent(Boton_Avanzar_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Panel_Estacionamiento_Espacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        if (pisoActual > 1) {
            pisoActual--;
            Piso_Label.setText(String.valueOf(pisoActual)); // Actualizar el label de piso
            cargar_Ubicaciones_DB(estacionamientoSeleccionado, pisoActual); // Recargar ubicaciones
        }
    }//GEN-LAST:event_Boton_Retroceder_LabelMouseClicked

    private void Boton_Retroceder_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Retroceder_LabelMouseEntered
        Boton_Retroceder_Label.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Boton_Retroceder_LabelMouseEntered

    private void Boton_Retroceder_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Retroceder_LabelMouseExited
        Boton_Retroceder_Label.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_Boton_Retroceder_LabelMouseExited

    private void Boton_Avanzar_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Avanzar_LabelMouseClicked
        int pisosTotales = estacionamientoSeleccionado.getPisosTotales();
        if (pisoActual < pisosTotales) {
            pisoActual++;
            Piso_Label.setText(String.valueOf(pisoActual)); // Actualizar el label de piso
            cargar_Ubicaciones_DB(estacionamientoSeleccionado, pisoActual); // Recargar ubicaciones
        }
    }//GEN-LAST:event_Boton_Avanzar_LabelMouseClicked

    private void Boton_Avanzar_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Avanzar_LabelMouseEntered
        Boton_Avanzar_Label.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Boton_Avanzar_LabelMouseEntered

    private void Boton_Avanzar_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Avanzar_LabelMouseExited
        Boton_Avanzar_Label.setBackground(new Color(102,255,102));
    }//GEN-LAST:event_Boton_Avanzar_LabelMouseExited

    private void Boton_ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ConfirmarMouseEntered
        Boton_Confirmar.setBackground(Color.decode("#46e514"));
    }//GEN-LAST:event_Boton_ConfirmarMouseEntered

    private void Boton_ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ConfirmarMouseExited
        Boton_Confirmar.setBackground(Color.green);
    }//GEN-LAST:event_Boton_ConfirmarMouseExited

    private void Lista_Tipos_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_Tipos_VehiculosActionPerformed

    }//GEN-LAST:event_Lista_Tipos_VehiculosActionPerformed

    private void Boton_ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_ConfirmarMouseClicked
        String tipoVehiculo = (String) Lista_Tipos_Vehiculos.getSelectedItem();
        String matricula = labelPlaca.getText();
        Vehiculo vehiculo = new Vehiculo(matricula,tipoVehiculo,LocalDateTime.now(),null);
        espaciosEstacionamiento[filaSeleccionado][columnaSeleccionado].setBackground(Color.CYAN);
        espaciosEstacionamiento[filaSeleccionado][columnaSeleccionado].setText("Reservado_rec");
        Agregar_Vehiculo(vehiculo);
        ModificarUbicacion(ubicacion_Seleccionada,"Reservado_rec");
        
        Timer timer = new Timer(8000, new ActionListener() { // 10000 ms = 10 segundos
            @Override
            public void actionPerformed(ActionEvent e) {
                ModificarUbicacion(ubicacion_Seleccionada, "Ocupado");

                // Actualiza el botón visualmente
                espaciosEstacionamiento[filaSeleccionado][columnaSeleccionado].setBackground(Color.RED);
                espaciosEstacionamiento[filaSeleccionado][columnaSeleccionado].setText("Ocupado");

                // Detiene el temporizador una vez ejecutado
                ((Timer) e.getSource()).stop();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_Boton_ConfirmarMouseClicked
    
    
    private void renderizar_Combobox(){
        Lista_Tipos_Vehiculos.setBackground(new Color(204, 255, 153));
        Lista_Tipos_Vehiculos.setForeground(Color.BLACK);

        Lista_Tipos_Vehiculos.setRenderer(new DefaultListCellRenderer() {
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
    
    private void Inicializar_Estacionamiento(Estacionamiento estacionamiento) {
        
        
        int columnas = estacionamiento.getColumnasTotales();
        int filas = estacionamiento.getFilasTotales();

        espaciosEstacionamiento = new javax.swing.JButton[filas][columnas];
        Panel_Estacionamiento_Espacios.setLayout(new java.awt.GridLayout(filas, columnas, 5, 5));

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                espaciosEstacionamiento[i][j] = new javax.swing.JButton();
                String nombreEspacio = (char) ('A' + i) + Integer.toString(j + 1);
                espaciosEstacionamiento[i][j].setText(nombreEspacio);
                espaciosEstacionamiento[i][j].setBackground(Color.GREEN);
                espaciosEstacionamiento[i][j].putClientProperty("nombreOriginal", nombreEspacio);
                final int fila = i;
                final int columna = j;
                espaciosEstacionamiento[i][j].addActionListener(evt -> espacioClicado(fila, columna));
                Panel_Estacionamiento_Espacios.add(espaciosEstacionamiento[i][j]);
            }
        }
        
        cargar_Ubicaciones_DB(estacionamiento, pisoActual);
    }
    
    private void cargar_Ubicaciones_DB(Estacionamiento estacionamiento, int piso) {
        for (int i = 0; i < espaciosEstacionamiento.length; i++) {
            for (int j = 0; j < espaciosEstacionamiento[i].length; j++) {
                // Restaurar el nombre original de cada botón
                String nombreOriginal = (String) espaciosEstacionamiento[i][j].getClientProperty("nombreOriginal");
                espaciosEstacionamiento[i][j].setText(nombreOriginal);
                espaciosEstacionamiento[i][j].setBackground(Color.GREEN); // Restaurar color a verde
            }
        }

        ubicaciones = listarUbicacionesPorEstacionamiento(estacionamiento.getIdEstacionamiento());
        for (ubicacion Ubicacion : ubicaciones) {
            if (Ubicacion.getPiso() == piso) {
                int fila = Ubicacion.getFila() - 1;
                int columna = Ubicacion.getColumna() - 1;
                if (fila >= 0 && columna >= 0 && fila < espaciosEstacionamiento.length && columna < espaciosEstacionamiento[0].length) {
                    if (Ubicacion.getEstado().equals("Ocupado")) {
                        espaciosEstacionamiento[fila][columna].setText("Ocupado");
                        espaciosEstacionamiento[fila][columna].setBackground(Color.RED);
                    } else if (Ubicacion.getEstado().equals("Por_Liberar")) {
                        espaciosEstacionamiento[fila][columna].setText("Por Liberar");
                        espaciosEstacionamiento[fila][columna].setBackground(Color.YELLOW);
                    } else if (Ubicacion.getEstado().equals("Reservado_rec")) {
                        espaciosEstacionamiento[fila][columna].setText("Reservado_rec");
                        espaciosEstacionamiento[fila][columna].setBackground(Color.CYAN);
                    } else {
                        // Si el estado no es ocupado, restaurar el nombre original
                        String nombreOriginal = (String) espaciosEstacionamiento[fila][columna].getClientProperty("nombreOriginal");
                        espaciosEstacionamiento[fila][columna].setText(nombreOriginal);
                        espaciosEstacionamiento[fila][columna].setBackground(Color.GREEN);
                    }
                }
            }
        }
    }
    
    private void espacioClicado(int fila, int columna) {
        
        for (ubicacion Ubicacion : ubicaciones) {
            if (Ubicacion.getPiso() == pisoActual && 
                Ubicacion.getFila() - 1 == fila && 
                Ubicacion.getColumna() - 1 == columna) {
                ubicacion_Seleccionada = Ubicacion;
                break;
            }
        }
        
        Color colorActual = espaciosEstacionamiento[fila][columna].getBackground();
        
        filaSeleccionado = fila;
        columnaSeleccionado = columna;

        if (colorActual.equals(Color.RED)) {
            labeltxtTipoVehiculo.setText("");
            labeltxtPlaca.setText("");
            labelPlaca.setText("");
            LabelSitio_Ocupadotxt.setText("SITIO OCUPADO");
            LabelSitio_Ocupadotxt.setVisible(true);
            Lista_Tipos_Vehiculos.setVisible(false);
            Boton_Confirmar.setVisible(false);
        } else if (colorActual.equals(Color.YELLOW)) {
            labeltxtTipoVehiculo.setText("");
            labeltxtPlaca.setText("");
            labelPlaca.setText("");
            LabelSitio_Ocupadotxt.setText("SITIO_LIBERAR");
            LabelSitio_Ocupadotxt.setVisible(true);
            Lista_Tipos_Vehiculos.setVisible(false);
            Boton_Confirmar.setVisible(false);
        } else if (colorActual.equals(Color.CYAN)) {
            labeltxtTipoVehiculo.setText("");
            labeltxtPlaca.setText("");
            labelPlaca.setText("");
            LabelSitio_Ocupadotxt.setText("RESERVADO H_M");
            LabelSitio_Ocupadotxt.setVisible(true);
            Lista_Tipos_Vehiculos.setVisible(false);
            Boton_Confirmar.setVisible(false);
        } else if (colorActual.equals(Color.GREEN)) {
            LabelSitio_Ocupadotxt.setVisible(false);
            labeltxtTipoVehiculo.setText("Tipo de vehículo");
            labeltxtPlaca.setText("PLACA: ");
            labelPlaca.setText(matricula_escaneada);

            String nombreEspacio = (char) ('A' + fila) + Integer.toString(columna + 1);
            labelEspacio.setText("Espacio N°: " + nombreEspacio);

            Lista_Tipos_Vehiculos.setVisible(true);
            Boton_Confirmar.setVisible(true);
        }
    }





    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu.PanelRound Boton_Avanzar_Label;
    private Menu.PanelRound Boton_Confirmar;
    private Menu.PanelRound Boton_Retroceder_Label;
    private javax.swing.JLabel LabelSitio_Ocupadotxt;
    private javax.swing.JComboBox<String> Lista_Tipos_Vehiculos;
    private javax.swing.JLabel Nombre_Estacionamiento_Label;
    private Menu.PanelRound Panel_Boton_Salir;
    private javax.swing.JPanel Panel_Botones;
    private Menu.PanelRound Panel_Estacionamiento_Espacios;
    private javax.swing.JLabel Piso_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelEspacio;
    private javax.swing.JLabel labelPark1;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelSmart;
    private javax.swing.JLabel labeltxtPlaca;
    private javax.swing.JLabel labeltxtTipoVehiculo;
    private Menu.PanelRound panelRound4;
    // End of variables declaration//GEN-END:variables
}
