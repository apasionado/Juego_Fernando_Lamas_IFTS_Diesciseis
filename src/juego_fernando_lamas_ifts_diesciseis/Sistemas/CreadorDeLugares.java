/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente;


public class CreadorDeLugares extends FabricaPrincipal {
    
    public static void crearLugares(){
        
        IOBase.mostrarTexto("Creando los mundos...");
        
        LugarBase recepcion = new LugarBase("Recepcion", "Ingreso del lugar");
        
        CreadorDeLugares.agregarIdLugar(recepcion.getId());
        recepcion.setDescripcion("Una sala de estar");

        LugarBase habitacionPrincipal = new LugarBase("Habitacion Principal", "Una habitacion llena de sorpresas");
        
        //Instancio las entidades y los items para crearlas? SIRVE?
        if(!(RepositorioPrincipal.existe("Elsa Humerio"))){
            IOBase.mostrarTexto("No se pudo encontrar a elsa humerio");
        }else{
            Viviente elsa = (Viviente) RepositorioPrincipal.traer("Elsa Humerio");
            
        //Como conecto mi mundo con otros personajes        
        //la referencia del personaje no la pude hacer andar
        recepcion.agregarHablador(elsa.referencia("Un viviente comun"));
        
        }
        
        
        
        


        //Como conecto mi mundo con otros mundos
        recepcion.agregarVecino(habitacionPrincipal.referencia("Habitacion principal"));

        habitacionPrincipal.agregarVecino(recepcion.referencia("Volver a la recepcion"));
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(recepcion, "Recepcion");
        RepositorioPrincipal.agregar(habitacionPrincipal, "Habitacion Principal");
        
        
    }


}