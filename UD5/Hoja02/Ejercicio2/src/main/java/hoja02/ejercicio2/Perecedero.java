/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author carmen
 */
public class Perecedero extends Articulo {

    private int mes, año;

    public Perecedero(int mes, int año, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.mes = mes;
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("Fecha De Caducidad: %d-%d\n", mes, año));
    }

    public static void caducados(Articulo[] cad) {

        for (int i = 0; i < cad.length; i++) {
            if (cad[i] instanceof Perecedero per) {//si el array [i] es del tipo indicado (perecederos), crea el objeto per del tipo indicado (perecedero)
                // Perecedero per = (Perecedero) array [i]; 
                // da igual hacerlo en articulos o perecederos porque es estatico y solo trabaja con lo que le pasas. 
                if (per.getAño() < LocalDate.now().getYear() || (per.getAño() == LocalDate.now().getYear() && per.getMes() < LocalDate.now().getMonthValue())) {

                    System.out.println("Los articulos caducados son: \nEl codigo es: "+cad[i].codigo+" La descripcion es: "+cad[i].descripcion);

                }
            }

        }
    }
}
