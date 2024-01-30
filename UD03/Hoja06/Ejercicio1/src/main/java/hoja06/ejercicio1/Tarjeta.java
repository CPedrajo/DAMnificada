/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

import java.util.Random;

/**
 *
 * @author carme
 */
public class Tarjeta {
    private String nombre;
    private int numero;
    private int pin;
    private Estado estado;
    private double saldo; 
    Random r=new Random();

public Tarjeta (String nombre, int numero, double saldo){
this.nombre=nombre; 
this.numero=numero;
this.saldo=saldo;
estado=estado.bloqueada;
pin=r.nextInt(10000);

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    

public void desbloquea(int pin){

if (this.pin==pin){
    estado=estado.habilitada;
    System.out.println("La tarjeta está desbloqueada");
}else {
    System.out.println("La tarjeta está bloqueada"); 
}
   
}
public void pagar(double compra, int pin, String descripcion, boolean propina){

if (estado==estado.habilitada&&this.pin==pin){
    if(saldo>=compra){
        if(propina==true){
            saldo-=compra*1.05;
            System.out.println(descripcion+" El saldo que queda es: "+saldo);
        }else {
        saldo-=compra;
        System.out.println(descripcion+" El saldo que queda es: "+saldo);
        }    
    }else {
        System.out.println("EL saldo es insuficente. ");
    }
}else{
    System.out.println("WARNING.LA TARJETA ESTÁ BLOQUEADA.");
}
        }


}

