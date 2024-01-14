/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja09.ejercicio1;

/**
 *
 * @author carme
 */
public class Alarma {
    private double temperatura;
     private Timbre timbre;
    
    
public Alarma (double temperatura){
    this.temperatura=temperatura;
    timbre=Timbre.APAGADO;
    
}

    public double getTemperatura() {
        return temperatura;
    }

public Timbre comprueba(){
   timbre= temperatura>35||temperatura<10?timbre.ENCENDIDO:timbre.APAGADO;
return timbre;
}    
public Timbre normaliza(){
    temperatura=timbre==timbre.ENCENDIDO?25:temperatura;
    return timbre.APAGADO;
}

}
