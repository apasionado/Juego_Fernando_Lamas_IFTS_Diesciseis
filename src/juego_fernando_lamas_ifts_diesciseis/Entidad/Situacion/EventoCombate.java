/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad.Situacion;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import juego_fernando_lamas_ifts_diesciseis.Sistemas.CreadorDeCombates;

/**
 *
 * @author Heresy
 */
public class EventoCombate extends PersonajeAbstracto {
    
    public CreadorDeCombates componenteCombate;
    
    EventoCombate() {
        super();
        this.nombre = "Enemigo " + this.getId().toString();
        this.componenteCombate = new CreadorDeCombates();
    }
    
    
    
    EventoCombate(String nombre) {
        super(nombre);
        this.componenteCombate = new CreadorDeCombates();
    }
    
}
