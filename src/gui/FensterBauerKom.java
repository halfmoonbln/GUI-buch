/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;


/**
 *
 * @author GürgensRobert
 */
public class FensterBauerKom {
    
    public static JFrame getFenster(String titel, Dimension groesse, 
            Point position, boolean groesseVeraenderbar, boolean mitDekoration,
            Stil stil) {
        switch(stil){
            case MOTIF:
                LAFEinstellung.setMotifLookAndFeel(); break;
            case JAVA:
                LAFEinstellung.setJavaLookandFeel(); break;
            case NIMBUS:
                LAFEinstellung.setNimbusLookAndFeel(); break;
            default:
                LAFEinstellung.setNativeLookAndFeel();
        }
        
        // Die folgenden Methoden bezeichnet man bei einer Komposition als "forwaring methods"
        JFrame einFenster = new JFrame(titel);
        einFenster.setUndecorated(!mitDekoration);
        einFenster.setLocation(position);
        einFenster.setSize(groesse);
        einFenster.setResizable(groesseVeraenderbar);
        einFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        einFenster.setVisible(true);
        return einFenster;
    }
    
    public static void zentriereFenster(JFrame einFenster)
    {
        Dimension bildschirmAufloesung = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension fensterGroesse = einFenster.getSize();
        Point position = new Point();
        position.x = (int) ((bildschirmAufloesung.getWidth()- fensterGroesse.getHeight()) / 2);
        einFenster.setLocation(position);
    }
            
}
