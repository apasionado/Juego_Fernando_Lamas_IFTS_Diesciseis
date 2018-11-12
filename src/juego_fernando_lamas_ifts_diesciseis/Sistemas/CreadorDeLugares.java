/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import juego_fernando_lamas_ifts_diesciseis.Entidad.Lugar.LugarBase;
import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Item.Grog;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Lugar.Entrada;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente.Viviente;
import juego_fernando_lamas_ifts_diesciseis.Entidad.Viviente.VivienteEnemigo;


public class CreadorDeLugares extends FabricaPrincipal {
    
    
    public static void crearLugaresyPersonajes(){
        
        IOBase.mostrarTexto("Creando los mundos...");
        
        Entrada entrada = new Entrada("Entrada", "Un pasillo con una sala de estar");
        
        CreadorDeLugares.agregarIdLugar(entrada.getId());
        entrada.setDescripcion("Entrando al IFTS te vas dirigiendo al aula...");

        LugarBase aula = new LugarBase("Aula", "Ingresar al aula");
        
        //Instancio las entidades y los items para crearlas? SIRVE?
        /*
        chequear por que no me anda el repositorio en conjunto de la navegacion
        */
        Viviente elsa = new Viviente();
        VivienteEnemigo enemigo = new VivienteEnemigo();
        Grog grog = new Grog();
            
        //Como conecto mi mundo con otros personajes        
        //la referencia del personaje no la pude hacer andar
        entrada.agregarHablador(elsa.referencia("Un aldeano"));
        entrada.agregarItem(grog.referencia("Una botella de grog"));
        entrada.agregarLuchador(enemigo.referencia("El ex suegro"));
        
        //Como conecto mi mundo con otros mundos
        entrada.agregarVecino(aula.referencia("Habitacion principal"));

        aula.agregarVecino(entrada.referencia("Volver a la recepcion"));
        
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(entrada, "Entrada");
        RepositorioPrincipal.agregar(aula, "Habitacion Principal");
        RepositorioPrincipal.agregar(elsa, "Elsa Humerio");
        RepositorioPrincipal.agregar(enemigo, "Enemigo");
        
    }


}