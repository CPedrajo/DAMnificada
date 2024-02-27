/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

/**
 *
 * @author carme
 */
public class Tabla {
    private int [][] array = new int [4][5];

    public Tabla() {
        for (int i= 0; i<array.length;i++){
            for (int j = 0; j <array[i].length; j++) {
               array[i][j]= (int) Math.floor(Math.random()*100)+1;
            }
        }
    }
   
    public void mostrar(){
        for(int i= 0; i<array.length;i++){
            for(int j= 0; j<array[i].length;j++){
                System.out.print(array [i][j]+"");
              
            }  System.out.println("");
        }
    }
    public void mayorF(int n){
        int max=0;
        for (int i= 0; i<array[n].length; i++){
            if (array[n][i]>max){
             max= array[n][i];   
            }
        }System.out.println(max);
        
    }
    public void mayorC (int c){
        int max= 0; 
        for (int i=0; i<array.length;i++){
            if (array [i][c]>max){
                max=array [i][c];
            }
        }System.out.println(max);
        
    }
    public int media(){
        int media=0;
        int suma=0;
        int contador=0;
    
        for(int i= 0; i<array.length;i++){
            for(int j= 0; j<array.length;j++){
                suma+=array[i][j];
                contador++;
            }
            media=suma/contador;
    }
   return media;
    } 
}
