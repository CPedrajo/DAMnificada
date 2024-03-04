/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Empleado {
    private String nombre; 
    private String departamento;
    private int edad;
    private boolean casado;
    private double salario; 

    
    

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    public Empleado() {
        Scanner t;
        System.out.println("Introduce los datos: ");
        System.out.println("Introduce el nombre");
        nombre= new Scanner (System.in).nextLine();
        System.out.println("Introduce el departamento");
        departamento=new Scanner (System.in).nextLine();
        System.out.println("Introduce la edad");
        edad= new Scanner (System.in).nextInt();
        System.out.println("Estado civil: true o false");
        casado= new Scanner (System.in).nextBoolean(); 
        System.out.println("Introduce el salario: ");
        salario= new Scanner (System.in).nextDouble(); 
        
                }
    
    

    
   
    
    
    
}

