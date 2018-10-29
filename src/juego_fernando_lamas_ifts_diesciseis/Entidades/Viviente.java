/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidades;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.personaje.Hablador;
import juego_fernando_lamas_ifts_diesciseis.Sistemas.CreadorDePersonajes;



/**
 *
 * @author Fernando Lamas
 */
public class Viviente extends Componente implements Hablador{
    
    
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
    
    
    
    
}
