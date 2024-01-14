/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author carme
 */
public class Taller {
    private int aceite, ruedas, contadorCambiosTotales, contadorCambiosParciales;
    
public Taller (int aceite, int ruedas){
        this.aceite=aceite;
        this.ruedas=ruedas; 
        contadorCambiosTotales=0;
        contadorCambiosParciales=0;
        }
public int addAceite (int aceite){
    this.aceite+=aceite*5; 
    return aceite; 
}
public int addRuedas (int ruedas){
    this.ruedas+=ruedas;
    return ruedas;   
    
}

public int getCambiosTotales() {
    return (ruedas/4)>(aceite/3)?(aceite/3):(ruedas/4);
    
    }

public int getCambiosParciales() {
    return(ruedas/2)>(aceite/3)?(aceite/3):(ruedas/2);
  
    }
public void cambioCompleto(){
    ruedas=getCambiosTotales()>=1?ruedas-4:ruedas;
    aceite=getCambiosTotales()>=1?aceite-3:aceite;
    contadorCambiosTotales++; 
}
public void cambioParcial(){
   ruedas=getCambiosParciales()>=1?ruedas-2:ruedas;
   aceite=getCambiosParciales()>=1?aceite-3:aceite;
     
    
    contadorCambiosParciales++;
}


public int getAceite() {
        return aceite;
    }

public int getRuedas() {
        return ruedas;
    }
public String cadenita(){
    double ingresos=contadorCambiosTotales*4.50+contadorCambiosTotales*3*4.50;
    ingresos=ingresos+contadorCambiosParciales*2*60+contadorCambiosParciales*3*5;
    String cadena="TALLER\nEXISTENCIAS: \n\tRuedas:"+getRuedas()+" unidades.\n\tAceite:"+getAceite()+"litros.\nINGRESOS: TOTAL"+ingresos+"€";
    return cadena;
 }


}
