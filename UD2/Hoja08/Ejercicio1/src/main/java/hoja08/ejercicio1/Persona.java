/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio1;

/**
 *
 * @author carme
 */
public class Persona {
    private String nombre, apellido1, apellido2, dni; 
    
public Persona (String nombre, String apellido1, String apellido2, String dni){
    this.nombre=nombre;
    this.apellido1=apellido1;
    this.apellido2=apellido2;
    this.dni=dni.toUpperCase();
    
} 
public String clave (){
    String contraseña= nombre.substring(0).concat(apellido1.substring(0, 3)).concat(apellido2.substring(apellido2.length()-1));
    return contraseña;
}

public boolean dniValido(){
    String cadena= "BCDFGHJKLMNPQRSTVWXYZ"; 
    boolean valido=(dni.length()==9)&&(cadena.contains(dni.substring(dni.length()-1)));
    return valido;
}
}
