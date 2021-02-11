package VntLibreria;

import AppPackage.AnimationClass;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import recursos.Mensaje;

public class VtnPrincipal extends javax.swing.JFrame
{

    public static JLabel imagen11;
    public static JLabel imagen22;
    public static JLabel imagen33;
    public static JLabel imagen44;

    public static java.awt.Color colorPE = new java.awt.Color(0, 102, 153);
    public static java.awt.Color colorPO = new java.awt.Color(0, 0, 0);
    public static java.awt.Color colorPC = new java.awt.Color(255, 255, 255);
    public static java.awt.Color colorPP = new java.awt.Color(255, 255, 255);
    Thread tiempo;
    public static int id = 0;

    int X_V;
    int Y_V;

    public VtnPrincipal()
    {

        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        initComponents();
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // setResizable(false);
        this.setLocationRelativeTo(null);



        jTextField1.setVisible(false);
        //JLabel en esta clase seran igual a los definidos en la ventana 
        imagen11 = imagen1;
        imagen22 = imagen2;
        imagen33 = imagen3;
        imagen44 = imagen4;
        proceso();
        tiempo.start();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        buttonAeroRound2 = new org.edisoncor.gui.button.ButtonAeroRound();
        buttonAeroRound3 = new org.edisoncor.gui.button.ButtonAeroRound();
        buttonAeroRound4 = new org.edisoncor.gui.button.ButtonAeroRound();
        panelFondo = new javax.swing.JPanel();
        imagen4 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        imagen1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener()
        {
            public void windowStateChanged(java.awt.event.WindowEvent evt)
            {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt)
            {
                formWindowDeactivated(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt)
            {
                formWindowDeiconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAeroRound2.setBackground(new java.awt.Color(255, 255, 255));
        buttonAeroRound2.setBorder(null);
        buttonAeroRound2.setForeground(new java.awt.Color(0, 0, 0));
        buttonAeroRound2.setText("Registro");
        buttonAeroRound2.setColorDeSombra(new java.awt.Color(255, 255, 255));
        buttonAeroRound2.setDireccionDeSombra(1);
        buttonAeroRound2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAeroRound2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAeroRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 20, 190, 35));

        buttonAeroRound3.setBackground(new java.awt.Color(255, 255, 255));
        buttonAeroRound3.setBorder(null);
        buttonAeroRound3.setForeground(new java.awt.Color(0, 0, 0));
        buttonAeroRound3.setText("Inicio de sesión");
        buttonAeroRound3.setColorDeSombra(new java.awt.Color(255, 255, 255));
        buttonAeroRound3.setDireccionDeSombra(1);
        buttonAeroRound3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAeroRound3ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAeroRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, 36));

        buttonAeroRound4.setBackground(new java.awt.Color(255, 255, 255));
        buttonAeroRound4.setBorder(null);
        buttonAeroRound4.setForeground(new java.awt.Color(0, 0, 0));
        buttonAeroRound4.setText("Consultar Libros");
        buttonAeroRound4.setColorDeSombra(new java.awt.Color(255, 255, 255));
        buttonAeroRound4.setDireccionDeSombra(1);
        buttonAeroRound4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAeroRound4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAeroRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 190, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 320, 170));

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(890, 560));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.jpg"))); // NOI18N
        panelFondo.add(imagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 430, -1));

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.jpg"))); // NOI18N
        panelFondo.add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 430, 480));

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.jpg"))); // NOI18N
        panelFondo.add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 430, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(0, 153, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTextField1KeyPressed(evt);
            }
        });
        panelFondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1270, -1));

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.jpg"))); // NOI18N
        panelFondo.add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 480));

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1260, 560));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Librería Virtual");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 430, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesG/buhoAzul.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 170));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 0));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Comando");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        jTextField1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextField1KeyPressed
    {//GEN-HEADEREND:event_jTextField1KeyPressed
        txtAcceso(evt);
    }//GEN-LAST:event_jTextField1KeyPressed
    public void txtAcceso(java.awt.event.KeyEvent evt)
    {
        if (evt.getKeyChar() == '\n')
        {
            if (jTextField1.getText().equals("<ENTRAR A LA PANTALLA DEL PROGRAMADOR>"))
            {
                //VtnPrincipal.pantallas_Usuario = "PROGRAMADOR";
                //VtnPrincipal.nombre_Final_de_Usuario = rs.getString("usuario");
                new VtnProgrmador("", "PROGRAMADOR").setVisible(true);
                jTextField1.setVisible(false);
                this.dispose();
            } else
            {
                jTextField1.setText("ERROR DE SINTAXIS: '" + jTextField1.getText() + "'");
            }
        }
    }

    private void buttonAeroRound2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAeroRound2ActionPerformed
    {//GEN-HEADEREND:event_buttonAeroRound2ActionPerformed
        new VtnRegistroUsuario("", "").setVisible(true);

    }//GEN-LAST:event_buttonAeroRound2ActionPerformed

    private void buttonAeroRound3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAeroRound3ActionPerformed
    {//GEN-HEADEREND:event_buttonAeroRound3ActionPerformed
        new VtnEntrar("", "").setVisible(true);

    }//GEN-LAST:event_buttonAeroRound3ActionPerformed

    private void buttonAeroRound4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAeroRound4ActionPerformed
    {//GEN-HEADEREND:event_buttonAeroRound4ActionPerformed
        new VtnConsultarLibros("", "").setVisible(true);
    }//GEN-LAST:event_buttonAeroRound4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        
            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Shutdown.wav"));
            music.play();


    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeiconified(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowDeiconified
    {//GEN-HEADEREND:event_formWindowDeiconified

    }//GEN-LAST:event_formWindowDeiconified

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
                
    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowDeactivated
    {//GEN-HEADEREND:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowStateChanged(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowStateChanged
    {//GEN-HEADEREND:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    public void proceso()
    {
        int h = 5000;
        int v = 10;

        int v2 = v / 2;
        tiempo = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    while (!buttonAeroRound2.isSelected() || !buttonAeroRound3.isSelected()
                            || !buttonAeroRound4.isSelected())
                    {

                        tiempo.sleep(h);
                        AnimationClass a1 = new AnimationClass();
                        a1.jLabelXLeft(10, -500, v, v2, imagen11);

                        AnimationClass a2 = new AnimationClass();
                        a2.jLabelXLeft(450, 10, v, v2, imagen22);

                        AnimationClass a3 = new AnimationClass();
                        a3.jLabelXLeft(890, 450, v, v2, imagen33);

                        AnimationClass a4 = new AnimationClass();
                        a4.jLabelXLeft(1330, 890, v, v2, imagen44);

                        // panelFondo.repaint();
                        tiempo.sleep(h);

                        imagen11.setBounds(1330, 10, imagen11.getWidth(), imagen11.getHeight());
                        AnimationClass b1 = new AnimationClass();
                        b1.jLabelXLeft(10, -500, v, v2, imagen22);

                        AnimationClass b2 = new AnimationClass();
                        b2.jLabelXLeft(450, 10, v, v2, imagen33);

                        AnimationClass b3 = new AnimationClass();
                        b3.jLabelXLeft(890, 450, v, v2, imagen44);

                        AnimationClass b4 = new AnimationClass();
                        b4.jLabelXLeft(1330, 890, v, v2, imagen11);

                        //  panelFondo.repaint();
                        tiempo.sleep(h);

                        imagen22.setBounds(1330, 10, imagen22.getWidth(), imagen22.getHeight());
                        AnimationClass c1 = new AnimationClass();
                        c1.jLabelXLeft(10, -500, v, v2, imagen33);

                        AnimationClass c2 = new AnimationClass();
                        c2.jLabelXLeft(450, 10, v, v2, imagen44);

                        AnimationClass c3 = new AnimationClass();
                        c3.jLabelXLeft(890, 450, v, v2, imagen11);

                        AnimationClass c4 = new AnimationClass();
                        c4.jLabelXLeft(1330, 890, v, v2, imagen22);

                        // panelFondo.repaint();
                        tiempo.sleep(h);

                        imagen33.setBounds(1330, 10, imagen33.getWidth(), imagen33.getHeight());
                        AnimationClass d1 = new AnimationClass();
                        d1.jLabelXLeft(10, -500, v, v2, imagen44);

                        AnimationClass d2 = new AnimationClass();
                        d2.jLabelXLeft(450, 10, v, v2, imagen11);

                        AnimationClass d3 = new AnimationClass();
                        d3.jLabelXLeft(890, 450, v, v2, imagen22);

                        AnimationClass d4 = new AnimationClass();
                        d4.jLabelXLeft(1330, 890, v, v2, imagen33);

                        //  panelFondo.repaint();
                        tiempo.sleep(h);
                        imagen44.setBounds(1330, 10, imagen44.getWidth(), imagen44.getHeight());
                    }

                } catch (InterruptedException e)
                {
                    Mensaje.errorException(null, "Ha ocurrido un error \n" + e.toString());
                }
            }
        };
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroRound buttonAeroRound2;
    private org.edisoncor.gui.button.ButtonAeroRound buttonAeroRound3;
    private org.edisoncor.gui.button.ButtonAeroRound buttonAeroRound4;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
