/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio7;

import java.util.Arrays;

/**
 *
 * @author carme
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[]numeros={1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(numeros);
        int[]numeros2=new int [numeros.length];
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros2[i]=numeros[numeros.length-1-i]);
        }
     
        
        
      
    }
    
    
}
