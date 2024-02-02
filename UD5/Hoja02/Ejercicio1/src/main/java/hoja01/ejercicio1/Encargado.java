/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

/**
 *
 * @author DAM112
 */
public class Encargado extends Empleado {

    public Encargado(int sueldo) {
        super(sueldo);
    }

    @Override
    public int getSueldo() {
        return (int) (super.getSueldo()*1.1);
    }
    
    
}
