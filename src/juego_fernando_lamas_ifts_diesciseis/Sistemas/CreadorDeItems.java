/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.componentes.Referencia;
import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;

/**
 *
 * @author alumno
 */
public class CreadorDeItems extends FabricaPrincipal{
    
	
	public void crearItem() {
    Entidad Item = new Entidad() {
        @Override
        public Referencia referencia(String texto) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Referencia referencia() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    Item.setNombre("Grog");
    
    RepositorioPrincipal.agregar(Item, "Grog");
    
    
    
	}
}
