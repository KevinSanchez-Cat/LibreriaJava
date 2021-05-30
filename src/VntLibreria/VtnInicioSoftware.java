package VntLibreria;

import java.awt.Image;
import java.awt.Toolkit;

public class VtnInicioSoftware extends javax.swing.JFrame
{

    HiloProgres hiloSoft;
    Thread hiloT;

    public VtnInicioSoftware()
    {

        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        setIconImage(icono);

        initComponents();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        hiloSoft = new HiloProgres(25);
        hiloSoft.recibeBarra(progres);
        hiloT = new Thread(hiloSoft);
        hiloT.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progres = new org.edisoncor.gui.progressBar.ProgressBarRect();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("AR BONNIE", 0, 78)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KREATIVE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 430, 80));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAMED BY: SANCHEZ VALDIN KEVIN IVAN && JIMENEZ APODACA EDUARDO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 420, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gota.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        progres.setBackground(new java.awt.Color(255, 255, 255));
        progres.setForeground(new java.awt.Color(0, 153, 204));
        progres.setBorde(0.0F);
        progres.setColorDeBorde(new java.awt.Color(0, 0, 0));
        progres.setColorDeSombra(new java.awt.Color(255, 255, 255));
        progres.setColorDeTexto(new java.awt.Color(0, 0, 0));
        progres.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        progres.setOpaque(true);
        progres.setStringPainted(true);
        getContentPane().add(progres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.progressBar.ProgressBarRect progres;
    // End of variables declaration//GEN-END:variables
}
