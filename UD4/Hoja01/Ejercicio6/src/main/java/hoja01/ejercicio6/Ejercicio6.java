/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio6;

/**
 *
 * @author carme
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int []numeros={1,2,3,4,5,6,7,8,9,50};
        int max=0;
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]>max){
                max=numeros[i];
            }
        }
        System.out.println(max);
    }
}
