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
import ifts16.pp.juego.sistemas.IOBase;
import java.util.UUID;
import juego_fernando_lamas_ifts_diesciseis.Componente.Item.Carga;

/**
 *
 * @author Heresy
 */
public class Inventario extends Componente implements ConInventario {
        
    public Carga Cargado;
    
    
    public Inventario(){
    
        this.Cargado = new Carga();
        
    }

    
    @Override
    public boolean agregar(Inventariable item) {
        
        if(!(Cargado.puedeCargar(1))){
            IOBase.mostrarTexto("No tienes espacio para cargar este item");
            return false;
        }else{
            item.agregar(1);
            IOBase.mostrarTexto("Se ha agregado 1 " + item.toString() + " a tu inventario");
            
            return true;
        }
        
    }

    @Override
    public boolean quitar(UUID id) {
        if(!(this.RefInventario.existe(id))){
            IOBase.mostrarTexto("No existe el item que intentaste quitar");
        }else{
            this.RefInventario.eliminar(id);
            IOBase.mostrarTexto("Se vacio un " + this.RefInventario.toString() + " de tu inventario");
        }
        
        return true;
    }

    @Override
    public boolean reemplazar(UUID id, Inventariable item) {
        if(!(this.RefInventario.existe(id))){
            
            IOBase.mostrarTexto("No se encuentra el item que intentas remaplazar");
            
            return false;
            
        }else{
            
            this.quitar(id);
            
            this.agregar(item);

            IOBase.mostrarTexto("Se remplazo el item exitosamente");
            
            return true;
            
        }
        
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
