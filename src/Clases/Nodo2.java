/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author sebas
 */
public class Nodo2<T> {
    ProcesosFab1 proceso;
    Nodo2<T> siguiente;

    public Nodo2() {
        this.proceso=proceso;
        this.siguiente = siguiente;
    }


    public ProcesosFab1 getproceso() {
        return proceso;
    }

    public void setproceso(ProcesosFab1 proceso) {
        this.proceso = proceso;
    }

    public Nodo2<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo2<T> siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
    
}

