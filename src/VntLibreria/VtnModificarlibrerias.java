package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import recursos.Mensaje;
import recursos.Validaciones;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VtnModificarlibrerias extends javax.swing.JFrame
{

    int num = 0;
    int X_V;
    int Y_V;
    JFileChooser fc;
    File fichero;
    FileInputStream fis;
   String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnModificarlibrerias(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        initComponents();
         Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
       


    }

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
        jLabel1.setText("MODIFICA DE LIBRERÍAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 540, -1));

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
        jPanel1.add(txtHAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 110, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Horario de cerrar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Localidad:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, -1, 20));

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
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 180, -1));

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
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 380, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Correo electronico:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Nombre de la librería:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 180, -1));

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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 270, 20));

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
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 160, -1));

        cbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(cbxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 170, -1));

        cbxLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(cbxLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 250, 130, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Dirección:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 70, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Estado:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Municipio:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Número telefonico:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 130, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Horario de abrir:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 130, -1));

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
        jPanel1.add(txtHCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 160, -1));

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
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 160, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_accounts_main.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton1.setText("Modificar");
        rSButton1.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton2.setText("Regresar");
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 560, -1, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png"))); // NOI18N
        rSButton3.setText("Limpiar y Actualizar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 255));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    DefaultComboBoxModel modeloCBX;
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        Validaciones.validaAlfabeticos(evt);        // TODO add your handling code here:
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
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCorreoKeyPressed
    {//GEN-HEADEREND:event_txtCorreoKeyPressed
        Validaciones.enter(this, evt, txtTelefono);
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtHAbrirKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtHAbrirKeyTyped
    {//GEN-HEADEREND:event_txtHAbrirKeyTyped
        Validaciones.validaAlfabeticos(evt);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHCerrarKeyPressed

    private void txtHCerrarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtHCerrarKeyTyped
    {//GEN-HEADEREND:event_txtHCerrarKeyTyped
        Validaciones.validaAlfanumerico(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtHCerrarKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtTelefonoActionPerformed
    {//GEN-HEADEREND:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelefonoKeyPressed
    {//GEN-HEADEREND:event_txtTelefonoKeyPressed
        Validaciones.enter(this, evt, txtHAbrir);        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelefonoKeyTyped
    {//GEN-HEADEREND:event_txtTelefonoKeyTyped
        Validaciones.validaEntero(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionKeyTyped
    {//GEN-HEADEREND:event_txtDireccionKeyTyped
        Validaciones.validaAlfanumerico(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionKeyPressed
    {//GEN-HEADEREND:event_txtDireccionKeyPressed
        Validaciones.enter(this, evt, txtCorreo);        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed

        CtrComponentes.limpiaTodo(txtCorreo, txtDireccion, txtHAbrir, txtHCerrar, txtNombre, txtTelefono, cbxEstado, cbxLocalidad, cbxMunicipio);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        AudioClip music;
        music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/BaseActualizada.wav"));
        music.play();
        CtrComponentes.limpiaTodo(txtCorreo, txtDireccion, txtHAbrir, txtHCerrar, txtNombre, txtTelefono, cbxEstado, cbxLocalidad, cbxMunicipio);
    }//GEN-LAST:event_rSButton3ActionPerformed
    public void carga()
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
