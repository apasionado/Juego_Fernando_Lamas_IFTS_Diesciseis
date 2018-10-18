/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Mundo;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.FabricaPrincipal;


public class Fabrica extends FabricaPrincipal {
    
    public static void crearLugares(){
        
        LugarBase world = new LugarBase("hola", "susana");
        
        world.activar();
        
    }
    
    /* este es un mundo de prueba*/
    
    
    
    
}
