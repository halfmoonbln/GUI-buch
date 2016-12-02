/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author GürgensRobert
 */
public class Zaehler {
    private int zaehlerstand = 0;
    
    public void setzeAufNull() {
        zaehlerstand = 0;
    }
    public void erhoeheUmeins()
    {
        zaehlerstand++;
    }
    public void erhoeheUm(int delta) {
        if (delta > 0) {
            zaehlerstand = zaehlerstand + delta;
        }
    }
    public int getZaehlerstand() {
        return zaehlerstand;
    }
}
