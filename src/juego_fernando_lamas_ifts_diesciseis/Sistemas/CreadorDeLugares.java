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


public class CreadorDeLugares extends FabricaPrincipal {
    
    
    public static void crearLugaresyPersonajes(){
        
        IOBase.mostrarTexto("Creando los mundos...");
        
        Entrada entrada = new Entrada("Entrada", "Un pasillo con una sala de estar");
        
        CreadorDeLugares.agregarIdLugar(entrada.getId());
        entrada.setDescripcion("Una habitacion normal todo parece muy correcto...");

        LugarBase habitacionRara = new LugarBase("Habitacion Rara", "Ingresar a la habitacion rara");
        
        LugarBase habitacionSinSalida = new LugarBase("Habitacion sin salida ", "Una habitación sin salida");
        habitacionSinSalida.setDescripcion("ES UNA TRAMPA, entraste a una habitacion sin salida");
        //Instancio las entidades y los items para crearlas? SIRVE?
        /*
        chequear por que no me anda el repositorio en conjunto de la navegacion
        */
        Viviente npc = new Viviente();
        Grog grog = new Grog();
            
        //Como conecto mi mundo con otros personajes        
        //la referencia del personaje no la pude hacer andar
        
        //Como conecto mi mundo con otros mundos
        entrada.agregarVecino(habitacionRara.referencia("Habitacion medio rara"));
        habitacionRara.agregarVecino(habitacionSinSalida.referencia("Volver a la recepcion"));
        
        habitacionSinSalida.agregarLuchador(npc.referencia("El ex suegro (esta siempre enojado)"));
        habitacionRara.agregarItem(grog.referencia("Una botella de grog"));
        
        /*Importar al repositorio principal*/
        RepositorioPrincipal.agregar(entrada, "Entrada");
        RepositorioPrincipal.agregar(habitacionRara, "Habitacion principal");
        RepositorioPrincipal.agregar(habitacionSinSalida, "Una habitacion sin salida");
        RepositorioPrincipal.agregar(npc, "Elsa Humerio");
    }


}