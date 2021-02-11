package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import recursos.Mensaje;

public class Retardos
{

    private static javax.swing.JFrame jf = null;

    public static JFrame getJf()
    {
        return jf;
    }

    static VtnBiblioteca bAdmin = null;
    static VtnBibliotecaUsuario bUser = null;
    static VtnBibliotecaVISITANTE bVist = null;

    public static void setJf(JFrame jf)
    {
        Retardos.jf = jf;
    }

    public void recibeJFrame(javax.swing.JFrame jf)
    {
        this.jf = jf;
    }
    public static Thread tSalir = new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                tSalir.sleep(2000);
    
            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };

    public static Thread Notificacion1 = new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                Notificacion1.sleep(2000);
                NotificacionActualizaPass n = new NotificacionActualizaPass();
                n.setVisible(true);
            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };

    public static Thread Notificacion2 = new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                Notificacion2.sleep(2000);
                NotificacionBienvenido n = new NotificacionBienvenido();
                n.setVisible(true);
            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };

    public void recibeBAdmin(VtnBiblioteca vv)
    {
        bAdmin = vv;
    }

    public void recibeBUser(VtnBibliotecaUsuario vv)
    {
        bUser = vv;
    }

    public void recibeBV(VtnBibliotecaVISITANTE vv)
    {
        bVist = vv;
    }
    public static Thread Notificacion3 = new Thread()
    {

        @Override
        public void run()
        {
            boolean b = true;
            try
            {
                Notificacion3.sleep(2000);
                if (!(bAdmin == null))
                {
                    bAdmin.getjLabel3().setVisible(true);
                }
                if (!(bUser == null))
                {

                    //   bUser.getjLabel3().setVisible(true);
                }
                if (!(bVist == null))
                {

                    bVist.getjLabel3().setVisible(true);
                }

            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };

    public static Thread Notificacion4 = new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                Notificacion4.sleep(2000);
                if (!(bAdmin == null))
                {
                    bAdmin.getjLabel3().setVisible(true);
                }
                if (!(bUser == null))
                {

//                    bUser.getjLabel3().setVisible(true);
                }
                if (!(bVist == null))
                {

                    bVist.getjLabel3().setVisible(true);
                }
                NotificacionNovedades n = new NotificacionNovedades();
                n.setVisible(true);
            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };

    public static Thread Notificacion5 = new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                Notificacion5.sleep(2000);
                if (!(bAdmin == null))
                {
                    bAdmin.getjLabel3().setVisible(true);
                }
                if (!(bUser == null))
                {

//                    bUser.getjLabel3().setVisible(true);
                }
                if (!(bVist == null))
                {

                    bVist.getjLabel3().setVisible(true);
                }
                NotificacionInicioSesion n = new NotificacionInicioSesion();
                n.setVisible(true);
            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };

    public static Thread Notificacion6 = new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                Notificacion6.sleep(2000);
                NotificacionInicioSesion n = new NotificacionInicioSesion();
                n.setVisible(true);
                if (!(bAdmin == null))
                {
                    bAdmin.getjLabel3().setVisible(true);
                }
                if (!(bUser == null))
                {

//                    bUser.getjLabel3().setVisible(true);
                }
                if (!(bVist == null))
                {

                    bVist.getjLabel3().setVisible(true);
                }
            } catch (InterruptedException ex)
            {
                Mensaje.errorException(jf, "Ha ocurrido un error RETRASO AL SALIR\n" + ex.toString());
            }
        }
    };
   
    static int seg;
    public static Thread tiempo;

    public static void proceso()
    {

        tiempo = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    for (seg = 0; seg <= 100; seg++)
                    {
                        int b[] = scarga(0);
                        JFrame in = new JFrame("H");
                        in.setSize(200, 100);
                        in.setLocation(b[0], b[1]);
                        in.setVisible(true);

                        JPanel p1;
                        p1 = new JPanel();
                        p1.setLayout(null);
                        p1.setBackground(new java.awt.Color(0, 0, 0));
                        in.getContentPane().add(p1);

                        JLabel p2;

                        p2 = new JLabel("I am the Creeper...");
                        p2.setBounds(5, 5, 300, 20);
                        p2.setFont(new Font("Consola", Font.ROMAN_BASELINE, 14));
                        p2.setForeground(Color.green);
                        p1.add(p2);

                        JButton p3;
                        p3 = new JButton();
                        p3.setBounds(100, 10, 80, 30);
                        p3.setText("Salir");
                        p3.addActionListener(new java.awt.event.ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent ae)
                            {
                                tiempo.stop();
                                //proceso();
                                // tiempo.start();

                            }
                        });
                        p1.add(p3);
                        tiempo.sleep(100);
                    }

                } catch (InterruptedException e)
                {
                }
            }
        };
    }

    public static int[] scarga(int n)
    {
        int b[] = new int[2];
        boolean c = true;
        while (c)
        {
            b[n] = (int) (Math.random() * 10000);
            if (b[n] > 0 && b[n] < 1366)
            {
                b[1] = (int) (Math.random() * 1000);
                if (b[1] > 0 && b[0] < 768)
                {
                    c = false;
                }
            }
        }
        return b;
    }

}
