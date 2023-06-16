/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Rectangulo> listaRectangulo = new ArrayList<Rectangulo>();
        System.out.println(listaRectangulo.isEmpty());
        ManejoArchivos met = new ManejoArchivos();
       // met.abrirArchivo();
       met.leerArchivo( met.abrirArchivo(),listaRectangulo);
       System.out.println( listaRectangulo.isEmpty());
       //listaRectangulo.isEmpty();
    }
    
}
