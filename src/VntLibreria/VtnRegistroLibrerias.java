package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import recursos.CtrlInterfaz;
import recursos.Mensaje;
import recursos.Validaciones;
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
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import recursos.BarraInstrucciones;

public class VtnRegistroLibrerias extends javax.swing.JFrame
{

    int num = 0;
    int X_V;
    int Y_V;
    JFileChooser fc;
    File fichero;
    FileInputStream fis;
      String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnRegistroLibrerias(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        this.pantallas_Usuario = pantallas_Usuario;
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

    }
    ImageIcon iconoAvatar = new ImageIcon(ClassLoader.getSystemResource("imagenes/avatarDefecto.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHAbrir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanelImagem = new javax.swing.JPanel();
        cbxEstado = new javax.swing.JComboBox<>();
        cbxMunicipio = new javax.swing.JComboBox<>();
        cbxLocalidad = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHCerrar = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();

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
        jLabel1.setText("REGISTRO DE LIBRERÍAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 540, -1));

        txtHAbrir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtHAbrirActionPerformed(evt);
            }
        });
        txtHAbrir.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtHAbrirKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtHAbrirKeyTyped(evt);
            }
        });
        jPanel1.add(txtHAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 160, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Horario de cerrar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Localidad:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, 20));

        txtCorreo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCorreoActionPerformed(evt);
            }
        });
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
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 180, -1));

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
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 270, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Correo electronico:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Nombre de la librería:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 180, -1));

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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 150, 20));

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
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 200, -1));

        cbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxMunicipio.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbxMunicipioItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 200, -1));

        cbxLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxLocalidad.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbxLocalidadItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 200, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Dirección:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 70, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Estado:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Municipio:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Número telefonico:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 130, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Horario de abrir:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 130, -1));

        txtHCerrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtHCerrarActionPerformed(evt);
            }
        });
        txtHCerrar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtHCerrarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtHCerrarKeyTyped(evt);
            }
        });
        jPanel1.add(txtHCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 160, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 160, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_accounts_main.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Librerías");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        jLabel5.setText("Calle y número");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 80, 20));

        jLabel8.setText("00:00 - 24:00");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 80, 20));

        jLabel10.setText("00:00 - 24:00");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 80, 20));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png"))); // NOI18N
        rSButton1.setText("Limpiar y Actualizar");
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, -1, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton2.setText("Registrar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, -1, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton3.setText("Regresar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    DefaultComboBoxModel modeloCBX;
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened
    public void registra()
    {

        // if (pwpasword.getText().equals(confirmPassword.getText()))
        {
            Conexion.con = Conexion.getConexion();
            String sql = "INSERT INTO personas (clave,nombre_personas,apellido_paterno,apellido_materno,fecha_de_nac_persona,direccion_persona,usuario,foto_perfil,genero,correo,celular) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            //     String clave = txtClave.getText().toUpperCase();
            String nombre = txtNombre.getText().toUpperCase();
            //   String apellido_p = txtApellidoP.getText().toUpperCase();
            String apellido_m = txtHAbrir.getText().toUpperCase();
            String fecha_nac = "";
            //    Date date = dateNacimiento.getDate();
            //long d = date.getTime();
            //  java.sql.Date fecha = new java.sql.Date(d);
            //    fecha_nac = fecha.toString();
            String direccion = txtDireccion.getText().toUpperCase();

            //String usuario = txtUser.getText();
//foto 
            String genero;
            //  if (rbMasulino.isSelected())
            {
                genero = "MASCULINO";
                //   } else
                // {
                genero = "FEMENINO";
            }

            try
            {
                fis = new FileInputStream(fichero);

                PreparedStatement registro = Conexion.con.prepareStatement(sql);

                // registro.setString(1, clave);
                // registro.setString(2, nombre);
                // registro.setString(3, apellido_p);
                registro.setString(4, apellido_m);
                registro.setString(5, fecha_nac);
                registro.setString(6, direccion);
                //    registro.setString(7, usuario);
                registro.setBinaryStream(8, fis, (int) fichero.length());
                registro.setString(9, genero);
                //  registro.setString(10, correo);
                //registro.setString(11, celular);
                int r = registro.executeUpdate();

                fis.close();
                if (r > 0)
                {
                    Mensaje.exito(this, "Persona ingresada correctamente");
                    Conexion.con = Conexion.getConexion();
                    String sql2 = "INSERT INTO usuarios (usuario,contraseña,tipo_usuario) VALUES(?,?,?)";
                    //  String contrase = new String(pwpasword.getPassword());
                    // String nuevopasword = Hash.sha1(contrase);
                    PreparedStatement registro2 = Conexion.con.prepareStatement(sql2);
                    //      registro2.setString(1, txtUser.getText());
                    //     registro2.setString(2, nuevopasword);
                    //    registro2.setString(3, cbxTipo.getSelectedItem().toString());
                    int r2 = registro2.executeUpdate();
                    if (r2 > 0)
                    {
                        Mensaje.exito(this, "Usuario ingresado ");
                    } else
                    {
                        Mensaje.error(this, "Usuario no ingresado ");
                    }

                } else
                {
                    Mensaje.error(this, "PERSONA no ingresado ");
                }
             
                this.dispose();
            } catch (IOException | SQLException e)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
            }

            //  } else
            // {
            Mensaje.error(this, "Las contraseñas no coinciden");

        }

    }


    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        Validaciones.enter(this, evt, cbxEstado);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyPressed
    {//GEN-HEADEREND:event_txtNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCorreoKeyTyped
    {//GEN-HEADEREND:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCorreoKeyPressed
    {//GEN-HEADEREND:event_txtCorreoKeyPressed

    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtHAbrirKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtHAbrirKeyTyped
    {//GEN-HEADEREND:event_txtHAbrirKeyTyped

    }//GEN-LAST:event_txtHAbrirKeyTyped

    private void txtHAbrirKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtHAbrirKeyPressed
    {//GEN-HEADEREND:event_txtHAbrirKeyPressed
        Validaciones.enter(this, evt, txtHCerrar);
    }//GEN-LAST:event_txtHAbrirKeyPressed

    private void txtHAbrirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtHAbrirActionPerformed
    {//GEN-HEADEREND:event_txtHAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHAbrirActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCorreoActionPerformed
    {//GEN-HEADEREND:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtHCerrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtHCerrarActionPerformed
    {//GEN-HEADEREND:event_txtHCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHCerrarActionPerformed

    private void txtHCerrarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtHCerrarKeyPressed
    {//GEN-HEADEREND:event_txtHCerrarKeyPressed

    }//GEN-LAST:event_txtHCerrarKeyPressed

    private void txtHCerrarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtHCerrarKeyTyped
    {//GEN-HEADEREND:event_txtHCerrarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHCerrarKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtTelefonoActionPerformed
    {//GEN-HEADEREND:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelefonoKeyPressed
    {//GEN-HEADEREND:event_txtTelefonoKeyPressed
        Validaciones.enter(this, evt, txtHAbrir);
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelefonoKeyTyped
    {//GEN-HEADEREND:event_txtTelefonoKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped
    public void btnRegistro()
    {
        if (txtNombre.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha llenado el nombre de la librería");
            CtrlInterfaz.selecciona(txtNombre);
        } else if (cbxEstado.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "No seleccionado un estado");
            CtrlInterfaz.selecciona(cbxEstado);
        } else if (cbxMunicipio.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "No ha seleccionado un municipio");
            CtrlInterfaz.selecciona(cbxMunicipio);
        } else if (cbxLocalidad.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "No ha seleccionado una localidad");
            CtrlInterfaz.selecciona(cbxLocalidad);

        } else if (txtDireccion.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha llenado la dirección");
            CtrlInterfaz.selecciona(txtDireccion);
        } else if (BarraInstrucciones.esEmail(txtCorreo.getText().trim()))
        {
            Mensaje.error(this, "Correo Invalido");
            CtrlInterfaz.selecciona(txtCorreo);
        } else if (txtTelefono.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el telefono");
            CtrlInterfaz.selecciona(txtTelefono);
        } else if (txtHAbrir.getText().trim().isEmpty() || (horaS(txtHCerrar.getText().trim())) == false)
        {
            Mensaje.error(this, "No ha ingresado la hora de abrir");
            CtrlInterfaz.selecciona(txtHAbrir);
        } else if (txtHCerrar.getText().trim().isEmpty() || horaS(txtHCerrar.getText().trim()) == false)
        {
            Mensaje.error(this, "No ha ingresado la hora de cerrar");
            CtrlInterfaz.selecciona(txtHCerrar);
        } else
        {
            String nombre = txtNombre.getText().trim().toUpperCase();
            String direccion = txtDireccion.getText().trim().toUpperCase();
            String correo = txtCorreo.getText().trim().toUpperCase();
            String habrir = txtHAbrir.getText().trim().toUpperCase();
            String hcerrar = txtHCerrar.getText().trim().toUpperCase();
            String telefono = txtTelefono.getText().trim().toUpperCase();
            String estado = cbxEstado.getSelectedItem().toString();
            String municipio = cbxMunicipio.getSelectedItem().toString();
            String localidad = cbxLocalidad.getSelectedItem().toString();
            try
            {

                Conexion.con = Conexion.getConexion();
                String sql = "INSERT INTO t_libreria(nombre_libreria,dir_libreria,tel_libreria,hora_abrir,hora_cerrar,estado,municipio,localidad,correo_libreria) VALUES (?,?,?,?,?,?,?,?,?) VALUES()";
                PreparedStatement registro = Conexion.con.prepareStatement(sql);

                registro.setString(1, nombre);
                registro.setString(2, direccion);
                registro.setString(3, telefono);
                registro.setString(4, habrir);
                registro.setString(5, hcerrar);
                registro.setString(6, estado);
                registro.setString(7, municipio);
                registro.setString(8, localidad);
                registro.setString(9, correo);
                int r = registro.executeUpdate();
                if (r > 0)
                {
                    NotificationForm n = new NotificationForm();
                    n.setVisible(true);
                    CtrComponentes.limpiaTodo(txtNombre, txtDireccion, txtCorreo, txtHAbrir, txtHCerrar, txtTelefono, cbxEstado, cbxLocalidad, cbxMunicipio);
                } else
                {
                    ErrorOccured e = new ErrorOccured();
                    e.setVisible(true);

                }
            } catch (SQLException ex)
            {
                CtrComponentes.limpiaTodo(txtNombre, txtDireccion, txtCorreo, txtHAbrir, txtHCerrar, txtTelefono, cbxEstado, cbxLocalidad, cbxMunicipio);
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        }
    }

    public boolean horaS(String s)//00:00//24:00
    {

        char[] toCharArray = s.toCharArray();

        if (s.length() != 5)
        {
            return false;
        }
        if (toCharArray[0] == '0' || toCharArray[0] == '1' || toCharArray[0] == '2')
        {
            if (toCharArray[0] == '2')
            {
                if (toCharArray[1] == '0' || toCharArray[1] == '1' || toCharArray[1] == '2' || toCharArray[1] == '3')
                {
                    if (toCharArray[2] == ':')
                    {
                        if (toCharArray[3] == '0' || toCharArray[3] == '1' || toCharArray[3] == '2' || toCharArray[3] == '3' || toCharArray[3] == '4' || toCharArray[3] == '5' || toCharArray[3] == '6')
                        {
                            if (toCharArray[4] == '0' || toCharArray[4] == '1' || toCharArray[4] == '2' || toCharArray[4] == '3' || toCharArray[4] == '4' || toCharArray[4] == '5' || toCharArray[4] == '6' || toCharArray[4] == '7' || toCharArray[4] == '8' || toCharArray[4] == '9')
                            {
                                return true;
                            } else
                            {
                                return false;
                            }

                        } else
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }

        } else
        {
            return false;
        }

        return false;
    }

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionKeyTyped
    {//GEN-HEADEREND:event_txtDireccionKeyTyped

        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionKeyPressed
    {//GEN-HEADEREND:event_txtDireccionKeyPressed

        Validaciones.enter(this, evt, txtCorreo);        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyPressed

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
        AudioClip music;
        music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/BaseActualizada.wav"));
        music.play();
        CtrComponentes.limpiaTodo(txtNombre, txtDireccion, txtCorreo, txtHAbrir, txtHCerrar, txtTelefono, cbxEstado, cbxLocalidad, cbxMunicipio);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        btnRegistro();
        CtrComponentes.limpiaTodo(txtNombre, txtDireccion, txtCorreo, txtHAbrir, txtHCerrar, txtTelefono, cbxEstado, cbxLocalidad, cbxMunicipio);
    }//GEN-LAST:event_rSButton2ActionPerformed
    public void cargaImagen()
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxLocalidad;
    private javax.swing.JComboBox<String> cbxMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanelImagem;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHAbrir;
    private javax.swing.JTextField txtHCerrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
