/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class HelloWorldApplet extends JApplet {
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                
                public void run() {
                    getContentPane().setLayout(null);
                    JLabel einText = new JLabel("Hello World!");
                    einText.setFont(new Font("SanSerif",Font.ITALIC,20));
                    einText.setForeground(Color.BLUE);
                    einText.setBounds(0, 0, 200, 120);
                    einText.setHorizontalAlignment(SwingConstants.CENTER);
                    einText.setVerticalAlignment(SwingConstants.CENTER);
                    //Text der Zeichenfläche hinzufügen
                    getContentPane().add(einText);
                }
            });
        } catch (Exception e) {
            System.err.println("GUI-Aufbau fehlgeschlafen");
        }
    }
    
}
