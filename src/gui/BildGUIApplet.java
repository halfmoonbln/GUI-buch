/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class BildGUIApplet extends JApplet {
    private Image meinBild;
    
    public void init() {
        //Image Objekt durch Aufruf von getImage erzeugen
        meinBild = getImage(getCodeBase(),"gui/strand.jpg");
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    getContentPane().setLayout(null);
                    }
            });
        } catch (Exception e) {
            System.err.println("Fehler bei der init-Methode");
        }
    }
    public void paint(Graphics g) {
        g.drawString("URLCodeBase= " + getCodeBase(), 10, 30);
        g.drawString("URLDocument= " + getDocumentBase(), 10, 50);
        g.drawImage(meinBild, 20, 70, this);
    }
}
