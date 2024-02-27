/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.time.LocalDate;



/**
 *
 * @author carme
 */
public class Libro extends Publicacion {
    private int numPaginas; 

    public Libro(int numPaginas, String titulo, String autor, int dia, int mes, int año) {
        super(titulo, autor, dia, mes, año);
        this.numPaginas = numPaginas;
    }

    

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
     return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", numero de paginas: ,"+ numPaginas + "fecha=" + fecha + '}';

    }
    public static void librolargo(Publicacion []lista){
       Libro aux; 
        System.out.println("Libros mas largos de este mes: ");
        for (int i=0;i<lista.length;i++){
            if (lista[i]instanceof Libro){
                aux=(Libro) lista[i];
               
                if(aux.fecha.getYear()==LocalDate.now().getYear()&& aux.fecha.getMonthValue()==LocalDate.now().getMonthValue()){
                    if( aux.numPaginas>1000){
                       System.out.println(aux.toString()); 
                    }
                    
                }
            }
        }
        
    }


    
    
    
}
