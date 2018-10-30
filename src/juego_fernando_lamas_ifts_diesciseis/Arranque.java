/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_fernando_lamas_ifts_diesciseis;

import ifts16.pp.juego.entidades.Entidad;
import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import java.awt.EventQueue;
import juego_fernando_lamas_ifts_diesciseis.Sistemas.CreadorDeMundos;
import juego_fernando_lamas_ifts_diesciseis.Sistemas.Navegacion;
/**
 *
 * @author Fernando Lamas
 */
public class Arranque {
     /*
     * @param args
     */
    public static void main(String[] args) {
        
        IOBase ventana = new IOBase();
        EventQueue.invokeLater(ventana);
        CreadorDeMundos.crearLugares();
        LugarBase lugarDeInicio = (LugarBase) RepositorioPrincipal.traer("inicio");
        Navegacion.iniciar(lugarDeInicio);
        
        
    }
    
    
}


    /*
1) El trabajo escrito deberá presentarse como un archivo digital armado con un
procesador de textos como Microsoft Word o LibreOffice Writer; lo más
recomendable es exportar el archivo al formato PDF, pero también se puede
presentar en los formatos .DOC, .DOCX u .ODT. Dentro del documento se
debe encontrar:
a) La descripción del juego en términos generales, de qué trata y qué se
puede hacer en el mismo, por qué piensan que puede resultar
divertido, etc. Para esto se deberían evitar los términos técnicos y
utilizar un lenguaje llano que pueda entender cualquier persona que lo
lea, tenga conocimientos informáticos o no. La idea es que sea una
introducción accesible a cualquier persona.
b) Una enumeración y breve descripción de los Lugares, Personajes e
Ítems que consideren relevantes para el juego ya que son importantes
en la historia, plantean alguna idea interesante o esperan que el
jugador pase buena parte del tiempo. Si considera que no hay algunos
más relevantes que otro, incluya todos.
c) La descripción de las Entidades del juego. Cada una de ellas debería
estar representada por una clase que tiene a Entidad en su árbol de
Herencia. Cada Entidad debe ser descrita con al menos un breve texto
que defina qué es dentro del juego, los métodos que se le hayan
agregado y por qué; así como una enumeración de los Componentes
que la integran y los Sistemas con los que se encuentra relacionado.
Se debe prestar particular atención a la Entidad que corresponde al
Jugador.
d) La descripción de los Componentes del juego. Cada una de ellos
debería estar representada por una clase que tiene a Componente en
su árbol de Herencia. Cada Componente debe ser descrito con al
menos un breve texto que defina qué representa dentro de la Entidad,
los atributos que contiene y cómo se espera que sea usado cada uno;
así como el o los Sistemas con los que se encuentra involucrado.
e) La descripción de los Sistemas del juego. Cada uno de ellos debería
estar representado por una clase que tiene a Sistema en su árbol de
Herencia. Cada Sistema debe ser descrito con al menos un texto
breve que explique de qué se encarga, principalmente explicitando el o
los algoritmos que se encuentren en sus métodos. De cada Sistema se
deben enumerar las Entidades y Componentes que se encuentren
involucrados en su tarea.
 */