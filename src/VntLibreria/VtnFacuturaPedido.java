package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.net.URI;
import javax.swing.JOptionPane;
import recursos.Mensaje;

public class VtnFacuturaPedido extends javax.swing.JFrame
{

    //VARIABLE ENTERA PARA CONOCER LA POSISION EN X DE LA VENTANA
    int X_V;
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN Y DE LA VENTANA
    int Y_V;
      String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnFacuturaPedido(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        this.pantallas_Usuario = pantallas_Usuario;
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Factura");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 300, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID COMPRA", "NOMBRE DEL LIBRO", "PRECIO DEL LIBRO", "IVA", "CANTIDAD", "PRECIO TOTAL"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1190, 330));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton1.setText("Regresar");
        rSButton1.setColorHover(new java.awt.Color(0, 153, 255));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 170, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Checked_24px.png"))); // NOI18N
        rSButton2.setText("Aceptar");
        rSButton2.setColorHover(new java.awt.Color(0, 153, 204));
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
CtrComponentes.botonSalirSI(this,nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    // End of variables declaration//GEN-END:variables
}
