/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis.Sistemas;

import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.NavegacionBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import ifts16.pp.juego.utiles.Opcion;
import ifts16.pp.juego.utiles.Opciones;

/**
 *
 * @author Fernando Lamas
 */
public class Navegacion extends NavegacionBase{
    
    
    public static void hablar(LugarBase ubicacion) {
        Opciones ops = ubicacion.getHabladores()
                .opcionesActivas("Elija con quien hablar.");
        Opcion eleccion = IOBase.elegirOpcion(ops);
        IOBase.mostrarTexto("Eligio hablar con " + eleccion.getTexto());
        if(eleccion.esEntidad()){
            Entidad ent = RepositorioPrincipal.traer(eleccion.getEntidadId());
            LugarBase lugar = (LugarBase) ent;
            ubicacionActual = lugar;
        }
    }
    
    public static void hacerMisiones(LugarBase ubicacion){
        
    }
    
    public static void recolectarItems(LugarBase ubicacion){
        Opciones ops = ubicacion.getItems()
                .opcionesActivas("Elija los items a recolectar");
        Opcion eleccion = IOBase.elegirOpcion(ops);
        if (eleccion.esEntidad()) {
            Entidad ent = RepositorioPrincipal.traer(eleccion.getEntidadId());
            LugarBase lugar = (LugarBase) ent;
            ubicacionActual = lugar; 
        }
    }
    
    public static void luchar(LugarBase ubicacion){
                Opciones ops = ubicacion.getLuchadores()
                .opcionesActivas("Elija los luchadores con quien pelear");
        Opcion eleccion = IOBase.elegirOpcion(ops);
        if (eleccion.esEntidad()) {
            Entidad ent = RepositorioPrincipal.traer(eleccion.getEntidadId());
            LugarBase lugar = (LugarBase) ent;
            ubicacionActual = lugar; 
        }
    }

    
}
