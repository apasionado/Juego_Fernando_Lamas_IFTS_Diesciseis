/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.componentes.Referencia;
import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.entidades.ItemAbstracto;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.sistemas.Sistema;
import juego_fernando_lamas_ifts_diesciseis.Item.Grog;

/**
 *
 * @author alumno
 */
public class CreadorDeItems extends Sistema{
    
    Grog grog = new Grog();
	
    public static void crearItem(Grog grog, BigoteFalso bigote) {
        
      RepositorioPrincipal.agregar(grog, "Grog");

    }
    public void PruebaOpciones(Grog grog){
          grog.opciones();
      }
}
