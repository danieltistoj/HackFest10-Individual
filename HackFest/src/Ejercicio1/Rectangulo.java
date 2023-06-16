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
public class Rectangulo {
   private List<Integer> lista;
   private  int area;

    public Rectangulo() {
        this.lista = new ArrayList<Integer>();
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public int calcularArea(){
        int ancho,alto;
        ancho = lista.get(2)-lista.get(0);
        alto = lista.get(3) - lista.get(1);
        this.area = ancho *alto;
        return getArea();
    }
    
}
