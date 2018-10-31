/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Hablador;
import ifts16.pp.juego.utiles.ConActividad;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;
import juego_fernando_lamas_ifts_diesciseis.Sistemas.CreadorDePersonajes;



/**
 *
 * @author Fernando Lamas
 */
public class Viviente extends Componente implements Hablador, ConActividad, ConOpciones{
    
    
    protected String texto;
    
    
    public String presentarse(CreadorDePersonajes personaje){
        this.texto = "¡Hola! Soy " + personaje.getNombre();
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
    
    
    
    
    /* Las entidades vivas vendrian a ser mas los NPC que se desarrollan en el juego
    a medida que el usuario va interactuando con ellos el NPC responde a cada interactuación
    
    */

    
    //TODO SOBRE CON ACTIVIDAD
    @Override
    public Opciones opcionesActivas(String texto) {
    }

    @Override
    public Opciones opcionesInactivas(String texto) {
    }

    
    //TODO SOBRE CON OPCIONES
    
    @Override
    public Opciones opciones() {
    }

    @Override
    public Opciones opciones(String texto) {
    }
    
    
    
    
}
