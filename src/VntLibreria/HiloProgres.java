package VntLibreria;

public class HiloProgres implements Runnable
{

    org.edisoncor.gui.progressBar.ProgressBarRect pr;
    int pidos;
    int porcent;

    HiloProgres(int i)
    {
        pidos = i;
    }

    @Override
    public void run()
    {
        try
        {
            for (porcent = 0; porcent <= 100; porcent++)
            {
                pintaBarra(pr, porcent);
                Thread.sleep(pidos);
            }
        } catch (InterruptedException e)
        {
        }
    }

    public void recibeBarra(org.edisoncor.gui.progressBar.ProgressBarRect pr)
    {
        this.pr = pr;
    }

    public void pintaBarra(javax.swing.JProgressBar barra, double porcetaje)
    {
        if (porcetaje <= 7.6)
        {
            barra.setForeground(new java.awt.Color(153, 0, 0));
        }
        if (porcetaje > 7.6 && porcetaje <= 15.2)
        {
            barra.setForeground(new java.awt.Color(204, 0, 0));
        }
        if (porcetaje > 15.2 && porcetaje <= 22.8)
        {
            barra.setForeground(new java.awt.Color(255, 0, 0));
        }
        if (porcetaje > 22.8 && porcetaje <= 30.4)
        {
            barra.setForeground(new java.awt.Color(255, 51, 0));
        }
        if (porcetaje > 30.4 && porcetaje <= 38)
        {
            barra.setForeground(new java.awt.Color(255, 102, 0));
        }
        if (porcetaje > 38 && porcetaje <= 45.6)
        {
            barra.setForeground(new java.awt.Color(255, 153, 0));
        }
        if (porcetaje > 45.6 && porcetaje <= 53.2)
        {
            barra.setForeground(new java.awt.Color(255, 204, 0));
        }
        if (porcetaje > 53.2 && porcetaje <= 60.8)
        {
            barra.setForeground(new java.awt.Color(204, 204, 0));
        }
        if (porcetaje > 60.8 && porcetaje <= 68.4)
        {
            barra.setForeground(new java.awt.Color(102, 250, 0));
        }
        if (porcetaje > 68.4 && porcetaje <= 76)
        {
            barra.setForeground(new java.awt.Color(51, 204, 0));
        }
        if (porcetaje > 76 && porcetaje <= 83.6)
        {
            barra.setForeground(new java.awt.Color(102, 204, 0));
        }
        if (porcetaje > 83.6 && porcetaje <= 91.2)
        {
            barra.setForeground(new java.awt.Color(0, 204, 0));
        }
        if (porcetaje > 91.2 && porcetaje <= 100)
        {
            barra.setForeground(new java.awt.Color(0, 204, 51));
        }
        barra.setValue((int) porcetaje);
    }
}
