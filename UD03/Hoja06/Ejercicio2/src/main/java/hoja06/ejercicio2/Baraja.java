/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio2;

import java.util.Random;

/**
 *
 * @author carme
 */
public class Baraja {
    private int numero;
    private int palo; 
    Random r= new Random ();
    
public Baraja (){
    numero=r.nextInt(10)+1;
    palo=(int) (Math.floor(Math.random()*4)+1);
    
    
}
public String mostrar(){
    String cadena="";
            switch(palo){
        case 1->{
            cadena+="La carta es el "+numero+" de oros";
        }
         case 2->{
            cadena+="La carta es el "+numero+" de bastos";
        }
          case 3->{
            cadena+="La carta es el "+numero+" de copas";
        }
          case 4->{
            cadena+="La carta es el "+numero+" de espadas";
        }
            
    }
            return cadena;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }
    


           
}
