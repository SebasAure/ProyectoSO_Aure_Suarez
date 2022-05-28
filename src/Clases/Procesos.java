/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    JLabel Area5;
    JLabel Area6;
    JLabel Area7;
    JLabel Area8;
    JLabel Area9;
    JLabel Area10;
    long dia;
    Semaphore p;
    Semaphore B;
    Semaphore Pc;
    Semaphore C;
    boolean procesado = false;
    Semaphore colitaE;
    Semaphore colitaE2;
    Semaphore colitaE3;
    Semaphore colitaE4;
    JLabel area11;
    JLabel area12;
    JLabel area13;
    
    public Procesos(int tipo,JLabel Area,Semaphore sem, Semaphore pantallas,long dia,Semaphore p,JLabel tiempo ){
        this.Area = Area;
        this.tipo=tipo;
        this.sem = sem;
        this.pantallas = pantallas;
        this.dia=dia;
        this.p=p;
        this.area13=tiempo;
        
    }
    public Procesos(int tipo,Semaphore sem2,Semaphore botones,JLabel Area2,long dia,Semaphore B,JLabel tiempo ){
        this.Area2 = Area2;
        this.tipo=tipo;
        this.sem2 = sem2;
        this.Botones = botones;
        this.dia=dia;
        this.B=B;
        this.area13=tiempo;
    }
     public Procesos(int tipo,Semaphore sem3,JLabel Area3,Semaphore pinCarga,long dia,Semaphore Pc,JLabel tiempo ){
        this.Area3 = Area3;
        this.tipo=tipo;
        this.sem3 = sem3;
        this.pinCarga = pinCarga;
        this.dia=dia;
        this.Pc=Pc;
        this.area13=tiempo;
     }
     public Procesos(JLabel Area4,int tipo,Semaphore sem4,Semaphore camara,long dia,Semaphore C,JLabel tiempo ){
        this.Area4 = Area4;
        this.tipo=tipo;
        this.sem4 = sem4;
        this.camara = camara;
        this.dia=dia;
        this.C=C;
        this.area13=tiempo;
     }
     public Procesos(JLabel p,JLabel b,JLabel pc,JLabel c,JLabel p1,JLabel b2,JLabel pc3,JLabel c4,JLabel E5,JLabel t6,int tipo,long dia,JLabel J7,JLabel G8,JLabel tiempo ){
         this.Area = p;
         this.Area2 = b;
         this.Area3 = pc;
         this.Area4 = c;
         this.Area5 = p1;
         this.Area6 = b2;
         this.Area7= pc3;
         this.Area8 = c4;
         this.Area9 = E5;
         this.Area10 = t6;
         this.tipo = tipo;
         this.dia = dia;
         this.area11 = J7;
         this.area12=G8;
         this.area13=tiempo;
     }
     public Procesos(Semaphore mutex4,Semaphore mutex3,Semaphore mutex2,Semaphore mutex,long dia,int tipo,Semaphore sem,Semaphore sem2,Semaphore sem3,Semaphore sem4,JLabel pantallas,JLabel botones,JLabel pinesc,JLabel camaras,JLabel AreaE,JLabel AreaT,Semaphore pantalla,Semaphore boton,Semaphore pinc,Semaphore camara,JLabel tiempo ){
         this.dia = dia;
         this.tipo =tipo;
         this.sem = sem;
         this.sem2 = sem2;
         this.sem3 = sem3;
         this.sem4 = sem4;
         this.Area=pantallas;
         this.Area2 = botones;
         this.Area3=pinesc;
         this.Area4=camaras;
         this.Area5=AreaE;
         this.Area6=AreaT;
         this.pantallas=pantalla;
         this.Botones=boton;
         this.pinCarga = pinc;
         this.camara=camara;
         this.colitaE = mutex;
         this.colitaE2 = mutex2;
         this.colitaE3 = mutex3;
         this.colitaE4 = mutex4;
         this.area13=tiempo;
                 
     }
     @Override
    public void run(){
        if (tipo == 0) {
        while (Integer.parseInt(area13.getText())!=0) {
        try{
            sleep(dia);
            cuenta();

        }catch(InterruptedException e){
        }
        }
        }
    if (tipo == 1) {
        while (Integer.parseInt(area13.getText())!=0) {
        try{
            if (procesado != true) {
            sleep(dia/2);
            procesado = true;
           cuenta();
            }else{
                cuenta();
            }

        }catch(InterruptedException e){
        }
        }
        }
        if (tipo == 2) {
        while (Integer.parseInt(area13.getText())!=0) {
        try{
            if (procesado != true) {
            sleep(dia/2);
            procesado = true;
           cuenta();
            }else{
                cuenta();
            }

        }catch(InterruptedException e){
        }
        }
        }
        if (tipo == 3) {
        while (Integer.parseInt(area13.getText())!=0) {
        try{
            if (procesado!=true) {
            sleep(dia*3);
            procesado=true;
           cuenta();
            }else{
                cuenta();
            }

        }catch(InterruptedException e){
        }
        }
        }
        if (tipo == 4) {
        while (Integer.parseInt(area13.getText())!=0) {
        try{
            if (procesado!=true) {
            sleep(dia*2);
            procesado=true;
           cuenta();
            }else{
                cuenta();
            }

        }catch(InterruptedException e){
        }
        }
        }
         if (tipo == 5) {
        while (Integer.parseInt(area13.getText())!=0) {
        try{
            if (procesado!=true) {
            sleep(dia*2);
            procesado = true;
           cuenta();
            }else{
                cuenta();
            }

        }catch(InterruptedException e){
        }
        }
        }
    }
    synchronized void cuenta() throws InterruptedException{
        if (tipo==0) {
            Area5.setText(Integer.toString((Integer.parseInt(Area.getText())*3)+Integer.parseInt(Area5.getText())));
            Area6.setText(Integer.toString((Integer.parseInt(Area2.getText())*4)+Integer.parseInt(Area6.getText())));
            Area7.setText(Integer.toString((Integer.parseInt(Area3.getText())*5)+Integer.parseInt(Area7.getText())));
            Area8.setText(Integer.toString((Integer.parseInt(Area4.getText())*5)+Integer.parseInt(Area8.getText())));
            Area10.setText(Integer.toString((Integer.parseInt(Area9.getText())*6)+Integer.parseInt(Area10.getText())));
            area11.setText(Integer.toString(Integer.parseInt(area11.getText())+7));
            area12.setText(Integer.toString(Integer.parseInt(area12.getText())+180));
        try {
            sleep(10);
        } catch (Exception e) {
        }
        }
        if (tipo==1) {
            p.acquire();
             if (pantallas.availablePermits() !=0) { 
            sem.acquire();
            pantallas.acquire();
            Area.setText(Integer.toString(Integer.parseInt(Area.getText())+1));
//            System.out.println(Area.getText());
            sem.release();
            procesado = false;
            p.release();
             }else{
                 wait(1500);
                 p.release();
             }
        try {
            sleep(10);
        } catch (Exception e) {
        }
        }if (tipo==2) {
            B.acquire();
            if (Botones.availablePermits() !=0) {                     
            sem2.acquire();
            Botones.acquire();
            Area2.setText(Integer.toString(Integer.parseInt(Area2.getText())+1));
//            System.out.println(Area2.getText());
            sem2.release();
             procesado = false;
            B.release();
            }else{
                wait(1500);
                B.release();
            }
        try {
            sleep(10);
        } catch (Exception e) {
        }
        }if (tipo==3) {
            Pc.acquire();
            if (pinCarga.availablePermits() !=0) {                        
            sem3.acquire();
            pinCarga.acquire();
            Area3.setText(Integer.toString(Integer.parseInt(Area3.getText())+1));
//            System.out.println(Area3.getText());
            sem3.release();
             procesado = false;
            Pc.release();
            }else{
                wait(1500);
                Pc.release();
            }
        try {
            sleep(10);
        } catch (Exception e) {
        }
       
        }
        if (tipo==4) {
            C.acquire();
            if (camara.availablePermits() !=0) {                     
            sem4.acquire();
            camara.acquire();
            Area4.setText(Integer.toString(Integer.parseInt(Area4.getText())+1));
//            System.out.println(Area4.getText());
            sem4.release();
             procesado = false;
             C.release();
            }else{
                wait(1500);
                C.release();

            }
        try {
            sleep(10);
        } catch (Exception e) {
        }
        }
        if (tipo==5) {
            try {
                colitaE.acquire();
                while (pantallas.availablePermits() > 39) {                     
                }
                sem.acquire();
                pantallas.release(1);
                Area.setText(Integer.toString(Integer.parseInt(Area.getText())-1));
                sem.release();
                colitaE.release();
//                System.out.println(this.Treadname+"agarro pantallas");
                colitaE2.acquire();
                while (Botones.availablePermits()>41) {                        
                }
                sem2.acquire();
                Botones.release(4);
                Area2.setText(Integer.toString(Integer.parseInt(Area2.getText())-4));
                sem2.release();
                colitaE2.release();
//                System.out.println(this.Treadname+"agarro botones");
                colitaE3.acquire();
                while (pinCarga.availablePermits()>14) {                        
                }
                sem3.acquire();
                pinCarga.release();
                Area3.setText(Integer.toString(Integer.parseInt(Area3.getText())-1));
                sem3.release();
                colitaE3.release();
//                System.out.println(this.Treadname+"agarro pin");
                colitaE4.acquire();
                while (camara.availablePermits()>17) {                        
                }
                sem4.acquire();
                camara.release(3);
                Area4.setText(Integer.toString(Integer.parseInt(Area4.getText())-3));
                sem4.release();
                colitaE4.release();
//                System.out.println(this.Treadname+"agarro camara");
                Area6.setText(Integer.toString(Integer.parseInt(Area6.getText())+1));
                procesado=false;
                
                
          
            
             } catch (InterruptedException ex) {
         Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

    


