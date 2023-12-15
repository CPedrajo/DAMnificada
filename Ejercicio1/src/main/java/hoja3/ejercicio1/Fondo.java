/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author DAM112
 */
public class Fondo {
    private double c, i; 
    private int n;
    
public Fondo(double c, double i, int n){
    this.c=c;
    this.i=i;
    this.n=n; 
}
public void evolucion (){
    int p=1;
    while(p<=n){
    double interes= (c*i/100*p);
    double Cfinal=c+interes; 
    
        System.out.println("EL interes es: "+interes+" la cantidad final es: "+Cfinal);
        p++;
    
    
    }
}
}
