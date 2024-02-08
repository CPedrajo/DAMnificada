/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio2;

/**
 *
 * @author carmen
 */
public class Ejercicio2 {

    public static void main(String[] args) {
     Articulo [] articulos= new Articulo[10]; 
     
     articulos[0]= new Perecedero(1,2023,01,25.5,"comprado");
     articulos[1]= new Perecedero(1,2023,02,25.5,"comprado");
     articulos[2]= new Perecedero(2,2024,03,25.5,"comprado");
     articulos[3]= new Perecedero(3,2024,04,25.5,"comprado");
     articulos[4]= new Perecedero(1,2024,05,25.5,"comprado");
     
     articulos[5] = new EnPromocion (1.9,06,20,"compra"); 
     articulos[6] = new EnPromocion (1.9,07,20,"compra"); 
     articulos[7] = new EnPromocion (1.9,8,20,"compra"); 
     articulos[8] = new EnPromocion (1.9,9,20,"compra"); 
     articulos[9] = new EnPromocion (1.9,10,20,"compra"); 
    
     
     
    /* for (Articulo articulo : articulos){ 
            System.out.println(articulo.toString());
}
     for (Articulo articulo : articulos){ 
        System.out.println(Articulo.enProm(articulos));
     }*/
     
      for (int i=0; i<articulos.length; i++){ 
      if(articulos[i] instanceof Perecedero){
          Perecedero.caducados(articulos);
      }
      }
     
     
    }
  
    
    
    
}
