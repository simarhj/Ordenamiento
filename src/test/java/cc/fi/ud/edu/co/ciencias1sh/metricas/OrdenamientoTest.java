/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cc.fi.ud.edu.co.ciencias1sh.metricas;

import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Estudiantes
 */
public class OrdenamientoTest {
    
    public OrdenamientoTest() {
    }

    /**
     * Test of burbuja method, of class Ordenamiento.
     */
    @org.junit.jupiter.api.Test
    public void testBurbuja() {
        System.out.println("burbuja");
        Comparable[] arr = leerArreglo();
        
        Respuesta result = Ordenamiento.burbuja(arr);
        Respuesta expResult = new Respuesta(result.getDatos(),arr.length*(arr.length-1)/2,result.getPasos());
        
        assertEquals(expResult.getCiclos(), result.getCiclos());
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult.getDatos(), result.getDatos());
    }
    
    private static Comparable[] leerArreglo() {
        Random r = new Random(System.currentTimeMillis());
        Integer arr[] = new Integer[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;
    }
    
}
