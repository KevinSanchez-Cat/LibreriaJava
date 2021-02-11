package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JOptionPane;

public class Inicio
{

    public static void main(String ar[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            Hilo1 h1 = new Hilo1();
            h1.start();
            h1.join();

            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Logoff Sound.wav"));
            music.play();
            
            VtnPrincipal vp = new VtnPrincipal();
            vp.setVisible(true);

        } catch (Exception e)
        {
            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Critical Stop.wav"));
            music.play();
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido: \n" + e, "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}
