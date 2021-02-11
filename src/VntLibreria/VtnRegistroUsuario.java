package VntLibreria;

import recursos.CtrlInterfaz;
import recursos.Mensaje;
import recursos.Validaciones;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import recursos.BarraInstrucciones;

public class VtnRegistroUsuario extends javax.swing.JFrame
{

    int num = 0;
    int X_V;
    int Y_V;
    JFileChooser fc = null;
    File fichero = null;
    FileInputStream fis = null;
    /////////////////////////////
    JFileChooser fcd = null;
    File ficherod = null;
    FileInputStream fisd = null;
    DefaultComboBoxModel modeloCBX;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnRegistroUsuario(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);

        ///Implementamos el codigo para que se vean los estados
        estados cc = new estados();

        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarEstados());
        cbxEstado.setModel(modelEstado);

        Statement stTipos;
        Conexion.con = Conexion.getConexion();
        String sqlTipos = "SELECT * FROM t_roles_usuario";
        modeloCBX = new DefaultComboBoxModel();
        modeloCBX.addElement("Seleccione");
        try
        {
            stTipos = Conexion.con.createStatement();
            ResultSet rstipos = stTipos.executeQuery(sqlTipos);
            while (rstipos.next())
            {
                modeloCBX.addElement(rstipos.getString("tipo_usuario"));
            }
            cbxTipo.setModel(modeloCBX);
        } catch (Exception e)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
        }
        txtClave.setEditable(false);

        revisaClave();
        panelLlamada1.setVisible(false);
    }
    ImageIcon iconoAvatar = new ImageIcon(ClassLoader.getSystemResource("imagenes/avatarDefecto.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelLlamada1 = new org.edisoncor.gui.panel.PanelLlamada();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        pwpasword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        rbMasulino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        mPhotoPath = new javax.swing.JTextField();
        jPanelImagem = new javax.swing.JPanel();
        cbxEstado = new javax.swing.JComboBox<>();
        cbxMunicipio = new javax.swing.JComboBox<>();
        cbxLocalidad = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chekDeportes = new javax.swing.JCheckBox();
        chkLibros = new javax.swing.JCheckBox();
        chkPeliculas = new javax.swing.JCheckBox();
        chkMusica = new javax.swing.JCheckBox();
        chkBailar = new javax.swing.JCheckBox();
        chkCiencia = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        chkFiccion = new javax.swing.JCheckBox();
        chkJuvenil = new javax.swing.JCheckBox();
        chkTerror = new javax.swing.JCheckBox();
        chkMisterio = new javax.swing.JCheckBox();
        chkAventura = new javax.swing.JCheckBox();
        chkNovelas = new javax.swing.JCheckBox();
        mPhotoPath1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        selectedPhoto1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        selectedPhoto = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        photoSelection1 = new rojeru_san.RSButton();
        photoSelection = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLlamada1.setColorPrimario(new java.awt.Color(204, 204, 204));
        panelLlamada1.setColorSecundario(new java.awt.Color(204, 204, 204));
        panelLlamada1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Las contraseña debe\nllevar letras mayusculas,\nletras minusculas y numeros\n");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        panelLlamada1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jPanel1.add(panelLlamada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 240, 60));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRARSE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 320, 36));

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
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtClaveKeyTyped(evt);
            }
        });
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 130, -1));

        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtApellidoPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtApellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 125, 20));

        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtApellidoMKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtApellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 140, -1));

        txtUser.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 170, -1));

        pwpasword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                pwpaswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                pwpaswordKeyTyped(evt);
            }
        });
        jPanel1.add(pwpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 140, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Categorías favoritas de libros:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Apellido materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 130, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Cuenta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Datos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 348, 1110, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Usuario:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Tipo de usuario:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 160, 20));

        confirmPassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                confirmPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                confirmPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 140, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Número de celular:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtCelular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCelularActionPerformed(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 120, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Localidad:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 20));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));
        jPanel1.add(dateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 140, -1));

        buttonGroup1.add(rbMasulino);
        rbMasulino.setText("Masculino");
        jPanel1.add(rbMasulino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        buttonGroup1.add(rbFemenino);
        rbFemenino.setText("Femenino");
        jPanel1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 270, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Correo electronico:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Genero:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ADMINISTRADOR", "EMPLEADO", "USUARIO" }));
        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 140, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel21.setText("Confirmar contraseña:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 160, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));

        mPhotoPath.setEditable(false);
        mPhotoPath.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mPhotoPath.setForeground(new java.awt.Color(51, 51, 51));
        mPhotoPath.setText("Elige una foto para tu perfil");
        mPhotoPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        mPhotoPath.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mPhotoPathActionPerformed(evt);
            }
        });
        jPanel1.add(mPhotoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 190, 30));

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, -1, -1));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxEstado.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbxEstadoItemStateChanged(evt);
            }
        });
        cbxEstado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxEstadoActionPerformed(evt);
            }
        });
        cbxEstado.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                cbxEstadoPropertyChange(evt);
            }
        });
        cbxEstado.addVetoableChangeListener(new java.beans.VetoableChangeListener()
        {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException
            {
                cbxEstadoVetoableChange(evt);
            }
        });
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 170, 110, -1));

        cbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxMunicipio.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbxMunicipioItemStateChanged(evt);
            }
        });
        cbxMunicipio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxMunicipioActionPerformed(evt);
            }
        });
        cbxMunicipio.addVetoableChangeListener(new java.beans.VetoableChangeListener()
        {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException
            {
                cbxMunicipioVetoableChange(evt);
            }
        });
        jPanel1.add(cbxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 120, -1));

        cbxLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxLocalidad.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbxLocalidadItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 170, 120, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Dirección:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 70, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Estado:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Municipio:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 20));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Intereses:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 180, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Clave:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        chekDeportes.setText("Deportes");
        jPanel1.add(chekDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        chkLibros.setText("Libros");
        jPanel1.add(chkLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        chkPeliculas.setText("Peliculas");
        jPanel1.add(chkPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        chkMusica.setText("Musica");
        jPanel1.add(chkMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        chkBailar.setText("Bailar");
        jPanel1.add(chkBailar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        chkCiencia.setText("Ciencia");
        jPanel1.add(chkCiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Telefono Lada:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        chkFiccion.setText("Ficción");
        jPanel1.add(chkFiccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 250, -1, -1));

        chkJuvenil.setText("Jovenil");
        jPanel1.add(chkJuvenil, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, -1, -1));

        chkTerror.setText("Terror");
        jPanel1.add(chkTerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        chkMisterio.setText("Misterio");
        jPanel1.add(chkMisterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, -1, -1));

        chkAventura.setText("Aventura");
        jPanel1.add(chkAventura, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, -1, -1));

        chkNovelas.setText("Novelas");
        jPanel1.add(chkNovelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, -1, -1));

        mPhotoPath1.setEditable(false);
        mPhotoPath1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mPhotoPath1.setForeground(new java.awt.Color(51, 51, 51));
        mPhotoPath1.setText("Elige tu foto para una portada");
        mPhotoPath1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        mPhotoPath1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mPhotoPath1ActionPerformed(evt);
            }
        });
        jPanel1.add(mPhotoPath1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 210, 30));

        selectedPhoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png"))); // NOI18N
        selectedPhoto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        selectedPhoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectedPhoto1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(selectedPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 260, 140));

        selectedPhoto.setBackground(new java.awt.Color(102, 102, 102));
        selectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1055000 - profle.png"))); // NOI18N
        selectedPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        selectedPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectedPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selectedPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 240, 140));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Person_48px.png"))); // NOI18N
        rSButton1.setText("Registrar");
        rSButton1.setColorHover(new java.awt.Color(0, 153, 255));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 160, 40));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton2.setText("Regresar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 255));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 160, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png"))); // NOI18N
        rSButton3.setText("Limpiar y Actualizar");
        rSButton3.setColorHover(new java.awt.Color(0, 153, 204));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, -1, -1));

        photoSelection1.setBackground(new java.awt.Color(0, 51, 102));
        photoSelection1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png"))); // NOI18N
        photoSelection1.setColorHover(new java.awt.Color(0, 102, 204));
        photoSelection1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                photoSelection1ActionPerformed(evt);
            }
        });
        jPanel1.add(photoSelection1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 50, 30));

        photoSelection.setBackground(new java.awt.Color(0, 51, 102));
        photoSelection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png"))); // NOI18N
        photoSelection.setColorHover(new java.awt.Color(0, 102, 204));
        photoSelection.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                photoSelectionActionPerformed(evt);
            }
        });
        jPanel1.add(photoSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtClaveKeyPressed
    {//GEN-HEADEREND:event_txtClaveKeyPressed
        Validaciones.enter(this, evt, txtUser);
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtClaveKeyTyped
    {//GEN-HEADEREND:event_txtClaveKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtApellidoPKeyTyped
    {//GEN-HEADEREND:event_txtApellidoPKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtApellidoMKeyTyped
    {//GEN-HEADEREND:event_txtApellidoMKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUserKeyTyped
    {//GEN-HEADEREND:event_txtUserKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_txtUserKeyTyped

    private void pwpaswordKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_pwpaswordKeyTyped
    {//GEN-HEADEREND:event_pwpaswordKeyTyped
//        panelLlamada1.setVisible(false);

        if ((evt.getKeyChar() < 'a' || evt.getKeyChar() > 'z')
                && (evt.getKeyChar() < 'A' || evt.getKeyChar() > 'Z')
                && (evt.getKeyChar() < '0' || evt.getKeyChar() > '9')
                && evt.getKeyCode() != 8 && evt.getKeyChar() != '.'
                && evt.getKeyChar() != ' ' && evt.getKeyChar() != 'ñ'
                && evt.getKeyChar() != 'Ñ' && evt.getKeyChar() != 'á'
                && evt.getKeyChar() != 'Á' && evt.getKeyChar() != 'é'
                && evt.getKeyChar() != 'É' && evt.getKeyChar() != 'í'
                && evt.getKeyChar() != 'Í' && evt.getKeyChar() != 'ó'
                && evt.getKeyChar() != 'Ó' && evt.getKeyChar() != 'ú'
                && evt.getKeyChar() != 'Ú')
        {
            evt.setKeyChar((char) 8);
        }

    }//GEN-LAST:event_pwpaswordKeyTyped

    private void confirmPasswordKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_confirmPasswordKeyPressed
    {//GEN-HEADEREND:event_confirmPasswordKeyPressed

    }//GEN-LAST:event_confirmPasswordKeyPressed

    private void confirmPasswordKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_confirmPasswordKeyTyped
    {//GEN-HEADEREND:event_confirmPasswordKeyTyped

    }//GEN-LAST:event_confirmPasswordKeyTyped

    private void txtApellidoPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtApellidoPKeyPressed
    {//GEN-HEADEREND:event_txtApellidoPKeyPressed
        Validaciones.enter(this, evt, txtApellidoM);
    }//GEN-LAST:event_txtApellidoPKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUserKeyPressed
    {//GEN-HEADEREND:event_txtUserKeyPressed
        Validaciones.enter(this, evt, pwpasword);
    }//GEN-LAST:event_txtUserKeyPressed

    private void pwpaswordKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_pwpaswordKeyPressed
    {//GEN-HEADEREND:event_pwpaswordKeyPressed
        if (evt.getKeyChar() == '\n')
        {

            String s = new String(pwpasword.getPassword());
            if (contra(s) == false)
            {
                panelLlamada1.setVisible(true);
            } else
            {
                panelLlamada1.setVisible(false);
                Validaciones.enter(this, evt, confirmPassword);
            }
        }


    }//GEN-LAST:event_pwpaswordKeyPressed
    public boolean contra(String pw)
    {
        boolean p = false;
        boolean s = false;
        boolean t = false;
        boolean b;

        char[] w = pw.toCharArray();
        for (int i = 0; i < w.length; i++)
        {
            if (w[i] >= '0' && w[i] <= '9')
            {
                t = true;
            }
        }
        for (int i = 0; i < w.length; i++)
        {
            if (w[i] >= 'A' && w[i] <= 'Z')
            {
                s = true;
            }
        }
        for (int i = 0; i < w.length; i++)
        {
            if (w[i] >= 'a' && w[i] <= 'z')
            {
                p = true;
            }
        }

        if (p == true && s == true && t == true)
        {
            b = true;
        } else
        {
            b = false;
        }
        return b;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened
    DefaultComboBoxModel modeloEstado;
    DefaultComboBoxModel modeloMunicipio;
    DefaultComboBoxModel modeloLocalidad;
    private void txtApellidoMKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtApellidoMKeyPressed
    {//GEN-HEADEREND:event_txtApellidoMKeyPressed

    }//GEN-LAST:event_txtApellidoMKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCelularKeyPressed
    {//GEN-HEADEREND:event_txtCelularKeyPressed
        Validaciones.enter(this, evt, txtTelefono);
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCorreoKeyPressed
    {//GEN-HEADEREND:event_txtCorreoKeyPressed
        Validaciones.enter(this, evt, txtClave);
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCelularKeyTyped
    {//GEN-HEADEREND:event_txtCelularKeyTyped

        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCorreoKeyTyped
    {//GEN-HEADEREND:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped
    public void registra()
    {
        if (txtNombre.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Nombre Invalido");
            CtrlInterfaz.selecciona(txtNombre);
        } else if (txtApellidoP.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Apellido paterno Invalido");
            CtrlInterfaz.selecciona(txtApellidoP);
        } else if (txtApellidoM.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Apellido materno Invalido");
            CtrlInterfaz.selecciona(txtApellidoM);
        } else if (txtCelular.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Celular Invalido");
            CtrlInterfaz.selecciona(txtCelular);
        } else if (txtClave.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Clave Invalido");
            CtrlInterfaz.selecciona(txtClave);
        } else if (txtCorreo.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Correo Invalido");
            CtrlInterfaz.selecciona(txtCorreo);
        } else if (txtDireccion.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Direccion Invalido");
            CtrlInterfaz.selecciona(txtDireccion);
        } else if (txtTelefono.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Telefono Invalido");
            CtrlInterfaz.selecciona(txtTelefono);
        } else if (txtCelular.getText().length() != 10)
        {
            Mensaje.error(this, "Celular Invalido, 10 digitos");
            CtrlInterfaz.selecciona(txtCelular);

        } else if (txtUser.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Usuario Invalido");
            CtrlInterfaz.selecciona(txtUser);
        } else if (pwpasword.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Contaseña no valida");
            CtrlInterfaz.selecciona(pwpasword);
        } else if (confirmPassword.getText().trim().isEmpty())
        {
            Mensaje.error(this, "Contaseña no valida");
            CtrlInterfaz.selecciona(confirmPassword);
        } else if (cbxEstado.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "Estado no seleccionado");
            CtrlInterfaz.selecciona(cbxEstado);
        } else if (cbxMunicipio.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "Municipio no seleccionado");
            CtrlInterfaz.selecciona(cbxMunicipio);
        } else if (cbxLocalidad.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "localidad no seleccionado");
            CtrlInterfaz.selecciona(cbxLocalidad);
        } else if (cbxTipo.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "Tipo de usuario no seleccionado");
            CtrlInterfaz.selecciona(cbxTipo);
        } else if (!BarraInstrucciones.esEmail(txtCorreo.getText().trim()))
        {
            Mensaje.error(this, "Correo invalidado");
            CtrlInterfaz.selecciona(txtCorreo);
        } else if (fichero == null)
        {
            Mensaje.error(this, "No ha ingresado la foto de portada");
            CtrlInterfaz.cambia(selectedPhoto1);
        } else if (ficherod == null)
        {
            Mensaje.error(this, "No ha ingresado la foto de portada");
            CtrlInterfaz.cambia(selectedPhoto);
        } else
        {
            if (rbFemenino.isSelected() || rbMasulino.isSelected())
            {
                boolean b = true;
                try
                {

                    String s = txtUser.getText();

                    Conexion.con = Conexion.getConexion();
                    String sql = "SELECT usuar FROM t_persona WHERE usuar=?";
                    PreparedStatement ps = Conexion.con.prepareStatement(sql);
                    ps.setString(1, s);
                    ResultSet rs;
                    rs = ps.executeQuery();

                    if (rs.next())
                    {
                        b = true;
                    } else
                    {
                        b = false;
                    }
                } catch (SQLException ex)
                {
                    Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
                }
                if (b == true)
                {
                    //EL USUARIO YA EXISTE
                    Mensaje.error(this, "EL USUARIO YA EXISTE");
                    CtrlInterfaz.limpia(txtUser);
                    CtrlInterfaz.selecciona(txtUser);
                } else
                {
                    boolean b1 = false;

                    try
                    {

                        String s = txtUser.getText();

                        Conexion.con = Conexion.getConexion();
                        String sql2 = "SELECT usuar FROM t_persona WHERE apellido_materno_usu=? AND apellido_paterno_usu=? AND nombre_usu=?";
                        PreparedStatement ps2 = Conexion.con.prepareStatement(sql2);
                        String nn = txtNombre.getText();
                        String np = txtApellidoP.getText();
                        String nm = txtApellidoM.getText();

                        ps2.setString(1, nm);
                        ps2.setString(2, np);
                        ps2.setString(3, nn);
                        ResultSet rs2;
                        rs2 = ps2.executeQuery();

                        if (rs2.next())
                        {
                            b1 = true;
                            Mensaje.error(this, "LA PERSONA INGRESADA YA EXISTE");
                            CtrlInterfaz.selecciona(txtNombre);
                        } else
                        {
                            b1 = false;
                            if (pwpasword.getText().equals(confirmPassword.getText()))
                            {
                                Conexion.con = Conexion.getConexion();
                                String sql3 = "INSERT INTO t_persona (nombre_usu,apellido_paterno_usu,apellido_materno_usu,fecha_nacimiento_usu,dir_usu,tel_usu,cel_usu,clave_usu,foto_perfil_usu,foto_portada_usu,email_usu,usuar,genero,estado,municipio,localidad,nombre_autor,nombre_categoria,intereses) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                String clave = txtClave.getText();
                                String nombre = txtNombre.getText().toUpperCase();
                                String apellido_p = txtApellidoP.getText().toUpperCase();
                                String apellido_m = txtApellidoM.getText().toUpperCase();
                                String intereses = " ";
                                if (chekDeportes.isSelected())
                                {
                                    intereses += "DEPORTES ";
                                }

                                if (chkBailar.isSelected())
                                {
                                    intereses += "BAILAR ";
                                }
                                if (chkCiencia.isSelected())
                                {
                                    intereses += "CIENCIA ";
                                }

                                if (chkLibros.isSelected())
                                {
                                    intereses += "LIBROS ";

                                }

                                if (chkMusica.isSelected())
                                {
                                    intereses += "MUSICA";
                                }

                                if (chkPeliculas.isSelected())
                                {
                                    intereses += "PELICULAS ";
                                }

                                String categorias = "";
                                if (chkTerror.isSelected())
                                {
                                    categorias += "TERROR ";
                                }
                                if (chkNovelas.isSelected())
                                {
                                    categorias += "NOVELAS";
                                }
                                if (chkMisterio.isSelected())
                                {
                                    categorias += "MISTERIO ";

                                }
                                if (chkFiccion.isSelected())
                                {
                                    categorias += "FICCION ";

                                }
                                if (chkJuvenil.isSelected())
                                {
                                    categorias += "JUVENIL ";

                                }
                                if (chkAventura.isSelected())
                                {
                                    categorias += "AVENTURA ";
                                }
                                String fecha_nac = "";
                                Date date = dateNacimiento.getDate();
                                long d = date.getTime();
                                java.sql.Date fecha = new java.sql.Date(d);
                                fecha_nac = fecha.toString();

                                String direccion = txtDireccion.getText().toUpperCase();
                                String usuario = txtUser.getText();
//foto 
                                String genero;
                                if (rbMasulino.isSelected())
                                {
                                    genero = "MASCULINO";
                                } else
                                {
                                    genero = "FEMENINO";
                                }
                                String correo = txtCorreo.getText();
                                String celular = txtCelular.getText();
                                String tel = txtTelefono.getText();
                                try
                                {
                                    fis = new FileInputStream(fichero);
                                    fisd = new FileInputStream(ficherod);

                                    PreparedStatement registro4 = Conexion.con.prepareStatement(sql3);

                                    registro4.setString(1, nombre);
                                    registro4.setString(2, apellido_p);
                                    registro4.setString(3, apellido_m);
                                    registro4.setString(4, fecha_nac);
                                    registro4.setString(5, direccion);
                                    registro4.setString(6, tel);
                                    registro4.setString(7, celular);
                                    registro4.setString(8, clave);
                                    registro4.setBinaryStream(9, fis, (int) fichero.length());
                                    registro4.setBinaryStream(10, fisd, (int) ficherod.length());
                                    registro4.setString(11, correo);
                                    registro4.setString(12, usuario);
                                    registro4.setString(13, genero);
                                    registro4.setString(14, cbxEstado.getSelectedItem().toString());
                                    registro4.setString(15, cbxMunicipio.getSelectedItem().toString());
                                    registro4.setString(16, cbxLocalidad.getSelectedItem().toString());
                                    registro4.setString(17, txtNombre.getText());
                                    registro4.setString(18, categorias);
                                    registro4.setString(19, intereses);

                                    int r = registro4.executeUpdate();

                                    fisd.close();
                                    if (r > 0)
                                    {

                                        Conexion.con = Conexion.getConexion();
                                        String sql23 = "INSERT INTO t_usuario (usuar,password,tipo_usuario) VALUES(?,?,?)";
                                        String contrase = new String(pwpasword.getPassword());
                                        String nuevopasword = Hash.sha1(contrase);
                                        PreparedStatement registro2 = Conexion.con.prepareStatement(sql23);
                                        registro2.setString(1, txtUser.getText());
                                        registro2.setString(2, nuevopasword);
                                        registro2.setString(3, cbxTipo.getSelectedItem().toString());
                                        int r2 = registro2.executeUpdate();
                                        if (r2 > 0)
                                        {

                                            BarraInstrucciones.genera(clave, nombre, correo);
                                            BarraInstrucciones.generaManager(clave, correo);
                                            limpia();
                                            NotificationForm not = new NotificationForm();
                                            not.setVisible(true);

                                        } else
                                        {
                                            Mensaje.error(this, "Usuario no ingresado ");
                                        }

                                    } else
                                    {
                                        Mensaje.error(this, "PERSONA no ingresado ");
                                    }

                                } catch (IOException | SQLException e)
                                {
                                    Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
                                }

                            } else
                            {
                                Mensaje.error(this, "Las contraseñas no coinciden");
                                CtrlInterfaz.limpia(pwpasword, confirmPassword);
                                CtrlInterfaz.selecciona(pwpasword);

                            }

                        }
                    } catch (SQLException ex)
                    {
                        Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
                    }

                }

            } else
            {
                Mensaje.error(this, "¡¿Genero indefinido?!");

            }

        }

    }

    public void cargaPerfil()
    {
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
                jPanel4.removeAll();
                fichero = fc.getSelectedFile();//traer el archivo que se ha seleccionado
                String ruts = fichero.getAbsolutePath();

                int x = jPanel4.getWidth();
                int y = jPanel4.getHeight();

                Imagen img = new Imagen(x, y, ruts);

                jPanel4.add(img);

            }
            jPanel4.repaint();

        } catch (Exception e)
        {
            System.out.println("" + e.toString());
        }
    }

    public void cargaPortada()
    {
        try
        {

            fcd = new JFileChooser();
            fcd.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("*.PNG", "png");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("*.JPG", "jpg");
            fcd.setFileFilter(filtro1);
            fcd.setFileFilter(filtro2);

            int seleccion = fcd.showOpenDialog(this);
            //jPanelImagem
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {//aceptar
                jPanel3.removeAll();
                ficherod = fcd.getSelectedFile();//traer el archivo que se ha seleccionado
                String ruts = ficherod.getAbsolutePath();

                int x = jPanel3.getWidth();
                int y = jPanel3.getHeight();

                Imagen img = new Imagen(x, y, ruts);

                jPanel3.add(img);

            }
            jPanel3.repaint();

        } catch (Exception e)
        {
            System.out.println("" + e.toString());
        }
    }
    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyPressed
    {//GEN-HEADEREND:event_txtNombreKeyPressed
        Validaciones.enter(this, evt, txtApellidoP);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void mPhotoPathActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mPhotoPathActionPerformed
    {//GEN-HEADEREND:event_mPhotoPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhotoPathActionPerformed
    public void revisaClave()
    {
        try
        {

            String s = genera();
            txtClave.setText(s);
            Conexion.con = Conexion.getConexion();
            String sql = "SELECT clave_usu FROM t_persona WHERE clave_usu=?";
            PreparedStatement ps = Conexion.con.prepareStatement(sql);
            ps.setString(1, s);
            ResultSet rs;
            rs = ps.executeQuery();

            if (rs.next())
            {
                revisaClave();
            }
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
    }

    public String genera()
    {
        String s = "ABC-123";
        char[] toCharArray = s.toCharArray();
        s = "";
        toCharArray[0] = (char) chas();
        toCharArray[1] = (char) chas();
        toCharArray[2] = (char) chas();
        toCharArray[3] = '-';

        toCharArray[4] = (char) enteros();
        toCharArray[5] = (char) enteros();
        toCharArray[6] = (char) enteros();
        for (int i = 0; i < toCharArray.length; i++)
        {
            s += toCharArray[i];
        }
        return s;
    }

    public int chas()
    {
        int n = (int) (Math.random() * 100);
        char c = (char) n;
        if (c >= 'A' && c <= 'Z')
        {
            return n;
        } else
        {
            n = chas();
        }
        return n;
    }

    public int enteros()
    {
        int n = (int) (Math.random() * 100);
        char c = (char) n;
        if (c >= '0' && c <= '9')
        {
            return n;
        } else
        {
            n = enteros();
        }
        return n;
    }

    public void limpia()
    {
        CtrComponentes.limpiaTodo(txtApellidoM, txtApellidoP, txtCelular, txtClave,
                txtCorreo, txtDireccion, txtNombre, txtTelefono, txtUser,
                cbxEstado, cbxTipo, rbFemenino, rbMasulino, pwpasword, confirmPassword,
                chekDeportes, chkAventura,
                chkBailar, chkCiencia, chkFiccion, chkJuvenil, chkLibros, chkMisterio,
                chkMusica, chkNovelas, chkPeliculas, chkTerror);
        selectedPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png")));
        selectedPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1055000 - profle.png")));
        jPanel3.removeAll();
        jPanel4.removeAll();

        jPanel3.add(selectedPhoto1);
        jPanel4.add(selectedPhoto);
        jPanel3.repaint();
        jPanel4.repaint();
    }
    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCelularActionPerformed
    {//GEN-HEADEREND:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtClaveActionPerformed
    {//GEN-HEADEREND:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void mPhotoPath1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mPhotoPath1ActionPerformed
    {//GEN-HEADEREND:event_mPhotoPath1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhotoPath1ActionPerformed

    private void cbxEstadoPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_cbxEstadoPropertyChange
    {//GEN-HEADEREND:event_cbxEstadoPropertyChange

    }//GEN-LAST:event_cbxEstadoPropertyChange

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbxEstadoActionPerformed
    {//GEN-HEADEREND:event_cbxEstadoActionPerformed

    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void cbxEstadoVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException//GEN-FIRST:event_cbxEstadoVetoableChange
    {//GEN-HEADEREND:event_cbxEstadoVetoableChange

    }//GEN-LAST:event_cbxEstadoVetoableChange

    private void cbxMunicipioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbxMunicipioActionPerformed
    {//GEN-HEADEREND:event_cbxMunicipioActionPerformed

    }//GEN-LAST:event_cbxMunicipioActionPerformed

    private void cbxMunicipioVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException//GEN-FIRST:event_cbxMunicipioVetoableChange
    {//GEN-HEADEREND:event_cbxMunicipioVetoableChange


    }//GEN-LAST:event_cbxMunicipioVetoableChange

    private void cbxEstadoItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxEstadoItemStateChanged
    {//GEN-HEADEREND:event_cbxEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            estados est = (estados) cbxEstado.getSelectedItem();
            municipios mun = new municipios();
            DefaultComboBoxModel modelMunicipio = new DefaultComboBoxModel(mun.mostrarMunicipio(est.getId()));
            cbxMunicipio.setModel(modelMunicipio);
            cbxLocalidad.removeAllItems();
            //txtDatos.setText("");
        }
    }//GEN-LAST:event_cbxEstadoItemStateChanged

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelefonoKeyTyped
    {//GEN-HEADEREND:event_txtTelefonoKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void cbxMunicipioItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxMunicipioItemStateChanged
    {//GEN-HEADEREND:event_cbxMunicipioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            municipios mun = (municipios) cbxMunicipio.getSelectedItem();
            localidades loc = new localidades();
            DefaultComboBoxModel modelLocalidad = new DefaultComboBoxModel(loc.mostrarLocalidad(mun.getId()));
            cbxLocalidad.setModel(modelLocalidad);
        }
    }//GEN-LAST:event_cbxMunicipioItemStateChanged

    private void cbxLocalidadItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxLocalidadItemStateChanged
    {//GEN-HEADEREND:event_cbxLocalidadItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            estados est = (estados) cbxEstado.getSelectedItem();
            municipios mun = (municipios) cbxMunicipio.getSelectedItem();
            localidades loc = (localidades) cbxLocalidad.getSelectedItem();

            // txtDatos.setText("Estado: " + est.getNombre() + " \nMunicipio: " + mun.getNombre() + " \nLocaidad: " + loc.getNombre());
        }
    }//GEN-LAST:event_cbxLocalidadItemStateChanged

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        registra();
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        CtrComponentes.botonSalirSI(this, "", "");
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        AudioClip music;
        music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/BaseActualizada.wav"));
        music.play();
        limpia();
        revisaClave();
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void photoSelection1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_photoSelection1ActionPerformed
    {//GEN-HEADEREND:event_photoSelection1ActionPerformed
        cargaPortada();
    }//GEN-LAST:event_photoSelection1ActionPerformed

    private void photoSelectionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_photoSelectionActionPerformed
    {//GEN-HEADEREND:event_photoSelectionActionPerformed
        cargaPerfil();
    }//GEN-LAST:event_photoSelectionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxLocalidad;
    private javax.swing.JComboBox<String> cbxMunicipio;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JCheckBox chekDeportes;
    private javax.swing.JCheckBox chkAventura;
    private javax.swing.JCheckBox chkBailar;
    private javax.swing.JCheckBox chkCiencia;
    private javax.swing.JCheckBox chkFiccion;
    private javax.swing.JCheckBox chkJuvenil;
    private javax.swing.JCheckBox chkLibros;
    private javax.swing.JCheckBox chkMisterio;
    private javax.swing.JCheckBox chkMusica;
    private javax.swing.JCheckBox chkNovelas;
    private javax.swing.JCheckBox chkPeliculas;
    private javax.swing.JCheckBox chkTerror;
    private javax.swing.JPasswordField confirmPassword;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mPhotoPath;
    private javax.swing.JTextField mPhotoPath1;
    private org.edisoncor.gui.panel.PanelLlamada panelLlamada1;
    private rojeru_san.RSButton photoSelection;
    private rojeru_san.RSButton photoSelection1;
    private javax.swing.JPasswordField pwpasword;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasulino;
    private javax.swing.JLabel selectedPhoto;
    private javax.swing.JLabel selectedPhoto1;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
