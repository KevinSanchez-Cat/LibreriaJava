package recursos;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lecturas.Lecturas;

public class Mensaje
{

    public static void error(JFrame jf, String s)
    {
        if (jf == null)
        {
            System.out.println(s);
        } else
        {
            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Exclamation.wav"));
            music.play();
            JOptionPane.showMessageDialog(jf, s, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void errorException(JFrame jf, String s)
    {
        if (jf == null)
        {
            System.out.println(s);
        } else
        {
            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Critical Stop.wav"));
            music.play();
            JOptionPane.showMessageDialog(jf, s, "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void exito(JFrame jf, String s)
    {
        if (jf == null)
        {
            System.out.println(s);
        } else
        {
            AudioClip music;
            music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/Windows Background.wav"));
            music.play();
            JOptionPane.showMessageDialog(jf, s, "Mensaje de éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Método para enviar mensajes de pregunta, si es a consola es mensaje
     * simple si es a pantalla aparece con el icono de interrrogación (?)
     *
     * @param jf Objeto de tipo JFrame si es nulo el mensaje recibido se
     * despliega en consola, sino se despliega en pantalla como ventana
     * emergente
     * @param s Cadena con el mensaje a desplegar
     * @return Valor entero, si la respuesta es si regresa 0, sino regresa 1
     */
    public static int pregunta(JFrame jf, String s)
    {
        if (jf == null)
        {
            System.out.println(s);
            return Lecturas.entero();
        } else
        {
            return JOptionPane.showConfirmDialog(jf, s, "Mensaje de pregunta", JOptionPane.YES_NO_OPTION);
        }
    }

}
