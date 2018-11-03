/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import ifts16.pp.juego.sistemas.IOBase;
import juego_fernando_lamas_ifts_diesciseis.Componente.Item.Carga;

/**
 *
 * @author Fernando Lamas
 */
public class EntidadHumana extends PersonajeAbstracto{
    
    public Carga Cargado;
    
    public EntidadHumana(){
        super();
        this.nombre = IOBase.ingresarTexto("Escribe el nombre de tu personaje ") + this.getId().toString();
        this.Cargado = new Carga();
        this.Cargado.pesoMaximo(10);
    }
    
}
