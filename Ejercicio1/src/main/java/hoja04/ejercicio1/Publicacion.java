/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.time.LocalDate;

import java.util.Scanner;



/**
 *
 * @author carme
 */
public abstract class Publicacion {
    protected String titulo;
    protected String autor;
    protected   LocalDate fecha; 

    public Publicacion(String titulo, String autor, int dia, int mes, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(año, mes, dia);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public abstract String toString() ; 

    public static Publicacion crear(int n){
        Publicacion p= null;
        Scanner t; 
        System.out.println("Introduce un titulo: ");
        String titulo= new Scanner (System.in).nextLine();
        
        System.out.println("Introduce un autor: ");
        String autor= new Scanner (System.in).nextLine();
        
         System.out.println("Introduce año: ");
        int año= new Scanner (System.in).nextInt();
        
        System.out.println("Introduce mes: ");
        int mes= new Scanner (System.in).nextInt();
        
        System.out.println("Introduce dia: ");
        int dia= new Scanner (System.in).nextInt();
        
        if (n==1){
            System.out.println("Duracion del disco: ");
            int duracionMinutos= new Scanner (System.in).nextInt();
            p= new Disco (duracionMinutos, titulo, autor, dia, mes, año); 
        }else if (n==2){
             System.out.println("Paginas del libro: ");
            int numPaginas= new Scanner (System.in).nextInt();
            p= new Libro (numPaginas, titulo, autor, dia, mes, año); 
        }
        return p;
    }
    
    
}
