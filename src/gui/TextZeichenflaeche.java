/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author GürgensRobert
 */
public class TextZeichenflaeche extends JPanel {
    private String text;
    
    public TextZeichenflaeche(Dimension groesse, Point position, Color farbe,
        String text)
    {
        setLayout(null);
        setSize(groesse);
        setLocation(position);
        setBackground(farbe);
        this.text = text;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(text, 20, 100);
    }
    public void setText(String text) {
        if(text != null)
            this.text =text;
    }
    public String getText() {
        return text;
    }
}
