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

/**
 *
 * @author GürgensRobert
 */
public class SaalZeichenflaeche extends TextZeichenflaeche{
    
    public SaalZeichenflaeche(Dimension groesse, Point position,
            Color farbeFlaeche, String text) {
        super(groesse, position, farbeFlaeche, text);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Sans serif", Font.BOLD, 20));
        g.drawString(getText(), 160, 20);
        int xPos = 10, yPos = 50, breite = 14, hoehe = 14;
        //Alle Reihen i
        for (int i = 1; i <= 22; i++) {
            //Reihe j, Sitzplätze
            for(int j = 1; j <= 20; j++)
            {
                if (j == 10 || j == 11)
                {
                    //Keine Sitze...Mittelgang
                    if (j == 10)
                       g.drawString(Integer.toString(i), (xPos + breite/2),
                               yPos + hoehe);
                }
                else {
                    zeichneSitz(Color.GRAY, xPos, yPos,breite,hoehe,g);
                }
                xPos = 10;
                yPos = yPos + 20;
            }
        }
    }
    private void zeichneSitz(Color sitzfarbe, int xPos, int yPos, int breite, int hoehe,
            Graphics g) {
        g.setColor(sitzfarbe);
        g.fillRoundRect(xPos, yPos, breite, hoehe, 4,6);
        g.setColor(new Color(92,51,23));
        g.drawRoundRect(xPos, yPos, breite, hoehe, 4,6);
        g.fillRect((xPos + 2), (yPos + 10), 10, 4);
    }
}
