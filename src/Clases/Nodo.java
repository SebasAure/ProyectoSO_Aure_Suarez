/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author gabriel
 */
public class Nodo<T> {
    Procesos proceso;
    Nodo<T> siguiente;

    public Nodo() {
        this.proceso = proceso;
        this.siguiente = siguiente;
    }

    public Procesos getproceso() {
        return proceso;
    }

    public void setproceso(Procesos proceso) {
        this.proceso = proceso;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
    
}