/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;
import javax.swing.JLabel;

/**
 *
 * @author gabriel
 */
public class Procesos extends Thread{
    String Treadname;
    int tipo;
    JLabel Area;
    JLabel Area2;
    JLabel Area3;
    JLabel Area4;
    Semaphore sem;
    Semaphore sem2;
    Semaphore sem3;
    Semaphore sem4;
    Semaphore pantallas;
    Semaphore Botones;
    Semaphore pinCarga;
    Semaphore camara;
    long dia;
    
    public Procesos(String nombreP,int tipo,JLabel Area,Semaphore sem, Semaphore pantallas,long dia ){
        this.Treadname = nombreP;
        this.Area = Area;
        this.tipo=tipo;
        this.sem = sem;
        this.pantallas = pantallas;
        this.dia=dia;
        
    }
    public Procesos(String nombreB,int tipo,Semaphore sem2,Semaphore botones,JLabel Area2,long dia){
        this.Treadname = nombreB;
        this.Area2 = Area2;
        this.tipo=tipo;
        this.sem2 = sem2;
        this.Botones = botones;
        this.dia=dia;
        
    }
     public Procesos(String nombrePc,int tipo,Semaphore sem3,JLabel Area3,Semaphore pinCarga,long dia){
        this.Treadname = nombrePc;
        this.Area3 = Area3;
        this.tipo=tipo;
        this.sem3 = sem3;
        this.pinCarga = pinCarga;
        this.dia=dia;
     }
     public Procesos(String nombreC,JLabel Area4,int tipo,Semaphore sem4,Semaphore camara,long dia){
        this.Treadname = nombreC;
        this.Area4 = Area4;
        this.tipo=tipo;
        this.sem4 = sem4;
        this.camara = camara;
        this.dia=dia;
     }

     @Override
    public void run(){
    if (tipo == 1) {
        while (true) {
        try{
            sleep(dia);
        System.out.println(this.Treadname);
           cuenta();

        }catch(InterruptedException e){
        }
        }
        }
        if (tipo == 2) {
        while (true) {
        try{
            sleep(dia/2);
        System.out.println(this.Treadname);
           cuenta();

        }catch(InterruptedException e){
        }
        }
        }
        if (tipo == 3) {
        while (true) {
        try{
            sleep(dia*3);
        System.out.println(this.Treadname);
           cuenta();

        }catch(InterruptedException e){
        }
        }
        }
        if (tipo == 4) {
        while (true) {
        try{
            sleep(dia*2);
        System.out.println(this.Treadname);
           cuenta();

        }catch(InterruptedException e){
        }
        }
        }
    }
    synchronized void cuenta() throws InterruptedException{
        if (tipo==1) {
            sem.acquire();
            pantallas.acquire();
            Area.setText(Integer.toString(Integer.parseInt(Area.getText())+1));
            System.out.println(Area.getText());
            sem.release();
        try {
            sleep(10);
        } catch (Exception e) {
        }
        }if (tipo==2) {
            sem2.acquire();
            Botones.acquire();
            Area2.setText(Integer.toString(Integer.parseInt(Area2.getText())+1));
            System.out.println(Area2.getText());
            sem2.release();
        try {
            sleep(10);
        } catch (Exception e) {
        }
        }if (tipo==3) {
            sem3.acquire();
            pinCarga.acquire();
            Area3.setText(Integer.toString(Integer.parseInt(Area3.getText())+1));
            System.out.println(Area3.getText());
            sem3.release();
        try {
            sleep(10);
        } catch (Exception e) {
        }
       
        }
        if (tipo==4) {
            sem4.acquire();
            camara.acquire();
            Area4.setText(Integer.toString(Integer.parseInt(Area4.getText())+1));
            System.out.println(Area4.getText());
            sem4.release();
        try {
            sleep(10);
        } catch (Exception e) {
        }
       
        }

    }
    
}
