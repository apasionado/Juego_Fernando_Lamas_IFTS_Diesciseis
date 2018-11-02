/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.NavegacionBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente;
import juego_fernando_lamas_ifts_diesciseis.Item.Grog;


public class CreadorDeLugares extends FabricaPrincipal {
    
    public static void crearLugares(){
        
        IOBase.mostrarTexto("Creando los mundos...");
        
        LugarBase recepcion = new LugarBase("Recepcion", "Ingreso del lugar");
        
        CreadorDeLugares.agregarIdLugar(recepcion.getId());
        recepcion.setDescripcion("Una sala de estar");
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(recepcion, "Recepcion");

        
        LugarBase habitacionPrincipal = new LugarBase("Habitacion Principal", "Una habitacion llena de sorpresas");
        
        //Instancio las entidades y los items para crearlas? SIRVE?
        PersonajeAbstracto elsa = (PersonajeAbstracto) RepositorioPrincipal.traer("Elsa Humerio");
        
                //Como conecto mi mundo con otros personajes        
        //la referencia del personaje no la pude hacer andar
        recepcion.agregarHablador(elsa.referencia());
        
        
        Grog grog = new Grog();
        
        
        //Como conecto mi mundo con otros mundos
        recepcion.agregarVecino(habitacionPrincipal.referencia("Habitacion principal"));
        
        //Como conecto mi mundo con items
        recepcion.agregarItem(grog.referencia("Grog"));
        

        
        habitacionPrincipal.agregarVecino(recepcion.referencia("Volver a la recepcion"));
        
    }


}