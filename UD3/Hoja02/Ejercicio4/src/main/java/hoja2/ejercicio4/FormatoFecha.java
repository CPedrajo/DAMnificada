/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio4;

/**
 *
 * @author carme
 */
public class FormatoFecha {
    int dia, diasem, mes, año; 
    
public FormatoFecha (int dia, int diasem, int mes, int año){
    this.dia=dia;
    this.diasem=diasem;
    this.mes=mes;
    this.año=año; 
   
}
private String ObtenerDiaSemana() {
    String cadena;
        cadena = switch (diasem) {
            case 1 ->"Lunes";
            case 2 -> "Martes";               
            case 3 -> "Miercoles";               
            case 4 ->"Jueves";                
            case 5 ->  "Viernes";              
            case 6 -> "Sabado";               
            case 7 -> "Domingo";       
            default ->"no fecha";
        };
        return cadena;
}
private String obtenerMes(){
        String cadena;
        cadena = switch(mes){
            case 1->"Enero";            
            case 2 -> "Febrero";               
            case 3 -> "Marzo";               
            case 4 ->"Abril";                
            case 5 ->  "Mayo";              
            case 6 -> "Junio";               
            case 7 -> "Julio";      
            case 8 ->"Agosto";
            case 9 -> "Septiembre";               
            case 10 -> "Octubre";               
            case 11 ->"Noviembre";                
            case 12 ->  "Diciembre";     
            default -> "no fecha";
        };
        return cadena;
    }
 public void salidaFormatoFecha(){
        if ((dia<31)&&!("no fecha".equals(ObtenerDiaSemana()))&&!("no fecha".equals(obtenerMes()))){
            System.out.println(ObtenerDiaSemana()+", "+dia+" de "+obtenerMes()+" de "+año);            
        }
        else{
            System.out.println("fecha no valida");
        }
    }

}
