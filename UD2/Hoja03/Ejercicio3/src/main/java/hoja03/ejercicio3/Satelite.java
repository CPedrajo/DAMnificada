/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio3;

/**
 *
 * @author carme
 */
public class Satelite {
    private int meridiano, paralelo, distancia; 
    
    
public Satelite (){
    
}
public Satelite (int meridiano, int paralelo, int distancia){
    this. meridiano=meridiano;
    this.paralelo=paralelo;
    this.distancia=distancia;
    
}
public void printPosicion (){
    System.out.println("el satelite se encuentra en el meridiano: "+meridiano+", el paralelo: "+paralelo+", a una distancia de la tierra de: "+distancia+" m."); 
}
public int variarAltura (double desplazamiento){
   distancia += desplazamiento;
    return distancia;
}
public void variarPosicion (int meridiano, int paralelo){
    this.meridiano=meridiano;
    this.paralelo=paralelo;
    
    
}
public boolean enOrbita (){
    return distancia>16000;
}
}
