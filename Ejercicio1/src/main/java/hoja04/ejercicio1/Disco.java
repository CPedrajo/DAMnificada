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
public class Disco extends Publicacion {
    private int duracionMinutos; 

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int año) {
         super(titulo, autor, dia, mes, año);
        this.duracionMinutos = duracionMinutos;
    }

   

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
     return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", duracion: ,"+ duracionMinutos+ "fecha=" + fecha + '}';
    }
    
    public static String cortanombre(Disco disco){
           return String.format(disco.titulo.substring(0,3).concat(String.format(" %s ", disco.autor)));  
    }
    
    public static Disco maslargo (Publicacion []lista){
        Disco max= null; 
        Disco aux; 
        for (int i= 0;i<lista.length;i++){
            if (lista[i]instanceof Disco){
                aux=(Disco)lista[i]; 
                if (max==null){
                    max=aux;
                }
                if (aux.duracionMinutos>max.duracionMinutos){
                    max=aux;
                }
            }
        }
       return max; 
    }
    public static void dosaños(Publicacion[]lista){
        Disco aux; 
        for (int i=0;i<lista.length;i++){
            if (lista [i] instanceof Disco){
               aux= (Disco)lista[i];
               if (aux.fecha.getYear()>(LocalDate.now().getYear()-2)&& aux.fecha.getYear()< LocalDate.now().getYear()){
                   System.out.println(aux.autor+aux.titulo);
               }
            }
        }
    }
   
    
}
