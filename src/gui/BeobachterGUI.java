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
public class BeobachterGUI {
    public BeobachterGUI(){
        initGUI();
    }

    private void initGUI() {
       
        EreignisBeobachter einBeobachter = new EreignisBeobachter();
        JFrame einFenster = new JFrame("Fenster der Ereignisquelle");
        einFenster.setSize(200, 100);
        //Ereignisquelle
        JButton einDrueckknopf = new JButton("1. Ereignis auslösen");
        einDrueckknopf.setActionCommand("Druckknopf gedrueckt");
        einDrueckknopf.addActionListener(einBeobachter);
        einFenster.add(einDrueckknopf);
        einFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        einFenster.setVisible(true);
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BeobachterGUI();
            }
        });
    }
}
