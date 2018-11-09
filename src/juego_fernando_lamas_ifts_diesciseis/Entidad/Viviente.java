/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.MapaDeOpciones;
import ifts16.pp.juego.utiles.Opciones;
import java.awt.Color;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Dialogador;

/**
 *
 * @author Heresy
 */
public class Viviente extends PersonajeAbstracto{
    
    
    public Dialogador Hablador;
    
    public Viviente(){
    super();  
    this.id = this.getId();
    this.nombre = "Elsa Humerio" + this.getId().toString();
    this.Hablador = new Dialogador();
    
    }
    

    
}