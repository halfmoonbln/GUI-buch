/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author GürgensRobert
 */
public class EreignisBeobachter implements ActionListener{
    private int anzahl = 1;

    @Override
    public void actionPerformed(ActionEvent einEreignis) {
        // Reaktion auf das Ergebnis
        System.out.println(anzahl + ". Ereignis: " + einEreignis.getActionCommand()
            + "\nZeit in ms: " + einEreignis.getWhen() );
        if(einEreignis.getActionCommand().equals("Druckknopf gedrueckt"))
        {
            // Referenz auf Objekt "EinDruckKnopf" holen
            JButton eineQuelle = (JButton) einEreignis.getSource();
            String text = eineQuelle.getText();
            anzahl++;
            eineQuelle.setText(Integer.toString(anzahl)+ text.substring(1));
        }
        if (anzahl > 5) System.exit(0);
    
    }   
}
