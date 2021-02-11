package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import recursos.CtrlInterfaz;
import recursos.Mensaje;
import recursos.Validaciones;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VtnEntrar extends javax.swing.JFrame
{

    int X_V;
    int Y_V;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnEntrar(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        setIconImage(icono);
        initComponents();
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel21 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        panel2 = new org.edisoncor.gui.panel.Panel();
        panel3 = new org.edisoncor.gui.panel.Panel();
        jPasswordField1 = new rojeru_san.RSMPassView();
        txtUsuario = new rojeru_san.RSMTextFull();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Entrar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 130, -1));

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/10364066_764239930280417_563357671439422772_n.jpg"))); // NOI18N
        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 570, 170));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 77, 64));
        jLabel21.setText("¿No tienes cuenta aun?");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, -1, -1));

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(51, 153, 255));
        signUpButton.setText("Registrarse ahora");
        signUpButton.setToolTipText("Sign In with your existed credentials.");
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                signUpButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                signUpButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                signUpButtonMouseReleased(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, -1, 30));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Person_48px.png"))); // NOI18N
        rSButton2.setText("Entrar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 255));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, 50));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton3.setText("Regresar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 255));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, -1, 50));

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/58608390_2129915260379537_9077232394469113856_n.jpg"))); // NOI18N
        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 160));

        panel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/58775420_2141918955845834_8675439655627259904_n.jpg"))); // NOI18N
        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 570, 170));

        jPasswordField1.setForeground(new java.awt.Color(0, 51, 102));
        jPasswordField1.setBordeColorFocus(new java.awt.Color(0, 51, 102));
        jPasswordField1.setBotonColor(new java.awt.Color(0, 51, 102));
        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPasswordField1.setOpaque(false);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 270, -1));

        txtUsuario.setForeground(new java.awt.Color(0, 51, 102));
        txtUsuario.setBordeColorFocus(new java.awt.Color(0, 51, 102));
        txtUsuario.setBotonColor(new java.awt.Color(0, 51, 102));
        txtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUsuario.setOpaque(false);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton3ActionPerformed
    {//GEN-HEADEREND:event_boton3ActionPerformed

    }//GEN-LAST:event_boton3ActionPerformed
    public void btn3()
    {
        if (txtUsuario.getText().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el campo de usuario");
            CtrlInterfaz.selecciona(txtUsuario);
        } else if (jPasswordField1.getText().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el campo de contraseña");
            CtrlInterfaz.selecciona(jPasswordField1);
        } else
        {
            try
            {
                boolean b = false;
                Conexion.con = Conexion.getConexion();
                String sql = "SELECT * FROM t_usuario WHERE usuar=? AND password=?";
                PreparedStatement ps = Conexion.con.prepareStatement(sql);
                String contrase = new String(jPasswordField1.getPassword());
                String nuevopasword = Hash.sha1(contrase);
                ps.setString(1, txtUsuario.getText());
                ps.setString(2, nuevopasword);
                ResultSet rs;
                rs = ps.executeQuery();

                if (rs.next())
                {
                    b = true;
                    VtnPrincipal.id = rs.getInt("id_usuar");
                }
                if (b)//busca si existe el usuario y la contraseña
                {

                    if (rs.getString("tipo_usuario").equals("ADMINISTRADOR"))
                    {
                        pantallas_Usuario = "ADMINISTRADOR";
                        nombre_Final_de_Usuario = rs.getString("usuar");
                        new VtnBiblioteca(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
                        this.dispose();
                    } else if (rs.getString("tipo_usuario").equals("PROGRAMADOR"))
                    {
                        pantallas_Usuario = "PROGRAMADOR";
                        nombre_Final_de_Usuario = rs.getString("usuar");
                        new VtnProgrmador(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
                        this.dispose();
                    } else if (rs.getString("tipo_usuario").equals("USUARIO"))
                    {
                        pantallas_Usuario = "USUARIO";
                        nombre_Final_de_Usuario = rs.getString("usuar");
                        new VtnBibliotecaUsuario(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
                        this.dispose();
                    } else if (rs.getString("tipo_usuario").equals("VISITANTE"))
                    {

                        pantallas_Usuario = "VISITANTE";
                        nombre_Final_de_Usuario = rs.getString("usuar");
                        new VtnBibliotecaVISITANTE(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
                        this.dispose();
                    } else if (rs.getString("tipo_usuario").equals("EMPLEADO"))
                    {

                        pantallas_Usuario = "EMPLEADO";
                        nombre_Final_de_Usuario = rs.getString("usuar");
                        new VtnBibliotecaUsuario(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
                        this.dispose();
                    }

                } else
                {
                    Mensaje.error(this, "Usuario no reconocido");
                    CtrlInterfaz.limpia(txtUsuario, jPasswordField1);
                    CtrlInterfaz.selecciona(txtUsuario);
                }
            } catch (SQLException ex)
            {
                Logger.getLogger(VtnEntrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void boton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton4ActionPerformed
    {//GEN-HEADEREND:event_boton4ActionPerformed

    }//GEN-LAST:event_boton4ActionPerformed

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_signUpButtonMouseEntered
    {//GEN-HEADEREND:event_signUpButtonMouseEntered
        signUpButton.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_signUpButtonMouseExited
    {//GEN-HEADEREND:event_signUpButtonMouseExited

    }//GEN-LAST:event_signUpButtonMouseExited

    private void signUpButtonMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_signUpButtonMousePressed
    {//GEN-HEADEREND:event_signUpButtonMousePressed

    }//GEN-LAST:event_signUpButtonMousePressed

    private void signUpButtonMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_signUpButtonMouseReleased
    {//GEN-HEADEREND:event_signUpButtonMouseReleased
        signUpButton.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_signUpButtonMouseReleased

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_signUpButtonActionPerformed
    {//GEN-HEADEREND:event_signUpButtonActionPerformed
        new VtnRegistroUsuario("", "").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        btn3();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUsuarioKeyPressed
    {//GEN-HEADEREND:event_txtUsuarioKeyPressed
        Validaciones.enter(this, evt, jPasswordField1);
    }//GEN-LAST:event_txtUsuarioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSMPassView jPasswordField1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JButton signUpButton;
    private rojeru_san.RSMTextFull txtUsuario;
    // End of variables declaration//GEN-END:variables
}
