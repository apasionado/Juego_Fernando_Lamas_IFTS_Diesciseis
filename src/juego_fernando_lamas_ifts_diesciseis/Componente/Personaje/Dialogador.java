/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente.Personaje;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Hablador;
import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;

/**
 *
 * @author Heresy
 */
public class Dialogador extends Componente implements Hablador {
    
    
        protected String texto;
    
    PersonajeAbstracto personajeActual = new PersonajeAbstracto() {};
    
    
    //cambiar todos los returns por void y un iobase
    public void presentarse(){
        this.texto = "¡Hola! Soy " + personajeActual.getNombre();
        IOBase.mostrarTexto(this.texto);
    }
    
    public void pegarle(){
        this.texto = "¡Auch!";
        IOBase.mostrarTexto(this.texto);
    }
    
    public boolean terminarConversacion(){
        return true;
    }
    
    public void despedirse(){
        if(!(this.terminarConversacion() == true)){
            return;
        }else{
            this.texto = "¡Nos vimos compa!";
            IOBase.mostrarTexto(this.texto);
        }
    }
}
