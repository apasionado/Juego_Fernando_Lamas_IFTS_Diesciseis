/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente.Personaje;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ReferenciaItem;
import ifts16.pp.juego.componentes.Referencias;
import ifts16.pp.juego.componentes.item.Inventariable;
import ifts16.pp.juego.componentes.personaje.ConInventario;
import ifts16.pp.juego.entidades.ItemAbstracto;
import java.util.UUID;

/**
 *
 * @author Heresy
 */
public class Inventario extends Componente implements ConInventario {
        
    //TODO SOBRE INVENTARIO
    
    

    
    @Override
    public boolean agregar(Inventariable item) {
        
        if(!(item.getClass() == null)){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean quitar(UUID id) {
        if(!(id.getClass() == null)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean reemplazar(UUID id, Inventariable item) {
        
        //COMO SE USA ESTO?
        return false;
        
    }

    @Override
    public int agregarCantidad(UUID id, int cantidad) {
        
        if(!(this.item(id) == null)){
            
            cantidad = cantidad + 1;
            
        }else{
            
        }
        return cantidad;
    }

    @Override
    public int quitarCantidad(UUID id, int cantidad) {
        
        if(!(this.item(id) == null)){
            
        cantidad = cantidad + 1;
            
        }else{
            
        }
        return cantidad;
    }
    
    Referencias RefInventario = new Referencias();
    
    @Override
    public Referencias<ReferenciaItem> items() {
        //Como se usan las referencias?
        return this.RefInventario;
    }

    @Override
    public ItemAbstracto item(UUID id) {
        return this.item(id);
    }


}
