package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import recursos.Mensaje;
import recursos.Validaciones;

public class VtnPedido_Imprenta extends javax.swing.JFrame
{

    //VARIABLE ENTERA PARA CONOCER LA POSISION EN X DE LA VENTANA
    int X_V;
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN Y DE LA VENTANA
    int Y_V;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnPedido_Imprenta(String pantallas_Usuario, String nombre_Final_de_Usuario)
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAut = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtpreciot = new javax.swing.JTextField();
        txtNL = new javax.swing.JTextField();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        panel3 = new org.edisoncor.gui.panel.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Clave del usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, -1, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 110, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Imprimir un libro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 370, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre del autor:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Sucursal:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cantidad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nombre del libro:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, -1, -1));

        txtAut.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtAutKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtAutKeyTyped(evt);
            }
        });
        jPanel1.add(txtAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 120, -1));

        txtSucursal.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtSucursalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtSucursalKeyTyped(evt);
            }
        });
        jPanel1.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 250, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtcantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 80, -1));
        jPanel1.add(txtpreciot, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 80, -1));

        txtNL.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNLActionPerformed(evt);
            }
        });
        txtNL.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNLKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNLKeyTyped(evt);
            }
        });
        jPanel1.add(txtNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 120, -1));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesG/118917 - clear edit.png"))); // NOI18N
        rSButton1.setText("Limpiar");
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 140, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton2.setText("Regresar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, 150, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Buy_24px.png"))); // NOI18N
        rSButton3.setText("Pedir libro");
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 160, -1));

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/58608390_2129915260379537_9077232394469113856_n.jpg"))); // NOI18N
        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 160));

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/58775420_2141918955845834_8675439655627259904_n.jpg"))); // NOI18N
        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 570, 160));

        panel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/52743175_2048960041808393_7988474849406222336_n.jpg"))); // NOI18N
        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 570, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtUsuarioActionPerformed
    {//GEN-HEADEREND:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUsuarioKeyPressed
    {//GEN-HEADEREND:event_txtUsuarioKeyPressed
        Validaciones.enter(this, evt, txtNL);
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUsuarioKeyTyped
    {//GEN-HEADEREND:event_txtUsuarioKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtNLActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNLActionPerformed
    {//GEN-HEADEREND:event_txtNLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNLActionPerformed

    private void txtNLKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNLKeyTyped
    {//GEN-HEADEREND:event_txtNLKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtNLKeyTyped

    private void txtAutKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAutKeyTyped
    {//GEN-HEADEREND:event_txtAutKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtAutKeyTyped

    private void txtSucursalKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtSucursalKeyTyped
    {//GEN-HEADEREND:event_txtSucursalKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txtSucursalKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtcantidadKeyTyped
    {//GEN-HEADEREND:event_txtcantidadKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtNLKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNLKeyPressed
    {//GEN-HEADEREND:event_txtNLKeyPressed
        Validaciones.enter(this, evt, txtAut);
    }//GEN-LAST:event_txtNLKeyPressed

    private void txtAutKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAutKeyPressed
    {//GEN-HEADEREND:event_txtAutKeyPressed
        Validaciones.enter(this, evt, txtSucursal);
    }//GEN-LAST:event_txtAutKeyPressed

    private void txtSucursalKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtSucursalKeyPressed
    {//GEN-HEADEREND:event_txtSucursalKeyPressed
        Validaciones.enter(this, evt, txtcantidad);
    }//GEN-LAST:event_txtSucursalKeyPressed

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtcantidadKeyPressed
    {//GEN-HEADEREND:event_txtcantidadKeyPressed
        Validaciones.enter(this, evt, txtpreciot);
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        CtrComponentes.limpiaTodo(txtAut, txtNL, txtSucursal, txtUsuario, txtcantidad, txtpreciot);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JTextField txtAut;
    private javax.swing.JTextField txtNL;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtpreciot;
    // End of variables declaration//GEN-END:variables
}
