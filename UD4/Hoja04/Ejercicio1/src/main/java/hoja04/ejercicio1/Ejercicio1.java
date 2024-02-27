/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja04.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int matriz[][] = {{101, 102, 103, 104, 105},
        {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305},
        {401, 402, 403, 404, 405},
        {501, 502, 503, 504, 505}};
        Scanner t;

        int option = 0;
        do {

            System.out.println("Introduce un numero: ");
            option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Elige fila ");
                    int fila = new Scanner(System.in).nextInt();
                    System.out.println("( ");
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println(matriz[fila - 1][i] + "");

                    }
                    System.out.println(")");
                }
                case 2 -> {
                    System.out.println("Elige columna ");
                    int c = new Scanner(System.in).nextInt();
                    System.out.println("( ");
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println(matriz[i][c - 1] + "");

                    }
                    System.out.println(")");
                }
                case 3 -> {
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println(matriz[i][i] + " ");

                    }
                    System.out.println(" ");
                }
                case 4 -> {
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println(matriz[i][matriz.length - 1 - i] + " ");
                    }
                    System.out.println(" ");
                }
                case 5 -> {
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println(matriz[matriz.length-1-i][matriz.length-1-i] + " ");
                    }
                    System.out.println(" ");
                }
                case 0 ->{
                    System.out.println("Salir");
                }
                default -> {
                    System.out.println("Introduce un numero valido");
                }
                    

            }
        } while (option != 0);

    }
}
