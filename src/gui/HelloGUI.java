package gui;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GürgensRobert
 */
public class HelloGUI {
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Fenster vorbereiten
                JFrame meinFenster = new JFrame("Mein erstes Fenster");
                meinFenster.setSize(300, 200);
                meinFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Kein Layout Manager
                meinFenster.setLayout(null);
                
                //Informationstext vorbereiten
                JLabel meinText = new JLabel("Hallo Welt");
                /* Größe der Zeichenfläsche setzen
                *  (x, y, Breite, Höhe )
                */
                meinText.setBounds(40, 35, 100, 28);
                meinFenster.add(meinText);
                meinFenster.setVisible(true);
                       
            }
        });
    }
}
