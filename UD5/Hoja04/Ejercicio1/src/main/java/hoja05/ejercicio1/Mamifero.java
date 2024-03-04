/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio1;

/**
 *
 * @author DAM112
 */
public class Mamifero {
    protected String raza;
    protected int npatas;
    protected String alimento; 

    public Mamifero(String raza, int npatas, String alimento) {
        this.raza = raza;
        this.npatas = npatas;
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", npatas=" + npatas + ", alimento=" + alimento + '}';
    }
    
    
}
