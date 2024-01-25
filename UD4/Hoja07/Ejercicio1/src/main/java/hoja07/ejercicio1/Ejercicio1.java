/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja07.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
    Alumno a=new Alumno("Carmen");
    int []mejores;
        System.out.println( "La nota mas alta es: "+a.mayor());
        System.out.println("La nota más baja es: "+a.menor()); 
        System.out.println("El cinco está en la posición: "+a.buscar(5));
        
        System.out.println("Las tres mejores notas son: ");
        mejores=a.tresMejores();
        for(int i=0;i<mejores.length;i++){
            if (i==0){
                System.out.println(mejores[i]);
            }else{
                System.out.println(" / "+mejores[i]);
            }
        }System.out.println("");
    a.ponerACero();    
    a.getNotas();
    
    
    }
}
