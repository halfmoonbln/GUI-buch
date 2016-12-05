/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class ZaehlerGUIApplet extends JApplet{
    private JPanel zeichenflaeche;
    private Zaehler zaehler;
    private JLabel kmStandAnzeige;
    private JTextField deltaTextFeld;
    
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    initGUI();
                    add(gibZeichenflaeche());
                }
            });
        } catch (Exception e) {
            System.err.println("GUI-Aufbau fehlgeschlagen");
        }
    }
    private void initGUI() {
        //Fachkonzeptklasse
    zaehler = new Zaehler();
    LAFEinstellung.setJavaLookandFeel();
    //Oberfläche zusammensetzen
    //Zeichenfläche erstellen
    zeichenflaeche = new JPanel();
    zeichenflaeche.setBounds(25, 25, 200, 230);
    zeichenflaeche.setBackground(Color.LIGHT_GRAY);
    zeichenflaeche.setLayout(null);
    
    JLabel ueberschrift = new JLabel("KM-Stand");
    ueberschrift.setBounds(25, 25, 150, 20);
    ueberschrift.setForeground(Color.BLUE);
    ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
    zeichenflaeche.add(ueberschrift);
    
    kmStandAnzeige = new JLabel(Integer.toString(zaehler.getZaehlerstand()));
    kmStandAnzeige.setBounds(25, 50, 150, 20);
    kmStandAnzeige.setForeground(Color.BLUE);
    kmStandAnzeige.setHorizontalAlignment(SwingConstants.CENTER);
    zeichenflaeche.add(kmStandAnzeige);
    
    JButton erhoeheUmEinsKnopf = new JButton("Erhöhe um 1");
    erhoeheUmEinsKnopf.setBounds(25,75,150,30);
    erhoeheUmEinsKnopf.setBackground(Color.YELLOW);
    zeichenflaeche.add(erhoeheUmEinsKnopf);
    
    JButton setzeAufNullKnopf = new JButton("Setze auf 0");
    setzeAufNullKnopf.setBounds(25, 125, 150, 30);
    setzeAufNullKnopf.setBackground(Color.YELLOW);
    zeichenflaeche.add(setzeAufNullKnopf);
    
    JButton erhoeheUmXKnopf = new JButton("Erhöhe um:");
    erhoeheUmXKnopf.setBounds(25, 175, 100, 30);
    erhoeheUmXKnopf.setBackground(Color.YELLOW);
    zeichenflaeche.add(erhoeheUmXKnopf);
    
    deltaTextFeld = new JTextField();
    deltaTextFeld.setBounds(130,175,45,30);
    zeichenflaeche.add(deltaTextFeld);
    
    //Ereignisse verbeiten mit Lambda-Ausdrücken
    erhoeheUmEinsKnopf.addActionListener(
            event -> {
                zaehler.erhoeheUmeins();
                kmStandAnzeige.setText(Integer.toString(zaehler.getZaehlerstand()));
            }
    );
    
    setzeAufNullKnopf.addActionListener(
            event -> {
                zaehler.setzeAufNull();
                kmStandAnzeige.setText(Integer.toString(zaehler.getZaehlerstand()));
            }
    );
    erhoeheUmXKnopf.addActionListener(
    event -> {
        try {
            int delta = Integer.parseInt(deltaTextFeld.getText());
            zaehler.erhoeheUm(delta);
            kmStandAnzeige.setText(Integer.toString(zaehler.getZaehlerstand()));
        } catch (NumberFormatException ausnahme) {
            Toolkit.getDefaultToolkit().beep();
            deltaTextFeld.setText("");
        }
    }
    );    
    }
    public JPanel gibZeichenflaeche() {
        return zeichenflaeche;
    }
}
