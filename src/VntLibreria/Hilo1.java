package VntLibreria;

public class Hilo1 extends Thread
{

    VtnInicioSoftware vSoft = new VtnInicioSoftware();

    @Override
    public void run()
    {
        for (int i = 0; i <= 5; i++)
        {

            vSoft.setVisible(true);

            try
            {
                Hilo1.sleep(1000);
            } catch (InterruptedException e)
            {
            }
            if (i == 5)
            {
                try
                {
                    Hilo1.sleep(50);
                } catch (InterruptedException e)
                {
                }
                vSoft.dispose();
            }

        }
    }
}
