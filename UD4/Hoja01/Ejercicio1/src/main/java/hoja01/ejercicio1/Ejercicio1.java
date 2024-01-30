/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
       
      int []numeros={-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
      for (int i=0;i<numeros.length;i++){
          numeros[i]=-1;
          System.out.print(numeros[i]+" ");
      }
        System.out.println("");
      for (int i=0;i<numeros.length;i++){
          numeros[i]=(int) Math.floor(Math.random()*10);
          System.out.print(numeros[i]+" ");
      }  
     
      
    }
}
