/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author carmen
 */
public class Perecedero extends Articulo {
    private static int mes, año; 

    public Perecedero(int mes, int año, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.mes = mes;
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    

       @Override
    public String toString() {
        return super.toString().concat(String.format("Fecha De Caducidad: %d-%d\n", mes, año));
    }
    
    public static void caducados(Articulo[] cad){
        
        for (int i=0; i<cad.length;i++){
            if(cad[i] instanceof Perecedero &&(año<LocalDate.now().getYear() || (año==LocalDate.now().getYear()&& mes<LocalDate.now().getMonthValue()))){
            
                System.out.println(cad[i].toString());
            
                    }
        }
        
    }

    

   
        
        
       
    
    
}
