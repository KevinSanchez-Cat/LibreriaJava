package VntLibreria;

import recursos.Mensaje;
import recursos.Validaciones;
import AppPackage.AnimationClass;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VtnModificarUsuariosPeticiones extends javax.swing.JFrame
{

    int num = 0;
    int X_V;
    int Y_V;
    JFileChooser fc;
    File fichero;
    FileInputStream fis;
    String nombreUsuario = "";
     String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnModificarUsuariosPeticiones(String nombre, String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
   Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);

        initComponents();
        nombreUsuario = nombre;
        jTextField2.setText(nombre);
        jTextField2.setEnabled(false);
        jTextField2.setEditable(false);
        jButton5ActionPerformed(null);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
 

        CtrComponentes.inicializarBoton(jButton10);

        CtrComponentes.botonAccion(jButton10);

    }

    ImageIcon iconoAvatar = new ImageIcon(ClassLoader.getSystemResource("imagenes/avatarDefecto.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanelImagem = new javax.swing.JPanel();
        btnCargaImagen = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IMG = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();

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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("MODIFICAR USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 500, 36));

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
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 150, -1));

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
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 125, -1));

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
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 140, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Clave:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Apellido materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("*Nueva foto");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 340, 90, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/299104 - facebook social.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 170, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Menu_32px_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Menu_32px_1 - copia.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Menu_32px_1.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 60, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/299059 - google plus social.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jButton3KeyPressed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 210, 30, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Calculator_32px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jButton4KeyPressed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 130, 30, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Número de celular:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

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
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 120, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Dirección:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtcorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtcorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 180, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, 170, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 140, 140));

        btnCargaImagen.setText("Cargar");
        btnCargaImagen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCargaImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, 80, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Masculino");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Femenino");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 270, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Correo electronico:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Genero:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 130, -1));

        jLabel10.setText("USUARIO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));
        jPanel1.add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 150));

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        jButton10.setText("LIMPIAR");
        jButton10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton1.setText("Regresar");
        rSButton1.setColorHover(new java.awt.Color(0, 102, 255));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, -1, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton2.setText("Modificar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtClaveKeyPressed
    {//GEN-HEADEREND:event_txtClaveKeyPressed
        Validaciones.enter(this, evt, txtCelular);
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

    private void txtApellidoPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtApellidoPKeyPressed
    {//GEN-HEADEREND:event_txtApellidoPKeyPressed
        Validaciones.enter(this, evt, txtApellidoM);
    }//GEN-LAST:event_txtApellidoPKeyPressed
    DefaultComboBoxModel modeloCBX;
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void txtApellidoMKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtApellidoMKeyPressed
    {//GEN-HEADEREND:event_txtApellidoMKeyPressed
        Validaciones.enter(this, evt, jDateChooser1);
    }//GEN-LAST:event_txtApellidoMKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try
        {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/"));
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR..", "Se ha producido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jButton1KeyPressed
    {//GEN-HEADEREND:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseClicked
    {//GEN-HEADEREND:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton2MouseClicked
    {//GEN-HEADEREND:event_jButton2MouseClicked
        AnimationClass i1 = new AnimationClass();
        i1.jButtonXLeft(1300, 1210, 10, 5, jButton1);

        AnimationClass i2 = new AnimationClass();
        i2.jButtonXLeft(1300, 1210, 10, 5, jButton3);

        AnimationClass i3 = new AnimationClass();
        i3.jButtonXLeft(1300, 1210, 10, 5, jButton4);

        AnimationClass i11 = new AnimationClass();
        i11.jButtonXRight(1210, 1300, 10, 5, jButton1);

        AnimationClass i22 = new AnimationClass();
        i22.jButtonXRight(1210, 1300, 10, 5, jButton3);

        AnimationClass i33 = new AnimationClass();
        i33.jButtonXRight(1210, 1300, 10, 5, jButton4);

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jButton2KeyPressed
    {//GEN-HEADEREND:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton3MouseClicked
    {//GEN-HEADEREND:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        try
        {
            Desktop.getDesktop().browse(new URI("https://www.google.com/"));
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR..", "Se ha producido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jButton3KeyPressed
    {//GEN-HEADEREND:event_jButton3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton4MouseClicked
    {//GEN-HEADEREND:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        try
        {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jButton4KeyPressed
    {//GEN-HEADEREND:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCelularKeyPressed
    {//GEN-HEADEREND:event_txtCelularKeyPressed
        Validaciones.enter(this, evt, txtcorreo);
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtcorreoKeyPressed
    {//GEN-HEADEREND:event_txtcorreoKeyPressed

    }//GEN-LAST:event_txtcorreoKeyPressed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCelularKeyTyped
    {//GEN-HEADEREND:event_txtCelularKeyTyped

        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtcorreoKeyTyped
    {//GEN-HEADEREND:event_txtcorreoKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton3ActionPerformed
    {//GEN-HEADEREND:event_boton3ActionPerformed


    }//GEN-LAST:event_boton3ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton1ActionPerformed
    {//GEN-HEADEREND:event_boton1ActionPerformed


    }//GEN-LAST:event_boton1ActionPerformed
    public void salir()
    {
        if (pantallas_Usuario == "ADMINISTRADOR")
        {
            new VtnBiblioteca(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
            this.dispose();
        } else if (pantallas_Usuario == "NORMAL")
        {
            new VtnBibliotecaUsuario(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
            this.dispose();
        } else
        {
            new VtnProgrmador(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
            this.dispose();
        }

    }
    private void btnCargaImagenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCargaImagenActionPerformed
    {//GEN-HEADEREND:event_btnCargaImagenActionPerformed

    }//GEN-LAST:event_btnCargaImagenActionPerformed
    public void cargaIm()
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

    }
    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyPressed
    {//GEN-HEADEREND:event_txtNombreKeyPressed
        Validaciones.enter(this, evt, txtApellidoP);        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        Validaciones.validaAlfabeticos(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton4ActionPerformed
    {//GEN-HEADEREND:event_boton4ActionPerformed


    }//GEN-LAST:event_boton4ActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionKeyTyped
    {//GEN-HEADEREND:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionKeyPressed
    {//GEN-HEADEREND:event_txtDireccionKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, txtClave);
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_usuario where usuar=?");
            ps.setString(1, jTextField2.getText());
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next())
            {

                Conexion.con = Conexion.getConexion();
                PreparedStatement ps2 = Conexion.con.prepareStatement("SELECT * FROM t_persona where usuar=?");
                ps2.setString(1, jTextField2.getText());
                ResultSet rs2;
                rs2 = ps2.executeQuery();
                if (rs2.next())
                {
                    txtNombre.setText(rs2.getString("nombre_usu"));
                    txtApellidoP.setText(rs2.getString("apellido_paterno_usu"));
                    txtApellidoM.setText(rs2.getString("apellido_materno_usu"));
                    txtClave.setText(rs2.getString("clave_usu"));
                    txtDireccion.setText(rs2.getString("dir_usu"));
                    txtcorreo.setText(rs2.getString("email_usu"));
                    txtCelular.setText(rs2.getString("cel_usu"));
                    if (rs2.getString("genero").equals("MASCULINO"))
                    {
                        jRadioButton1.setSelected(true);
                    } else
                    {
                        jRadioButton2.setSelected(true);
                    }

                    BufferedImage buffing = null;
                    Blob blob = rs2.getBlob("foto_perfil_usu");
                    byte[] image = blob.getBytes(1, (int) blob.length());
                    image = rs2.getBytes("foto_perfil_usu");

                    try
                    {
                        buffing = ImageIO.read(new ByteArrayInputStream(image));

                        ImageIcon icono = new ImageIcon(buffing);
                        IMG.setIcon(icono);

                    } catch (Exception e)
                    {
                    }

                    try
                    {
                        // obtiene el valor de la caja de fecha
                        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                        Date fechaTxt;
                        fechaTxt = formatoFecha.parse(rs2.getString("fecha_nacimiento_usu"));
                        jDateChooser1.setDate(fechaTxt);
                    } catch (ParseException ex)
                    {

                    }

                }
            } else
            {
                JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO");
            }
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton10ActionPerformed
    {//GEN-HEADEREND:event_jButton10ActionPerformed
        CtrComponentes.limpiaTodo(txtApellidoM, txtApellidoP, txtCelular, txtClave, txtDireccion, txtNombre, txtcorreo, jDateChooser1, jRadioButton1, jRadioButton2, jTextField2);

        jPanelImagem.removeAll();
        IMG.removeAll();
        IMG.repaint();
        jPanelImagem.repaint();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        if (fichero == null)
        {
            try
            {
                Conexion.con = Conexion.getConexion();
                String sql = "UPDATE t_persona SET nombre_usu=?, apellido_paterno_usu=?,apellido_materno_usu=?,fecha_nacimiento_usu=?,genero=?,dir_usu=?,clave_usu=?,email_usu=?,cel_usu=? WHERE usuar=?";

                PreparedStatement registro = Conexion.con.prepareStatement(sql);
                String fecha_nac = "";
                Date date = jDateChooser1.getDate();
                long d = date.getTime();
                java.sql.Date fecha = new java.sql.Date(d);
                fecha_nac = fecha.toString();
                registro.setString(1, txtNombre.getText());
                registro.setString(2, txtApellidoP.getText());
                registro.setString(3, txtApellidoM.getText());
                registro.setString(4, fecha_nac);
                if (jRadioButton1.isSelected())
                {
                    registro.setString(5, "MASCULINO");
                } else
                {
                    registro.setString(5, "FEMENINO");
                }

                registro.setString(6, txtDireccion.getText());
                registro.setString(7, txtClave.getText());
                registro.setString(8, txtcorreo.getText());
                registro.setString(9, txtCelular.getText());
                registro.setString(10, jTextField2.getText());
                int rh = registro.executeUpdate();

                if (rh > 0)
                {
                    JOptionPane.showMessageDialog(null, "Registro modificado");
                } else
                {
                    JOptionPane.showMessageDialog(null, "Registro no modificado");
                }
            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }

        } else
        {

            try
            {
                fis = new FileInputStream(fichero);
            } catch (FileNotFoundException e)
            {
            }
            try
            {
                Conexion.con = Conexion.getConexion();
                String sql = "UPDATE t_persona SET nombre_usu=?, apellido_paterno_usu=?,apellido_materno_usu=?,fecha_nacimiento_usu=?,genero=?,dir_usu=?,clave_usu=?,email_usu=?,cel_usu=?,foto_perfil_usu=? WHERE usuar=?";

                PreparedStatement registro = Conexion.con.prepareStatement(sql);
                String fecha_nac = "";
                Date date = jDateChooser1.getDate();
                long d = date.getTime();
                java.sql.Date fecha = new java.sql.Date(d);
                fecha_nac = fecha.toString();
                registro.setString(1, txtNombre.getText());
                registro.setString(2, txtApellidoP.getText());
                registro.setString(3, txtApellidoM.getText());
                registro.setString(4, fecha_nac);
                if (jRadioButton1.isSelected())
                {
                    registro.setString(5, "MASCULINO");
                } else
                {
                    registro.setString(5, "FEMENINO");
                }

                registro.setString(6, txtDireccion.getText());
                registro.setString(7, txtClave.getText());
                registro.setString(8, txtcorreo.getText());
                registro.setString(9, txtCelular.getText());
                registro.setBinaryStream(10, fis, (int) fichero.length());
                registro.setString(11, jTextField2.getText());

                int rh = registro.executeUpdate();
                fis.close();
                if (rh > 0)
                {
                    JOptionPane.showMessageDialog(null, "Registro modificado");
                    CtrComponentes.limpiaTodo(txtApellidoM, txtApellidoP, txtCelular, txtClave, txtDireccion, txtNombre, txtcorreo, jDateChooser1, jRadioButton1, jRadioButton2, jTextField2);

                    jPanelImagem.removeAll();
                    IMG.removeAll();
                    IMG.repaint();
                    jPanelImagem.repaint();
                } else
                {
                    JOptionPane.showMessageDialog(null, "Registro no modificado");
                }
            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            } catch (IOException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        }

    }//GEN-LAST:event_rSButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMG;
    private javax.swing.JButton btnCargaImagen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
