/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio1;

import java.util.Random;

/**
 *
 * @author carme
 */
public class Tarjeta {

    Random r = new Random();
    private static String nombre;
    private static String cuenta;
    private static int pin;
    private static boolean habilitada, propina;
    private static double saldo, compra;

    public Tarjeta(String nombre, String cuenta, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        habilitada = false;
        pin = r.nextInt(10000);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean desbloquea(int pin) {
        if (this.pin == pin) {
            habilitada = true;
        } else {
            System.out.println("El PIN es incorrecto");
        }
        return habilitada;
    }

    public void pagar(double importe, int pin, String descripcion, boolean propina) {
        compra = importe;
        if (habilitada == true && pin == this.pin && saldo >= importe) {

            if (propina == true) {
                importe *= 1.05;
            }
            saldo -= importe;
            imprimirTicket(descripcion, propina);
        } else if (this.pin != pin) {
            System.out.println("El PIN es incorrecto");
        } else if (habilitada == false) {
            System.out.println("La tarjeta está bloqueada");
        } else if (saldo < importe) {
            System.out.println("El saldo es insuficiente");
        }
    }

    private static void imprimirTicket(String descripcion, boolean propina) {
        System.out.println("EL nombre del titular es: " + nombre);
        System.out.println("Los cuatro primeros caracteres de la cuenta: " + cuenta.substring(cuenta.length() - 4) + "**** ****");
        System.out.println("Descripción: " + descripcion.substring(0, 8));
        System.out.println("El valor de la compra " + compra);
        if (propina == true) {
            System.out.println("Propina: " + compra * 0.05);
            System.out.println("TOTAL A PAGAR: " + compra * 1.05);
        } else {
            System.out.println("Propina: ");
            System.out.println("TOTAL A PAGAR: " + compra);
        }

    }
}
