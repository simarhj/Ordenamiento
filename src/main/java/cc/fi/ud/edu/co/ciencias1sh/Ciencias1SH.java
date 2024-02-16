/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cc.fi.ud.edu.co.ciencias1sh;

import cc.fi.ud.edu.co.ciencias1sh.metricas.Ordenamiento;
import cc.fi.ud.edu.co.ciencias1sh.metricas.Respuesta;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Ciencias1SH {

    public static void main(String[] args) {
        Comparable arr[] = leerArreglo();
        Comparable arr2[] = leerArreglo2();
        Comparable arr3[] = leerArreglo3();
        Respuesta res = Ordenamiento.monticulos(arr);
        System.out.println("ciclos: "+res.getCiclos());
        System.out.println("pasos: "+res.getPasos());
        for (Comparable dato : res.getDatos()) {
            System.out.println("arr: "+dato);
        }
    }

    private static Comparable[] leerArreglo() {
        Random r = new Random(System.currentTimeMillis());
        Integer arr[] = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000);
        }
        return arr;
    }
    
    private static Comparable[] leerArreglo2() {
        Integer arr[] = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
    private static Comparable[] leerArreglo3() {
        Integer arr[] = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i;
        }
        return arr;
    }
}
