/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

/**
 *
 * @author carme
 */
public class Circulo {
    private double radio;
    
public Circulo(){ //constructor sin parametros, inicializa valores a 0
    
}
public Circulo (double radio){ // con parametros que inicializa el radio con un valor
    this.radio=radio;
}

public double getRadio() {//metodo que muestra el atributo
    return radio;
    }

public void setRadio(double radio) {//metodo que modifica el atributo
    this.radio = radio;
    }
public double area(){ //metodo que calcula el area
    return Math.PI*Math.pow(radio, 2);
        }  
public double longitud (){//metodo que calcula la longitud
    return 2*Math.PI*radio;
}
}
