/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Hablador;
import ifts16.pp.juego.entidades.PersonajeAbstracto;

/**
 *
 * @author Heresy
 */
public class Dialogador extends Componente implements Hablador {
    
    
        protected String texto;
    
    PersonajeAbstracto personajeActual = new PersonajeAbstracto() {};
    
    public String presentarse(){
        this.texto = "¡Hola! Soy " + personajeActual.getNombre();
        return this.texto;
    }
    
    public String pegarle(){
        this.texto = "¡Auch!";
        return this.texto;
    }
    
    public boolean terminarConversacion(){
        return true;
    }
    
    public String despedirse(){
        if(this.terminarConversacion() == true){
            this.texto = "¡Nos vimos guachin!";
            return this.texto;
        }else{
            return null;
        }
    }
}
