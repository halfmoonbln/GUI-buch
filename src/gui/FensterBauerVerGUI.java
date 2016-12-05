/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class FensterBauerVerGUI {
    
    public FensterBauerVerGUI()
    {
        initGUI();
    }

    private void initGUI() 
    {
        Dimension d, g;
        Point pos;
        // Aktuelle Bildschirmgröße feststellen
        d = Toolkit.getDefaultToolkit().getScreenSize();
        // Neue Fesntergröße festlegen
        g = new Dimension(400, 150);
        //Neue Fensterposition so festlegen, dass Fenster mittig angeodnet wird
        pos = new Point();
        pos.x = (d.width - g.width) / 2;
        pos.y = (d.height - g.height) / 2;
        // Piep als Hinweis auf das Fenster
        Toolkit.getDefaultToolkit().beep();
        //Fenster erzeugen
        FensterBauerVer erstesFenster = new FensterBauerVer("1. Fenster", g, pos, true, true, Stil.MOTIF);
        JLabel meinText = new JLabel("Mittig angeordnet, Größe veränderbar," + " mit Dekoration, MOTIF");
        meinText.setBounds(10, 40, 500, 30);
        meinText.setForeground(Color.BLUE);
        // Informations-Text zur Zeichenfläsche hinzufügen
        erstesFenster.setLayout(null);
        erstesFenster.getContentPane().setBackground(Color.YELLOW);
        erstesFenster.getContentPane().add(meinText);
        
        // Fenster so groß wie 1/4 der Bildschirmgröße
        Dimension viertelBildschirm = new Dimension((int) (d.getWidth() / 2), (int)(d.getHeight() / 2));
        // Fenster erzeugen
        FensterBauerVer zweitesFenster = 
            new FensterBauerVer("2. Fenster", viertelBildschirm, new Point(50,20), false, false, Stil.JAVA);
        meinText = new JLabel("Größe 1/4 Bildschirm, Größe fest, " + "ohne Dekoration, Java, mit LayoutManager");
        meinText.setForeground(Color.BLUE);
        // Informationstext zur Zeichenfläsche hinzufügen
        zweitesFenster.getContentPane().setBackground(Color.GREEN);
        zweitesFenster.getContentPane().add(meinText);
    }
    
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new FensterBauerVerGUI();
                }
        });
        
    }
}
