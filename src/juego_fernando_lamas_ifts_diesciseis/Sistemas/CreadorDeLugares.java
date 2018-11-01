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


public class CreadorDeLugares extends FabricaPrincipal {
    
    public static void crearLugares(){
        
        IOBase.mostrarTexto("Creando los mundos...");
        
        LugarBase recepcion = new LugarBase("Recepcion", "Ingreso del lugar");
        
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(recepcion, "Recepcion");
        CreadorDeLugares.agregarIdLugar(recepcion.getId());
        
        LugarBase habitacionPrincipal = new LugarBase("Habitacion Principal", "Una habitacion llena de sorpresas");
        
        //Como conecto mi mundo con otros mundos
        recepcion.agregarVecino(habitacionPrincipal.referencia("Habitacion principal"));
        
        
        
        recepcion.setDescripcion("Una sala de estar");
        
    }
    
    
    
    
    
}
