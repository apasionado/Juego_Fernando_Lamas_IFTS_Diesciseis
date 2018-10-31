/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Jugador;

/**
 *
 * @author Heresy
 */
public class EsJugador extends Componente implements Jugador{
    
    @Override
    public boolean esJugador() {
        return true;
    }
    
}
