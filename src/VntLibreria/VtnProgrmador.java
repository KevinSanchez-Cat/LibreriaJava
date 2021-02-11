package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import recursos.Mensaje;

public class VtnProgrmador extends javax.swing.JFrame
{

    public static java.awt.Color c;
    int X_V;
    int Y_V;
     String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnProgrmador(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        initComponents();
         Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
       


        VtnMenuOpcion mn = new VtnMenuOpcion(this, pantallas_Usuario, nombre_Final_de_Usuario);
        mn.setVisible(true);
        mn.show();
        jDesktopPane1.add(mn);

        PerflProgra pps = new PerflProgra(this, nombre_Final_de_Usuario);
        pps.setVisible(true);
        pps.show();
        jDesktopPane4.add(pps);

        // jDesktopPane1.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane4 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setViewportView(jDesktopPane1);

        jTabbedPane2.addTab("Inicio", jScrollPane1);
        jTabbedPane2.addTab("Peticiones de usuarios", jDesktopPane2);
        jTabbedPane2.addTab("Peticiones de Libros", jDesktopPane3);
        jTabbedPane2.addTab("Más Opciones", jDesktopPane4);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 570));
        jTabbedPane2.getAccessibleContext().setAccessibleName("Inicio");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton1ActionPerformed
    {//GEN-HEADEREND:event_boton1ActionPerformed

    }//GEN-LAST:event_boton1ActionPerformed
    public void vtR()
    {
        new VtnRegistroUsuario(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton2ActionPerformed
    {//GEN-HEADEREND:event_boton2ActionPerformed

    }//GEN-LAST:event_boton2ActionPerformed
    public void mu()
    {
        new VtnModificarUsuarios(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton3ActionPerformed
    {//GEN-HEADEREND:event_boton3ActionPerformed

    }//GEN-LAST:event_boton3ActionPerformed
    public void bu()
    {
        new VtnBajasAdministradores(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }
    private void boton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton7ActionPerformed
    {//GEN-HEADEREND:event_boton7ActionPerformed

    }//GEN-LAST:event_boton7ActionPerformed
    public void rl()
    {
        new VtnRegistroLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }
    private void boton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton6ActionPerformed
    {//GEN-HEADEREND:event_boton6ActionPerformed

    }//GEN-LAST:event_boton6ActionPerformed
    public void ml()
    {
        new VtnModificarLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }
    private void boton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton8ActionPerformed
    {//GEN-HEADEREND:event_boton8ActionPerformed

    }//GEN-LAST:event_boton8ActionPerformed
   
    private void boton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton9ActionPerformed
    {//GEN-HEADEREND:event_boton9ActionPerformed

    }//GEN-LAST:event_boton9ActionPerformed
    public void cl()
    {
        new VtnConsultarLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }
    private void boton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton4ActionPerformed
    {//GEN-HEADEREND:event_boton4ActionPerformed

    }//GEN-LAST:event_boton4ActionPerformed
  
    private void boton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton5ActionPerformed
    {//GEN-HEADEREND:event_boton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton10ActionPerformed
    {//GEN-HEADEREND:event_boton10ActionPerformed

    }//GEN-LAST:event_boton10ActionPerformed
    public void cad()
    {
        new VtnConsultarAdministradores(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
