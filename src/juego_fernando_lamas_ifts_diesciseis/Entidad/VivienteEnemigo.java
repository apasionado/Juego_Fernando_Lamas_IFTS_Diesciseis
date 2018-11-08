/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.componentes.personaje.Luchador;
import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Lucha;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Salud;

/**
 *
 * @author Fernando Lamas
 */
public class VivienteEnemigo extends PersonajeAbstracto{
    

    public Salud Saludable;
    public Lucha Luchador;
    
    public VivienteEnemigo(){
    super();  
    this.id = this.getId();
    this.nombre = "Elsa Humerio" + this.getId().toString();
    
    this.Saludable = new Salud();
    this.Luchador = new Lucha();
    }
    
}
