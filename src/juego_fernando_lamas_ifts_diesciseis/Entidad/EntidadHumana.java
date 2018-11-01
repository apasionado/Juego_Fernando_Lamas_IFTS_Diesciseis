/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;

/**
 *
 * @author Fernando Lamas
 */
public class EntidadHumana extends PersonajeAbstracto{
    
    
    
    public EntidadHumana(){
        super();
        this.activo = true;
        this.nombre = this.getNombre() + this.getId();
        
    }
    
}
