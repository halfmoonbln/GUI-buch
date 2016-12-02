/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author GürgensRobert
 */
public class HelloGUI2 {

    public static void main(String args[]) {
        Runnable initialisierer;
        initialisierer = new Runnable() {
            @Override
            public void run() {
                // Fenster vorbereiten
                JFrame meinFenster = new JFrame("Mein erstes Fenster");
                meinFenster.setSize(300, 200);
                meinFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                meinFenster.setLayout(null);

                //Menübalken vorbereiten
                JMenuBar meinMenuebalken = new JMenuBar();
                meinMenuebalken.setOpaque(true);
                meinMenuebalken.setBackground(Color.green);
                meinMenuebalken.setPreferredSize(new Dimension(200, 20));

                //Informationstext vorbereiten
                JLabel meinText = new JLabel("Hello World");
                meinText.setBounds(40, 35, 100, 28);
                meinText.setForeground(Color.BLUE);
                meinText.setOpaque(true);
                meinText.setBackground(Color.YELLOW);

                //Varianten zum ausprobieren
                meinText.setHorizontalAlignment(SwingConstants.RIGHT);
                //meinText.setHorizontalAlignment(SwingConstants.CENTER);
                
                //Menübalken und Infotext zum Fenster hinzufügen
                meinFenster.setJMenuBar(meinMenuebalken);
                meinFenster.getContentPane().add(meinText);
                
                // Druckknopf
                JButton einDruckknopf = new JButton("Aktion");
                einDruckknopf.setBounds(40, 75, 100, 28);
                meinFenster.add(einDruckknopf);
                
                //Fenster anzeigen
                meinFenster.setVisible(true);
                LAFEinstellung.setMotifLookAndFeel();
            }
        };
        SwingUtilities.invokeLater(initialisierer);
    }

}
