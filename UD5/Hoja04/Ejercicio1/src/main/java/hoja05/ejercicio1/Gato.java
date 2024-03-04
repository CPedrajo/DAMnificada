/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio1;

/**
 *
 * @author DAM112
 */
public class Gato extends Mamifero implements Domestico, Felino {

    protected String nombre;

    public Gato(String nombre, String raza, int npatas, String alimento) {
        super(raza, npatas, alimento);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre= " + nombre + '}';
    }
   
    
    
    @Override
    public String obedecer() {
        String cadena = "El gato es un desobediente.";
        return cadena; 
    }

    @Override
    public String arañar() {
        String cadena= "El gato araña";
        return cadena;
    }
    
}
