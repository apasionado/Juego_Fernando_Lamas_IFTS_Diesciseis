/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Inventario;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Lucha;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Salud;

/**
 *
 * @author Fernando Lamas
 */
public class EntidadHumana extends PersonajeAbstracto{
    
    public Inventario ConInventario;
    public Salud Saludable;
    public Lucha Luchador;
    
    public EntidadHumana(){
        super();
        
        if(!(this.nombre.isEmpty())){
           this.nombre = IOBase.ingresarTexto("Escribe el nombre de tu personaje "); 
        }else{
            IOBase.mostrarTexto(this.nombre);
        }
        
        this.ConInventario = new Inventario();
        this.Saludable = new Salud();
        this.Luchador = new Lucha();
        this.Saludable.establecerSalud(10);
    }
    
}
