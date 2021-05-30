/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VntLibreria;

import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class Reacciona extends javax.swing.JFrame
{

    /**
     * Creates new form Reacciona
     */
    public Reacciona()
    {
        initComponents();
        componentesReacciona(jPanel1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 350, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void componentesReacciona(javax.swing.JPanel v)
    {
        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel panelReaccion = new javax.swing.JPanel();
        javax.swing.JLabel etirquetaTituloLibro = new javax.swing.JLabel();
        javax.swing.JLabel etiquetaAutorLibro = new javax.swing.JLabel();
        javax.swing.JLabel etiquetaEditorial = new javax.swing.JLabel();
        javax.swing.JLabel etiqueta1 = new javax.swing.JLabel();
        javax.swing.JLabel etiqueta2 = new javax.swing.JLabel();
        javax.swing.JLabel etiqueta3 = new javax.swing.JLabel();
        javax.swing.JPanel panelVerificarReaccion = new javax.swing.JPanel();
        javax.swing.JPanel panelEmocion = new javax.swing.JPanel();
        org.edisoncor.gui.panel.PanelLlamada panelLlamadaEmocion = new org.edisoncor.gui.panel.PanelLlamada();
        javax.swing.JRadioButton radioEncanta = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioSonroja = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioAsombra = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioDivierte = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioEntristece = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioEnoja = new javax.swing.JRadioButton();
        javax.swing.JRadioButton radioGusta = new javax.swing.JRadioButton();
        javax.swing.JToggleButton botonEmocion = new javax.swing.JToggleButton();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JPanel jPanelImagem = new javax.swing.JPanel();
        rojeru_san.RSButton bntDescripcion = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelReaccion.setBackground(new java.awt.Color(255, 255, 255));
        panelReaccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        panelReaccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etirquetaTituloLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etirquetaTituloLibro.setText("Nombre del libro");
        panelReaccion.add(etirquetaTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, -1));

        etiquetaAutorLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaAutorLibro.setText("Autor");
        panelReaccion.add(etiquetaAutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 20));

        etiquetaEditorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaEditorial.setText("Editorial");
        panelReaccion.add(etiquetaEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 170, -1));

        etiqueta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta1.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta1.setText("Nombre del libro:");
        panelReaccion.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        etiqueta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta2.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta2.setText("Autor:");
        panelReaccion.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 40, -1));

        etiqueta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiqueta3.setForeground(new java.awt.Color(102, 102, 102));
        etiqueta3.setText("Editorial:");
        panelReaccion.add(etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, -1));

        panelVerificarReaccion.setOpaque(false);
        panelVerificarReaccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                panelLlamadaEmocion.setVisible(false);
            }
        });
        panelVerificarReaccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEmocion.setOpaque(false);

        panelEmocion.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                panelLlamadaEmocion.setVisible(false);
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelEmocion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLlamadaEmocion.setColorDeBorde(new java.awt.Color(153, 153, 153));
        panelLlamadaEmocion.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelLlamadaEmocion.setColorSecundario(new java.awt.Color(255, 255, 255));
        panelLlamadaEmocion.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CENTRAL);
        panelLlamadaEmocion.setOrientacion(org.edisoncor.gui.panel.PanelLlamada.Orientacion.BOTTOM);
        panelLlamadaEmocion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(radioEncanta);
        radioEncanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEncanta1.png"))); // NOI18N
        radioEncanta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEncanta2.png"))); // NOI18N
        radioEncanta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEncanta3.png"))); // NOI18N
        radioEncanta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioEncanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 30));

        buttonGroup1.add(radioSonroja);
        radioSonroja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meSonroja1.png"))); // NOI18N
        radioSonroja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meSonroja2.png"))); // NOI18N
        radioSonroja.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meSonroja3.png"))); // NOI18N
        radioSonroja.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioSonroja, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 30, 30));

        buttonGroup1.add(radioAsombra);
        radioAsombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meAsombra1.png"))); // NOI18N
        radioAsombra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meAsombra2.png"))); // NOI18N
        radioAsombra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meAsombra3.png"))); // NOI18N
        radioAsombra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioAsombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 30));

        buttonGroup1.add(radioDivierte);
        radioDivierte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meDivierte1.png"))); // NOI18N
        radioDivierte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meDivierte2.png"))); // NOI18N
        radioDivierte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meDivierte3.png"))); // NOI18N
        radioDivierte.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioDivierte, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 30));

        buttonGroup1.add(radioEntristece);
        radioEntristece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEntristece1.png"))); // NOI18N
        radioEntristece.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEntristece2.png"))); // NOI18N
        radioEntristece.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEntristece3.png"))); // NOI18N
        radioEntristece.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioEntristece, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 30));

        buttonGroup1.add(radioEnoja);
        radioEnoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEnoja1.png"))); // NOI18N
        radioEnoja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEnoja2.png"))); // NOI18N
        radioEnoja.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meEnoja3.png"))); // NOI18N
        radioEnoja.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioEnoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 40, 30));

        buttonGroup1.add(radioGusta);
        radioGusta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meGusta1.png"))); // NOI18N
        radioGusta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meGusta2.png"))); // NOI18N
        radioGusta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emociones/meGusta3.png"))); // NOI18N
        radioGusta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reacciona(radioEncanta, radioSonroja, radioAsombra, radioDivierte, radioEntristece, radioEnoja, radioGusta, botonEmocion, panelLlamadaEmocion);
            }
        });
        panelLlamadaEmocion.add(radioGusta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        panelEmocion.add(panelLlamadaEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        botonEmocion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEmocion.setForeground(new java.awt.Color(153, 153, 153));
        botonEmocion.setText("Me gusta");
        botonEmocion.setContentAreaFilled(false);
        botonEmocion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                panelLlamadaEmocion.setVisible(true);
                panelVerificarReaccion.setVisible(true);
                panelEmocion.setVisible(true);
            }
        });
        botonEmocion.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                botonEmocion.setForeground(new Color(153, 153, 153));
                botonEmocion.setText("Me gusta");
                botonEmocion.setIcon(null);
                panelLlamadaEmocion.setVisible(false);
            }
        });

        panelEmocion.add(botonEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));
        panelEmocion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 310, 10));

        panelVerificarReaccion.add(panelEmocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 260, 70));

        panelReaccion.add(panelVerificarReaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 310, 120));

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
                jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanelImagemLayout.setVerticalGroup(
                jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 150, Short.MAX_VALUE)
        );

        panelReaccion.add(jPanelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 130, -1));

        bntDescripcion.setBackground(new java.awt.Color(0, 51, 102));
        bntDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Up_24px.png"))); // NOI18N
        bntDescripcion.setText("Ver descripción");
        bntDescripcion.setColorHover(new java.awt.Color(0, 102, 204));
        bntDescripcion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                /*
                Que se desea hacer si se oprime el botonVerDescripcion
                 */

            }
        });
        panelReaccion.add(bntDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 310, -1));
        panelLlamadaEmocion.setVisible(false);
        v.add(panelReaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 360));

    }

    public void reacciona(javax.swing.JRadioButton radioEncanta, javax.swing.JRadioButton radioSonroja, javax.swing.JRadioButton radioAsombra, javax.swing.JRadioButton radioDivierte, javax.swing.JRadioButton radioEntristece, javax.swing.JRadioButton radioEnoja, javax.swing.JRadioButton radioGusta, javax.swing.JToggleButton botonEmocion, org.edisoncor.gui.panel.PanelLlamada panelLlamadaEmocion)
    {
        if (radioEncanta.isSelected())
        {
            botonEmocion.setForeground(new Color(204, 0, 0));
            botonEmocion.setText("Me encanta");
            botonEmocion.setIcon(radioEncanta.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (radioSonroja.isSelected())
        {
            botonEmocion.setForeground(new Color(255, 204, 0));
            botonEmocion.setText("Me sonroja");
            botonEmocion.setIcon(radioSonroja.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (radioAsombra.isSelected())
        {
            botonEmocion.setForeground(new Color(204, 204, 0));
            botonEmocion.setText("Me asombra");
            botonEmocion.setIcon(radioAsombra.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (radioDivierte.isSelected())
        {
            botonEmocion.setForeground(new Color(255, 204, 0));
            botonEmocion.setText("Me divierte");
            botonEmocion.setIcon(radioDivierte.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (radioEntristece.isSelected())
        {
            botonEmocion.setForeground(new Color(255, 204, 0));
            botonEmocion.setText("Me entristece");
            botonEmocion.setIcon(radioEntristece.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else if (radioEnoja.isSelected())
        {
            botonEmocion.setForeground(new Color(204, 102, 0));
            botonEmocion.setText("Me enfada");
            botonEmocion.setIcon(radioEnoja.getSelectedIcon());

            panelLlamadaEmocion.setVisible(false);
        } else if (radioGusta.isSelected())
        {
            botonEmocion.setForeground(new Color(0, 102, 255));
            botonEmocion.setText("Me gusta");
            botonEmocion.setIcon(radioGusta.getSelectedIcon());
            panelLlamadaEmocion.setVisible(false);
        } else
        {
            botonEmocion.setForeground(new Color(153, 153, 153));
            botonEmocion.setText("Me gusta");
            botonEmocion.setIcon(null);
            panelLlamadaEmocion.setVisible(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Reacciona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Reacciona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Reacciona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Reacciona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Reacciona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
