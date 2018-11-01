/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.componentes.Referencia;
import ifts16.pp.juego.componentes.ReferenciaPersonaje;
import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.sistemas.Sistema;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Aldeano;

/**
 *
 * @author alumno
 */
public class CreadorDePersonajes extends Sistema {
    
    
    public static void crearPersonajes(){
        
        
        
        Aldeano Elsa_Humerio = new Aldeano() {
            
            Entidad npc1 = new Entidad();
           
            
        };
        
        
        
        Elsa_Humerio.setNombre("Elsa humerio");

        RepositorioPrincipal.agregar(Elsa_Humerio , "Elsa Humerio");
        
        
    }
    
    public static void crearPersonajeJugador(){
        
        //nombreDelJugador = nombre del jugador humano
        
        //QUE DIFERENCIA HAY ENTRE UN JUGADOR HUMANO Y UNO QUE NO EXISTE(NPC)
        
        //quiero que combata, eso es un componente
        
        
        
        
    }
    
    
}

        //Los NPC serán personajes que odies y compañeros, también personas con vinculos parentales o amorosos

        
        
        
        /*La idea es que ustedes en su juego hereden de esta fabrica principal y despues pisen este metodo
        
        creamos una fabrica en mi juego que hereda de esta fabrica principal y lo unico que tenemos que hacer es
        crear 2 metodos que se escriban igual que estos y adentor le metemos la logica uque queremos para nuestro
        mundo
        
        Y depsues desde el main llamamos a estos metodos de nuestra fabrica, crearPersonaje jugador y ahi tenemos
        todal a logica de pedir infomracion como por ejemplo el nombre del j ugador y despues problablemente alla
        algo de cuando creamos el mundo lo genera en el momento y no nos damos cuenta, es algo en lo que no 
        interferimos
        
        
        
        */