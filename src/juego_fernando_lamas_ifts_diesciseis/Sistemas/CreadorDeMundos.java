/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;


public class CreadorDeMundos extends FabricaPrincipal {
    
    public static void crearLugares(){
        
        LugarBase Recepcion = new LugarBase("Recepción", "Ingreso del lugar");
        
        Recepcion.activar();
        
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(Recepcion, "Recepcion");
        
        RepositorioPrincipal.traer("Recepcion");
    }
    
    /* este es un mundo de prueba*/
    
    
    
    
}
