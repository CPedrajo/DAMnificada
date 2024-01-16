/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio3;

/**
 *
 * @author DAM112
 */
public class Ejercicio3 {

    public static void main(String[] args) {
             
   for (int y=2016; y<=2030;y++){
       int a=y%19;
       int b= y%4;
       int c=y%7;
       int d=(19*a+24)%30;
       int e=(2*b+4*c+6*d+5)%7;
       int n=(22+d+e);
       
       if (n>31){
           n-=31;
           System.out.println("En el año "+y+" el domingo de pascua es "+n+" de abril");
           
       }else{
           System.out.println("En el año "+y+" el domingo de pascua es "+n+" de mayo");
       }
   }
    }
    }

