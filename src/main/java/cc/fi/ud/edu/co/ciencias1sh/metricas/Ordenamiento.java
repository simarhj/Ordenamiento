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
        treeHeap(0,arr.length,arr);
        return null;
    }
    
    public static void treeHeap(int pos, int tam,Comparable arr[]){
        int hi = pos*2+1;
        int hd = pos*2+2;
        if(hi<tam){
            treeHeap(hi,tam,arr);
            if(hd<tam){
                treeHeap(hd,tam,arr);
                if(arr[hi].compareTo(arr[pos])>0&&arr[hi].compareTo(arr[hd])>0){
                    Comparable aux = arr[hi];
                    arr[hi] = arr[pos];
                    arr[pos] = aux;
                }else{
                    if(arr[hd].compareTo(arr[pos])>0&&arr[hd].compareTo(arr[hi])>0){
                        Comparable aux = arr[hi];
                        arr[hi] = arr[pos];
                        arr[pos] = aux;
                    }
                }
            }else{
                if(arr[hi].compareTo(arr[pos])>0){
                    Comparable aux = arr[hi];
                    arr[hi] = arr[pos];
                    arr[pos] = aux;
                }
            }
        }
    }
    
}
