/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Button;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author gabriel
 */
public class ProcesosJG extends Thread{
    public boolean stop;
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
    JLabel accjefe;
    int ruta=0;
    JLabel sueldop;
    JLabel sueldob;
    JLabel sueldopc;
    JLabel sueldoc;
    JLabel sueldoe;
    JLabel $jefe;
    JLabel sueldog;
    JLabel tlfs;
    JLabel gastos;
    JLabel ganacias;
    JLabel neto;
    JButton boton;
    
    public ProcesosJG(int tipo,long dia,Semaphore mod,JLabel countdown,JLabel accion){
        this.stop=true;
        this.modCountdown = mod;
        this.countdown = countdown;
        this.accion=accion;
        this.dias=dias;
        this.dia=dia;
        this.actual=Integer.parseInt(countdown.getText())+1;
        this.tipo=tipo;
        
    }
    public ProcesosJG(long dia,int tipo,Semaphore mod,JLabel accion,JLabel countdown,JLabel tlf,JLabel accionjefe,JLabel saldojefe){
        this.stop=true;
        this.modCountdown = mod;
        this.countdown = countdown;
        this.accion=accion;
        this.dias=dias;
        this.dia=dia;
        this.actual=Integer.parseInt(countdown.getText())+1;
        this.tipo=tipo;
        this.tlf=tlf;
        this.accjefe = accionjefe;
        this.$jefe = saldojefe;
        
    }
    public ProcesosJG(long dia,JLabel count,int tipo){
        this.stop=true;
        this.tipo=tipo;
        this.countdown=count;
        this.dia=dia;
    }
    public ProcesosJG(int tipo,JLabel gastoP,JLabel gastoB,JLabel gastoPC,JLabel gastoC,JLabel sueldoJ,JLabel sueldoG,JLabel tlf,JLabel gastos,JLabel ganacias,JLabel neto,JLabel countdown,JLabel sueldoe,JButton boton){
      this.stop=true;
       this.tipo=tipo;
      this.sueldop = gastoP;
      this.sueldob = gastoB;
      this.sueldopc = gastoPC;
      this.sueldoc = gastoC;
      this.$jefe = sueldoJ;
      this.sueldog=sueldoG;
      this.tlfs=tlf;
      this.gastos=gastos;
      this.ganacias=ganacias;
      this.neto=neto;
      this.countdown=countdown;
      this.actual = Integer.parseInt(countdown.getText())+1;
      this.sueldoe = sueldoe;
      this.boton=boton;
    }
    public void StopToggle(){
        this.stop=!this.stop;
    }
     public void run(){            
         if (tipo==1) {
        try {
            while (this.stop) {   
                if (Integer.parseInt(countdown.getText())!=actual) {       
                modCountdown.acquire();
                accion.setText(modC);
                sleep(dia/4);
                modCountdown.release();
                    if (Integer.parseInt(countdown.getText())==0) {
                        this.StopToggle();
                    }
                actual--;
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
             while (Integer.parseInt(countdown.getText())!=0) {                 
                 try {
                     sleep(dia);
                     countdown.setText((Integer.toString((Integer.parseInt(countdown.getText()))-1)));
                 } catch (InterruptedException ex) {
                     Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
             
         }
            if (tipo==3) {
             while (this.stop) {   
                 if (ruta <= 0) {
                    if (modCountdown.availablePermits()==0) {
                        while (modCountdown.availablePermits()==0) {   
                            accion.setText("Esperando para leer el cartel");
                        }
                    
                    accion.setText("Leyendo el cartel");
                    long max1=dia*3/4;
                    long min1=dia/2;
                    ruta = (int)(Math.random()*(max1-min1+1)+min1);
                     try {
                         sleep(dia/288);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                    try {
                        modCountdown.acquire();
                        if (Integer.parseInt(countdown.getText())==0) {
                            sleep(dia);
                            System.out.println("dia despachoo");
                            this.StopToggle();
                            modCountdown.release();
                        }    
                        modCountdown.release();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 }
                    

                 try {
                    accion.setText("Dando vueltas por la fabrica");
                    long max2=dia/16;
                    long min2=dia/48;
                    int tiempo = (int)(Math.random()*(max2-min2+1)+min2);
                    sleep(tiempo);
                    ruta=ruta-tiempo;
                    accion.setText("Revisando al jefe");
                     if (accjefe.getText()==CR) {
                         $jefe.setText(Integer.toString(Integer.parseInt($jefe.getText())-2));
                     }
                     sleep(dia/288);
                     ruta-=dia/288;
                 } catch (InterruptedException ex) {
                     Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
         }
            if (tipo==4) {
            while (this.stop) {  
                if (Integer.parseInt(countdown.getText())==0) {
//                    try {
//                        sleep(dia*3);
                        gastos.setText(Integer.toString(Integer.parseInt(sueldop.getText())+Integer.parseInt(sueldob.getText())+Integer.parseInt(sueldopc.getText())+Integer.parseInt(sueldoc.getText())+Integer.parseInt(sueldoe.getText())+Integer.parseInt($jefe.getText())+Integer.parseInt(sueldog.getText())));
                        ganacias.setText(Integer.toString(Integer.parseInt(tlfs.getText())*900));
                        neto.setText(Integer.toString(Integer.parseInt(ganacias.getText())-Integer.parseInt(gastos.getText())));
                        boton.setEnabled(true);
//                        this.StopToggle();
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ProcesosJG.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    }
                    gastos.setText(Integer.toString(Integer.parseInt(sueldop.getText())+Integer.parseInt(sueldob.getText())+Integer.parseInt(sueldopc.getText())+Integer.parseInt(sueldoc.getText())+Integer.parseInt(sueldoe.getText())+Integer.parseInt($jefe.getText())+Integer.parseInt(sueldog.getText())));
                    ganacias.setText(Integer.toString(Integer.parseInt(tlfs.getText())*900));
                    neto.setText(Integer.toString(Integer.parseInt(ganacias.getText())-Integer.parseInt(gastos.getText())));
                
                

        }
     }
     
     }
}
