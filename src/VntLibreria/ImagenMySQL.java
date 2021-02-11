package VntLibreria;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImagenMySQL extends javax.swing.JPanel
{

    BufferedImage ruta;

    public ImagenMySQL(int x, int y, BufferedImage ruta)
    {
        this.setSize(x, y);
        this.ruta = ruta;
    }

    @Override
    public void paint(Graphics g)
    {
        Dimension height = getSize();
        BufferedImage img = ruta;
        g.drawImage(img, 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
