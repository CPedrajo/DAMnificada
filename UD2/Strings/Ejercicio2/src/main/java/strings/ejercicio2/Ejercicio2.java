/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package strings.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        String nombre, primerapellido, segundoapellido;
        nombre ="Pepito";
        primerapellido="Perez";
        segundoapellido="Fernandez";
        
        System.out.println(nombre .concat(primerapellido ).concat(segundoapellido));
        System.out.println("El nombre completo es: "+nombre +primerapellido +segundoapellido+" y la longuitud es: "+nombre.concat(primerapellido).concat(segundoapellido).length());
        
    }
}
