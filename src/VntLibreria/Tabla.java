
package VntLibreria;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Tabla extends DefaultTableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1)
    {

        if (o instanceof JLabel)
        {
            JLabel lbl = (JLabel) o;
            return lbl;
        }
        if (o instanceof javax.swing.JPanel)
        {
            javax.swing.JPanel lb = (javax.swing.JPanel) o;
            return lb;
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

}
