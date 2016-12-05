/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GürgensRobert
 */
public class EreignisDemoInner {
    public EreignisDemoInner() {
        initGUI();
    }

    private void initGUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Innere Klasse EreigenisDemo
    public class EreignisDemo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent einEreignis) {
            //Reaktion auf das Ergebnis
            System.out.println("Druckknopf wurde gedrückt");
        }
    }
    
    public static void main(String[] args) {
        //
    }
}
