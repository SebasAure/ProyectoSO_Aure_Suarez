/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabriel
 */
public class archivoCsv {
    
    public void escribirCsvHistorico(String dias, String cantTlfFab1,String cantTlfFab2, String salariosFab1, String salariosFab2, String gastosFab1, String gastosFab2){
        String historicoDespachos = "";
        String line;
        try {
            FileReader pw1 =new FileReader("test\\historicoDespachos.csv");
            BufferedReader br = new BufferedReader(pw1);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        historicoDespachos += line + "\n";
                    }
                }

        
            FileWriter pw = new FileWriter("test\\historicoDespachos.csv");
            pw.append(historicoDespachos+dias + ","
                        + cantTlfFab1 + "," + cantTlfFab2 + ","
                        + salariosFab1 + "," + salariosFab2 + ","
                        + gastosFab1 + "," + gastosFab2+"\n" );
            pw.close();
        } catch (Exception e) {
        }
    }
    
    public String[] leerCsvHistorico(){
        String[] despachos = new String[7];
        String line;
        String despachosCsv = "";
        String path = "test\\historicoDespachos.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < despachos_split.length; i++) {
                        String[] despacho = despachos_split[i].split(",");
                        despachos[0] = despacho[0];
                        despachos[1] = despacho[1];
                        despachos[2] = despacho[2];
                        despachos[3] = despacho[3];
                        despachos[4] = despacho[4];
                        despachos[5] = despacho[5];
                        despachos[6] = despacho[6];
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return despachos;
    }
    
    public String leerCsvParametrosPorDefecto(){
        String diasDespacho = "";
        String line;
        String despachosCsv = "";
        String path = "test\\datosPorDefecto.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 3; i++) {
                        String[] despacho = despachos_split[i].split(",");
                        diasDespacho = despacho[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return diasDespacho;
    }
    public String leerCsvParametrosPorDefectoAlmacenPantallas(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\datosPorDefecto.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 4; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    public String leerCsvParametrosPorDefectoAlmacenBotones(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\datosPorDefecto.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 5; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    public String leerCsvParametrosPorDefectoAlmacenPinCarga(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\datosPorDefecto.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 6; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    public String leerCsvParametrosPorDefectoAlmacenCamaras(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\datosPorDefecto.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 7; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    
    public String leerCsvParametrosPorDefectoAlmacenPantallasFab1(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\parametrosPorDefectoFab1.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 4; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    public String leerCsvParametrosPorDefectoAlmacenBotonesFab1(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\parametrosPorDefectoFab1.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 5; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    public String leerCsvParametrosPorDefectoAlmacenPinCargaFab1(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\parametrosPorDefectoFab1.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 6; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    public String leerCsvParametrosPorDefectoAlmacenCamarasFab1(){
        String capacidadTotal = "";
        String line;
        String despachosCsv = "";
        String path = "test\\parametrosPorDefectoFab1.csv";
        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        despachosCsv += line + "\n";
                    }
                }
                
                if (!"".equals(despachosCsv)){
                    String[] despachos_split = despachosCsv.split("\n");
                    for (int i = 0; i < 7; i++) {
                        String[] capacidad = despachos_split[i].split(",");
                        capacidadTotal = capacidad[1];
                        
                    }
                }
                br.close();
            }
        } catch (Exception e) {
        }
        return capacidadTotal;
    }
    
    public void vaciarCsvHistorico(String cadena){
        try {
            FileWriter  save = new FileWriter("test\\historicoDespachos.csv");
            save.write(cadena);
            save.close();
        } catch (Exception e) {
        }
    }
    public long leerPorDefectoFab1(long dia,JLabel count,JLabel almap,JLabel almab,JLabel almapc,JLabel almac){
        String aux="";   
        String texto="";
        try
        {  
            FileReader archivos=new FileReader("test\\parametrosPorDefectoFab1.csv");
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
                            count.setText(datos[1]);
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
    public long leerPorDefectoFab2(long dia,JLabel count,JLabel almap,JLabel almab,JLabel almapc,JLabel almac){
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
                            count.setText(datos[1]);
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
    public int leerPorDefecto2Fab1(long dia,int empleados,cola2 librep,cola2 ocup, cola2 libreb,cola2 ocub,cola2 librepc,cola2 ocupc,cola2 librec,cola2 ocuc,JLabel produP,JLabel produB,JLabel produPc,JLabel produC,cola2 libreE,cola2 ocuE,JLabel ensam,JLabel almap,JLabel almab,JLabel almapc,JLabel almac,JLabel telef,Semaphore sem,Semaphore sem2,Semaphore sem3,Semaphore sem4,Semaphore AP,Semaphore AB,Semaphore APC,Semaphore AC,Semaphore p,Semaphore b,Semaphore pc,Semaphore c,Semaphore mutex4,Semaphore mutex3,Semaphore mutex2,Semaphore mutex,JLabel countdown){
         String aux="";   
        String texto="";
        try
        {  
            FileReader archivos=new FileReader("test\\parametrosPorDefectoFab1.csv");
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
                        }if (i==2) {
                            countdown.setText(datos[1]);
                        }if (i==7&&j==1) {
                            for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                                ProcesosFab1 hilop = new ProcesosFab1(1, almap, sem, AP, dia, p,countdown);
                                ocup.Encolar(hilop);
                                hilop.start();
                                produP.setText(Integer.toString(Integer.parseInt(produP.getText())+1));
                                empleados--;
                            }
                        }if (i==8&&j==1) {
                           for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                               ProcesosFab1 hiloB = new ProcesosFab1(2, sem2, AB, almab, dia, b,countdown);
                                hiloB.start();
                                ocub.Encolar(hiloB);
                                produB.setText(Integer.toString(Integer.parseInt(produB.getText())+1));
                                empleados--;
                            }
                        }if (i==9&&j==1) {
                            for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                                ProcesosFab1 hiloPc = new ProcesosFab1(3, sem3, almapc, APC, dia, pc,countdown);
                                hiloPc.start();
                                ocupc.Encolar(hiloPc);
                                produPc.setText(Integer.toString(Integer.parseInt(produPc.getText())+1));
                                empleados--;
                            }
                           
                        }if (i==10&&j==1) {
                           for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                               ProcesosFab1 hiloC = new ProcesosFab1(almac, 4, sem4, AC, dia, c,countdown);
                                hiloC.start();
                                ocuc.Encolar(hiloC);
                                produC.setText(Integer.toString(Integer.parseInt(produC.getText())+1));
                                empleados--;
                            }
                        }if (i==11&&j==1) {
                           for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                               ProcesosFab1 hiloE = new ProcesosFab1(mutex4, mutex3, mutex2, mutex, dia, 5, sem, sem2, sem3, sem4, almap, almab, almapc, almac, ensam, telef, AP, AB, APC, AC,countdown);
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
     public int leerPorDefecto2Fab2(long dia,int empleados,Cola librep,Cola ocup, Cola libreb,Cola ocub,Cola librepc,Cola ocupc,Cola librec,Cola ocuc,JLabel produP,JLabel produB,JLabel produPc,JLabel produC,Cola libreE,Cola ocuE,JLabel ensam,JLabel almap,JLabel almab,JLabel almapc,JLabel almac,JLabel telef,Semaphore sem,Semaphore sem2,Semaphore sem3,Semaphore sem4,Semaphore AP,Semaphore AB,Semaphore APC,Semaphore AC,Semaphore p,Semaphore b,Semaphore pc,Semaphore c,Semaphore mutex4,Semaphore mutex3,Semaphore mutex2,Semaphore mutex,JLabel countdown){
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
                        }if (i==2) {
                            countdown.setText(datos[1]);
                        }if (i==7&&j==1) {
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
      public void leerPorDefectoParametrosFab2(JTextField T1,JTextField T2,JTextField T3,JTextField T4,JTextField T5,JTextField T6,JTextField T7,JTextField T8,JTextField T9,JTextField T10,JTextField T11){
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
                            T1.setText(datos[1]);
                        }if (i==2) {
                            T2.setText(datos[1]);
                        }if (i==3) {
                            T3.setText(datos[1]);
                        }if (i==4) {
                            T4.setText(datos[1]);
                        }if (i==5) {
                            T5.setText(datos[1]);
                        }if (i==6) {
                            T6.setText(datos[1]);
                        }if (i==7) {
                            T7.setText(datos[1]);
                        }if (i==8) {
                            T8.setText(datos[1]);
                        }if (i==9) {
                            T9.setText(datos[1]);
                        }if (i==10) {
                            T10.setText(datos[1]);
                        }if (i==11) {
                            T11.setText(datos[1]);
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
}
    public void leerPorDefectoParametrosFab1(JTextField T1,JTextField T2,JTextField T3,JTextField T4,JTextField T5,JTextField T6,JTextField T7,JTextField T8,JTextField T9,JTextField T10,JTextField T11){
        String aux="";   
        String texto="";
        try
        {  
            FileReader archivos=new FileReader("test\\parametrosPorDefectoFab1.csv");
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
                            T1.setText(datos[1]);
                        }if (i==2) {
                            T2.setText(datos[1]);
                        }if (i==3) {
                            T3.setText(datos[1]);
                        }if (i==4) {
                            T4.setText(datos[1]);
                        }if (i==5) {
                            T5.setText(datos[1]);
                        }if (i==6) {
                            T6.setText(datos[1]);
                        }if (i==7) {
                            T7.setText(datos[1]);
                        }if (i==8) {
                            T8.setText(datos[1]);
                        }if (i==9) {
                            T9.setText(datos[1]);
                        }if (i==10) {
                            T10.setText(datos[1]);
                        }if (i==11) {
                            T11.setText(datos[1]);
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
    public void escribirCvsPorDefectoFab1(String cadena){
         try
        {
        FileWriter  save = new FileWriter("test\\parametrosPorDefectoFab1.csv");
        save.write(cadena);
        save.close();

     }catch(IOException ex)
         {
         }
}
    


}
