/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Entidad;

import ifts16.pp.juego.entidades.PersonajeAbstracto;
import juego_fernando_lamas_ifts_diesciseis.Componente.Personaje.Dialogador;

/**
 *
 * @author Heresy
 */
public class Aldeano extends PersonajeAbstracto{
    
    public Dialogador Hablador;
    int cantidad = 0;
    
    public Aldeano(){
    super();  
    this.nombre = "Elsa Humerio" + this.getId().toString();
    this.Hablador = new Dialogador();
    
    }
    
    public void prueba(){
            if(cantidad == 1){
                this.Hablador.pegarle();
            }
    }

    
}
