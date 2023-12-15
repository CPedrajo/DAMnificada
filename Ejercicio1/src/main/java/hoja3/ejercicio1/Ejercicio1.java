/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio1;

/**
 * Diseña una clase denominada Fondo, con tres atributos privados:
• C: representa el capital del fondo, es de tipo double
• I: representa el interés del fondo, es de tipo double
• N: representa los años que vamos a tener el capital en el fondo, es de tipo entero.
Como métodos tendrá un constructor por parámetros que inicializa los tres atributos, y un
método denominado evolución, donde muestra para cada año el interés alcanzado y el capital
acumulado.
La fórmula para el cálculo del capital en cada año es: Cfinal=C+(C*I/100*N), siendo N el número
de años.
Prueba la clase Fondo desde el programa principal.
 *
 * @author DAM112
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Fondo f= new Fondo (100,50,5);
        f.evolucion();
        
        
    }
}
