/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import juego_fernando_lamas_ifts_diesciseis.Entidad.Lugar.LugarBase;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Item.Grog;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Lugar.Recepcion;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente.Viviente;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente.VivienteEnemigo;


public class CreadorDeLugares extends FabricaPrincipal {
    
    
    public static void crearLugaresyPersonajes(){
        
        IOBase.mostrarTexto("Creando los mundos...");
        
        Recepcion recepcion = new Recepcion("Recepcion", "Una sala de estar");
        
        CreadorDeLugares.agregarIdLugar(recepcion.getId());
        recepcion.setDescripcion("Una sala de estar");

        LugarBase habitacionPrincipal = new LugarBase("Habitacion Principal", "Una habitacion llena de sorpresas");
        
        //Instancio las entidades y los items para crearlas? SIRVE?
        /*
        chequear por que no me anda el repositorio en conjunto de la navegacion
        */
        Viviente elsa = new Viviente();
        VivienteEnemigo enemigo = new VivienteEnemigo();
        Grog grog = new Grog();
            
        //Como conecto mi mundo con otros personajes        
        //la referencia del personaje no la pude hacer andar
        recepcion.agregarHablador(elsa.referencia("Un aldeano"));
        recepcion.agregarItem(grog.referencia("Una botella de grog"));
        recepcion.agregarLuchador(enemigo.referencia("El ex suegro"));
        
        //Como conecto mi mundo con otros mundos
        recepcion.agregarVecino(habitacionPrincipal.referencia("Habitacion principal"));

        habitacionPrincipal.agregarVecino(recepcion.referencia("Volver a la recepcion"));
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(recepcion, "Recepcion");
        RepositorioPrincipal.agregar(habitacionPrincipal, "Habitacion Principal");
        RepositorioPrincipal.agregar(elsa, "Elsa Humerio");
        RepositorioPrincipal.agregar(enemigo, "Enemigo");
        
    }


}