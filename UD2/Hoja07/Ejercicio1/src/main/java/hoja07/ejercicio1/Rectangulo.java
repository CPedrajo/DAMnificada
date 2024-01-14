/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja07.ejercicio1;

/**
 *
 * @author carme
 */
public class Rectangulo {
    private int largo, ancho;
    
public Rectangulo (){
    
}
public Rectangulo (int largo, int ancho){
    this.largo=largo;
    this.ancho=ancho;
}

public int getLargo() {
        return largo;
    }

public void setLargo(int largo) {
        this.largo = largo;
     
    }

public int getAncho() {
        return ancho;
    }

public void setAncho(int ancho) {
        this.ancho = ancho;
    }
public double area (){
    return getAncho()*getLargo();
    
}
public float diagonal(){
float diagonal= (float) Math.sqrt(Math.pow(largo, 2)+Math.pow(ancho,2));
return diagonal;

}
    
}
