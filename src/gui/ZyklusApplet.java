/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class ZyklusApplet extends JApplet{
    private JLabel einText;
    private int zaehler;
    
    public ZyklusApplet () // Konstruktor
    {
        super();
        zaehler = 0;
        
        try {
            setSize(300,150);
            einText = new JLabel("Applet erzeugt: Zähler = " + zaehler);
            einText.setHorizontalAlignment(SwingConstants.CENTER);
            getContentPane().add(einText);
        } catch (Exception e) {
            System.err.println("GUI-Aufbau fehlgeschlagen");
        }
    }
    public void init()
    {
        zaehler = zaehler + 100;
        final String text = "Applet initialisiert: Zähler = "+zaehler;
        
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    einText.setText(text);
                }
            });
        } catch (Exception e) {
            System.err.println("Text setzen fehlgeschlagen");
        }
    }
    public void start() {
        zaehler++;
        final String text = "Applet gestartet: Zähler = " + zaehler;
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    einText.setText(text);
                }
            });
        } catch (Exception e) {
            System.err.println("Text setzen fehlgeschlagen");
        }
    }
    public void stop(){
        zaehler = zaehler +5;
        final String text = "Applet gestoppt: Zähler = " + zaehler;
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    einText.setText(text);
                }
            });
        } catch (Exception e) {
            System.err.println("Text setzen fehlgeschlagen");
        }
    }
    public void destroy() {
        zaehler = zaehler + 99;
        final String text = "Applet zerstört : Zähler = " + zaehler;
        
       try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    einText.setText(text);
                }
            });
        } catch (Exception e) {
            System.err.println("Text setzen fehlgeschlagen");
        }
    }
}
