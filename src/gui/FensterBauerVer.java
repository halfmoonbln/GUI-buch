/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;

/**
 *
 * @author GürgensRobert
 */
public class FensterBauerVer extends JFrame{
    
    public FensterBauerVer(String titel, Dimension groesse, Point position,
            boolean groesseVeraenderbar, boolean mitDekoration, Stil stil) {
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
        
        setTitle(titel);
        setUndecorated(!mitDekoration);
        setLocation(position);
        setSize(groesse);
        setResizable(groesseVeraenderbar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
