/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner t;
        Circulo c1= new Circulo();
        Circulo c2=new Circulo (10);
        Circulo c3=new Circulo (new Scanner (System.in).nextDouble());
        c1.setRadio(5);
        System.out.println("EL nuevo valor del radio es: "+c1.getRadio());
        System.out.println("El valor del radio c3 es: "+c3.getRadio());
        System.out.printf("El area es: %,.2f\n",c2.area());
        System.out.printf("El area es: %,.2f y la longitud: %,.2f",c3.area(),c3.longitud());
    }
}
