/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio4;

/**
 *
 * @author carme
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       int[]numeros={1,2,3,4,5,6,7,8,9,10};
       int []numeros2=new int[10];
       for (int i=0;i<numeros.length;i++){
           numeros2[i]=numeros[numeros.length-1-i];
      
       }
        for (int i=0;i<numeros2.length;i++){
            System.out.print(numeros2[i]+" ");
       }
       
        
    }
}
