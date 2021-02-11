
package VntLibreria;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Imagen extends javax.swing.JPanel
{

    String ruta;

    public Imagen(int x, int y, String ruta)
    {
        this.setSize(x, y);
        this.ruta = ruta;
    }

    @Override
    public void paint(Graphics g)
    {
        Dimension height = getSize();
        //para que muestre en el panel una imagen guardada en este proyecto
        //ImageIcon img= new ImageIcon(getClass().getResource(ruta));

        //para que muestre en el panel de una imagen guardada en un archivo externo
        Image imgExt = new ImageIcon(ruta).getImage();
        g.drawImage(imgExt, 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);

    }
}
