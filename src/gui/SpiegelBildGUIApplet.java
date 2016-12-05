/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;

/**
 *
 * @author GürgensRobert
 */
public class SpiegelBildGUIApplet extends JApplet{
    private Image meinBild;
    
    public void init(){
        meinBild = getImage(getCodeBase(),"gui/strand.jpg");
    }
    public void paint(Graphics g) {
        // Höhe und Breite ermiteln
        int hoehe = meinBild.getHeight(this);
        int breite = meinBild.getWidth(this);
        g.drawString("Höhe = "+ hoehe, 10, 300);
        g.drawString("Breite = " + breite, 100, 30);
        //Unskalierte Ausgabe
        g.drawImage(meinBild, 20, 30, breite,hoehe,this);
        //Nochmalige horizontal gespiegelte Ausgabe
        //Zielrechteck: dx1 = Breite * 2, dy1 = 30,
        //dx2 = Breite, dy2 = Hoehe + 30
        //Quellrechteck: sx1 = 0, sy1 = 0,
        //sx2 = Breite, sy2 = hoehe
        g.drawImage(meinBild, breite*2, 30, breite,hoehe +30,0,0,
                breite,hoehe,this);
        //Ausschnitt kopieren
        g.copyArea(20, 30, breite/2, hoehe/2, breite-20, hoehe);
        g.copyArea(breite, 30, breite/2, hoehe/2, -breite/2, hoehe);
    }
    
}
