/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja07.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Triangulo t=new Triangulo(15,12,15);
        System.out.println("¿Es isosceles? "+t.esIsosceles());
        System.out.println("¿Es equilatero? "+t.esEquilatero());
        System.out.println("El perimetro es: "+t.perimetro());
        
    }
}
