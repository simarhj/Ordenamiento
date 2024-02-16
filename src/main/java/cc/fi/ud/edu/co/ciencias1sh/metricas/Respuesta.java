/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cc.fi.ud.edu.co.ciencias1sh.metricas;

/**
 *
 * @author Estudiantes
 */
public class Respuesta <T extends Comparable<T>>{

    public Respuesta(T[] datos, int ciclos, int pasos) {
        this.datos = datos;
        this.ciclos = ciclos;
        this.pasos = pasos;
    }
    
    
    
    private T datos[];
    private int ciclos;
    private int pasos;

    /**
     * @return the datos
     */
    public T[] getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(T[] datos) {
        this.datos = datos;
    }

    /**
     * @return the ciclos
     */
    public int getCiclos() {
        return ciclos;
    }

    /**
     * @param ciclos the ciclos to set
     */
    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    /**
     * @return the pasos
     */
    public int getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
    
}
