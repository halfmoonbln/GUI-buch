/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class EreignisDemoGUI {
    public EreignisDemoGUI() {
        initGUI();
    }

    private void initGUI() {
       // Fenster
        JFrame einFenster = new JFrame("Fenster der Ereignisquelle");
        einFenster.setSize(200, 100);
        //Ereignisquelle erzeugen
        JButton einDruckknopf = new JButton("Druckknopf");
        //Ereignisbeobachter erzeugen
        EreignisDemo einBeobachter = new EreignisDemo();
        //Ereignisbeobachter bei der Ereignisquelle registrieren
        einDruckknopf.addActionListener(einBeobachter);
        //Druckknopf zum Fenster hinzufügen
        einFenster.add(einDruckknopf);
        einFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        einFenster.setVisible(true);
    }
    
    public static void main (String args[]) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new EreignisDemoGUI();
                   }
            });
            
    }
}
