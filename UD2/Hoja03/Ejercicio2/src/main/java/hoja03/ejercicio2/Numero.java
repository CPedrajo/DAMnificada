/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio2;

/**
 *
 * @author carme
 */
public class Numero {
    private int numero; 
    
public Numero (){
    
}
public Numero (int numero){
this.numero=numero;    
}
public void suma(int numero){
   int suma =this.numero+numero;
    System.out.println("El resultado es: "+suma);
}
public void resta(int numero){
   int resta=this.numero-numero; 
    System.out.println("El resultado es: "+resta);
}
public int doble (){
    return numero*2;
}
public int triple (){
    return numero*3;
}

public void setNumero(int numero) {
        this.numero = numero;
    }

}
