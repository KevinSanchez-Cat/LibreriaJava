package VntLibreria;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import recursos.Mensaje;

public class PPerfil extends javax.swing.JPanel
{

    JFrame jf;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public PPerfil(JFrame jf, String nombre_Final_de_Usuario)
    {
        this.jf = jf;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        try
        {
            initComponents();

            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_persona where usuar=?");
            String nombre = nombre_Final_de_Usuario;
            ps.setString(1, nombre);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next())
            {
                lbnumbre.setText(rs.getString("nombre_usu") + " " + rs.getString("apellido_paterno_usu") + " " + rs.getString("apellido_materno_usu"));
                BufferedImage buffing = null;
                Blob blob = rs.getBlob("foto_perfil_usu");
                byte[] image = blob.getBytes(1, (int) blob.length());
                image = rs.getBytes("foto_perfil_usu");

                try
                {
                    buffing = ImageIO.read(new ByteArrayInputStream(image));

                    ImageIcon icono = new ImageIcon(buffing);
                    panel2.removeAll();
                    panel2.setIcon(icono);
                    panel2.repaint();
                } catch (Exception e)
                {
                }
                BufferedImage buffingP = null;
                Blob blobP = rs.getBlob("foto_portada_usu");
                byte[] imageP = blobP.getBytes(1, (int) blobP.length());
                imageP = rs.getBytes("foto_portada_usu");

                try
                {
                    buffingP = ImageIO.read(new ByteArrayInputStream(imageP));

                    ImageIcon iconoP = new ImageIcon(buffingP);
                    panel1.removeAll();
                    panel1.setIcon(iconoP);
                    panel1.repaint();
                } catch (Exception e)
                {
                    Mensaje.errorException(null, "Ha ocurrido un error \n" + e.toString());
                }
                String intereses = "";
                intereses = rs.getString("intereses");
                char[] interes = intereses.toCharArray();
                intereses = "";
                for (int i = 0; i < interes.length; i++)
                {

                    if (interes[i] == ' ')
                    {
                        interes[i] = ',';
                    }
                    intereses += interes[i];
                }
                String cate = rs.getString("nombre_categoria");
                String clave = rs.getString("clave_usu");
                lbnumbre1.setText(clave);
                jTextArea1.setText("Mis intereses son :" + intereses + "\n" + "Mi categoria preferida de libros es: " + cate);

            }
            HiloReloj relojSistema = new HiloReloj();
            relojSistema.recibeetiqueta(relojX);
            relojSistema.start();
        } catch (Exception ex)
        {
            Mensaje.errorException(null, "Ha ocurrido un error \n" + ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        lbnumbre = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbnumbre1 = new javax.swing.JLabel();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        jLabel4 = new javax.swing.JLabel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        relojX = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setPreferredSize(new java.awt.Dimension(970, 599));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos-de-pantalla-con-movimiento-mac.jpg"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 750, 180));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 101, 30));

        lbnumbre.setBackground(new java.awt.Color(255, 255, 255));
        lbnumbre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbnumbre.setText("Nombre(s) + Apellido Paterno + Apellido Materno");
        add(lbnumbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 690, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea1.setText("...\n...\n...\n...\n");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 102, 153));
        add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 690, 140));
        jTextArea1.getAccessibleContext().setAccessibleParent(jTextArea1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Descipción:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 101, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Clave:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 30));

        lbnumbre1.setBackground(new java.awt.Color(255, 255, 255));
        lbnumbre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbnumbre1.setText("ABC-123");
        add(lbnumbre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 690, 30));

        rSButton2.setBackground(new java.awt.Color(255, 255, 255));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png"))); // NOI18N
        rSButton2.setText("Foto de perfil");
        rSButton2.setColorHover(new java.awt.Color(0, 51, 102));
        add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 30));

        rSButton3.setBackground(new java.awt.Color(255, 255, 255));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png"))); // NOI18N
        rSButton3.setText("Foto de portada");
        rSButton3.setColorHover(new java.awt.Color(0, 51, 102));
        add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesG/molde.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 280, 240));

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_accounts_main.png"))); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 190));

        relojX.setBackground(new java.awt.Color(0, 0, 0));
        relojX.setFont(new java.awt.Font("Digital-7", 0, 24)); // NOI18N
        relojX.setForeground(new java.awt.Color(255, 255, 255));
        relojX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        relojX.setText("00:00:00 xm");
        relojX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        relojX.setOpaque(true);
        add(relojX, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 140, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesG/buhoAzul.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 170, 60));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbnumbre;
    private javax.swing.JLabel lbnumbre1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JLabel relojX;
    // End of variables declaration//GEN-END:variables
}
