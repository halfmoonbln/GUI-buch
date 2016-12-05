/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author GürgensRobert
 */
public class Zeichenflaeche extends JPanel{
    private String text;
    
    public Zeichenflaeche(Dimension groesse, Point position,
            Color farbe, String text) {
        setLayout(null);
        setSize(groesse.width, groesse.height);
        setLocation(position);
        setBackground(farbe);
        this.text = text;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Farbe setzen
        g.setColor(Color.blue);
        //Kreis zeichnen
        g.fillOval(30, 10, 150, 150);
        //Farbe neu setzen
        g.setColor(Color.white);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        g.drawString(text, 70, 85);
    }
}
