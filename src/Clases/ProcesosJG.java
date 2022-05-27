/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author gabriel
 */
public class ProcesosJG extends Thread{
    JLabel countdown;
    Semaphore modCountdown;
    String CR = "El jefe esta jugando Clash royale";
    String trabajo = "El jefe esta trabajando";
    String modC = "El jefe esta disminuyendo el contador";
    JLabel accion;
    JLabel dias;
    long dia;
    int actual;
    int tipo;
    JLabel tlf;
    
    public ProcesosJG(int tipo,long dia,Semaphore mod,JLabel countdown,JLabel accion){
        this.modCountdown = mod;
        this.countdown = countdown;
        this.accion=accion;
        this.dias=dias;
        this.dia=dia;
        this.actual=Integer.parseInt(countdown.getText())+1;
        this.tipo=tipo;
        
    }
    public ProcesosJG(long dia,int tipo,Semaphore mod,JLabel accion,JLabel countdown,JLabel tlf){
        this.modCountdown = mod;
        this.countdown = countdown;
        this.accion=accion;
        this.dias=dias;
        this.dia=dia;
        this.actual=Integer.parseInt(countdown.getText())+1;
        this.tipo=tipo;
        this.tlf=tlf;
        
    }
    public ProcesosJG(long dia,JLabel count,int tipo){
        this.tipo=tipo;
        this.countdown=count;
        this.dia=dia;
    }
     public void run(){
         if (tipo==1) {
        try {
            while (true) {   
                if (Integer.parseInt(countdown.getText())!=actual) {       
                modCountdown.acquire();
                accion.setText(modC);
                sleep(dia/4);
                actual--;
                modCountdown.release();
                }
                accion.setText(CR);
                sleep(dia/72);
                accion.setText(trabajo);
                sleep(dia/72);
                
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
         if (tipo==2) {
             while (true) {                 
                 try {
                     sleep(dia);
                     countdown.setText((Integer.toString((Integer.parseInt(countdown.getText()))-1)));
                 } catch (InterruptedException ex) {
                     Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
             
         }
         if (tipo==3) {
             while (true) {                 
//                    if (Integer.parseInt(countdown.getText())!=actual) { 
//                        if (modCountdown.tryAcquire()==false) {
//                            accion.setText("Esperando para leer el cartel");
//                        }
//                        try {
//                            modCountdown.acquire();
//                            if (Integer.parseInt(countdown.getText())==0) {
//                                tlf.setText("0");
//                                modCountdown.release();
//                            }    
//                            modCountdown.release();
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
                     try {
                        accion.setText("Dando vueltas por la fabrica");
                        long max=dia/16;
                        long min=dia/48;
                        int tiempo = (int)(Math.random()*(max-min+1)+min);
                        sleep(tiempo);
                        accion.setText("Revisando al jefe");
                         sleep(100);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
                     }
             }
         }
     }
    
}
