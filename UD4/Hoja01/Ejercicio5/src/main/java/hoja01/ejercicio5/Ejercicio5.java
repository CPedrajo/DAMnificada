/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio5;

/**
 *
 * @author carme
 */
public class Ejercicio5 {

    public static void main(String[] args) {
     int [] numeros={1,2,3,4,5,6,7,8,9,10};
     int [] numeros2;
     numeros2=numeros;
     for (int i=0;i<numeros2.length;i++){
         System.out.print(numeros2[i]+" ");
     }System.out.println("");
     for (int i=0;i<numeros.length;i++){
         numeros[i]=numeros2[numeros2.length-1-i];
        
     }
     for (int i=0;i<numeros.length;i++){
         System.out.print(numeros[i]+" ");
     }
    }
}
