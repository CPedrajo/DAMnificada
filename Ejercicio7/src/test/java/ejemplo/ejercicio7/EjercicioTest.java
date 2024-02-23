/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejemplo.ejercicio7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carme
 */
public class EjercicioTest {
    
    public EjercicioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Ejercicio.
     */
    @Test
    public void testSumar1() {
        System.out.println("sumar");
        int a = 2;
        int b = 5;
        Ejercicio instance = new Ejercicio();
        int expResult = 7;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testSumar2(){
        System.out.println("sumar2: test corto");
        Ejercicio instance = new Ejercicio();
        assertEquals (7, instance.sumar(2,5));
    }

    /**
     * Test of concatenar method, of class Ejercicio.
     */
    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String s1 = "Carmen ";
        String s2 = "Pedrajo";
        Ejercicio instance = new Ejercicio();
        String expResult = "Carmen Pedrajo";
        String result = instance.concatenar(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testConcatenar2(){
        System.out.println("concatenar2: test corto");
        Ejercicio instance = new Ejercicio();
        assertEquals ("Carmen Pedrajo", instance.concatenar("Carmen ", "Pedrajo"));
    }

    /**
     * Test of getArray method, of class Ejercicio.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        Ejercicio instance = new Ejercicio();
        int[] expResult = {1,2,3,4,5};
        int[] result = instance.getArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetArray2(){
        System.out.println("getArray2: test corto");
        Ejercicio instance= new Ejercicio();
        assertArrayEquals (new int[] {1,2,3,4,5},instance.getArray());
    }
    /**
     * Test of esMayorQueCero method, of class Ejercicio.
     */
    @Test
    public void testEsMayorQueCero() {
        System.out.println("esMayorQueCero");
        int numero = -1;
        Ejercicio instance = new Ejercicio();
        boolean expResult = false;
        boolean result = instance.esMayorQueCero(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testEsMayorQueCero1(){
        System.out.println("esmayorquecero1: test corto");
        Ejercicio instance = new Ejercicio();
        assertFalse (instance.esMayorQueCero(-1));
    }
    @Test
    public void testEsMayorQueCero2(){
        System.out.println("esMayorQueCero : test corto");
        Ejercicio instance = new Ejercicio (); 
        assertTrue (instance.esMayorQueCero(2));
    }

    /**
     * Test of obtenerNulo method, of class Ejercicio.
     */
    @Test
    public void testObtenerNulo() {
        System.out.println("obtenerNulo");
        Ejercicio instance = new Ejercicio();
        Object expResult = null;
        Object result = instance.obtenerNulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test 
    public void testObtenerNulo1(){
        System.out.println("obtenerNulo: test corto");
        Ejercicio instance = new Ejercicio();
        assertNull(instance.obtenerNulo()); 
    }

    /**
     * Test of getObjeto method, of class Ejercicio.
     */
    @Test
    public void testGetObjeto() {
        String casa="hola";
        System.out.println("getObjeto");
        Ejercicio instance = new Ejercicio();
        Object expResult = "hola";
        Object result = instance.getObjeto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test 
    public void testGetObjeto1(){
        System.out.println("getObjeto");
        Ejercicio instance = new Ejercicio();
        assertNotNull (instance.getObjeto());
    }
    
}
