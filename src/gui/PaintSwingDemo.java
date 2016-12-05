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
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class PaintSwingDemo {
    public PaintSwingDemo() {
        initGUI();
    }
    
    private void initGUI(){
        JFrame einFenster = FensterBauerKom.getFenster("Paint-Demo mit Swing",
                new Dimension(260, 310), new Point(), false, false, Stil.JAVA);
        FensterBauerKom.zentriereFenster(einFenster);
        // Zeichenfläche
        
        Dimension groesse = new Dimension(200,300);
        Point position = new Point(25,25);
        TextZeichenflaeche eineFlaeche = new TextZeichenflaeche(groesse,
                position, Color.LIGHT_GRAY, "Hello World mit Swing");
        einFenster.setLayout(null);
        einFenster.getContentPane().add(eineFlaeche);
        JOptionPane.showMessageDialog(einFenster,"Hallo");
        eineFlaeche.setText("Mein neuer Text");
        eineFlaeche.repaint();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintSwingDemo();
            }
        });
    }
}
