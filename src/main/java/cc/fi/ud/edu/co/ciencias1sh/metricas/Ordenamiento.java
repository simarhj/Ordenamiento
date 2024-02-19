/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cc.fi.ud.edu.co.ciencias1sh.metricas;

/**
 *
 * @author Estudiantes
 */
public class Ordenamiento {
    
    public static Respuesta burbuja(Comparable arr[]){
        int ciclos = 0, pasos = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-(i+1); j++) {
                ciclos++;
                if(arr[j].compareTo(arr[j+1])>0){
                    Comparable aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                    pasos+=3;
                } 
                pasos+=3;
            }
            pasos+=4;
        }
        pasos+=2;
        Respuesta r = new Respuesta(arr,ciclos,pasos);
        return r;
    }
    
    public static Respuesta insercion(Comparable arr[]){
        int ciclos = 0, pasos = 0;
        for (int i = 1; i < arr.length; i++) {
            Comparable dato = arr[i];
            for (int j = i-1; j >= 0; j--) {
                ciclos++;
                if(arr[j].compareTo(dato)>0){
                    arr[j+1]= arr[j];
                    if(j==0)
                        arr[j] = dato;
                    pasos++;
                } else{
                    arr[j+1] = dato;
                    pasos++;
                    break;
                }
                pasos+=3;
            }
            pasos+=5;
        }
        pasos+=2;
        Respuesta r = new Respuesta(arr,ciclos,pasos);
        return r;
    }
    
    public static Respuesta monticulos(Comparable arr[]){
        Respuesta res = new Respuesta(arr, 0, 0);
        for(int i=arr.length/2-1; i>=0; i--){
            treeHeap(i,arr.length,arr, res);
        }
        for (int i = arr.length-1; i >= 0; i--) {
            intercambiar(0, i, arr);
            treeHeap(0, i, arr, res);
        }
        
        return res;
    }
    
    public static void treeHeap(int pos, int tam,Comparable arr[], Respuesta res){
        res.setCiclos(res.getCiclos()+1);
        int hi = pos*2+1;
        int hd = pos*2+2;
        int mayor = pos;
        if(hi<tam && arr[hi].compareTo(arr[mayor])>=0 ){
            mayor = hi;
        }
        if(hd<tam && arr[hd].compareTo(arr[mayor])>=0){
            mayor = hd;
        }
        
        if(mayor != pos){
            Comparable aux = arr[mayor];
            arr[mayor] = arr[pos];
            arr[pos] = aux;
            treeHeap(mayor, tam, arr, res);
        }
    }

    private static void intercambiar(int i, int i0, Comparable[] arr) {
        Comparable aux = arr[i];
        arr[i] = arr[i0];
        arr[i0] = aux;
    }
    
}
