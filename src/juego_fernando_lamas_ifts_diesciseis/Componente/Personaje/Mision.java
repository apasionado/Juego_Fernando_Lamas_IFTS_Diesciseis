/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente.Personaje;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ReferenciaItem;
import ifts16.pp.juego.componentes.personaje.ConMision;

/**
 *
 * @author Heresy
 */
public class Mision extends Componente implements ConMision {
    // TODO SOBRE MISIONERO
    
    //ver como engancharlo con misiones en situaciones especificas
    //probablemente con if de por medio
    

    
    @Override
    public void darMision(ReferenciaItem mision) {
        
    }

    @Override
    public ReferenciaItem mision() {
        return null;
    }

    @Override
    public boolean completa() {
        return false;
    }

    @Override
    public void completar() {
    }
}
