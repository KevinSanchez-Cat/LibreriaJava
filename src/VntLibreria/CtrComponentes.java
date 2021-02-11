package VntLibreria;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * CLASE QUE NOS DARA ATRIBUTOS ESTATICOS, O METODOS ESTATICOS PARA QUE NO
 * DEPENDAN DE UNA IMPORTACION EN UNA CLASE MAS QUE ESTA MISMA CLASE
 *
 * @author HP
 */
public class CtrComponentes
{

    public static String hora, minutos, segundos, m;
    public static Calendar calendario;
    public static HiloReloj hilo;
    public static Color colorOsuro = new Color(0, 0, 0);
    public static Color colorNormal = new Color(255, 255, 255);
    public static Color colorPressed = new Color(51, 51, 51);
    public static Color colorHover = new Color(153, 153, 153);

    public static Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));

    public static Color colorTextNormal = new Color(0, 0, 0);
    public static Color colorTextPressed = new Color(255, 255, 255);
    public static Color colorTextHover = new Color(0, 0, 0);

    //Linea para colocar una imagen al tamaño de una etiqueta
    //imagenFondo.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(imagenFondo.getWidth(), imagenFondo.getHeight(), Image.SCALE_SMOOTH)));
    //linea de codigo para darle formato a una etiqueta
    //  txtTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 38));
    //linea para abrir una calculadora
    /**
     * try { Runtime rt = Runtime.getRuntime(); Process p = rt.exec("calc");
     * p.waitFor(); } catch (Exception e) { Mensaje.error(this, "Ha ocurrido un
     * error"); }
     *
     */
    public static void inicializarBoton(JButton b)
    {
        b.setContentAreaFilled(false);
        b.setBorder(null);
        b.setOpaque(true);
        b.setSize(190, 50);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        b.setFont(new Font("Roboto", Font.PLAIN, 20));
        //    b.setBackground(CtrComponentes.colorNormal);
        //    b.setForeground(CtrComponentes.colorTextNormal);

    }

    public static void botonAccion(JButton b)
    {
        MouseListener mouse = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                b.setForeground(CtrComponentes.colorTextPressed);
                b.setBackground(CtrComponentes.colorPressed);
            }

            @Override
            public void mousePressed(MouseEvent me)
            {
                b.setForeground(CtrComponentes.colorTextPressed);
                b.setBackground(CtrComponentes.colorPressed);
            }

            @Override
            public void mouseReleased(MouseEvent me)
            {
                b.setBackground(CtrComponentes.colorNormal);
                b.setForeground(CtrComponentes.colorTextNormal);
            }

            @Override
            public void mouseEntered(MouseEvent me)
            {

            }

            @Override
            public void mouseExited(MouseEvent me)
            {
                b.setBackground(CtrComponentes.colorNormal);
                b.setForeground(CtrComponentes.colorTextNormal);
            }
        };
        b.addMouseListener(mouse);

        MouseMotionListener mouseM = new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent me)
            {

            }

            @Override
            public void mouseMoved(MouseEvent me)
            {
                b.setForeground(CtrComponentes.colorTextHover);
                b.setBackground(CtrComponentes.colorHover);
                //  b.setBorder(CtrComponentes.bordeMoved);
            }
        };
        b.addMouseMotionListener(mouseM);

        /* ActionListener accion = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
             
            }
        };*/
        //   b.addActionListener(accion);
    }

    public static void limpiaTodo(Object... o)
    {
        for (Object jt : o)
        {
            if (jt instanceof JTextField)
            {
                ((JTextField) jt).setText("");
            }
            if (jt instanceof JCheckBox)
            {
                ((JCheckBox) jt).setSelected(false);
            }
            if (jt instanceof JRadioButton)
            {
                ((JRadioButton) jt).setSelected(false);
            }
            if (jt instanceof JTextArea)
            {
                ((JTextArea) jt).setText("");
            }
            if (jt instanceof JDateChooser)
            {
                //  ((JDateChooser) jt).setDate(null);
            }
            if (jt instanceof JPanel)
            {
                ((JPanel) jt).removeAll();
            }
            if (jt instanceof JComboBox)
            {
                ((JComboBox) jt).setSelectedIndex(0);
            }
            if (jt instanceof JSpinner)
            {
                //     ((JSpinner) jt).setValue(((JSpinner) jt).getPreviousValue());
            }
            if (jt instanceof JProgressBar)
            {
                ((JProgressBar) jt).setValue(0);
            }
            if (jt instanceof JPasswordField)
            {
                ((JPasswordField) jt).setText("");
            }

        }
    }

    public static void botonSalirSI(javax.swing.JFrame jf, String nombre_Usuario, String tipo_Usuario)
    {
        switch (tipo_Usuario)
        {
            case "ADMINISTRADOR":
                new VtnBiblioteca(tipo_Usuario, nombre_Usuario).setVisible(true);
                jf.dispose();
                break;
            case "PROGRAMADOR":
                new VtnProgrmador(tipo_Usuario, nombre_Usuario).setVisible(true);
                jf.dispose();
                break;
            case "USUARIO":
                new VtnBibliotecaUsuario(tipo_Usuario, nombre_Usuario).setVisible(true);
                jf.dispose();
                break;
            case "VISITANTE":
                new VtnBibliotecaVISITANTE(tipo_Usuario, nombre_Usuario).setVisible(true);
                jf.dispose();
                break;
            default:
            
                jf.dispose();
                break;
        }
    }
}
