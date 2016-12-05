/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author GürgensRobert
 */
public class EreignisDemo implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent einEreignis)
    {
        //Reaktion auf das Ereignis
        System.err.println("Druckknopf wurde gedrückt");
    }
    
}
