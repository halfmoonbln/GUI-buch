/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class BildGUI extends JFrame{
    private Image meinBild;
    
    public BildGUI(String bildName) {
        super("Mein erstes Bild");
        meinBild = getToolkit().getImage(bildName);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(meinBild, 30, 50, this);
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BildGUI einBildGUI = 
                        new BildGUI("gui/strand.jpg");
                einBildGUI.setSize(400,300);
                einBildGUI.setVisible(true);
            }
        });
    }
    
}
