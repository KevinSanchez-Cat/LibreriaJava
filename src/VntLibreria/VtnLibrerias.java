package VntLibreria;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import recursos.CtrlInterfaz;
import recursos.Validaciones;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public final class VtnLibrerias extends javax.swing.JFrame
{

    int X_V;
    int Y_V;
    public JToggleButton botoNanimacion = null;

    public JToggleButton getBotoNanimacion()
    {
        return botoNanimacion;
    }

    public void setBotoNanimacion(JToggleButton botoNanimacion)
    {
        this.botoNanimacion = botoNanimacion;
    }

    public VtnLibrerias()
    {
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        setIconImage(icono);
        ImageIcon iconoEncabezado = new ImageIcon(ClassLoader.getSystemResource("imagenes/Icono.png"));
        panelIconoEncabezado.setIcon(iconoEncabezado);

        getContentPane().setBackground(Color.ORANGE);
        panelLlamadaEmocion.setVisible(false);
        setLocationRelativeTo(null);

        setTitle("BASE DE DATOS DE VIRUS!");
        txtId.setVisible(false);
        modeloLista1 = new DefaultListModel();
        modeloLista1.addElement("nombre");
        modeloLista1.addElement("apellido_p");
        modeloLista1.addElement("correo");
        modeloLista1.addElement("telefono");
        modeloLista1.addElement("genero");
        modeloLista1.addElement("nivel_estudios");
        modeloLista1.addElement("apellido_m");
        modeloLista1.addElement("fecha_de_nac");
        jList1.setModel(modeloLista1);

        modeloLista2 = new DefaultListModel();
        jList2.setModel(modeloLista2);

        modelo3 = new DefaultComboBoxModel();
        modelo3.addElement("Seleccionar por");
        jComboBox1.setModel(modelo3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuElimiar = new javax.swing.JMenuItem();
        menumodificar = new javax.swing.JMenuItem();
        buttonEmocion = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaUsuarios = new javax.swing.JTable();
        txtBuscarClave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido_p = new javax.swing.JTextField();
        txtApellido_m = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEstado_civil = new javax.swing.JTextField();
        radioMasculino = new javax.swing.JRadioButton();
        radioFemenino = new javax.swing.JRadioButton();
        cbxNivel_estudios = new javax.swing.JComboBox<>();
        chek4 = new javax.swing.JCheckBox();
        chek1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        chek3 = new javax.swing.JCheckBox();
        jDate = new com.toedter.calendar.JDateChooser();
        password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtFelicitaciones = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        panelIconoEncabezado = new org.edisoncor.gui.panel.Panel();
        jLabel17 = new javax.swing.JLabel();
        panelReaccion = new javax.swing.JPanel();
        etirquetaTituloLibro = new javax.swing.JLabel();
        etiquetaAutorLibro = new javax.swing.JLabel();
        etiquetaEditorial = new javax.swing.JLabel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        etiqueta3 = new javax.swing.JLabel();
        panelVerificarReaccion = new javax.swing.JPanel();
        panelEmocion = new javax.swing.JPanel();
        panelLlamadaEmocion = new org.edisoncor.gui.panel.PanelLlamada();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        botonEmocion = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelImagem = new javax.swing.JPanel();
        bntDescripcion = new rojeru_san.RSButton();
        jLabel15 = new javax.swing.JLabel();
        panelRecomienda = new javax.swing.JPanel();
        etirquetaTituloLibro1 = new javax.swing.JLabel();
        etiquetaAutorLibro1 = new javax.swing.JLabel();
        etiquetaEditorial1 = new javax.swing.JLabel();
        etiqueta4 = new javax.swing.JLabel();
        etiqueta5 = new javax.swing.JLabel();
        etiqueta6 = new javax.swing.JLabel();
        panelImagenRecomienda = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bntDescripcion1 = new rojeru_san.RSButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();

        menuElimiar.setText("Eliminar");
        menuElimiar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuElimiarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuElimiar);

        menumodificar.setText("Modificar");
        menumodificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menumodificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menumodificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                formMouseClicked(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jTablaUsuarios.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTablaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 220, 40));

        txtBuscarClave.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarClave.setText("Puscar por clave");
        txtBuscarClave.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtBuscarClaveMouseClicked(evt);
            }
        });
        txtBuscarClave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBuscarClaveActionPerformed(evt);
            }
        });
        txtBuscarClave.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtBuscarClaveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtBuscarClaveKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 94, -1));

        jLabel1.setText("Buscar por clave:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel2.setText("Clave:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 105, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("Apellido paterno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setText("Apellido materno:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setText("Correo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel8.setText("Estado civil:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel9.setText("Genero:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel10.setText("Nivel de estudios:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel11.setText("Intereses:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel12.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel13.setText("Imagen:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));

        jLabel14.setText("Contraseña:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 70, -1));

        txtClave.setForeground(new java.awt.Color(204, 204, 204));
        txtClave.setText("13-AB");
        txtClave.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txtClaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                txtClaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                txtClaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                txtClaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                txtClaveMouseReleased(evt);
            }
        });
        txtClave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtClaveActionPerformed(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtClaveKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtClaveKeyReleased(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 110, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, -1));
        getContentPane().add(txtApellido_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));
        getContentPane().add(txtApellido_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtTelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, -1));
        getContentPane().add(txtEstado_civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, -1));

        buttonGroup1.add(radioMasculino);
        radioMasculino.setText("Masculino");
        getContentPane().add(radioMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        buttonGroup1.add(radioFemenino);
        radioFemenino.setText("Femenino");
        getContentPane().add(radioFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        cbxNivel_estudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Primaria", "Secundaria", "Preparatoria", "Licenciatura", "Doctorado" }));
        getContentPane().add(cbxNivel_estudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));

        chek4.setText("Peliculas");
        getContentPane().add(chek4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        chek1.setText("Musica");
        getContentPane().add(chek1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        check2.setText("Libros");
        getContentPane().add(check2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        chek3.setText("Deportes");
        getContentPane().add(chek3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));
        getContentPane().add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 130, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 150, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1260, 20));

        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "apellido materno" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 600, 120, 90));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, 100, 30));

        jButton2.setText("Quitar");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 100, 30));

        jList2.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "correo", "telefono" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 590, 120, 100));

        jButton3.setText("realizar consulta");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 650, 110, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 610, 140, -1));

        jLabel16.setText("Ordenar por:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 580, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 220, 120));

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 140, 40));

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 40));

        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 40));

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 140, 40));

        jButton8.setText("Buscar usuario");
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 140, 40));

        jButton9.setText("Mostrar Usuario");
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 140, 40));

        txtFelicitaciones.setColumns(20);
        txtFelicitaciones.setRows(5);
        jScrollPane4.setViewportView(txtFelicitaciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 140));

        jPanel5.setBackground(new java.awt.Color(191, 191, 191));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mininizar2.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusPainted(false);
        jButton12.setFocusable(false);
        jButton12.setPreferredSize(new java.awt.Dimension(73, 30));
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mininizar1.png"))); // NOI18N
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mininizar3.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 50, -1));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);
        jButton13.setFocusable(false);
        jButton13.setPreferredSize(new java.awt.Dimension(73, 30));
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar1.png"))); // NOI18N
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar3.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 50, -1));

        panelIconoEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        panelIconoEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        panelIconoEncabezado.setColorPrimario(new java.awt.Color(204, 204, 204));
        panelIconoEncabezado.setColorSecundario(new java.awt.Color(204, 204, 204));
        jPanel5.add(panelIconoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jLabel17.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Biblioteca Virtual");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 240, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 30));

        panelReaccion.setBackground(new java.awt.Color(255, 255, 255));
        panelReaccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        panelReaccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etirquetaTituloLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etirquetaTituloLibro.setText("Nombre del libro");
        panelReaccion.add(etirquetaTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, -1));

        etiquetaAutorLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaAutorLibro.setText("Autor");
        panelReaccion.add(etiquetaAutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 20));

        etiquetaEditorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaEditorial.setText("Editorial");
        panelReaccion.add(etiquetaEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 170, -1));

        etiqueta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta1.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta1.setText("Nombre del libro:");
        panelReaccion.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        etiqueta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta2.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta2.setText("Autor:");
        panelReaccion.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 40, -1));

        etiqueta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta3.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta3.setText("Editorial:");
        panelReaccion.add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, -1));

        panelVerificarReaccion.setOpaque(false);
        panelVerificarReaccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                panelVerificarReaccionMouseMoved(evt);
            }
        });
        panelVerificarReaccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEmocion.setOpaque(false);
        panelEmocion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                panelEmocionMouseMoved(evt);
            }
        });
        panelEmocion.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                panelEmocionMouseClicked(evt);
            }
        });
        panelEmocion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLlamadaEmocion.setColorDeBorde(new java.awt.Color(153, 153, 153));
        panelLlamadaEmocion.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelLlamadaEmocion.setColorSecundario(new java.awt.Color(255, 255, 255));
        panelLlamadaEmocion.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CENTRAL);
        panelLlamadaEmocion.setOrientacion(org.edisoncor.gui.panel.PanelLlamada.Orientacion.BOTTOM);
        panelLlamadaEmocion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonEmocion.add(jRadioButton1);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEncanta1.png"))); // NOI18N
        jRadioButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEncanta2.png"))); // NOI18N
        jRadioButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEncanta3.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton1ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 30));

        buttonEmocion.add(jRadioButton2);
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meSonroja1.png"))); // NOI18N
        jRadioButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meSonroja2.png"))); // NOI18N
        jRadioButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meSonroja3.png"))); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton2ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 30, 30));

        buttonEmocion.add(jRadioButton3);
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meAsombra1.png"))); // NOI18N
        jRadioButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meAsombra2.png"))); // NOI18N
        jRadioButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meAsombra3.png"))); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton3ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 30));

        buttonEmocion.add(jRadioButton4);
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meDivierte1.png"))); // NOI18N
        jRadioButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meDivierte2.png"))); // NOI18N
        jRadioButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meDivierte3.png"))); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton4ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 30));

        buttonEmocion.add(jRadioButton5);
        jRadioButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEntristece1.png"))); // NOI18N
        jRadioButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEntristece2.png"))); // NOI18N
        jRadioButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEntristece3.png"))); // NOI18N
        jRadioButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton5ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 30));

        buttonEmocion.add(jRadioButton6);
        jRadioButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEnoja1.png"))); // NOI18N
        jRadioButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEnoja2.png"))); // NOI18N
        jRadioButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEnoja3.png"))); // NOI18N
        jRadioButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton6ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 40, 30));

        buttonEmocion.add(jRadioButton7);
        jRadioButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meGusta1.png"))); // NOI18N
        jRadioButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meGusta2.png"))); // NOI18N
        jRadioButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meGusta3.png"))); // NOI18N
        jRadioButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton7ActionPerformed(evt);
            }
        });
        panelLlamadaEmocion.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        panelEmocion.add(panelLlamadaEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        botonEmocion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEmocion.setForeground(new java.awt.Color(153, 153, 153));
        botonEmocion.setText("Me gusta");
        botonEmocion.setContentAreaFilled(false);
        botonEmocion.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                botonEmocionStateChanged(evt);
            }
        });
        botonEmocion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                botonEmocionMouseMoved(evt);
            }
        });
        botonEmocion.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                botonEmocionMouseClicked(evt);
            }
        });
        botonEmocion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botonEmocionActionPerformed(evt);
            }
        });
        panelEmocion.add(botonEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));
        panelEmocion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 310, 10));

        panelVerificarReaccion.add(panelEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 260, 70));

        panelReaccion.add(panelVerificarReaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 310, 120));

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panelReaccion.add(jPanelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, -1));

        bntDescripcion.setBackground(new java.awt.Color(0, 51, 102));
        bntDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Up_24px.png"))); // NOI18N
        bntDescripcion.setText("Ver descripción");
        bntDescripcion.setColorHover(new java.awt.Color(0, 102, 204));
        bntDescripcion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bntDescripcionActionPerformed(evt);
            }
        });
        panelReaccion.add(bntDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 310, -1));

        getContentPane().add(panelReaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 340, 360));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesG/buhoAzul.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 80, 80));

        panelRecomienda.setBackground(new java.awt.Color(255, 255, 255));
        panelRecomienda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        panelRecomienda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                panelRecomiendaMouseMoved(evt);
            }
        });
        panelRecomienda.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                panelRecomiendaMouseEntered(evt);
            }
        });
        panelRecomienda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etirquetaTituloLibro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etirquetaTituloLibro1.setText("Nombre del libro");
        panelRecomienda.add(etirquetaTituloLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, -1));

        etiquetaAutorLibro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaAutorLibro1.setText("Autor");
        panelRecomienda.add(etiquetaAutorLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 20));

        etiquetaEditorial1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaEditorial1.setText("Editorial");
        panelRecomienda.add(etiquetaEditorial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 170, -1));

        etiqueta4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta4.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta4.setText("Nombre del libro:");
        panelRecomienda.add(etiqueta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        etiqueta5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta5.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta5.setText("Autor:");
        panelRecomienda.add(etiqueta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 40, -1));

        etiqueta6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta6.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta6.setText("Editorial:");
        panelRecomienda.add(etiqueta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, -1));

        javax.swing.GroupLayout panelImagenRecomiendaLayout = new javax.swing.GroupLayout(panelImagenRecomienda);
        panelImagenRecomienda.setLayout(panelImagenRecomiendaLayout);
        panelImagenRecomiendaLayout.setHorizontalGroup(
            panelImagenRecomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panelImagenRecomiendaLayout.setVerticalGroup(
            panelImagenRecomiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        panelRecomienda.add(panelImagenRecomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, -1));

        bntDescripcion1.setBackground(new java.awt.Color(0, 51, 102));
        bntDescripcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Up_24px.png"))); // NOI18N
        bntDescripcion1.setText("Ver descripción");
        bntDescripcion1.setColorHover(new java.awt.Color(0, 102, 204));
        bntDescripcion1.addContainerListener(new java.awt.event.ContainerAdapter()
        {
            public void componentAdded(java.awt.event.ContainerEvent evt)
            {
                bntDescripcion1ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt)
            {
                bntDescripcion1ComponentRemoved(evt);
            }
        });
        bntDescripcion1.addHierarchyListener(new java.awt.event.HierarchyListener()
        {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt)
            {
                bntDescripcion1HierarchyChanged(evt);
            }
        });
        bntDescripcion1.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
                bntDescripcion1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
                bntDescripcion1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
                bntDescripcion1AncestorRemoved(evt);
            }
        });
        bntDescripcion1.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                bntDescripcion1StateChanged(evt);
            }
        });
        bntDescripcion1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MouseMoved(evt);
            }
        });
        bntDescripcion1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                bntDescripcion1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                bntDescripcion1FocusLost(evt);
            }
        });
        bntDescripcion1.addMouseWheelListener(new java.awt.event.MouseWheelListener()
        {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt)
            {
                bntDescripcion1MouseWheelMoved(evt);
            }
        });
        bntDescripcion1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                bntDescripcion1MouseReleased(evt);
            }
        });
        bntDescripcion1.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentHidden(java.awt.event.ComponentEvent evt)
            {
                bntDescripcion1ComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt)
            {
                bntDescripcion1ComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt)
            {
                bntDescripcion1ComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                bntDescripcion1ComponentShown(evt);
            }
        });
        bntDescripcion1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bntDescripcion1ActionPerformed(evt);
            }
        });
        bntDescripcion1.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                bntDescripcion1PropertyChange(evt);
            }
        });
        bntDescripcion1.addVetoableChangeListener(new java.beans.VetoableChangeListener()
        {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException
            {
                bntDescripcion1VetoableChange(evt);
            }
        });
        panelRecomienda.add(bntDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 310, -1));

        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png"))); // NOI18N
        jCheckBox1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star.png"))); // NOI18N
        jCheckBox1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png"))); // NOI18N
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (2).png"))); // NOI18N
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jCheckBox1MouseMoved(evt);
            }
        });
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jCheckBox1MouseReleased(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox1ActionPerformed(evt);
            }
        });
        panelRecomienda.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png"))); // NOI18N
        jCheckBox2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star.png"))); // NOI18N
        jCheckBox2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png"))); // NOI18N
        jCheckBox2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (2).png"))); // NOI18N
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jCheckBox2StateChanged(evt);
            }
        });
        jCheckBox2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jCheckBox2MouseMoved(evt);
            }
        });
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jCheckBox2MouseReleased(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox2ActionPerformed(evt);
            }
        });
        panelRecomienda.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, 30));

        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png"))); // NOI18N
        jCheckBox3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star.png"))); // NOI18N
        jCheckBox3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png"))); // NOI18N
        jCheckBox3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (2).png"))); // NOI18N
        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jCheckBox3StateChanged(evt);
            }
        });
        jCheckBox3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jCheckBox3MouseMoved(evt);
            }
        });
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jCheckBox3MouseReleased(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox3ActionPerformed(evt);
            }
        });
        panelRecomienda.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 30));

        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png"))); // NOI18N
        jCheckBox4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star.png"))); // NOI18N
        jCheckBox4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png"))); // NOI18N
        jCheckBox4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (2).png"))); // NOI18N
        jCheckBox4.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jCheckBox4StateChanged(evt);
            }
        });
        jCheckBox4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jCheckBox4MouseMoved(evt);
            }
        });
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jCheckBox4MouseReleased(evt);
            }
        });
        jCheckBox4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox4ActionPerformed(evt);
            }
        });
        panelRecomienda.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, 30));

        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png"))); // NOI18N
        jCheckBox5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star.png"))); // NOI18N
        jCheckBox5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png"))); // NOI18N
        jCheckBox5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (2).png"))); // NOI18N
        jCheckBox5.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jCheckBox5StateChanged(evt);
            }
        });
        jCheckBox5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jCheckBox5MouseMoved(evt);
            }
        });
        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jCheckBox5MouseReleased(evt);
            }
        });
        jCheckBox5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox5ActionPerformed(evt);
            }
        });
        panelRecomienda.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 30));

        getContentPane().add(panelRecomienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 330, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtClaveKeyPressed
    {//GEN-HEADEREND:event_txtClaveKeyPressed
        Validaciones.enter(this, evt, txtNombre);
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    JFileChooser fc;
    File fichero;
    FileInputStream fis;
    DefaultTableModel modelo;

    void mostrarDatos(String clave)
    {
        modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");

        jTablaUsuarios.setModel(modelo);
        // int anchos[]={10,250,250,25};
        // for (int x = 0; x < jTablaUsuarios.getColumnCount(); x++)
        // {
        // jTablaUsuarios.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
        //}

        String sql = "";
        if (clave.equals(""))
        {
            sql = "SELECT * FROM alumnos";
        } else
        {

            sql = "SELECT * FROM alumnos WHERE clave like '" + clave + "%'";

        }

        String datos[] = new String[4];
        Statement st;
        Conexion.con = Conexion.getConexion();
        try
        {
            st = Conexion.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                datos[0] = rs.getString("idalumnos");
                datos[1] = rs.getString("clave");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("apellido_p");
                modelo.addRow(datos);
            }
            jTablaUsuarios.setModel(modelo);
        } catch (Exception e)
        {
        }
    }

    void agregarCampos(String campo, String clave)
    {

        modelo = new DefaultTableModel();
        String s = campo;
        if (s.equals("apellido materno"))
        {
            s = "apellido_m";
        }

        modelo.addColumn("id");
        modelo.addColumn("clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn(s);
        jTablaUsuarios.setModel(modelo);

        String sql = "";
        if (clave.equals(""))
        {
            sql = "SELECT * FROM alumnos";
        } else
        {

            sql = "SELECT * FROM alumnos WHERE clave like '" + clave + "%'";

        }

        String datos[] = new String[modelo.getColumnCount()];
        Statement st;
        Conexion.con = Conexion.getConexion();
        try
        {
            st = Conexion.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {

                for (int i = 0; i < modelo.getColumnCount(); i++)
                {
                    if (i == 0)
                    {
                        datos[i] = rs.getString("idalumnos");
                    }
                    if (i == 1)
                    {
                        datos[i] = rs.getString("clave");
                    }
                    if (i == 2)
                    {
                        datos[i] = rs.getString("nombre");
                    }
                    if (i == 3)
                    {
                        datos[i] = rs.getString("apellido_p");
                    }
                }
                modelo.addRow(datos);
            }
            jTablaUsuarios.setModel(modelo);
        } catch (Exception e)
        {
        }
    }
    private void menuElimiarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuElimiarActionPerformed
    {//GEN-HEADEREND:event_menuElimiarActionPerformed

        Conexion.con = Conexion.getConexion();
        String sql = "DELETE FROM alumnos WHERE clave=?";
        try
        {
            PreparedStatement registro = Conexion.con.prepareStatement(sql);
            int fila = jTablaUsuarios.getSelectedRow();
            String codigo = jTablaUsuarios.getValueAt(fila, 1).toString();
            registro.setInt(1, Integer.parseInt(codigo));
            modelo.removeRow(fila);

            //Actualiz los registros
            int rh = registro.executeUpdate();

            if (rh > 0)
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            } else
            {
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar registro");
            System.out.println("" + e.toString());
        }
        limpiar();
    }//GEN-LAST:event_menuElimiarActionPerformed

    private void menumodificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menumodificarActionPerformed
    {//GEN-HEADEREND:event_menumodificarActionPerformed
        try
        {
            int fila = jTablaUsuarios.getSelectedRow();
            String codigo = jTablaUsuarios.getValueAt(fila, 1).toString();
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM alumnos where clave=?");
            ps.setString(1, codigo);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next())
            {
                txtClave.setText("clave");
                txtId.setText(rs.getString("idalumnos"));
                txtNombre.setText(rs.getString("nombre"));
                txtApellido_p.setText(rs.getString("apellido_p"));
                txtApellido_m.setText(rs.getString("apellido_m"));
                txtCorreo.setText(rs.getString("correo"));
                txtTelefono.setText(rs.getString("telefono"));
                txtEstado_civil.setText(rs.getString("estado_civil"));
                cbxNivel_estudios.setSelectedItem(rs.getString("nivel_estudios"));
                String genero = rs.getString("genero");
                if ("Masculino".equals(genero))
                {

                    radioMasculino.setSelected(true);
                }
                if ("Femenino".equals(genero))
                {
                    radioFemenino.setSelected(true);

                }
                password.setText(rs.getString("contra"));

                jPanelImagem.removeAll();
                BufferedImage buffing = null;

                byte[] image = null;
                image = rs.getBytes("imagen");
                InputStream img = rs.getBinaryStream(15);

                try
                {
                    buffing = ImageIO.read(img);
                    ImagenMySQL imagen = new ImagenMySQL(jPanelImagem.getWidth(), jPanelImagem.getHeight(), buffing);
                    jPanelImagem.add(imagen);
                    jPanelImagem.repaint();

                } catch (Exception e)
                {
                }

                try
                {
                    // obtiene el valor de sql de fecha
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaTxt;
                    fechaTxt = formatoFecha.parse(rs.getString("fecha_de_nac"));
                    jDate.setDate(fechaTxt);
                } catch (ParseException ex)
                {

                }
                String interes = rs.getString("intereses");
                char[] toCharArray = interes.toCharArray();
                String s = "";
                for (int i = 0; i < toCharArray.length; i++)
                {
                    s = s + toCharArray[i];
                    if (toCharArray[i] == ' ')
                    {
                        if ("Musica ".equals(s))
                        {
                            chek1.setSelected(true);
                            s = "";
                        }

                        if ("Libros ".equals(s))
                        {
                            check2.setSelected(true);
                            s = "";
                        }
                        if ("Deportes ".equals(s))
                        {
                            chek3.setSelected(true);
                            s = "";
                        }
                        if ("Peliculas ".equals(s))
                        {
                            chek4.setSelected(true);
                            s = "";
                        }
                    }
                }

            } else
            {
                System.out.println("No existe el registro");
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(VtnLibrerias.class.getName()).log(Level.SEVERE, null, ex);
        }

//        limpiar();
//        limpiar();
    }//GEN-LAST:event_menumodificarActionPerformed

    private void txtBuscarClaveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtBuscarClaveKeyTyped
    {//GEN-HEADEREND:event_txtBuscarClaveKeyTyped

    }//GEN-LAST:event_txtBuscarClaveKeyTyped

    private void txtBuscarClaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtBuscarClaveActionPerformed
    {//GEN-HEADEREND:event_txtBuscarClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClaveActionPerformed

    private void txtBuscarClaveKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtBuscarClaveKeyReleased
    {//GEN-HEADEREND:event_txtBuscarClaveKeyReleased
        mostrarDatos(txtBuscarClave.getText().trim());
    }//GEN-LAST:event_txtBuscarClaveKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed

        if (jComboBox1.getSelectedItem().equals("Seleccionar por"))
        {
            int tElementos = modeloLista2.getSize();
            String[] elementosT = new String[tElementos];
            for (int i = 0; i < tElementos; i++)
            {
                elementosT[i] = (String) modeloLista2.getElementAt(i);
            }
            /*for (String elementosT1 : elementosT)
        {
            System.out.println("" + elementosT1);
        }*/
            muestraConsultaPersonalizada(elementosT);
        } else
        {
            int tElementos = modeloLista2.getSize();
            String[] elementosT = new String[tElementos];
            for (int i = 0; i < tElementos; i++)
            {
                elementosT[i] = (String) modeloLista2.getElementAt(i);
            }
            /*for (String elementosT1 : elementosT)
        {
            System.out.println("" + elementosT1);
        }*/
            String ordenarPor = modelo3.getElementAt(jComboBox1.getSelectedIndex()).toString();
            muestraConsultaPersonalizadaConOrdenPor(elementosT, ordenarPor);
        }


    }//GEN-LAST:event_jButton3ActionPerformed
    DefaultListModel modeloLista1;
    DefaultListModel modeloLista2;
    DefaultComboBoxModel modelo3;
    DefaultListModel modeloLista4;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        if (jList1.getSelectedIndex() == -1)
        {
            //mesaje de que seleciones
        } else
        {
            String s = jList1.getSelectedValue();
            modeloLista1.removeElementAt(jList1.getSelectedIndex());
            modeloLista2.addElement(s);
            modelo3.addElement(s);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void muestraConsultaPersonalizada(String camposT[])
    {
        try
        {

            modelo = new DefaultTableModel();
            String sql = "SELECT * FROM alumnos";
            Statement st;
            Conexion.con = Conexion.getConexion();
            st = Conexion.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                Conexion.con = Conexion.getConexion();
                st = Conexion.con.createStatement();
                rs = st.executeQuery(sql);
                ingresaCamposT(0, rs, camposT);
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    public void muestraConsultaPersonalizadaConOrdenPor(String camposT[], String ordenarPor)
    {
        try
        {

            modelo = new DefaultTableModel();
            String sql = "SELECT * FROM alumnos order by " + ordenarPor + "";
            Statement st;
            Conexion.con = Conexion.getConexion();
            st = Conexion.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                Conexion.con = Conexion.getConexion();
                st = Conexion.con.createStatement();
                rs = st.executeQuery(sql);
                ingresaCamposT(0, rs, camposT);
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    public void ingresaCamposT(int i, ResultSet rs, String campos[])
    {
        try
        {

            for (int j = 0; j < campos.length; j++)
            {
                modelo.addColumn(campos[j]);
                jTablaUsuarios.setModel(modelo);
            }

            String datos[] = new String[campos.length];
            int index = 0;
            while (rs.next())
            {
                for (int j = 0; j < campos.length; j++)
                {
                    try
                    {
                        datos[index] = rs.getString(campos[j]);
                        index++;
                    } catch (SQLException ex)
                    {
                        Logger.getLogger(VtnLibrerias.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                modelo.addRow(datos);
                jTablaUsuarios.setModel(modelo);
                index = 0;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(VtnLibrerias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed

        if (jList2.getSelectedIndex() == -1)
        {
//mensaje
        } else
        {
            String s = jList2.getSelectedValue();

            modeloLista2.removeElementAt(jList2.getSelectedIndex());
            modeloLista1.addElement(s);
            modelo3.removeElement(s);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void ingresa(int i, ResultSet rs, Object... jts)
    {
        try
        {
            int contador = i;
            for (Object obj : jts)
            {

                if (obj instanceof String)
                {
                    modelo.addColumn((String) obj);
                    jTablaUsuarios.setModel(modelo);
                    contador++;
                }
            }
            String datos[] = new String[contador];
            int index = i;
            while (rs.next())
            {
                for (Object obj : jts)
                {
                    if (obj instanceof String)
                    {
                        try
                        {
                            datos[index] = rs.getString((String) obj);
                            index++;
                        } catch (SQLException ex)
                        {
                            Logger.getLogger(VtnLibrerias.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                modelo.addRow(datos);
                jTablaUsuarios.setModel(modelo);
                index = 0;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(VtnLibrerias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelefonoKeyPressed
    {//GEN-HEADEREND:event_txtTelefonoKeyPressed

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jList1MouseClicked
    {//GEN-HEADEREND:event_jList1MouseClicked
        jButton1.setVisible(true);
        jButton2.setVisible(false);
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jList2MouseClicked
    {//GEN-HEADEREND:event_jList2MouseClicked
        jButton1.setVisible(false);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jList2MouseClicked

    private void txtClaveKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtClaveKeyReleased
    {//GEN-HEADEREND:event_txtClaveKeyReleased

    }//GEN-LAST:event_txtClaveKeyReleased

    private void txtClaveMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtClaveMouseClicked
    {//GEN-HEADEREND:event_txtClaveMouseClicked

    }//GEN-LAST:event_txtClaveMouseClicked

    private void txtClaveMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtClaveMouseExited
    {//GEN-HEADEREND:event_txtClaveMouseExited

    }//GEN-LAST:event_txtClaveMouseExited

    private void txtClaveMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtClaveMouseEntered
    {//GEN-HEADEREND:event_txtClaveMouseEntered

    }//GEN-LAST:event_txtClaveMouseEntered

    private void txtClaveMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtClaveMousePressed
    {//GEN-HEADEREND:event_txtClaveMousePressed

    }//GEN-LAST:event_txtClaveMousePressed

    private void txtClaveMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtClaveMouseReleased
    {//GEN-HEADEREND:event_txtClaveMouseReleased

    }//GEN-LAST:event_txtClaveMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseClicked
    {//GEN-HEADEREND:event_formMouseClicked
        panelLlamadaEmocion.setVisible(false);
        if (txtBuscarClave.getText().equals(""))
        {

            txtBuscarClave.setForeground(Color.LIGHT_GRAY);
            txtBuscarClave.setText("Puscar por clave");
        }
    }//GEN-LAST:event_formMouseClicked

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtClaveActionPerformed
    {//GEN-HEADEREND:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtBuscarClaveMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtBuscarClaveMouseClicked
    {//GEN-HEADEREND:event_txtBuscarClaveMouseClicked
        if (txtBuscarClave.getText().equals("Puscar por clave"))
        {
            txtBuscarClave.setText("");
            txtBuscarClave.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtBuscarClaveMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        if (txtBuscarClave.getText().equals("Buscar por clave"))
        {
            mostrarDatos("");
        } else
        {
            mostrarDatos(txtBuscarClave.getText());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        jPanelImagem.removeAll();

        check2.repaint();
        chek1.repaint();
        chek4.repaint();
        chek3.repaint();
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM alumnos where clave=?");
            ps.setString(1, txtClave.getText());
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next())
            {
                txtId.setText(rs.getString("idalumnos"));
                txtNombre.setText(rs.getString("nombre"));
                txtApellido_p.setText(rs.getString("apellido_p"));
                txtApellido_m.setText(rs.getString("apellido_m"));
                txtCorreo.setText(rs.getString("correo"));
                txtTelefono.setText(rs.getString("telefono"));
                txtEstado_civil.setText(rs.getString("estado_civil"));
                cbxNivel_estudios.setSelectedItem(rs.getString("nivel_estudios"));

                Date date = new Date();
                DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd"); //para la fecha y hora // yyyy-MM-dd HH:mm:ss//modificar

                if (rs.getString("fecha_de_nac").equals(fecha.format(date)))
                {
                    txtFelicitaciones.setText("Feliz cumpleaños \n" + rs.getString("nombre") + "!");
                }
                try
                {

                    BufferedImage buffing = null;

                    byte[] image = null;
                    image = rs.getBytes("imagen");
                    InputStream img = rs.getBinaryStream(15);
                    try
                    {
                        buffing = ImageIO.read(img);
                        ImagenMySQL imagen = new ImagenMySQL(jPanelImagem.getWidth(), jPanelImagem.getHeight(), buffing);
                        jPanelImagem.add(imagen);

                    } catch (Exception e)
                    {
                    }

                } catch (Exception e)
                {
                }

                String genero = rs.getString("genero");
                if ("Masculino".equals(genero))
                {

                    radioMasculino.setSelected(true);
                }
                if ("Femenino".equals(genero))
                {
                    radioFemenino.setSelected(true);

                }
                password.setText(rs.getString("contra"));

                try
                {
                    // obtiene el valor de sql de fecha
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaTxt;
                    fechaTxt = formatoFecha.parse(rs.getString("fecha_de_nac"));
                    jDate.setDate(fechaTxt);
                } catch (ParseException ex)
                {

                }
                String interes = rs.getString("intereses");
                char[] toCharArray = interes.toCharArray();
                String s = "";
                check2.setSelected(false);
                chek1.setSelected(false);
                chek3.setSelected(false);
                chek4.setSelected(false);
                for (int i = 0; i < toCharArray.length; i++)
                {
                    s = s + toCharArray[i];
                    if (toCharArray[i] == ' ')
                    {
                        if ("Musica ".equals(s))
                        {
                            chek1.setSelected(true);
                            s = "";
                        }

                        if ("Libros ".equals(s))
                        {
                            check2.setSelected(true);
                            s = "";
                        }
                        if ("Deportes ".equals(s))
                        {
                            chek3.setSelected(true);
                            s = "";
                        }
                        if ("Peliculas ".equals(s))
                        {
                            chek4.setSelected(true);
                            s = "";
                        }
                    }
                }

            } else
            {
                System.out.println("No existe el registro");
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(VtnLibrerias.class.getName()).log(Level.SEVERE, null, ex);
        }
        check2.repaint();
        chek1.repaint();
        chek4.repaint();
        chek3.repaint();
        jPanelImagem.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed

        Conexion.con = Conexion.getConexion();
        String sql = "DELETE FROM alumnos WHERE idalumnos=?";
        try
        {
            PreparedStatement registro = Conexion.con.prepareStatement(sql);

            registro.setInt(1, Integer.parseInt(txtId.getText()));
            //Actualiz los registros
            int rh = registro.executeUpdate();

            if (rh > 0)
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            } else
            {
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar registro");
            System.out.println("" + e.toString());
        }
        limpiar();

        mostrarDatos("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed

        Conexion.con = Conexion.getConexion();
        String sql = "UPDATE alumnos SET clave=?, nombre=?, apellido_p=?, apellido_m=?, correo=?, telefono=?, estado_civil=?, genero=?,  nivel_estudios=?, intereses=?, fecha_de_nac=?, contra=? WHERE idalumnos=?";
        String clave = txtClave.getText();
        String nombre = txtNombre.getText();
        String apellido_p = txtApellido_p.getText();
        String apellido_m = txtApellido_m.getText();
        String correo = txtCorreo.getText();
        if (esEmail(correo))
        {
            System.out.println("Es correo");
        } else
        {
            System.out.println("No es correo");
        }
        String telefono = txtTelefono.getText();
        String estado_civil = txtEstado_civil.getText();
        String genero = "";
        if (radioFemenino.isSelected())
        {
            genero = "Femenino";
        }
        if (radioMasculino.isSelected())
        {
            genero = "Masculino";
        }
        String nivel_estudios = cbxNivel_estudios.getSelectedItem().toString();
        String intereses = "";
        if (chek1.isSelected())
        {
            intereses += "Musica ";
        }
        if (check2.isSelected())
        {
            intereses += "Libros ";
        }
        if (chek3.isSelected())
        {
            intereses += "Deportes ";
        }
        if (chek4.isSelected())
        {
            intereses += "Peliculas ";
        }
        String fecha_nac = "";
        Date date = jDate.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
        fecha_nac = fecha.toString();
        String contrase = new String(password.getPassword());
        String nuevopasword = Hash.sha1(contrase);
        try
        {
            PreparedStatement registro = Conexion.con.prepareStatement(sql);

            registro.setString(1, clave);
            registro.setString(2, nombre);
            registro.setString(3, apellido_p);
            registro.setString(4, apellido_m);
            registro.setString(5, correo);
            registro.setString(6, telefono);
            registro.setString(7, estado_civil);
            registro.setString(8, genero);
            registro.setString(9, nivel_estudios);
            registro.setString(10, intereses);
            registro.setString(11, fecha_nac);
            registro.setString(12, nuevopasword);
            registro.setString(13, txtId.getText());
            //Actualiz los registros
            int rh = registro.executeUpdate();

            if (rh > 0)
            {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            } else
            {
                JOptionPane.showMessageDialog(null, "Registro no modificado");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar registro");
            System.out.println("" + e.toString());
        }
        limpiar();
        mostrarDatos("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed

        Conexion.con = Conexion.getConexion();
        String sql = "INSERT INTO alumnos(clave,nombre,apellido_p,apellido_m,correo,telefono,estado_civil,genero,nivel_estudios,intereses,fecha_de_nac,contra,imagen) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String clave = txtClave.getText();
        String nombre = txtNombre.getText();
        String apellido_p = txtApellido_p.getText();
        String apellido_m = txtApellido_m.getText();
        String correo = txtCorreo.getText();
        if (esEmail(correo))
        {
            //  System.out.println("Es correo");
        } else
        {
            //System.out.println("No es correo");
        }
        String telefono = txtTelefono.getText();
        String estado_civil = txtEstado_civil.getText();
        String genero = "";
        if (radioFemenino.isSelected())
        {
            genero = "Femenino";
        }
        if (radioMasculino.isSelected())
        {
            genero = "Masculino";
        }
        String nivel_estudios = cbxNivel_estudios.getSelectedItem().toString();
        String intereses = "";
        if (chek1.isSelected())
        {
            intereses += "Musica ";
        }
        if (check2.isSelected())
        {
            intereses += "Libros ";
        }
        if (chek3.isSelected())
        {
            intereses += "Deportes ";
        }
        if (chek4.isSelected())
        {
            intereses += "Peliculas ";
        }
        String fecha_nac = "";
        Date date = jDate.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
        fecha_nac = fecha.toString();
        String contrase = new String(password.getPassword());
        String nuevopasword = Hash.sha1(contrase);

        try
        {
            fis = new FileInputStream(fichero);
        } catch (FileNotFoundException e)
        {
        }

        try
        {
            PreparedStatement registro = Conexion.con.prepareStatement(sql);

            registro.setString(1, clave);
            registro.setString(2, nombre);
            registro.setString(3, apellido_p);
            registro.setString(4, apellido_m);
            registro.setString(5, correo);
            registro.setString(6, telefono);
            registro.setString(7, estado_civil);
            registro.setString(8, genero);
            registro.setString(9, nivel_estudios);
            registro.setString(10, intereses);
            registro.setString(11, fecha_nac);
            registro.setString(12, nuevopasword);

            registro.setBinaryStream(13, fis, (int) fichero.length());
            //  registro.setBinaryStream(13, fis, (int) fichero.length());
            //Actualiz los registros
            int r = registro.executeUpdate();

            fis.close();
            if (r > 0)
            {
                ImageIcon icono = new ImageIcon("src/48/299112 - shield warning.png");
                JOptionPane.showMessageDialog(this, "Registro guardado", "Titulo", JOptionPane.PLAIN_MESSAGE, icono);
            } else
            {
                ImageIcon icono = new ImageIcon("src/48/299112 - shield warning.png");
                JOptionPane.showMessageDialog(this, "Registro no guardado", "Titulo", JOptionPane.PLAIN_MESSAGE, icono);
            }

        } catch (Exception e)
        {
            ImageIcon icono = new ImageIcon("src/48/299112 - shield warning.png");
            JOptionPane.showMessageDialog(this, "Error al guardar\n" + e, "Titulo", JOptionPane.PLAIN_MESSAGE, icono);
            System.out.println("" + e.toString());
        }
        limpiar();
        mostrarDatos("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton12ActionPerformed
    {//GEN-HEADEREND:event_jButton12ActionPerformed
        this.setState(VtnBiblioteca.ICONIFIED);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton13ActionPerformed
    {//GEN-HEADEREND:event_jButton13ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel5MouseDragged
    {//GEN-HEADEREND:event_jPanel5MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - X_V, mueve.y - Y_V);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel5MousePressed
    {//GEN-HEADEREND:event_jPanel5MousePressed
        X_V = evt.getX();
        Y_V = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBox1ActionPerformed
    {//GEN-HEADEREND:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void panelEmocionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelEmocionMouseClicked
    {//GEN-HEADEREND:event_panelEmocionMouseClicked
        panelLlamadaEmocion.setVisible(false);
        reacciona();
    }//GEN-LAST:event_panelEmocionMouseClicked

    private void panelEmocionMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelEmocionMouseMoved
    {//GEN-HEADEREND:event_panelEmocionMouseMoved
//      panelLlamada1.setVisible(false);
    }//GEN-LAST:event_panelEmocionMouseMoved

    private void formPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_formPropertyChange
    {//GEN-HEADEREND:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton7ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton7ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton1ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton2ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton2ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton3ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton3ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton4ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton4ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton5ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton5ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton6ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton6ActionPerformed
        reacciona();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void botonEmocionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botonEmocionActionPerformed
    {//GEN-HEADEREND:event_botonEmocionActionPerformed

    }//GEN-LAST:event_botonEmocionActionPerformed

    private void botonEmocionStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_botonEmocionStateChanged
    {//GEN-HEADEREND:event_botonEmocionStateChanged

    }//GEN-LAST:event_botonEmocionStateChanged

    private void botonEmocionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botonEmocionMouseClicked
    {//GEN-HEADEREND:event_botonEmocionMouseClicked
        botonEmocion.setForeground(new Color(153, 153, 153));
        botonEmocion.setText("Me gusta");
        botonEmocion.setIcon(null);
        panelLlamadaEmocion.setVisible(false);
    }//GEN-LAST:event_botonEmocionMouseClicked

    private void botonEmocionMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botonEmocionMouseMoved
    {//GEN-HEADEREND:event_botonEmocionMouseMoved

        panelLlamadaEmocion.setVisible(true);
        panelVerificarReaccion.setVisible(true);
        panelEmocion.setVisible(true);
    }//GEN-LAST:event_botonEmocionMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseMoved
    {//GEN-HEADEREND:event_formMouseMoved


    }//GEN-LAST:event_formMouseMoved

    private void panelVerificarReaccionMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelVerificarReaccionMouseMoved
    {//GEN-HEADEREND:event_panelVerificarReaccionMouseMoved
        panelLlamadaEmocion.setVisible(false);
    }//GEN-LAST:event_panelVerificarReaccionMouseMoved

    private void bntDescripcionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bntDescripcionActionPerformed
    {//GEN-HEADEREND:event_bntDescripcionActionPerformed
        try
        {

            fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("*.PNG", "png");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("*.JPG", "jpg");
            fc.setFileFilter(filtro1);
            fc.setFileFilter(filtro2);

            int seleccion = fc.showOpenDialog(this);
            //jPanelImagem
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {//aceptar
                jPanelImagem.removeAll();
                fichero = fc.getSelectedFile();//traer el archivo que se ha seleccionado
                String ruts = fichero.getAbsolutePath();

                int x = jPanelImagem.getWidth();
                int y = jPanelImagem.getHeight();

                Imagen img = new Imagen(x, y, ruts);

                jPanelImagem.add(img);

            }
            jPanelImagem.repaint();

        } catch (Exception e)
        {
            System.out.println("" + e.toString());
        }


    }//GEN-LAST:event_bntDescripcionActionPerformed

    private void bntDescripcion1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bntDescripcion1ActionPerformed
    {//GEN-HEADEREND:event_bntDescripcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntDescripcion1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox5ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox5ActionPerformed
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jCheckBox5.setSelected(true);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox1ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox1ActionPerformed
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));


    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox2ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox2ActionPerformed

        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));


    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox3ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox3ActionPerformed
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox4ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox4ActionPerformed
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jCheckBox5.setSelected(false);
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox1MouseReleased
    {//GEN-HEADEREND:event_jCheckBox1MouseReleased

    }//GEN-LAST:event_jCheckBox1MouseReleased

    private void jCheckBox2MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox2MouseReleased
    {//GEN-HEADEREND:event_jCheckBox2MouseReleased

    }//GEN-LAST:event_jCheckBox2MouseReleased

    private void jCheckBox3MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox3MouseReleased
    {//GEN-HEADEREND:event_jCheckBox3MouseReleased

    }//GEN-LAST:event_jCheckBox3MouseReleased

    private void jCheckBox4MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox4MouseReleased
    {//GEN-HEADEREND:event_jCheckBox4MouseReleased

    }//GEN-LAST:event_jCheckBox4MouseReleased

    private void jCheckBox5MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox5MouseReleased
    {//GEN-HEADEREND:event_jCheckBox5MouseReleased

    }//GEN-LAST:event_jCheckBox5MouseReleased

    private void jCheckBox5StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jCheckBox5StateChanged
    {//GEN-HEADEREND:event_jCheckBox5StateChanged

    }//GEN-LAST:event_jCheckBox5StateChanged

    private void jCheckBox4StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jCheckBox4StateChanged
    {//GEN-HEADEREND:event_jCheckBox4StateChanged

    }//GEN-LAST:event_jCheckBox4StateChanged

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jCheckBox3StateChanged
    {//GEN-HEADEREND:event_jCheckBox3StateChanged

    }//GEN-LAST:event_jCheckBox3StateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jCheckBox2StateChanged
    {//GEN-HEADEREND:event_jCheckBox2StateChanged

    }//GEN-LAST:event_jCheckBox2StateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jCheckBox1StateChanged
    {//GEN-HEADEREND:event_jCheckBox1StateChanged

    }//GEN-LAST:event_jCheckBox1StateChanged

    private void bntDescripcion1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MouseClicked
    {//GEN-HEADEREND:event_bntDescripcion1MouseClicked
//JOptionPane.showMessageDialog(null, "HolaClic");
/*
Clic sobre el componente 
         */
    }//GEN-LAST:event_bntDescripcion1MouseClicked

    private void bntDescripcion1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MouseEntered
    {//GEN-HEADEREND:event_bntDescripcion1MouseEntered
        //JOptionPane.showMessageDialog(null, "HolaEtntered");
        /*
        Cuando pasa el mouse de afuera hacia adentro
         */
    }//GEN-LAST:event_bntDescripcion1MouseEntered

    private void bntDescripcion1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MouseExited
    {//GEN-HEADEREND:event_bntDescripcion1MouseExited
//JOptionPane.showMessageDialog(null, "HolaExited");
        /*
       Cuando pasa el mouse de adentro hacia Afuera 
         */
    }//GEN-LAST:event_bntDescripcion1MouseExited

    private void bntDescripcion1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MousePressed
    {//GEN-HEADEREND:event_bntDescripcion1MousePressed
//JOptionPane.showMessageDialog(null, "HolaPresed");
        /*
        Cuando se presiona el mause
         */

    }//GEN-LAST:event_bntDescripcion1MousePressed

    private void bntDescripcion1MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MouseReleased
    {//GEN-HEADEREND:event_bntDescripcion1MouseReleased
//JOptionPane.showMessageDialog(null, "HolaRelased");
        /*
        Caundo se presiona el boton y hasta que se suelta, se realiza la opracion
         */
    }//GEN-LAST:event_bntDescripcion1MouseReleased

    private void bntDescripcion1AncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_bntDescripcion1AncestorAdded
    {//GEN-HEADEREND:event_bntDescripcion1AncestorAdded
        //JOptionPane.showMessageDialog(null, "HolaAntecestorAdded");
        /*
        *Se ejecuta con el inicio del programa
         */
    }//GEN-LAST:event_bntDescripcion1AncestorAdded

    private void bntDescripcion1AncestorMoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_bntDescripcion1AncestorMoved
    {//GEN-HEADEREND:event_bntDescripcion1AncestorMoved
//JOptionPane.showMessageDialog(null, "HolaAntecesorMoved");
    }//GEN-LAST:event_bntDescripcion1AncestorMoved

    private void bntDescripcion1AncestorRemoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_bntDescripcion1AncestorRemoved
    {//GEN-HEADEREND:event_bntDescripcion1AncestorRemoved
//JOptionPane.showMessageDialog(null, "HolaRemoved");
    }//GEN-LAST:event_bntDescripcion1AncestorRemoved

    private void bntDescripcion1StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_bntDescripcion1StateChanged
    {//GEN-HEADEREND:event_bntDescripcion1StateChanged
//JOptionPane.showMessageDialog(null, "StatedChge");
    }//GEN-LAST:event_bntDescripcion1StateChanged

    private void bntDescripcion1ComponentHidden(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_bntDescripcion1ComponentHidden
    {//GEN-HEADEREND:event_bntDescripcion1ComponentHidden
//JOptionPane.showMessageDialog(null, "HolaComponentHidden");
    }//GEN-LAST:event_bntDescripcion1ComponentHidden

    private void bntDescripcion1ComponentMoved(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_bntDescripcion1ComponentMoved
    {//GEN-HEADEREND:event_bntDescripcion1ComponentMoved
//JOptionPane.showMessageDialog(null, "HolaComponentMoved");
    }//GEN-LAST:event_bntDescripcion1ComponentMoved

    private void bntDescripcion1ComponentResized(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_bntDescripcion1ComponentResized
    {//GEN-HEADEREND:event_bntDescripcion1ComponentResized
//JOptionPane.showMessageDialog(null, "HolaRized");
    }//GEN-LAST:event_bntDescripcion1ComponentResized

    private void bntDescripcion1ComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_bntDescripcion1ComponentShown
    {//GEN-HEADEREND:event_bntDescripcion1ComponentShown
//JOptionPane.showMessageDialog(null, "HolaShow");
    }//GEN-LAST:event_bntDescripcion1ComponentShown

    private void bntDescripcion1ComponentAdded(java.awt.event.ContainerEvent evt)//GEN-FIRST:event_bntDescripcion1ComponentAdded
    {//GEN-HEADEREND:event_bntDescripcion1ComponentAdded
//JOptionPane.showMessageDialog(null, "HolaComponentAddeds");
    }//GEN-LAST:event_bntDescripcion1ComponentAdded

    private void bntDescripcion1ComponentRemoved(java.awt.event.ContainerEvent evt)//GEN-FIRST:event_bntDescripcion1ComponentRemoved
    {//GEN-HEADEREND:event_bntDescripcion1ComponentRemoved
//JOptionPane.showMessageDialog(null, "HolaComponetRemoved");
    }//GEN-LAST:event_bntDescripcion1ComponentRemoved

    private void bntDescripcion1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_bntDescripcion1FocusGained
    {//GEN-HEADEREND:event_bntDescripcion1FocusGained
//JOptionPane.showMessageDialog(null, "HolaFocusGainend");
    }//GEN-LAST:event_bntDescripcion1FocusGained

    private void bntDescripcion1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_bntDescripcion1FocusLost
    {//GEN-HEADEREND:event_bntDescripcion1FocusLost
//JOptionPane.showMessageDialog(null, "HolaFocusLost");
    }//GEN-LAST:event_bntDescripcion1FocusLost

    private void bntDescripcion1HierarchyChanged(java.awt.event.HierarchyEvent evt)//GEN-FIRST:event_bntDescripcion1HierarchyChanged
    {//GEN-HEADEREND:event_bntDescripcion1HierarchyChanged
        //JOptionPane.showMessageDialog(null, "HolaHierarChyChage");
        /*
        Realiza la operacion hasta que abra la pantalla
        
         */
    }//GEN-LAST:event_bntDescripcion1HierarchyChanged

    private void bntDescripcion1MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MouseDragged
    {//GEN-HEADEREND:event_bntDescripcion1MouseDragged
//JOptionPane.showMessageDialog(null, "HolaDraged");
/*
Presionar sobre el comonente y moverlo
         */
    }//GEN-LAST:event_bntDescripcion1MouseDragged

    private void bntDescripcion1MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_bntDescripcion1MouseMoved
    {//GEN-HEADEREND:event_bntDescripcion1MouseMoved
        //JOptionPane.showMessageDialog(null, "HolaMouseMoved");
        /*
        Cuando el mause entra en el boton
         */
    }//GEN-LAST:event_bntDescripcion1MouseMoved

    private void bntDescripcion1PropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_bntDescripcion1PropertyChange
    {//GEN-HEADEREND:event_bntDescripcion1PropertyChange
//JOptionPane.showMessageDialog(null, "HolaPropieto");
    }//GEN-LAST:event_bntDescripcion1PropertyChange

    private void bntDescripcion1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException//GEN-FIRST:event_bntDescripcion1VetoableChange
    {//GEN-HEADEREND:event_bntDescripcion1VetoableChange
//JOptionPane.showMessageDialog(null, "HolaVetoable");
    }//GEN-LAST:event_bntDescripcion1VetoableChange

    private void bntDescripcion1MouseWheelMoved(java.awt.event.MouseWheelEvent evt)//GEN-FIRST:event_bntDescripcion1MouseWheelMoved
    {//GEN-HEADEREND:event_bntDescripcion1MouseWheelMoved
//JOptionPane.showMessageDialog(null, "HolaMouseWhwrl");
    }//GEN-LAST:event_bntDescripcion1MouseWheelMoved

    private void panelRecomiendaMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelRecomiendaMouseMoved
    {//GEN-HEADEREND:event_panelRecomiendaMouseMoved

    }//GEN-LAST:event_panelRecomiendaMouseMoved

    private void jCheckBox1MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox1MouseMoved
    {//GEN-HEADEREND:event_jCheckBox1MouseMoved
        if (!(jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()))
        {
            jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        }

    }//GEN-LAST:event_jCheckBox1MouseMoved

    private void jCheckBox2MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox2MouseMoved
    {//GEN-HEADEREND:event_jCheckBox2MouseMoved
        if (!(jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()))
        {
            jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));

            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        }
    }//GEN-LAST:event_jCheckBox2MouseMoved

    private void jCheckBox3MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox3MouseMoved
    {//GEN-HEADEREND:event_jCheckBox3MouseMoved
        if (!(jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()))
        {
            jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));

            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        }
    }//GEN-LAST:event_jCheckBox3MouseMoved

    private void jCheckBox4MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox4MouseMoved
    {//GEN-HEADEREND:event_jCheckBox4MouseMoved
        if (!(jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()))
        {
            jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));

            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        }
    }//GEN-LAST:event_jCheckBox4MouseMoved

    private void jCheckBox5MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jCheckBox5MouseMoved
    {//GEN-HEADEREND:event_jCheckBox5MouseMoved
        if (!(jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()))
        {
            jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (3).png")));

        }
    }//GEN-LAST:event_jCheckBox5MouseMoved

    private void panelRecomiendaMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelRecomiendaMouseEntered
    {//GEN-HEADEREND:event_panelRecomiendaMouseEntered
        if (jCheckBox1.isSelected())
        {
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        } else if (jCheckBox2.isSelected())
        {
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        } else if (jCheckBox3.isSelected())
        {
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        } else if (jCheckBox4.isSelected())
        {
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        } else if (jCheckBox5.isSelected())
        {

        } else
        {
            jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
            jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/icon-23-star (4).png")));
        }


    }//GEN-LAST:event_panelRecomiendaMouseEntered
    public void recomienda(javax.swing.JCheckBox c)
    {
        if (c.equals(jCheckBox1))
        {
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (c.equals(jCheckBox2))
        {
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (c.equals(jCheckBox3))
        {
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (c.equals(jCheckBox4))
        {
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(false);

        }
        if (c.equals(jCheckBox5))
        {
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);

        }
    }

    public void reacciona()
    {
        if (jRadioButton1.isSelected())
        {
            botonEmocion.setForeground(new Color(204, 0, 0));
            botonEmocion.setText("Me encanta");
            botonEmocion.setIcon(jRadioButton1.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (jRadioButton2.isSelected())
        {
            botonEmocion.setForeground(new Color(255, 204, 0));
            botonEmocion.setText("Me sonroja");
            botonEmocion.setIcon(jRadioButton2.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (jRadioButton3.isSelected())
        {
            botonEmocion.setForeground(new Color(204, 204, 0));
            botonEmocion.setText("Me asombra");
            botonEmocion.setIcon(jRadioButton3.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (jRadioButton4.isSelected())
        {
            botonEmocion.setForeground(new Color(255, 204, 0));
            botonEmocion.setText("Me divierte");
            botonEmocion.setIcon(jRadioButton4.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (jRadioButton5.isSelected())
        {
            botonEmocion.setForeground(new Color(255, 204, 0));
            botonEmocion.setText("Me entristece");
            botonEmocion.setIcon(jRadioButton5.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (jRadioButton6.isSelected())
        {
            botonEmocion.setForeground(new Color(204, 102, 0));
            botonEmocion.setText("Me enfada");
            botonEmocion.setIcon(jRadioButton6.getSelectedIcon());

            panelLlamadaEmocion.setVisible(false);
        } else if (jRadioButton7.isSelected())
        {
            botonEmocion.setForeground(new Color(0, 102, 255));
            botonEmocion.setText("Me gusta");
            botonEmocion.setIcon(jRadioButton7.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else
        {
            botonEmocion.setForeground(new Color(153, 153, 153));
            botonEmocion.setText("Me gusta");
            botonEmocion.setIcon(null);
            panelLlamadaEmocion.setVisible(false);
        }
    }

    public void componentesRecomienda()
    {

    }

    File f;

    public void limpiar()
    {
        CtrlInterfaz.limpia(txtApellido_m, txtApellido_p, txtBuscarClave, txtClave, txtCorreo, txtEstado_civil, txtId, txtNombre, txtTelefono);
        cbxNivel_estudios.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        //jDate.cleanup();
        jDate.setDate(null);
        jDate.repaint();
        password.setText("");
        check2.setSelected(false);
        chek4.setSelected(false);
        chek3.setSelected(false);
        chek1.setSelected(false);
        jPanelImagem.removeAll();
        jPanelImagem.repaint();
    }

    public boolean esEmail(String correo)
    {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnLibrerias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnLibrerias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnLibrerias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnLibrerias.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnLibrerias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton bntDescripcion;
    private rojeru_san.RSButton bntDescripcion1;
    private javax.swing.JToggleButton botonEmocion;
    private javax.swing.ButtonGroup buttonEmocion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxNivel_estudios;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox chek1;
    private javax.swing.JCheckBox chek3;
    private javax.swing.JCheckBox chek4;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JLabel etiqueta5;
    private javax.swing.JLabel etiqueta6;
    private javax.swing.JLabel etiquetaAutorLibro;
    private javax.swing.JLabel etiquetaAutorLibro1;
    private javax.swing.JLabel etiquetaEditorial;
    private javax.swing.JLabel etiquetaEditorial1;
    private javax.swing.JLabel etirquetaTituloLibro;
    private javax.swing.JLabel etirquetaTituloLibro1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDate;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaUsuarios;
    private javax.swing.JMenuItem menuElimiar;
    private javax.swing.JMenuItem menumodificar;
    private javax.swing.JPanel panelEmocion;
    private org.edisoncor.gui.panel.Panel panelIconoEncabezado;
    private javax.swing.JPanel panelImagenRecomienda;
    private org.edisoncor.gui.panel.PanelLlamada panelLlamadaEmocion;
    private javax.swing.JPanel panelReaccion;
    private javax.swing.JPanel panelRecomienda;
    private javax.swing.JPanel panelVerificarReaccion;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JTextField txtApellido_m;
    private javax.swing.JTextField txtApellido_p;
    private javax.swing.JTextField txtBuscarClave;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEstado_civil;
    private javax.swing.JTextArea txtFelicitaciones;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
