/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Dialogador;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Salud;

/**
 *
 * @author Heresy
 */
public class Viviente extends PersonajeAbstracto{
    
    
    public Dialogador Hablador;
    public Salud Saludable;
    
    public Viviente(){
    super();
    this.nombre = "Elsa Humerio";
    this.Hablador = new Dialogador();
    this.Saludable = new Salud();
    this.Saludable.establecerSalud(10);
    }
    

    
}