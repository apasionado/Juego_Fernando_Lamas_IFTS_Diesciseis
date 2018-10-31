/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Componente;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ParteDelCuerpo;
import ifts16.pp.juego.componentes.item.DeDefensa;
import ifts16.pp.juego.sistemas.IOBase;

/**
 *
 * @author Heresy
 */
public class Defensa extends Componente implements DeDefensa {
        
    protected int bonoDefensa;
    protected int bonoResistencia;
    
    
    @Override
    public int bonoDefensa() {
        return this.bonoDefensa;
    }

    @Override
    public int bonoResistencia() {
        return this.bonoResistencia;
    }

    @Override
    public int aumentarBonoDefensa(int cantidad) {
        cantidad = 1;
        IOBase.mostrarTexto("Tu defensa aumento en " + cantidad);
        this.bonoDefensa = 0;
        return this.bonoDefensa;
    }

    @Override
    public int disminuirBonoDefensa(int cantidad) {       
        this.bonoDefensa = 0;
        return this.bonoDefensa;
    }

    @Override
    public int aumentarBonoResistencia(int cantidad) {
        this.bonoResistencia = this.bonoResistencia + 1;
        return this.bonoResistencia;
    }

    @Override
    public int disminuirBonoResistencia(int cantidad) {
        this.bonoResistencia = this.bonoResistencia - 1;
        return this.bonoResistencia;
    }

    ;
   

    @Override
    public void lugarDeUso(ParteDelCuerpo parte) {
        IOBase.mostrarTexto("Se usa en ");
    }
    
    @Override
    public ParteDelCuerpo seUsaEn() {
        //como pido partes del cuerpo segun el item o entidad??
        return null;
    }
    
}
