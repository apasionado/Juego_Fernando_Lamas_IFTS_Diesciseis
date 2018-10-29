/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Item;

import ifts16.pp.juego.componentes.Componente;
import ifts16.pp.juego.componentes.ParteDelCuerpo;
import ifts16.pp.juego.componentes.item.DeDefensa;
import ifts16.pp.juego.componentes.item.Equipable;
import ifts16.pp.juego.componentes.item.Inventariable;
import ifts16.pp.juego.componentes.item.Pesado;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.utiles.ConOpciones;
import ifts16.pp.juego.utiles.Opciones;

/**
 *
 * @author Fernando Lamas
 */
public class Grog extends Componente implements DeDefensa, Inventariable, Equipable, Pesado, ConOpciones{


    //TODO SOBRE DEFENSA 
    
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
    
    
    //TODO SOBRE EQUIPABLE
    
   
    protected ParteDelCuerpo Boca;
   

    @Override
    public void lugarDeUso(ParteDelCuerpo parte) {
        IOBase.mostrarTexto("Se usa en " + parte.ManoDerecha);
    }
    
    @Override
    public ParteDelCuerpo seUsaEn() {
        return this.Boca;
    }

    //TODO de inventariable
    
     protected int cantidad;
    
    @Override
    public int cantidad() {
        return this.cantidad;
    }

    @Override
    public int vaciar() {
        this.cantidad = 0;
        return this.cantidad;
    }

    @Override
    public int agregar(int cantidad) {
        cantidad = cantidad + 1;
        return cantidad;
    }

    @Override
    public int quitar(int cantidad) {
        cantidad = cantidad - 1;
        return cantidad;
    }

    //TODO sobre opciones
    Opciones GrogOpciones = new Opciones();
    
    @Override
    public Opciones opciones() {
        
        //no entendi esto???
        GrogOpciones.agregar(op);
        
        GrogOpciones.agregar("Beber", "Bebe el Grog");
        GrogOpciones.agregar("Tirar", "Tira el grog al suelo");
        GrogOpciones.agregar("Observar", "Observa la descripción del objeto");
        
        return GrogOpciones;
        
    }

    @Override
    public Opciones opciones(String texto) {
        
        String numElegido = GrogOpciones.comandoElegido(IOBase.ingresarEntero("Ingrese un número disponible en la lista"));
        for(int i = 0; i < texto.indexOf(numElegido); i++){
        
        if(numElegido == "0"){
            
            this.quitar(1);
            
            if(!(this.cantidad == 0)){
                texto = "Haz bebido un poco de Grog";
            
            }else{
                texto = "¡Has bebido todo el Grog!";
            }
        }
            
        if(numElegido == "1"){
            this.vaciar();
            texto = "¿Te volviste loco? ¡Haz tirado todo el Grog!";
        }
        
        if(numElegido == "2"){
            
        
        texto = "El grog es una bebida hecha de agua caliente azucarada, mezclada con un licor, "
                + "generalmente ron, aunque también kirsch, coñac u otros. "
                + "Suele contener algún aromatizante, por ejemplo, limón.";
        GrogOpciones.setMensaje(texto);
        
        }
        
        }
        //chequear si hay que returnear el grogopciones o el texto (depende la necesidad)
        return GrogOpciones;
    }


    //TODO SOBRE PESO
    
    protected int pesoActual;
    
    @Override
    public int peso() {
        return this.pesoActual;
    }

    @Override
    public int agregarPeso(int peso) {
    
        this.pesoActual = this.pesoActual + peso;
        return this.pesoActual;
    }

    @Override
    public int quitarPeso(int peso) {
        this.pesoActual = this.pesoActual - peso;
        return this.pesoActual;
    }


    
}
