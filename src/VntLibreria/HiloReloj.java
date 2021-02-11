package VntLibreria;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HiloReloj extends Thread
{

    javax.swing.JLabel lb1;
    int seg;
    String hora, minutos, segundos, m;

    public HiloReloj()
    {
        seg = 0;
    }

    @Override
    public void run()
    {
        while (true)
        {
            calcula();
            lb1.setText(hora + ":" + minutos + ":" + segundos + " " + m);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
            }
        }
    }

    private void calcula()
    {
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        m = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (m.equals("PM"))
        {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else
        {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void recibeetiqueta(javax.swing.JLabel lb1)
    {
        this.lb1 = lb1;
    }
}
