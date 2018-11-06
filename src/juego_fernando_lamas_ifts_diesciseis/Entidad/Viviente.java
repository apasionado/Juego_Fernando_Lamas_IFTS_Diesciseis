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
    
    public void conversacionPrincipalEnRecepcion(EntidadHumana jugador){
        
        MapaDeOpciones m = new MapaDeOpciones();
        Opciones o = new Opciones();
        
        m.poner("1", o);
        
        
        o.agregar("1", "Conocido dirás?");
        o.agregar("2", "Que tal... mira estoy buscando al señor Gomes");
        o.agregar("3", "¿Quien sos y que haces aca?");
        
        
        IOBase.mostrarTexto("Bienvenido tu... ehh... quien eres? " , Color.darkGray, Color.white);
        IOBase.ingresarTexto("Soy...");
        
        IOBase.mostrarTexto("Ah... si... " + jugador.getNombre() + " me pareces conosido");

       
    }
    
}