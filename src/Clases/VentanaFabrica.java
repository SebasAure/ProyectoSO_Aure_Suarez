/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class VentanaFabrica extends javax.swing.JFrame {
    archivoCsv archivo = new archivoCsv();
    long dia=0;
    int dias;
    
    String cadena = "";
    //Fabrica 1
    int empleadosFab1 = 19;
    Cola colaLibrePantallaFab1 = new Cola();
    Cola ColaOcupadoPantallaFab1 = new Cola();
    Cola colaLibreBotonesFab1 = new Cola();
    Cola colaOcupadoBotonesFab1 = new Cola();
    Cola colaLibrePinesCFab1 = new Cola();
    Cola colaOcupadoPinesCFab1 = new Cola();
    Cola colaLibreCamarasFab1 = new Cola();
    Cola colaOcupadoCamarasFab1 = new Cola();
    Cola colaEnsambladoresLibresFab1 = new Cola(); 
    Cola colaEnsambladoresOcupadosFab1 = new Cola();
    Semaphore sem1Fab1 = new Semaphore(1);
    Semaphore sem2Fab1 = new Semaphore(1);
    Semaphore sem3Fab1 = new Semaphore(1);
    Semaphore sem4Fab1 = new Semaphore(1);
    Semaphore mutex1Fab1 = new Semaphore(1);
    Semaphore mutex2Fab1 = new Semaphore(1);
    Semaphore mutex3Fab1 = new Semaphore(1);
    Semaphore mutex4Fab1 = new Semaphore(1);
    Semaphore almacenPantallasFab1;
    Semaphore almacenBotonesFab1;
    Semaphore almacenPinesCFab1;
    Semaphore almacenCamarasFab1;
    Semaphore pFab1 = new Semaphore(1);
    Semaphore BFab1= new Semaphore(1);
    Semaphore PcFab1= new Semaphore(1);
    Semaphore CFab1= new Semaphore(1);
    
    //Fabrica 2
    int empleadosFab2 = 15;
    Cola colaLibrePantallaFab2 = new Cola();
    Cola ColaOcupadoPantallaFab2 = new Cola();
    Cola colaLibreBotonesFab2 = new Cola();
    Cola colaOcupadoBotonesFab2 = new Cola();
    Cola colaLibrePinesCFab2 = new Cola();
    Cola colaOcupadoPinesCFab2 = new Cola();
    Cola colaLibreCamarasFab2 = new Cola();
    Cola colaOcupadoCamarasFab2 = new Cola();
    Cola colaEnsambladoresLibresFab2 = new Cola();
    Cola colaEnsambladoresOcupadosFab2 = new Cola();
    Semaphore sem1Fab2 = new Semaphore(1);
    Semaphore sem2Fab2 = new Semaphore(1);
    Semaphore sem3Fab2 = new Semaphore(1);
    Semaphore sem4Fab2 = new Semaphore(1);
    Semaphore mutex1Fab2 = new Semaphore(1);
    Semaphore mutex2Fab2 = new Semaphore(1);
    Semaphore mutex3Fab2 = new Semaphore(1);
    Semaphore mutex4Fab2 = new Semaphore(1);
    Semaphore almacenPantallasFab2;
    Semaphore almacenBotonesFab2;
    Semaphore almacenPinesCFab2;
    Semaphore almacenCamarasFab2;
    Semaphore pFab2 = new Semaphore(1);
    Semaphore BFab2= new Semaphore(1);
    Semaphore PcFab2= new Semaphore(1);
    Semaphore CFab2= new Semaphore(1);
    Semaphore modCountdown = new Semaphore(1);
    public void agregarFab1(int tipo,Cola libre,Cola ocupada,JLabel trabajador){
        if (empleadosFab1!=0) {
            if (tipo==1) {
           
                Procesos hiloP = new Procesos(tipo, cantidadPFab1, sem1Fab1, almacenPantallasFab1, dia, pFab1,Countdown);
                ocupada.Encolar(hiloP);
                hiloP.start();
            }if (tipo==2) {
                Procesos hiloB = new Procesos(tipo, sem2Fab1, almacenBotonesFab1, cantidadBFab1, dia, BFab1,Countdown);
                ocupada.Encolar(hiloB);
                hiloB.start();
            }if (tipo==3) {
                Procesos hiloPc = new Procesos(tipo, sem3Fab1, cantidadPCFab1, almacenPinesCFab1, dia, PcFab1,Countdown);
                ocupada.Encolar(hiloPc);
                hiloPc.start();
            }if (tipo==4) {
                Procesos hiloC = new Procesos(cantidadCFab1, tipo, sem4Fab1, almacenCamarasFab1, dia, CFab1,Countdown);
                ocupada.Encolar(hiloC);
                hiloC.start();
            }if (tipo==5) {
                Procesos hiloE = new Procesos(mutex4Fab1, mutex3Fab1, mutex2Fab1, mutex1Fab1, dia, tipo, sem1Fab1, sem2Fab1, sem3Fab1, sem4Fab1, cantidadPFab1, cantidadBFab1, cantidadPCFab1, cantidadCFab1, ensambladoresFab1, telefonosProducidosFab1, almacenPantallasFab1, almacenBotonesFab1, almacenPinesCFab1, almacenCamarasFab1,Countdown);
                ocupada.Encolar(hiloE);
                hiloE.start();
            }
        trabajador.setText(Integer.toString(Integer.parseInt(trabajador.getText())+1));
        empleadosFab1--;
        }
    }
    public void agregarFab2(int tipo,Cola libre,Cola ocupada,JLabel trabajador){
        if (empleadosFab2!=0) {
            if (tipo==1) {
                Procesos hiloP = new Procesos(tipo, cantidadPFab2, sem1Fab2, almacenPantallasFab2, dia, pFab2,Countdown);
                ocupada.Encolar(hiloP);
                hiloP.start();
            }if (tipo==2) {
                Procesos hiloB = new Procesos(tipo, sem2Fab2, almacenBotonesFab2, cantidadBFab2, dia, BFab2,Countdown);
                ocupada.Encolar(hiloB);
                hiloB.start();
            }if (tipo==3) {
                Procesos hiloPc = new Procesos(tipo, sem3Fab2, cantidadPCFab2, almacenPinesCFab2, dia, PcFab2,Countdown);
                ocupada.Encolar(hiloPc);
                hiloPc.start();
            }if (tipo==4) {
                Procesos hiloC = new Procesos(cantidadCFab2, tipo, sem4Fab2, almacenCamarasFab2, dia, CFab2,Countdown);
                ocupada.Encolar(hiloC);
                hiloC.start();
            }if (tipo==5) {
                Procesos hiloE = new Procesos(mutex4Fab2, mutex3Fab2, mutex2Fab2, mutex1Fab2, dia, tipo, sem1Fab2, sem2Fab2, sem3Fab2, sem4Fab2, cantidadPFab2, cantidadBFab2, cantidadPCFab2, cantidadCFab2, ensambladoresFab2, telefonosProducidosFab2, almacenPantallasFab2, almacenBotonesFab2, almacenPinesCFab2, almacenCamarasFab2,Countdown);
                ocupada.Encolar(hiloE);
                hiloE.start();
            }
        trabajador.setText(Integer.toString(Integer.parseInt(trabajador.getText())+1));
        empleadosFab2--;
        }
    }
    public void quitarFab1(Cola ocupado,Cola libre,JLabel trabajadores,Semaphore mutexq,Semaphore semq){
        if ( !ocupado.esta_vacia()) {
        Procesos siguiente = ocupado.getPfirst().getproceso();
        ocupado.Desencolar();
        libre.Encolar(siguiente);
        mutexq.release();
        semq.release();
        siguiente.suspend();
        trabajadores.setText(Integer.toString(Integer.parseInt(trabajadores.getText())-1));
        empleadosFab1++;
        }
    }
    public void quitarFab2(Cola ocupado,Cola libre,JLabel trabajadores,Semaphore mutexq,Semaphore semq){
        if ( !ocupado.esta_vacia()) {
        Procesos siguiente = ocupado.getPfirst().getproceso();
        ocupado.Desencolar();
        libre.Encolar(siguiente);
        mutexq.release();
        semq.release();
        siguiente.suspend();
        trabajadores.setText(Integer.toString(Integer.parseInt(trabajadores.getText())-1));
        empleadosFab2++;
        }
    }

    /**
     * Creates new form VentanaFabrica
     */
    public VentanaFabrica() {
        initComponents();
//        archivo.escribirCvsPorDefecto(cadena);
        dia = archivo.leerPorDefecto(dia, dias, maxPFab2, maxBFab2, maxPCFab2, maxCFab2);
        // Fabrica 1
        almacenPantallasFab1 = new Semaphore(Integer.parseInt(maxPFab2.getText()));
        almacenBotonesFab1 = new Semaphore(Integer.parseInt(maxBFab2.getText()));
        almacenPinesCFab1 = new Semaphore(Integer.parseInt(maxPCFab2.getText()));
        almacenCamarasFab1 = new Semaphore(Integer.parseInt(maxCFab2.getText()));
        
        // Fabrica 2
        almacenPantallasFab2 = new Semaphore(Integer.parseInt(maxPFab2.getText()));
        almacenBotonesFab2 = new Semaphore(Integer.parseInt(maxBFab2.getText()));
        almacenPinesCFab2 = new Semaphore(Integer.parseInt(maxPCFab2.getText()));
        almacenCamarasFab2 = new Semaphore(Integer.parseInt(maxCFab2.getText()));
        Countdown.setText(Integer.toString(dias));
        
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Fabrica");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productoresPCFab1 = new javax.swing.JLabel();
        ensambladoresFab2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        eliminarPPF1 = new javax.swing.JButton();
        sueldoEFab2 = new javax.swing.JLabel();
        agregarPPF1 = new javax.swing.JButton();
        eliminarPBF1 = new javax.swing.JButton();
        agregarPBF1 = new javax.swing.JButton();
        eliminarPPCF1 = new javax.swing.JButton();
        agregarPPCF1 = new javax.swing.JButton();
        eliminarPCF1 = new javax.swing.JButton();
        agregarPCF1 = new javax.swing.JButton();
        maxBFab1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        agregarEF1 = new javax.swing.JButton();
        eliminarEF1 = new javax.swing.JButton();
        telefonosProducidosFab1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        eliminarPPF2 = new javax.swing.JButton();
        productoresBFab2 = new javax.swing.JLabel();
        productoresCFab2 = new javax.swing.JLabel();
        productoresPCFab2 = new javax.swing.JLabel();
        agregarPPF2 = new javax.swing.JButton();
        eliminarPBF2 = new javax.swing.JButton();
        agregarPBF2 = new javax.swing.JButton();
        eliminarPPCF2 = new javax.swing.JButton();
        agregarPPCF2 = new javax.swing.JButton();
        eliminarPCF2 = new javax.swing.JButton();
        agregarPCF2 = new javax.swing.JButton();
        productoresPFab2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        agregarEF2 = new javax.swing.JButton();
        eliminarEF2 = new javax.swing.JButton();
        telefonosProducidosFab2 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        estadoGerenteFab1 = new javax.swing.JLabel();
        sueldoGFab1 = new javax.swing.JLabel();
        estadoGerenteFab2 = new javax.swing.JLabel();
        estadoJefeFab2 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        iniciarFabricas = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        Countdown = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        productoresBFab1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        productoresPFab1 = new javax.swing.JLabel();
        cantidadBFab1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ensambladoresFab1 = new javax.swing.JLabel();
        cantidadPFab1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        maxPCFab1 = new javax.swing.JLabel();
        cantidadPCFab1 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        maxCFab1 = new javax.swing.JLabel();
        cantidadCFab1 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        estadoJefeFab1 = new javax.swing.JLabel();
        sueldoJFab2 = new javax.swing.JLabel();
        maxPFab1 = new javax.swing.JLabel();
        sueldoPFab1 = new javax.swing.JLabel();
        sueldoBFab1 = new javax.swing.JLabel();
        sueldoPCFab1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        maxBFab2 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        sueldoGFab2 = new javax.swing.JLabel();
        cantidadBFab2 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        sueldoCFab2 = new javax.swing.JLabel();
        cantidadPFab2 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        maxPCFab2 = new javax.swing.JLabel();
        cantidadPCFab2 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        maxCFab2 = new javax.swing.JLabel();
        cantidadCFab2 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        sueldoJFab1 = new javax.swing.JLabel();
        maxPFab2 = new javax.swing.JLabel();
        sueldoPFab2 = new javax.swing.JLabel();
        sueldoBFab2 = new javax.swing.JLabel();
        sueldoPCFab2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        productoresCFab1 = new javax.swing.JLabel();
        sueldoCFab1 = new javax.swing.JLabel();
        sueldoEFab1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        irSimulacionButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(204, 204, 204));
        Panel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Componente");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pantalla(s)");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fabrica 1 ");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        productoresPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresPCFab1.setText("0");
        Panel.add(productoresPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 10, -1));

        ensambladoresFab2.setForeground(new java.awt.Color(0, 0, 0));
        ensambladoresFab2.setText("0");
        Panel.add(ensambladoresFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Unidades ");
        Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        eliminarPPF1.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPPF1.setText("-");
        eliminarPPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 40, 30));

        sueldoEFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoEFab2.setText("0");
        Panel.add(sueldoEFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 30, -1));

        agregarPPF1.setForeground(new java.awt.Color(0, 0, 0));
        agregarPPF1.setText("+");
        agregarPPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 40, 30));

        eliminarPBF1.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPBF1.setText("-");
        eliminarPBF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPBF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPBF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 40, 30));

        agregarPBF1.setForeground(new java.awt.Color(0, 0, 0));
        agregarPBF1.setText("+");
        agregarPBF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPBF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPBF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 40, 30));

        eliminarPPCF1.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPPCF1.setText("-");
        eliminarPPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPCF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 40, 30));

        agregarPPCF1.setForeground(new java.awt.Color(0, 0, 0));
        agregarPPCF1.setText("+");
        agregarPPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPCF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 40, 30));

        eliminarPCF1.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPCF1.setText("-");
        eliminarPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPCF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 40, 30));

        agregarPCF1.setForeground(new java.awt.Color(0, 0, 0));
        agregarPCF1.setText("+");
        agregarPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPCF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 40, 30));

        maxBFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxBFab1.setText("45");
        Panel.add(maxBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 20, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ensambladores");
        Panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        agregarEF1.setForeground(new java.awt.Color(0, 0, 0));
        agregarEF1.setText("+");
        agregarEF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarEF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 40, 30));

        eliminarEF1.setForeground(new java.awt.Color(0, 0, 0));
        eliminarEF1.setText("-");
        eliminarEF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarEF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 40, 30));

        telefonosProducidosFab1.setForeground(new java.awt.Color(0, 0, 0));
        telefonosProducidosFab1.setText("0");
        Panel.add(telefonosProducidosFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 20, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Xperia 1 IV (Producidos)");
        Panel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 140, -1));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Productores");
        Panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Sueldo");
        Panel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 40, -1));

        eliminarPPF2.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPPF2.setText("-");
        eliminarPPF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 40, 30));

        productoresBFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresBFab2.setText("0");
        Panel.add(productoresBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 20, 20));

        productoresCFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresCFab2.setText("0");
        Panel.add(productoresCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 20, -1));

        productoresPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresPCFab2.setText("0");
        Panel.add(productoresPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 20, -1));

        agregarPPF2.setForeground(new java.awt.Color(0, 0, 0));
        agregarPPF2.setText("+");
        agregarPPF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 40, 30));

        eliminarPBF2.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPBF2.setText("-");
        eliminarPBF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPBF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPBF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 40, 30));

        agregarPBF2.setForeground(new java.awt.Color(0, 0, 0));
        agregarPBF2.setText("+");
        agregarPBF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPBF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPBF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 40, 30));

        eliminarPPCF2.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPPCF2.setText("-");
        eliminarPPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPCF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 40, 30));

        agregarPPCF2.setForeground(new java.awt.Color(0, 0, 0));
        agregarPPCF2.setText("+");
        agregarPPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPCF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 40, 30));

        eliminarPCF2.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPCF2.setText("-");
        eliminarPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPCF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 40, 30));

        agregarPCF2.setForeground(new java.awt.Color(0, 0, 0));
        agregarPCF2.setText("+");
        agregarPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPCF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 40, 30));

        productoresPFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresPFab2.setText("0");
        Panel.add(productoresPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 20, -1));
        Panel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 20, -1));

        agregarEF2.setForeground(new java.awt.Color(0, 0, 0));
        agregarEF2.setText("+");
        agregarEF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarEF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 40, 30));

        eliminarEF2.setForeground(new java.awt.Color(0, 0, 0));
        eliminarEF2.setText("-");
        eliminarEF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarEF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 40, 30));

        telefonosProducidosFab2.setForeground(new java.awt.Color(0, 0, 0));
        telefonosProducidosFab2.setText("0");
        Panel.add(telefonosProducidosFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 40, 20));

        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Xperia 10 IV (Producidos)");
        Panel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Gerente esta...");
        Panel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Jefe esta... ");
        Panel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Fabrica 2");
        Panel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        estadoGerenteFab1.setForeground(new java.awt.Color(0, 0, 0));
        estadoGerenteFab1.setText("null");
        Panel.add(estadoGerenteFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        sueldoGFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoGFab1.setText("0");
        Panel.add(sueldoGFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        estadoGerenteFab2.setForeground(new java.awt.Color(0, 0, 0));
        estadoGerenteFab2.setText("null");
        Panel.add(estadoGerenteFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        estadoJefeFab2.setForeground(new java.awt.Color(0, 0, 0));
        estadoJefeFab2.setText("null");
        Panel.add(estadoJefeFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("HORA");
        Panel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        iniciarFabricas.setForeground(new java.awt.Color(0, 0, 0));
        iniciarFabricas.setText("Iniciar Fabricas");
        iniciarFabricas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarFabricasActionPerformed(evt);
            }
        });
        Panel.add(iniciarFabricas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Dias:");
        Panel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        Countdown.setForeground(new java.awt.Color(0, 0, 0));
        Countdown.setText("0");
        Panel.add(Countdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 50, -1));

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Productores");
        Panel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Botones");
        Panel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        productoresBFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresBFab1.setText("0");
        Panel.add(productoresBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Pin(es) de carga");
        Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 100, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Pin(es) de carga");
        Panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 100, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Pin(es) de carga");
        Panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 100, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Camara(s)");
        Panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        productoresPFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresPFab1.setText("0");
        Panel.add(productoresPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 20, -1));

        cantidadBFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadBFab1.setText("0");
        Panel.add(cantidadBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 20, -1));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("/");
        Panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 20, -1));

        ensambladoresFab1.setForeground(new java.awt.Color(0, 0, 0));
        ensambladoresFab1.setText("0");
        Panel.add(ensambladoresFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 20, -1));

        cantidadPFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPFab1.setText("0");
        Panel.add(cantidadPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 20, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("/");
        Panel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 20, -1));

        maxPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxPCFab1.setText("15");
        Panel.add(maxPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 20, -1));

        cantidadPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPCFab1.setText("0");
        Panel.add(cantidadPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 20, -1));

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("/");
        Panel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 20, -1));

        maxCFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxCFab1.setText("20");
        Panel.add(maxCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 20, -1));

        cantidadCFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadCFab1.setText("0");
        Panel.add(cantidadCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 20, -1));

        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("/");
        Panel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 20, -1));

        estadoJefeFab1.setForeground(new java.awt.Color(0, 0, 0));
        estadoJefeFab1.setText("null");
        Panel.add(estadoJefeFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        sueldoJFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoJFab2.setText("0");
        Panel.add(sueldoJFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 20, -1));

        maxPFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxPFab1.setText("40");
        Panel.add(maxPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 20, -1));

        sueldoPFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPFab1.setText("0");
        Panel.add(sueldoPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 20, -1));

        sueldoBFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoBFab1.setText("0");
        Panel.add(sueldoBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 20, -1));

        sueldoPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPCFab1.setText("0");
        Panel.add(sueldoPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 20, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Unidades ");
        Panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        maxBFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxBFab2.setText("45");
        Panel.add(maxBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 20, -1));

        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Sueldo");
        Panel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 40, -1));

        sueldoGFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoGFab2.setText("0");
        Panel.add(sueldoGFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 20, -1));

        cantidadBFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadBFab2.setText("0");
        Panel.add(cantidadBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 20, -1));

        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("/");
        Panel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 20, -1));

        sueldoCFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoCFab2.setText("0");
        Panel.add(sueldoCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 30, -1));

        cantidadPFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPFab2.setText("0");
        Panel.add(cantidadPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 20, -1));

        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("/");
        Panel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 20, -1));

        maxPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxPCFab2.setText("15");
        Panel.add(maxPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 20, -1));

        cantidadPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPCFab2.setText("0");
        Panel.add(cantidadPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 20, -1));

        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("/");
        Panel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 20, -1));

        maxCFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxCFab2.setText("20");
        Panel.add(maxCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 20, -1));

        cantidadCFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadCFab2.setText("0");
        Panel.add(cantidadCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 20, -1));

        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("/");
        Panel.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 20, -1));

        sueldoJFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoJFab1.setText("0");
        Panel.add(sueldoJFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        maxPFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxPFab2.setText("40");
        Panel.add(maxPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 20, -1));

        sueldoPFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPFab2.setText("0");
        Panel.add(sueldoPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 30, -1));

        sueldoBFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoBFab2.setText("0");
        Panel.add(sueldoBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 30, -1));

        sueldoPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPCFab2.setText("0");
        Panel.add(sueldoPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 30, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Ensambladores");
        Panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        productoresCFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresCFab1.setText("0");
        Panel.add(productoresCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        sueldoCFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoCFab1.setText("0");
        Panel.add(sueldoCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 20, -1));

        sueldoEFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoEFab1.setText("0");
        Panel.add(sueldoEFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 20, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fabrica 2");
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fabrica 1");
        Panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SONY");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irSimulacionButton.setBackground(new java.awt.Color(0, 0, 0));
        irSimulacionButton.setForeground(new java.awt.Color(204, 204, 204));
        irSimulacionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/baseline_class_black_24dp.png"))); // NOI18N
        irSimulacionButton.setText("Simulacion");
        irSimulacionButton.setBorder(null);
        irSimulacionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irSimulacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irSimulacionButtonActionPerformed(evt);
            }
        });
        jPanel3.add(irSimulacionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 130, 40));

        dashboardButton.setBackground(new java.awt.Color(0, 0, 0));
        dashboardButton.setForeground(new java.awt.Color(204, 204, 204));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/baseline_class_black_24dp.png"))); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorder(null);
        dashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        jPanel3.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 130, 40));

        Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 500));

        jLabel1.setText("SIMULACION");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        this.dispose();
        VentanaDashboard dashboard = new VentanaDashboard();
        dashboard.setVisible(true);
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void irSimulacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irSimulacionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irSimulacionButtonActionPerformed

    private void iniciarFabricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarFabricasActionPerformed
        Countdown.setText("30");
        //        empleadosFab1 = archivo.leerPorDefecto2(dia,empleadosFab1,colaLibrePantallaFab2,ColaOcupadoPantallaFab2,colaLibreBotonesFab2,colaOcupadoBotonesFab2,colaLibrePinesCFab2,colaOcupadoPinesCFab2,colaLibreCamarasFab2,colaOcupadoCamarasFab2,productoresPFab2,productoresBFab2,productoresPCFab2,productoresCFab2,colaEnsambladoresLibresFab2,colaEnsambladoresOcupadosFab2,ensambladoresFab2,cantidadPFab2,cantidadBFab2,cantidadPCFab2,cantidadCFab2,telefonosProducidosFab2,sem1Fab2,sem2Fab2,sem3Fab2,sem4Fab2,almacenPantallasFab2,almacenBotonesFab2,almacenPinesCFab2,almacenCamarasFab2,pFab2,BFab2,PcFab2,CFab2,mutex4Fab2,mutex3Fab2,mutex2Fab2,mutex1Fab2,Countdown);
        empleadosFab2 = archivo.leerPorDefecto2(dia,empleadosFab2,colaLibrePantallaFab2,ColaOcupadoPantallaFab2,colaLibreBotonesFab2,colaOcupadoBotonesFab2,colaLibrePinesCFab2,colaOcupadoPinesCFab2,colaLibreCamarasFab2,colaOcupadoCamarasFab2,productoresPFab2,productoresBFab2,productoresPCFab2,productoresCFab2,colaEnsambladoresLibresFab2,colaEnsambladoresOcupadosFab2,ensambladoresFab2,cantidadPFab2,cantidadBFab2,cantidadPCFab2,cantidadCFab2,telefonosProducidosFab2,sem1Fab2,sem2Fab2,sem3Fab2,sem4Fab2,almacenPantallasFab2,almacenBotonesFab2,almacenPinesCFab2,almacenCamarasFab2,pFab2,BFab2,PcFab2,CFab2,mutex4Fab2,mutex3Fab2,mutex2Fab2,mutex1Fab2,Countdown);
        Procesos pagos = new Procesos(productoresPFab2, productoresBFab2, productoresPCFab2, productoresCFab2, sueldoPFab2, sueldoBFab2, sueldoPCFab2, sueldoCFab2,ensambladoresFab2,sueldoEFab2,0,dia,sueldoJFab2,sueldoGFab2,Countdown);
        pagos.start();
        ProcesosJG jefe = new ProcesosJG(1,dia,modCountdown, Countdown, estadoJefeFab2);
        jefe.start();
        ProcesosJG gerente = new ProcesosJG(dia, 3, modCountdown, estadoGerenteFab2, Countdown,telefonosProducidosFab2,estadoJefeFab2,sueldoJFab2);
        gerente.start();
        ProcesosJG dias = new ProcesosJG(dia, Countdown, 2);
        dias.start();
    }//GEN-LAST:event_iniciarFabricasActionPerformed

    private void eliminarEF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEF2ActionPerformed
        if ( !colaEnsambladoresOcupadosFab2.esta_vacia()) {
            Procesos siguiente = colaEnsambladoresOcupadosFab2.getPfirst().getproceso();
            colaEnsambladoresOcupadosFab2.Desencolar();
            siguiente.suspend();
            siguiente.sem1.release();
            siguiente.sem2.release();
            siguiente.sem3.release();;
            siguiente.sem4.release();
            ensambladoresFab2.setText(Integer.toString(Integer.parseInt(ensambladoresFab2.getText())-1));
            empleadosFab2++;
        }
    }//GEN-LAST:event_eliminarEF2ActionPerformed

    private void agregarEF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEF2ActionPerformed
        agregarFab2(5,colaEnsambladoresLibresFab2, colaEnsambladoresOcupadosFab2, ensambladoresFab2);
    }//GEN-LAST:event_agregarEF2ActionPerformed

    private void agregarPCF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPCF2ActionPerformed
        agregarFab2(4,colaLibreCamarasFab2, colaOcupadoCamarasFab2, productoresCFab2);
    }//GEN-LAST:event_agregarPCF2ActionPerformed

    private void eliminarPCF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPCF2ActionPerformed
        quitarFab2(colaOcupadoCamarasFab2, colaLibreCamarasFab2, productoresCFab2, CFab2, sem4Fab2);
    }//GEN-LAST:event_eliminarPCF2ActionPerformed

    private void agregarPPCF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPPCF2ActionPerformed
        agregarFab2(3,colaLibrePinesCFab2, colaOcupadoPinesCFab2, productoresPCFab2);
    }//GEN-LAST:event_agregarPPCF2ActionPerformed

    private void eliminarPPCF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPPCF2ActionPerformed
        quitarFab2(colaOcupadoPinesCFab2, colaLibrePinesCFab2, productoresPCFab2, PcFab2, sem3Fab2);
    }//GEN-LAST:event_eliminarPPCF2ActionPerformed

    private void agregarPBF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPBF2ActionPerformed
        agregarFab2(2,colaLibreBotonesFab2, colaOcupadoBotonesFab2, productoresBFab2);

    }//GEN-LAST:event_agregarPBF2ActionPerformed

    private void eliminarPBF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPBF2ActionPerformed
        quitarFab2(colaOcupadoBotonesFab2, colaLibreBotonesFab2, productoresBFab2, BFab2, sem2Fab2);
    }//GEN-LAST:event_eliminarPBF2ActionPerformed

    private void agregarPPF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPPF2ActionPerformed
        agregarFab2(1,colaLibrePantallaFab2, ColaOcupadoPantallaFab2, productoresPFab2);
    }//GEN-LAST:event_agregarPPF2ActionPerformed

    private void eliminarPPF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPPF2ActionPerformed
        quitarFab2(ColaOcupadoPantallaFab2, colaLibrePantallaFab2, productoresPFab2, sem1Fab2, pFab2);
    }//GEN-LAST:event_eliminarPPF2ActionPerformed

    private void eliminarEF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEF1ActionPerformed
        if ( !colaEnsambladoresOcupadosFab1.esta_vacia()) {
            Procesos siguiente = colaEnsambladoresOcupadosFab1.getPfirst().getproceso();
            colaEnsambladoresOcupadosFab1.Desencolar();
            siguiente.suspend();
            siguiente.sem1.release();
            siguiente.sem2.release();
            siguiente.sem3.release();;
            siguiente.sem4.release();
            ensambladoresFab1.setText(Integer.toString(Integer.parseInt(ensambladoresFab1.getText())-1));
            empleadosFab1++;
        }
    }//GEN-LAST:event_eliminarEF1ActionPerformed

    private void agregarEF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEF1ActionPerformed
        agregarFab1(5,colaEnsambladoresLibresFab1, colaEnsambladoresOcupadosFab1, ensambladoresFab1);
    }//GEN-LAST:event_agregarEF1ActionPerformed

    private void agregarPCF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPCF1ActionPerformed
        agregarFab1(4,colaLibreCamarasFab1, colaOcupadoCamarasFab1, productoresCFab1);
    }//GEN-LAST:event_agregarPCF1ActionPerformed

    private void eliminarPCF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPCF1ActionPerformed
        quitarFab1(colaOcupadoCamarasFab1, colaLibreCamarasFab1, productoresCFab1, CFab1, sem4Fab1);
    }//GEN-LAST:event_eliminarPCF1ActionPerformed

    private void agregarPPCF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPPCF1ActionPerformed
        agregarFab1(3,colaLibrePinesCFab1, colaOcupadoPinesCFab1, productoresPCFab1);
    }//GEN-LAST:event_agregarPPCF1ActionPerformed

    private void eliminarPPCF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPPCF1ActionPerformed
        quitarFab1(colaOcupadoPinesCFab1, colaLibrePinesCFab1, productoresPCFab1, PcFab1, sem3Fab1);
    }//GEN-LAST:event_eliminarPPCF1ActionPerformed

    private void agregarPBF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPBF1ActionPerformed
        agregarFab1(2,colaLibreBotonesFab1, colaOcupadoBotonesFab1, productoresBFab1);
    }//GEN-LAST:event_agregarPBF1ActionPerformed

    private void eliminarPBF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPBF1ActionPerformed
        quitarFab1(colaOcupadoBotonesFab1, colaOcupadoBotonesFab1, productoresBFab1, BFab1, sem2Fab1);
    }//GEN-LAST:event_eliminarPBF1ActionPerformed

    private void agregarPPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPPF1ActionPerformed
        agregarFab1(1, colaLibrePantallaFab1, ColaOcupadoPantallaFab1, productoresPFab1);
    }//GEN-LAST:event_agregarPPF1ActionPerformed

    private void eliminarPPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPPF1ActionPerformed
        quitarFab1(ColaOcupadoPantallaFab1, colaLibrePantallaFab1, productoresPFab1, sem1Fab1, pFab1);
    }//GEN-LAST:event_eliminarPPF1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFabrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFabrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Countdown;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton agregarEF1;
    private javax.swing.JButton agregarEF2;
    private javax.swing.JButton agregarPBF1;
    private javax.swing.JButton agregarPBF2;
    private javax.swing.JButton agregarPCF1;
    private javax.swing.JButton agregarPCF2;
    private javax.swing.JButton agregarPPCF1;
    private javax.swing.JButton agregarPPCF2;
    private javax.swing.JButton agregarPPF1;
    private javax.swing.JButton agregarPPF2;
    private javax.swing.JLabel cantidadBFab1;
    private javax.swing.JLabel cantidadBFab2;
    private javax.swing.JLabel cantidadCFab1;
    private javax.swing.JLabel cantidadCFab2;
    private javax.swing.JLabel cantidadPCFab1;
    private javax.swing.JLabel cantidadPCFab2;
    private javax.swing.JLabel cantidadPFab1;
    private javax.swing.JLabel cantidadPFab2;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton eliminarEF1;
    private javax.swing.JButton eliminarEF2;
    private javax.swing.JButton eliminarPBF1;
    private javax.swing.JButton eliminarPBF2;
    private javax.swing.JButton eliminarPCF1;
    private javax.swing.JButton eliminarPCF2;
    private javax.swing.JButton eliminarPPCF1;
    private javax.swing.JButton eliminarPPCF2;
    private javax.swing.JButton eliminarPPF1;
    private javax.swing.JButton eliminarPPF2;
    private javax.swing.JLabel ensambladoresFab1;
    private javax.swing.JLabel ensambladoresFab2;
    private javax.swing.JLabel estadoGerenteFab1;
    private javax.swing.JLabel estadoGerenteFab2;
    private javax.swing.JLabel estadoJefeFab1;
    private javax.swing.JLabel estadoJefeFab2;
    private javax.swing.JButton iniciarFabricas;
    private javax.swing.JButton irSimulacionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel maxBFab1;
    private javax.swing.JLabel maxBFab2;
    private javax.swing.JLabel maxCFab1;
    private javax.swing.JLabel maxCFab2;
    private javax.swing.JLabel maxPCFab1;
    private javax.swing.JLabel maxPCFab2;
    private javax.swing.JLabel maxPFab1;
    private javax.swing.JLabel maxPFab2;
    private javax.swing.JLabel productoresBFab1;
    private javax.swing.JLabel productoresBFab2;
    private javax.swing.JLabel productoresCFab1;
    private javax.swing.JLabel productoresCFab2;
    private javax.swing.JLabel productoresPCFab1;
    private javax.swing.JLabel productoresPCFab2;
    private javax.swing.JLabel productoresPFab1;
    private javax.swing.JLabel productoresPFab2;
    private javax.swing.JLabel sueldoBFab1;
    private javax.swing.JLabel sueldoBFab2;
    private javax.swing.JLabel sueldoCFab1;
    private javax.swing.JLabel sueldoCFab2;
    private javax.swing.JLabel sueldoEFab1;
    private javax.swing.JLabel sueldoEFab2;
    private javax.swing.JLabel sueldoGFab1;
    private javax.swing.JLabel sueldoGFab2;
    private javax.swing.JLabel sueldoJFab1;
    private javax.swing.JLabel sueldoJFab2;
    private javax.swing.JLabel sueldoPCFab1;
    private javax.swing.JLabel sueldoPCFab2;
    private javax.swing.JLabel sueldoPFab1;
    private javax.swing.JLabel sueldoPFab2;
    private javax.swing.JLabel telefonosProducidosFab1;
    private javax.swing.JLabel telefonosProducidosFab2;
    // End of variables declaration//GEN-END:variables
}
