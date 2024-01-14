/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio7;

/**
 *
 * @author carme
 */
public class Operaciones {
    int numero; 
    
public Operaciones (int numero){
    this.numero=numero;
}
public void cifras (){
    int c= String.valueOf(numero).length();
    System.out.println("El numero "+numero+" tiene "+c+ " cifras");
    
}
public void multiplos(){
    for (int x=1;x<=10;x++){
        System.out.println(numero+ "x" +x+ "="+numero*x); 
        
    }
}
public void perfecto (){
    int suma=0; 
    for (int x=1;x<numero;x++){
        if (numero%x==0){
            suma+=x;
        }
    }
       if (suma==numero){
           System.out.println("El numero es perfecto. ");
       }else{
           System.out.println("El numero no es perfecto");
       }
}


}
