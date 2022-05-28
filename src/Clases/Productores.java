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
public class Productores {
    public void agregarProductores(long dia,JLabel Area,Cola librep,Semaphore sem1,Semaphore pantalla,JLabel Area2,Cola libreb,Semaphore sem2,Semaphore botones,JLabel Area3,Cola librePc,Semaphore sem3,Semaphore PinesC,JLabel Area4,Cola libreC,Semaphore sem4, Semaphore Camaras,Cola libreE,JLabel Area5,JLabel Area6,Semaphore mutex,Semaphore mutex2,Semaphore mutex3,Semaphore mutex4,Semaphore p,Semaphore B,Semaphore Pc,Semaphore C){
//        //Pantallas
//        Procesos hilop1 = new Procesos("ProductP1",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop1);
//        Procesos hilop2 = new Procesos("ProductP2",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop2);
//        Procesos hilop3 = new Procesos("ProductP3",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop3);
//        Procesos hilop4 = new Procesos("ProductP4",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop4);
//        Procesos hilop5 = new Procesos("ProductP5",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop5);
//        Procesos hilop6 = new Procesos("ProductP6",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop6);
//        Procesos hilop7 = new Procesos("ProductP7",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop7);
//        Procesos hilop8 = new Procesos("ProductP8",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop8);
//        Procesos hilop9 = new Procesos("ProductP9",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop9);
//        Procesos hilop10 = new Procesos("ProductP10",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop10);
//        Procesos hilop11 = new Procesos("ProductP11",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop11);
//        Procesos hilop12= new Procesos("ProductP12",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop12);
//        Procesos hilop13 = new Procesos("ProductP13",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop13);
//        Procesos hilop14 = new Procesos("ProductP14",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop14);
//        Procesos hilop15 = new Procesos("ProductP15",1,Area,sem1,pantalla,dia,p);
//        librep.Encolar(hilop15);
//        //Botones
//        Procesos hiloB1 = new Procesos("ProductB1", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB1);
//        Procesos hiloB2 = new Procesos("ProductB2", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB2);
//        Procesos hiloB3 = new Procesos("ProductB3", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB3);
//        Procesos hiloB4 = new Procesos("ProductB4", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB4);
//        Procesos hiloB5 = new Procesos("ProductB5", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB5);
//        Procesos hiloB6 = new Procesos("ProductB6", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB6);
//        Procesos hiloB7 = new Procesos("ProductB7", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB7);
//        Procesos hiloB8 = new Procesos("ProductB8", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB8);
//        Procesos hiloB9 = new Procesos("ProductB9", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB9);
//        Procesos hiloB10 = new Procesos("ProductB10", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB10);
//        Procesos hiloB11 = new Procesos("ProductB11", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB11);
//        Procesos hiloB12 = new Procesos("ProductB12", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB12);
//        Procesos hiloB13 = new Procesos("ProductB13", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB13);
//        Procesos hiloB14 = new Procesos("ProductB14", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB14);
//        Procesos hiloB15 = new Procesos("ProductB15", 2, sem2, botones, Area2,dia,B);
//        libreb.Encolar(hiloB15);
//        //Pines Carga
//        Procesos hiloPc1 = new Procesos("ProductPc1", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc1);
//        Procesos hiloPc2 = new Procesos("ProductPc2", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc2);
//        Procesos hiloPc3 = new Procesos("ProductPc3", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc3);
//        Procesos hiloPc4 = new Procesos("ProductPc4", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc4);
//        Procesos hiloPc5 = new Procesos("ProductPc5", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc5);
//        Procesos hiloPc6 = new Procesos("ProductPc6", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc6);
//        Procesos hiloPc7 = new Procesos("ProductPc7", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc7);
//        Procesos hiloPc8 = new Procesos("ProductPc8", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc8);
//        Procesos hiloPc9 = new Procesos("ProductPc9", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc9);
//        Procesos hiloPc10 = new Procesos("ProductPc10", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc10);
//        Procesos hiloPc11 = new Procesos("ProductPc11", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc11);
//        Procesos hiloPc12 = new Procesos("ProductPc12", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc12);
//        Procesos hiloPc13 = new Procesos("ProductPc13", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc13);
//        Procesos hiloPc14 = new Procesos("ProductPc14", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc14);
//        Procesos hiloPc15 = new Procesos("ProductPc15", 3, sem3, Area3, PinesC,dia,Pc);
//        librePc.Encolar(hiloPc15);
//        //Camaras
//        Procesos hiloC1 = new Procesos("ProductC1", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC1);
//         Procesos hiloC2 = new Procesos("ProductC2", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC2);
//         Procesos hiloC3 = new Procesos("ProductC3", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC3);
//         Procesos hiloC4 = new Procesos("ProductC4", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC4);
//         Procesos hiloC5 = new Procesos("ProductC5", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC5);
//         Procesos hiloC6 = new Procesos("ProductC6", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC6);
//         Procesos hiloC7 = new Procesos("ProductC7", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC7);
//         Procesos hiloC8 = new Procesos("ProductC8", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC8);
//         Procesos hiloC9 = new Procesos("ProductC9", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC9);
//         Procesos hiloC10 = new Procesos("ProductC10", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC10);
//         Procesos hiloC11 = new Procesos("ProductC11", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC11);
//         Procesos hiloC12 = new Procesos("ProductC12", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC12);
//         Procesos hiloC13 = new Procesos("ProductC13", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC13);
//         Procesos hiloC14 = new Procesos("ProductC14", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC14);
//         Procesos hiloC15 = new Procesos("ProductC15", Area4, 4, sem4, Camaras,dia,C);
//        libreC.Encolar(hiloC15);
        //Ensambladores
        Procesos hiloE1 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE1);
        Procesos hiloE2 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE2);
        Procesos hiloE3 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE3);
        Procesos hiloE4 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE4);
        Procesos hiloE5 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE5);
        Procesos hiloE6 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE6);
        Procesos hiloE7 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE7);
        Procesos hiloE8 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE8);
        Procesos hiloE9 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE9);
        Procesos hiloE10 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE10);
        Procesos hiloE11 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE11);
        Procesos hiloE12 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE12);
        Procesos hiloE13 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE13);
        Procesos hiloE14 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE14);
        Procesos hiloE15 = new Procesos(mutex4,mutex3,mutex2,mutex,dia,5, sem1, sem2, sem3, sem4, Area, Area2, Area3, Area4, Area5, Area6,pantalla,botones,PinesC,Camaras);
        libreE.Encolar(hiloE15);
        
    
}
}
