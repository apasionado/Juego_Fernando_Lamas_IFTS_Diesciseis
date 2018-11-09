/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
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
        
        this.nombre = "Nombre sin asignar still";
        this.ConInventario = new Inventario();
        this.Saludable = new Salud();
        this.Saludable.establecerSalud(10);
        
    }
    
}
