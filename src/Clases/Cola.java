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
public class Cola<T> {
   Nodo<T> pfirst;
   Nodo<T> plast;
   int size;

    public Cola() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }

    public Nodo<T> getPfirst() {
        return pfirst;
    }

    public void setPfirst(Nodo<T> pfirst) {
        this.pfirst = pfirst;
    }

    public Nodo<T> getPlast() {
        return plast;
    }

    public void setPlast(Nodo<T> plast) {
        this.plast = plast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
   
   public boolean esta_vacia(){
       return size==0;
   }
   
   public Procesos Leer_cabeza(){
       return pfirst.getproceso();
   }
   
   public void Encolar(Procesos proceso){
       Nodo nuevo_nodo= new Nodo();
       nuevo_nodo.setproceso(proceso);
       
       if (pfirst==null) {
           pfirst=nuevo_nodo;
       }
       else{
           plast.setSiguiente(nuevo_nodo);
       }
       plast= nuevo_nodo;
       size++;
   }
   
   public void Desencolar(){
       pfirst=pfirst.getSiguiente();
       size--;
       if (pfirst==null) {
           plast=null;
       }
       
       
   }
   
   public String imprimirCola(){
       String cadena="";
       Nodo aux= pfirst;
           while (aux!=null) {            
            cadena= cadena + aux.getproceso()+ ", ";
               aux= aux.getSiguiente();
        }
           return cadena;
   }
}