/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.componentes.Referencia;
import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;

/**
 *
 * @author alumno
 */
public class CreadorDePersonajes extends FabricaPrincipal {
    
    
    public static void crearPersonajes(){
        
        Entidad Personaje = new Entidad() {
          
            @Override
            public Referencia referencia(String texto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Referencia referencia() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        
        
        
        //Los NPC serán personajes que odies y compañeros, también personas con vinculos parentales o amorosos
        Personaje.setNombre("Enemigo");
        
        
        
        
       
        
        RepositorioPrincipal.agregar(Personaje , "Alan");
        
        /*La idea es que ustedes en su juego hereden de esta fabrica principal y despues pisen este metodo
        
        creamos una fabrica en mi juego que hereda de esta fabrica principal y lo unico que tenemos que hacer es
        crear 2 metodos que se escriban igual que estos y adentor le metemos la logica uque queremos para nuestro
        mundo
        
        Y depsues desde el main llamamos a estos metodos de nuestra fabrica, crearPersonaje jugador y ahi tenemos
        todal a logica de pedir infomracion como por ejemplo el nombre del j ugador y despues problablemente alla
        algo de cuando creamos el mundo lo genera en el momento y no nos damos cuenta, es algo en lo que no 
        interferimos
        
        
        
        */


   
    }
    
    public static void crearPersonajeJugador(){
        
        //nombreDelJugador = nombre del jugador humano
        
        //QUE DIFERENCIA HAY ENTRE UN JUGADOR HUMANO Y UNO QUE NO EXISTE(NPC)
        
        //quiero que combata, eso es un componente
        
        
    }
    
    
}
