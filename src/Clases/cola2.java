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
public class cola2<T> {
     Nodo2<T> pfirst;
   Nodo2<T> plast;
   int size;

    public cola2() {
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }

    public Nodo2<T> getPfirst() {
        return pfirst;
    }

    public void setPfirst(Nodo2<T> pfirst) {
        this.pfirst = pfirst;
    }

    public Nodo2<T> getPlast() {
        return plast;
    }

    public void setPlast(Nodo2<T> plast) {
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
   
   public ProcesosFab1 Leer_cabeza(){
       return pfirst.getproceso();
   }
   
   public void Encolar(ProcesosFab1 proceso){
       Nodo2 nuevo_nodo= new Nodo2();
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
   

}
