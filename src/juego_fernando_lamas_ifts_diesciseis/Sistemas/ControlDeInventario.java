/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.Sistema;
import juego_fernando_lamas_ifts_diesciseis.Entidad.EntidadHumana;

/**
 *
 * @author Fernando Lamas
 */
public class ControlDeInventario extends Sistema{
    
    public static void consultaInventario(EntidadHumana p){
        IOBase.ingresarTexto("Tienes los items " + p.ConInventario.items().mostrar() + "en tu inventario");
        
}
    
    
    /*
    public static boolean RecolectarItem(EntidadHumana p, Inventariable item){
        if(!(item == null)){
            p.ConInventario.agregar(item);
            return true;
        }else{
            IOBase.mostrarTexto("Si lees esto RecolectarItem de sistema da null");
            return false;
        }
    }
    */
}
