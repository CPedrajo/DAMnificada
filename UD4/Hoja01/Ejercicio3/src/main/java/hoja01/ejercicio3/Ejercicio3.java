/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner t;
        int []numero={1,2,3,4,5,6,7,8,9,10};
        int x=new Scanner(System.in).nextInt();
        for (int i=0;i<numero.length;i++){
            if (x==numero[i]){
                System.out.println("El numero coincide en la posicion "+i);
            }else{
                System.out.println("Numero no encontrado");
            }
        }
        
    }
}
