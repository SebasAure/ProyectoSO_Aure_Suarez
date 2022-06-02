/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class archivoCsv {
    public long leerPorDefecto(long dia,int dias,JLabel almap,JLabel almab,JLabel almapc,JLabel almac){
        String aux="";   
        String texto="";
        try
        {  
            FileReader archivos=new FileReader("test\\datosPorDefecto.csv");
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
               texto+= aux+ "\n";
            }

            if (!"".equals(texto) && !texto.isEmpty()){
                String[] txt_split= texto.split("\n");
                char espacio=' ';
                for (int i = 1; i < txt_split.length; i++) {
                    if (txt_split[0].contains(",")) {
                    String[] datos = txt_split[i].split(",");
                    for (int j = 0; j < datos.length; j++) {
                        if (datos[j].charAt(0)==espacio) {
                            datos[j]=datos[j].replaceFirst(" ","");
                        }
                        if (i==1) {
                            dia = Long.parseLong(datos[1]);
                        }if (i==2) {
                            dias=Integer.parseInt(datos[1]);
                        }if (i==3) {
                            almap.setText(datos[1]);
                        }if (i==4) {
                            almab.setText(datos[1]);
                        }if (i==5) {
                            almapc.setText(datos[1]);
                        }if (i==6) {
                            almac.setText(datos[1]);
                        }
                        }
                        
                            
                        }
                    }
                }
            
            lee.close();      
     
        }catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          } 
        return dia;
}
     public int leerPorDefecto2(long dia,int empleados,Cola librep,Cola ocup, Cola libreb,Cola ocub,Cola librepc,Cola ocupc,Cola librec,Cola ocuc,JLabel produP,JLabel produB,JLabel produPc,JLabel produC,Cola libreE,Cola ocuE,JLabel ensam,JLabel almap,JLabel almab,JLabel almapc,JLabel almac,JLabel telef,Semaphore sem,Semaphore sem2,Semaphore sem3,Semaphore sem4,Semaphore AP,Semaphore AB,Semaphore APC,Semaphore AC,Semaphore p,Semaphore b,Semaphore pc,Semaphore c,Semaphore mutex4,Semaphore mutex3,Semaphore mutex2,Semaphore mutex,JLabel countdown){
         String aux="";   
        String texto="";
        try
        {  
            FileReader archivos=new FileReader("test\\datosPorDefecto.csv");
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
               texto+= aux+ "\n";
            }

            if (!"".equals(texto) && !texto.isEmpty()){
                String[] txt_split= texto.split("\n");
                char espacio=' ';
                for (int i = 1; i < txt_split.length; i++) {
                    if (txt_split[0].contains(",")) {
                    String[] datos = txt_split[i].split(",");
                    for (int j = 0; j < datos.length; j++) {
                        if (datos[j].charAt(0)==espacio) {
                            datos[j]=datos[j].replaceFirst(" ","");
                        }
                        if (i==7&&j==1) {
                            for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                                Procesos hiloP = new Procesos(1, almap, sem, AP, dia, p,countdown);
                                ocup.Encolar(hiloP);
                                hiloP.start();
                                produP.setText(Integer.toString(Integer.parseInt(produP.getText())+1));
                                empleados--;
                            }
                        }if (i==8&&j==1) {
                           for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                               Procesos hiloB = new Procesos(2, sem2, AB, almab, dia, b,countdown);
                                hiloB.start();
                                ocub.Encolar(hiloB);
                                produB.setText(Integer.toString(Integer.parseInt(produB.getText())+1));
                                empleados--;
                            }
                        }if (i==9&&j==1) {
                            for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                                Procesos hiloPc = new Procesos(3, sem3, almapc, APC, dia, pc,countdown);
                                hiloPc.start();
                                ocupc.Encolar(hiloPc);
                                produPc.setText(Integer.toString(Integer.parseInt(produPc.getText())+1));
                                empleados--;
                            }
                           
                        }if (i==10&&j==1) {
                           for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                               Procesos hiloC = new Procesos(almac, 4, sem4, AC, dia, c,countdown);
                                hiloC.start();
                                ocuc.Encolar(hiloC);
                                produC.setText(Integer.toString(Integer.parseInt(produC.getText())+1));
                                empleados--;
                            }
                        }if (i==11&&j==1) {
                           for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                               Procesos hiloE = new Procesos(mutex4, mutex3, mutex2, mutex, dia, 5, sem, sem2, sem3, sem4, almap, almab, almapc, almac, ensam, telef, AP, AB, APC, AC,countdown);
                                hiloE.start();
                                ocuE.Encolar(hiloE);
                                ensam.setText(Integer.toString(Integer.parseInt(ensam.getText())+1));
                                empleados--;
                            }
                        }
                    }
                        }
                    }
                }
            
            lee.close();      
     
        }catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          } 
        return empleados;
}
    public void escribirCvsPorDefecto(String cadena){
         try
        {
        FileWriter  save=new FileWriter("test\\datosPorDefecto.csv");
        save.write(cadena);
        save.close();

     }catch(IOException ex)
         {
         }
}
    
}
