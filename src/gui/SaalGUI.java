/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class SaalGUI {
    public SaalGUI () {
        initGUI();
    }
    private void initGUI() {
        JFrame einFenster = FensterBauerKom.getFenster("Sitzplan",
                new Dimension(450, 600), new Point(), false, true, Stil.JAVA);
        FensterBauerKom.zentriereFenster(einFenster);
        //Zeichenfläche
        SaalZeichenflaeche meinSaal = new SaalZeichenflaeche(new Dimension(440, 510),
                new Point(25,25),
                new Color(176,226,255,255), "Leinwand");
        einFenster.getContentPane().add(meinSaal);
    }
    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SaalGUI();
              }
        });
        
    }
}
