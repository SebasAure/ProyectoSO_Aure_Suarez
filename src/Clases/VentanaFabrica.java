/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class VentanaFabrica extends javax.swing.JFrame {
    archivoCsv archivo = new archivoCsv();
    
    
    //Fabrica 1
    String cadenaFab1 = "";
    int diasFab1;
    long diaFab1=0;
    int empleadosFab1 = 19;
    cola2 colaLibrePantallaFab1 = new cola2();
    cola2 ColaOcupadoPantallaFab1 = new cola2();
    cola2 colaLibreBotonesFab1 = new cola2();
    cola2 colaOcupadoBotonesFab1 = new cola2();
    cola2 colaLibrePinesCFab1 = new cola2();
    cola2 colaOcupadoPinesCFab1 = new cola2();
    cola2 colaLibreCamarasFab1 = new cola2();
    cola2 colaOcupadoCamarasFab1 = new cola2();
    cola2 colaEnsambladoresLibresFab1 = new cola2(); 
    cola2 colaEnsambladoresOcupadosFab1 = new cola2();
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
    String cadenaFab2 = "";
    long diaFab2=0;
    int diasFab2;
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
    Thread Total;
    // Historico
    String[] historicoDespachos = new String[7];
     
    

    public void agregarFab1(int tipo,cola2 libre,cola2 ocupada,JLabel trabajador){
        if (empleadosFab1!=0) {
            if (tipo==1) {
           
                ProcesosFab1 hiloP = new ProcesosFab1(tipo, cantidadPFab1, sem1Fab1, almacenPantallasFab1, diaFab2, pFab1,CountdownFab2);
                ocupada.Encolar(hiloP);
                hiloP.start();
            }if (tipo==2) {
                ProcesosFab1 hiloB = new ProcesosFab1(tipo, sem2Fab1, almacenBotonesFab1, cantidadBFab1, diaFab2, BFab1,CountdownFab2);
                ocupada.Encolar(hiloB);
                hiloB.start();
            }if (tipo==3) {
                ProcesosFab1 hiloPc = new ProcesosFab1(tipo, sem3Fab1, cantidadPCFab1, almacenPinesCFab1, diaFab2, PcFab1,CountdownFab2);
                ocupada.Encolar(hiloPc);
                hiloPc.start();
            }if (tipo==4) {
                ProcesosFab1 hiloC = new ProcesosFab1(cantidadCFab1, tipo, sem4Fab1, almacenCamarasFab1, diaFab2, CFab1,CountdownFab2);
                ocupada.Encolar(hiloC);
                hiloC.start();
            }if (tipo==5) {
                ProcesosFab1 hiloE = new ProcesosFab1(mutex4Fab1, mutex3Fab1, mutex2Fab1, mutex1Fab1, diaFab2, tipo, sem1Fab1, sem2Fab1, sem3Fab1, sem4Fab1, cantidadPFab1, cantidadBFab1, cantidadPCFab1, cantidadCFab1, ensambladoresFab1, telefonosProducidosFab1, almacenPantallasFab1, almacenBotonesFab1, almacenPinesCFab1, almacenCamarasFab1,CountdownFab2);
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
                Procesos hiloP = new Procesos(tipo, cantidadPFab2, sem1Fab2, almacenPantallasFab2, diaFab2, pFab2,CountdownFab2);
                ocupada.Encolar(hiloP);
                hiloP.start();
            }if (tipo==2) {
                Procesos hiloB = new Procesos(tipo, sem2Fab2, almacenBotonesFab2, cantidadBFab2, diaFab2, BFab2,CountdownFab2);
                ocupada.Encolar(hiloB);
                hiloB.start();
            }if (tipo==3) {
                Procesos hiloPc = new Procesos(tipo, sem3Fab2, cantidadPCFab2, almacenPinesCFab2, diaFab2, PcFab2,CountdownFab2);
                ocupada.Encolar(hiloPc);
                hiloPc.start();
            }if (tipo==4) {
                Procesos hiloC = new Procesos(cantidadCFab2, tipo, sem4Fab2, almacenCamarasFab2, diaFab2, CFab2,CountdownFab2);
                ocupada.Encolar(hiloC);
                hiloC.start();
            }if (tipo==5) {
                Procesos hiloE = new Procesos(mutex4Fab2, mutex3Fab2, mutex2Fab2, mutex1Fab2, diaFab2, tipo, sem1Fab2, sem2Fab2, sem3Fab2, sem4Fab2, cantidadPFab2, cantidadBFab2, cantidadPCFab2, cantidadCFab2, ensambladoresFab2, telefonosProducidosFab2, almacenPantallasFab2, almacenBotonesFab2, almacenPinesCFab2, almacenCamarasFab2,CountdownFab2);
                ocupada.Encolar(hiloE);
                hiloE.start();
            }
        trabajador.setText(Integer.toString(Integer.parseInt(trabajador.getText())+1));
        empleadosFab2--;
        }
    }
    public void quitarFab1(cola2 ocupado,cola2 libre,JLabel trabajadores,Semaphore mutexq,Semaphore semq){
        if (ocupado.getSize() > 1) {
        if ( !ocupado.esta_vacia()) {
        ProcesosFab1 siguiente = ocupado.getPfirst().getproceso();
        ocupado.Desencolar();
        libre.Encolar(siguiente);
        mutexq.release();
        semq.release();
        siguiente.suspend();
        trabajadores.setText(Integer.toString(Integer.parseInt(trabajadores.getText())-1));
        empleadosFab1++;
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No puede dejar este departamento sin productores (Despedirian al Gerente)");
        }
    }
    public void quitarFab2(Cola ocupado,Cola libre,JLabel trabajadores,Semaphore mutexq,Semaphore semq){
        if (ocupado.getSize() > 1) {
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
        }else{
            JOptionPane.showMessageDialog(rootPane, "No puede dejar este departamento sin productores (Despedirian al Gerente)");
        }
    }

    /**
     * Creates new form VentanaFabrica
     */
    public VentanaFabrica() {
        initComponents();
        agregarPPF1.setEnabled(false);
        agregarPBF1.setEnabled(false);
        agregarPPCF1.setEnabled(false);
        agregarPCF1.setEnabled(false);
        agregarEF1.setEnabled(false);

        agregarPPF2.setEnabled(false);
        agregarPBF2.setEnabled(false);
        agregarPPCF2.setEnabled(false);
        agregarPCF2.setEnabled(false);
        agregarEF2.setEnabled(false);
        
        
        // Fabrica 1
        diaFab1 = archivo.leerPorDefectoFab1(diaFab1, CountdownFab1, maxPFab1, maxBFab1, maxPCFab1, maxCFab1);
        almacenPantallasFab1 = new Semaphore(Integer.parseInt(maxPFab2.getText()));
        almacenBotonesFab1 = new Semaphore(Integer.parseInt(maxBFab2.getText()));
        almacenPinesCFab1 = new Semaphore(Integer.parseInt(maxPCFab2.getText()));
        almacenCamarasFab1 = new Semaphore(Integer.parseInt(maxCFab2.getText()));
        
        // Fabrica 2
        diaFab2 = archivo.leerPorDefectoFab2(diaFab2, CountdownFab2, maxPFab2, maxBFab2, maxPCFab2, maxCFab2);
        almacenPantallasFab2 = new Semaphore(Integer.parseInt(maxPFab2.getText()));
        almacenBotonesFab2 = new Semaphore(Integer.parseInt(maxBFab2.getText()));
        almacenPinesCFab2 = new Semaphore(Integer.parseInt(maxPCFab2.getText()));
        almacenCamarasFab2 = new Semaphore(Integer.parseInt(maxCFab2.getText()));
        aggDashboard.setEnabled(false);
        
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
        iniciarFabricas = new javax.swing.JButton();
        CountdownFab2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        productoresBFab1 = new javax.swing.JLabel();
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
        Parametros = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        netofab1 = new javax.swing.JLabel();
        gastosfab1 = new javax.swing.JLabel();
        gananciasfab1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        netofab2 = new javax.swing.JLabel();
        gastosfab2 = new javax.swing.JLabel();
        gananciasfab2 = new javax.swing.JLabel();
        Reiniciar = new javax.swing.JButton();
        aggDashboard = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        CountdownFab1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(204, 204, 204));
        Panel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Componente");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pantalla(s)");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fabrica 1 ");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        productoresPCFab1.setBackground(new java.awt.Color(153, 153, 153));
        productoresPCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresPCFab1.setText("0");
        Panel.add(productoresPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 10, -1));

        ensambladoresFab2.setBackground(new java.awt.Color(153, 153, 153));
        ensambladoresFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        ensambladoresFab2.setForeground(new java.awt.Color(0, 0, 0));
        ensambladoresFab2.setText("0");
        Panel.add(ensambladoresFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Unidades ");
        Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 250, 70, -1));

        eliminarPPF1.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPPF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPPF1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPPF1.setText("-");
        eliminarPPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 40, 30));

        sueldoEFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoEFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoEFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoEFab2.setText("0");
        Panel.add(sueldoEFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 30, -1));

        agregarPPF1.setBackground(new java.awt.Color(51, 51, 51));
        agregarPPF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPPF1.setForeground(new java.awt.Color(255, 255, 255));
        agregarPPF1.setText("+");
        agregarPPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 40, 30));

        eliminarPBF1.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPBF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPBF1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPBF1.setText("-");
        eliminarPBF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPBF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPBF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 40, 30));

        agregarPBF1.setBackground(new java.awt.Color(51, 51, 51));
        agregarPBF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPBF1.setForeground(new java.awt.Color(255, 255, 255));
        agregarPBF1.setText("+");
        agregarPBF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPBF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPBF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 40, 30));

        eliminarPPCF1.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPPCF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPPCF1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPPCF1.setText("-");
        eliminarPPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPCF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 40, 30));

        agregarPPCF1.setBackground(new java.awt.Color(51, 51, 51));
        agregarPPCF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPPCF1.setForeground(new java.awt.Color(255, 255, 255));
        agregarPPCF1.setText("+");
        agregarPPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPCF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 40, 30));

        eliminarPCF1.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPCF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPCF1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPCF1.setText("-");
        eliminarPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPCF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 40, 30));

        agregarPCF1.setBackground(new java.awt.Color(51, 51, 51));
        agregarPCF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPCF1.setForeground(new java.awt.Color(255, 255, 255));
        agregarPCF1.setText("+");
        agregarPCF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPCF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarPCF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 40, 30));

        maxBFab1.setBackground(new java.awt.Color(153, 153, 153));
        maxBFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxBFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxBFab1.setText("45");
        Panel.add(maxBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 20, -1));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ensambladores");
        Panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        agregarEF1.setBackground(new java.awt.Color(51, 51, 51));
        agregarEF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarEF1.setForeground(new java.awt.Color(255, 255, 255));
        agregarEF1.setText("+");
        agregarEF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEF1ActionPerformed(evt);
            }
        });
        Panel.add(agregarEF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 40, 30));

        eliminarEF1.setBackground(new java.awt.Color(51, 51, 51));
        eliminarEF1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarEF1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarEF1.setText("-");
        eliminarEF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEF1ActionPerformed(evt);
            }
        });
        Panel.add(eliminarEF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 40, 30));

        telefonosProducidosFab1.setBackground(new java.awt.Color(153, 153, 153));
        telefonosProducidosFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        telefonosProducidosFab1.setForeground(new java.awt.Color(0, 0, 0));
        telefonosProducidosFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonosProducidosFab1.setText("0");
        Panel.add(telefonosProducidosFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 50, -1));

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Xperia 1 IV ");
        Panel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 160, -1));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Productores");
        Panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel32.setBackground(new java.awt.Color(153, 153, 153));
        jLabel32.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Sueldo");
        Panel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 60, -1));

        eliminarPPF2.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPPF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPPF2.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPPF2.setText("-");
        eliminarPPF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 40, 30));

        productoresBFab2.setBackground(new java.awt.Color(153, 153, 153));
        productoresBFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresBFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresBFab2.setText("0");
        Panel.add(productoresBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 20, 20));

        productoresCFab2.setBackground(new java.awt.Color(153, 153, 153));
        productoresCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresCFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresCFab2.setText("0");
        Panel.add(productoresCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 20, -1));

        productoresPCFab2.setBackground(new java.awt.Color(153, 153, 153));
        productoresPCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresPCFab2.setText("0");
        Panel.add(productoresPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 20, -1));

        agregarPPF2.setBackground(new java.awt.Color(51, 51, 51));
        agregarPPF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPPF2.setForeground(new java.awt.Color(255, 255, 255));
        agregarPPF2.setText("+");
        agregarPPF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 40, 30));

        eliminarPBF2.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPBF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPBF2.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPBF2.setText("-");
        eliminarPBF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPBF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPBF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 40, 30));

        agregarPBF2.setBackground(new java.awt.Color(51, 51, 51));
        agregarPBF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPBF2.setForeground(new java.awt.Color(255, 255, 255));
        agregarPBF2.setText("+");
        agregarPBF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPBF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPBF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 40, 30));

        eliminarPPCF2.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPPCF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPPCF2.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPPCF2.setText("-");
        eliminarPPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPPCF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 40, 30));

        agregarPPCF2.setBackground(new java.awt.Color(51, 51, 51));
        agregarPPCF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPPCF2.setForeground(new java.awt.Color(255, 255, 255));
        agregarPPCF2.setText("+");
        agregarPPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPPCF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 40, 30));

        eliminarPCF2.setBackground(new java.awt.Color(51, 51, 51));
        eliminarPCF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarPCF2.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPCF2.setText("-");
        eliminarPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPCF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 40, 30));

        agregarPCF2.setBackground(new java.awt.Color(51, 51, 51));
        agregarPCF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarPCF2.setForeground(new java.awt.Color(255, 255, 255));
        agregarPCF2.setText("+");
        agregarPCF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPCF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarPCF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 40, 30));

        productoresPFab2.setBackground(new java.awt.Color(153, 153, 153));
        productoresPFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresPFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresPFab2.setText("0");
        Panel.add(productoresPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 20, -1));
        Panel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 20, -1));

        agregarEF2.setBackground(new java.awt.Color(51, 51, 51));
        agregarEF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        agregarEF2.setForeground(new java.awt.Color(255, 255, 255));
        agregarEF2.setText("+");
        agregarEF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEF2ActionPerformed(evt);
            }
        });
        Panel.add(agregarEF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 40, 30));

        eliminarEF2.setBackground(new java.awt.Color(51, 51, 51));
        eliminarEF2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        eliminarEF2.setForeground(new java.awt.Color(255, 255, 255));
        eliminarEF2.setText("-");
        eliminarEF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEF2ActionPerformed(evt);
            }
        });
        Panel.add(eliminarEF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 40, 30));

        telefonosProducidosFab2.setBackground(new java.awt.Color(153, 153, 153));
        telefonosProducidosFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        telefonosProducidosFab2.setForeground(new java.awt.Color(0, 0, 0));
        telefonosProducidosFab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonosProducidosFab2.setText("0");
        Panel.add(telefonosProducidosFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 50, 20));

        jLabel48.setBackground(new java.awt.Color(153, 153, 153));
        jLabel48.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Xperia 10 IV");
        Panel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 160, -1));

        jLabel49.setBackground(new java.awt.Color(153, 153, 153));
        jLabel49.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Gerente esta...");
        Panel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 196, -1, 30));

        jLabel50.setBackground(new java.awt.Color(153, 153, 153));
        jLabel50.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Jefe esta... ");
        Panel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 20));

        jLabel51.setBackground(new java.awt.Color(153, 153, 153));
        jLabel51.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Fabrica 2");
        Panel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        estadoGerenteFab1.setBackground(new java.awt.Color(153, 153, 153));
        estadoGerenteFab1.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        estadoGerenteFab1.setForeground(new java.awt.Color(0, 0, 0));
        estadoGerenteFab1.setText("null");
        Panel.add(estadoGerenteFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 20));

        sueldoGFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoGFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoGFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoGFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoGFab1.setText("0");
        Panel.add(sueldoGFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 50, 20));

        estadoGerenteFab2.setBackground(new java.awt.Color(153, 153, 153));
        estadoGerenteFab2.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        estadoGerenteFab2.setForeground(new java.awt.Color(0, 0, 0));
        estadoGerenteFab2.setText("null");
        Panel.add(estadoGerenteFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 160, 20));

        estadoJefeFab2.setBackground(new java.awt.Color(153, 153, 153));
        estadoJefeFab2.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        estadoJefeFab2.setForeground(new java.awt.Color(0, 0, 0));
        estadoJefeFab2.setText("null");
        Panel.add(estadoJefeFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 190, 20));

        iniciarFabricas.setBackground(new java.awt.Color(51, 51, 51));
        iniciarFabricas.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        iniciarFabricas.setForeground(new java.awt.Color(255, 255, 255));
        iniciarFabricas.setText("Iniciar Simulacion");
        iniciarFabricas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarFabricasActionPerformed(evt);
            }
        });
        Panel.add(iniciarFabricas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 160, 40));

        CountdownFab2.setBackground(new java.awt.Color(153, 153, 153));
        CountdownFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        CountdownFab2.setForeground(new java.awt.Color(0, 0, 0));
        CountdownFab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CountdownFab2.setText("0");
        Panel.add(CountdownFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 50, 20));

        jLabel38.setBackground(new java.awt.Color(153, 153, 153));
        jLabel38.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Productores");
        Panel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel58.setBackground(new java.awt.Color(153, 153, 153));
        jLabel58.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Botones");
        Panel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        productoresBFab1.setBackground(new java.awt.Color(153, 153, 153));
        productoresBFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresBFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresBFab1.setText("0");
        Panel.add(productoresBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Pines de carga");
        Panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 120, -1));

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Camara(s)");
        Panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        productoresPFab1.setBackground(new java.awt.Color(153, 153, 153));
        productoresPFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresPFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresPFab1.setText("0");
        Panel.add(productoresPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 20, -1));

        cantidadBFab1.setBackground(new java.awt.Color(153, 153, 153));
        cantidadBFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadBFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadBFab1.setText("0");
        Panel.add(cantidadBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 20, -1));

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("/");
        Panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 20, -1));

        ensambladoresFab1.setBackground(new java.awt.Color(153, 153, 153));
        ensambladoresFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        ensambladoresFab1.setForeground(new java.awt.Color(0, 0, 0));
        ensambladoresFab1.setText("0");
        Panel.add(ensambladoresFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 20, -1));

        cantidadPFab1.setBackground(new java.awt.Color(153, 153, 153));
        cantidadPFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadPFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPFab1.setText("0");
        Panel.add(cantidadPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 20, -1));

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("/");
        Panel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 20, -1));

        maxPCFab1.setBackground(new java.awt.Color(153, 153, 153));
        maxPCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxPCFab1.setText("15");
        Panel.add(maxPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 20, -1));

        cantidadPCFab1.setBackground(new java.awt.Color(153, 153, 153));
        cantidadPCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPCFab1.setText("0");
        Panel.add(cantidadPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 20, -1));

        jLabel40.setBackground(new java.awt.Color(153, 153, 153));
        jLabel40.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("/");
        Panel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 20, -1));

        maxCFab1.setBackground(new java.awt.Color(153, 153, 153));
        maxCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxCFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxCFab1.setText("20");
        Panel.add(maxCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 20, -1));

        cantidadCFab1.setBackground(new java.awt.Color(153, 153, 153));
        cantidadCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadCFab1.setForeground(new java.awt.Color(0, 0, 0));
        cantidadCFab1.setText("0");
        Panel.add(cantidadCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 20, -1));

        jLabel43.setBackground(new java.awt.Color(153, 153, 153));
        jLabel43.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("/");
        Panel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 20, -1));

        estadoJefeFab1.setBackground(new java.awt.Color(153, 153, 153));
        estadoJefeFab1.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        estadoJefeFab1.setForeground(new java.awt.Color(0, 0, 0));
        estadoJefeFab1.setText("null");
        Panel.add(estadoJefeFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 170, 20));

        sueldoJFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoJFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoJFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoJFab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoJFab2.setText("0");
        Panel.add(sueldoJFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 50, 20));

        maxPFab1.setBackground(new java.awt.Color(153, 153, 153));
        maxPFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxPFab1.setForeground(new java.awt.Color(0, 0, 0));
        maxPFab1.setText("40");
        Panel.add(maxPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 20, -1));

        sueldoPFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoPFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoPFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoPFab1.setText("0");
        Panel.add(sueldoPFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 50, 30));

        sueldoBFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoBFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoBFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoBFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoBFab1.setText("0");
        Panel.add(sueldoBFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 50, 30));

        sueldoPCFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoPCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoPCFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPCFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoPCFab1.setText("0");
        Panel.add(sueldoPCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 50, 30));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Unidades ");
        Panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 70, -1));

        maxBFab2.setBackground(new java.awt.Color(153, 153, 153));
        maxBFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxBFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxBFab2.setText("45");
        Panel.add(maxBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 20, -1));

        jLabel60.setBackground(new java.awt.Color(153, 153, 153));
        jLabel60.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Sueldo");
        Panel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 80, -1));

        sueldoGFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoGFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoGFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoGFab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoGFab2.setText("0");
        Panel.add(sueldoGFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 50, 20));

        cantidadBFab2.setBackground(new java.awt.Color(153, 153, 153));
        cantidadBFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadBFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadBFab2.setText("0");
        Panel.add(cantidadBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 20, -1));

        jLabel63.setBackground(new java.awt.Color(153, 153, 153));
        jLabel63.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("/");
        Panel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 20, -1));

        sueldoCFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoCFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoCFab2.setText("0");
        Panel.add(sueldoCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 30, -1));

        cantidadPFab2.setBackground(new java.awt.Color(153, 153, 153));
        cantidadPFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadPFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPFab2.setText("0");
        Panel.add(cantidadPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 20, -1));

        jLabel66.setBackground(new java.awt.Color(153, 153, 153));
        jLabel66.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("/");
        Panel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 20, -1));

        maxPCFab2.setBackground(new java.awt.Color(153, 153, 153));
        maxPCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxPCFab2.setText("15");
        Panel.add(maxPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 20, -1));

        cantidadPCFab2.setBackground(new java.awt.Color(153, 153, 153));
        cantidadPCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadPCFab2.setText("0");
        Panel.add(cantidadPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 20, -1));

        jLabel69.setBackground(new java.awt.Color(153, 153, 153));
        jLabel69.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("/");
        Panel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 20, -1));

        maxCFab2.setBackground(new java.awt.Color(153, 153, 153));
        maxCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxCFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxCFab2.setText("20");
        Panel.add(maxCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 20, -1));

        cantidadCFab2.setBackground(new java.awt.Color(153, 153, 153));
        cantidadCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        cantidadCFab2.setForeground(new java.awt.Color(0, 0, 0));
        cantidadCFab2.setText("0");
        Panel.add(cantidadCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 20, -1));

        jLabel72.setBackground(new java.awt.Color(153, 153, 153));
        jLabel72.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("/");
        Panel.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 20, -1));

        sueldoJFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoJFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoJFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoJFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoJFab1.setText("0");
        Panel.add(sueldoJFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 50, 20));

        maxPFab2.setBackground(new java.awt.Color(153, 153, 153));
        maxPFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        maxPFab2.setForeground(new java.awt.Color(0, 0, 0));
        maxPFab2.setText("40");
        Panel.add(maxPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 20, -1));

        sueldoPFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoPFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoPFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPFab2.setText("0");
        Panel.add(sueldoPFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 30, -1));

        sueldoBFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoBFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoBFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoBFab2.setText("0");
        Panel.add(sueldoBFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 30, -1));

        sueldoPCFab2.setBackground(new java.awt.Color(153, 153, 153));
        sueldoPCFab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoPCFab2.setForeground(new java.awt.Color(0, 0, 0));
        sueldoPCFab2.setText("0");
        Panel.add(sueldoPCFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 30, -1));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Ensambladores");
        Panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        productoresCFab1.setBackground(new java.awt.Color(153, 153, 153));
        productoresCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        productoresCFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresCFab1.setText("0");
        Panel.add(productoresCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        sueldoCFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoCFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoCFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoCFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoCFab1.setText("0");
        Panel.add(sueldoCFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 50, 30));

        sueldoEFab1.setBackground(new java.awt.Color(153, 153, 153));
        sueldoEFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        sueldoEFab1.setForeground(new java.awt.Color(0, 0, 0));
        sueldoEFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sueldoEFab1.setText("0");
        Panel.add(sueldoEFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 50, 30));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fabrica 2");
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 160, -1));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Fabrica 1");
        Panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 146, 160, 20));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SONYC");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irSimulacionButton.setBackground(new java.awt.Color(0, 0, 0));
        irSimulacionButton.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
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
        dashboardButton.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
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

        Parametros.setBackground(new java.awt.Color(0, 0, 0));
        Parametros.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        Parametros.setForeground(new java.awt.Color(204, 204, 204));
        Parametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/baseline_class_black_24dp.png"))); // NOI18N
        Parametros.setText("Parametros");
        Parametros.setBorder(null);
        Parametros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParametrosActionPerformed(evt);
            }
        });
        jPanel3.add(Parametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 130, 40));

        Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 500));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Neto");
        Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 50, 20));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Producidos");
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 80, 20));

        jLabel18.setBackground(new java.awt.Color(153, 153, 153));
        jLabel18.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Ganancia");
        Panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 80, 20));

        netofab1.setBackground(new java.awt.Color(153, 153, 153));
        netofab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        netofab1.setForeground(new java.awt.Color(0, 0, 0));
        netofab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        netofab1.setText("0");
        Panel.add(netofab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 50, 20));

        gastosfab1.setBackground(new java.awt.Color(153, 153, 153));
        gastosfab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        gastosfab1.setForeground(new java.awt.Color(0, 0, 0));
        gastosfab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gastosfab1.setText("0");
        Panel.add(gastosfab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 50, 20));

        gananciasfab1.setBackground(new java.awt.Color(153, 153, 153));
        gananciasfab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        gananciasfab1.setForeground(new java.awt.Color(0, 0, 0));
        gananciasfab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gananciasfab1.setText("0");
        Panel.add(gananciasfab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 50, 20));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Neto");
        Panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 50, 20));

        jLabel25.setBackground(new java.awt.Color(153, 153, 153));
        jLabel25.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Gastos");
        Panel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 50, 20));

        jLabel27.setBackground(new java.awt.Color(153, 153, 153));
        jLabel27.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Ganancia");
        Panel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 80, 20));

        netofab2.setBackground(new java.awt.Color(153, 153, 153));
        netofab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        netofab2.setForeground(new java.awt.Color(0, 0, 0));
        netofab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        netofab2.setText("0");
        Panel.add(netofab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 50, 20));

        gastosfab2.setBackground(new java.awt.Color(153, 153, 153));
        gastosfab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        gastosfab2.setForeground(new java.awt.Color(0, 0, 0));
        gastosfab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gastosfab2.setText("0");
        Panel.add(gastosfab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 50, 20));

        gananciasfab2.setBackground(new java.awt.Color(153, 153, 153));
        gananciasfab2.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        gananciasfab2.setForeground(new java.awt.Color(0, 0, 0));
        gananciasfab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gananciasfab2.setText("0");
        Panel.add(gananciasfab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 50, 20));

        Reiniciar.setBackground(new java.awt.Color(51, 51, 51));
        Reiniciar.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        Reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        Panel.add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, 40));

        aggDashboard.setBackground(new java.awt.Color(51, 51, 51));
        aggDashboard.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        aggDashboard.setForeground(new java.awt.Color(255, 255, 255));
        aggDashboard.setText("Guardar Corrida");
        aggDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggDashboardActionPerformed(evt);
            }
        });
        Panel.add(aggDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 140, 40));

        jLabel36.setBackground(new java.awt.Color(153, 153, 153));
        jLabel36.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Dias restantes para despacho en Fabrica 2:");
        Panel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 310, 40));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SIMULACION");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 770, 20));
        Panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 770, 10));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Gastos");
        Panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 50, 20));

        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Producidos");
        Panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 80, 20));

        jLabel28.setBackground(new java.awt.Color(153, 153, 153));
        jLabel28.setToolTipText("");
        jLabel28.setOpaque(true);
        Panel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 590, 370));

        jLabel30.setBackground(new java.awt.Color(153, 153, 153));
        jLabel30.setToolTipText("");
        jLabel30.setOpaque(true);
        Panel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 170, 180));

        jLabel31.setBackground(new java.awt.Color(153, 153, 153));
        jLabel31.setToolTipText("");
        jLabel31.setOpaque(true);
        Panel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 170, 180));

        jLabel37.setBackground(new java.awt.Color(153, 153, 153));
        jLabel37.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Dias restantes para despacho en Fabrica 1:");
        Panel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 310, 40));

        CountdownFab1.setBackground(new java.awt.Color(153, 153, 153));
        CountdownFab1.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        CountdownFab1.setForeground(new java.awt.Color(0, 0, 0));
        CountdownFab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CountdownFab1.setText("0");
        Panel.add(CountdownFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 50, 20));

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
        agregarPPF1.setEnabled(true);
        agregarPBF1.setEnabled(true);
        agregarPPCF1.setEnabled(true);
        agregarPCF1.setEnabled(true);
        agregarEF1.setEnabled(true);

        agregarPPF2.setEnabled(true);
        agregarPBF2.setEnabled(true);
        agregarPPCF2.setEnabled(true);
        agregarPCF2.setEnabled(true);
        agregarEF2.setEnabled(true);
        
        Reiniciar.setEnabled(false);
        dashboardButton.setEnabled(false);
        Parametros.setEnabled(false);
        iniciarFabricas.setEnabled(false);
        //Fabrica 1
        if (colaEnsambladoresOcupadosFab1.esta_vacia()) {
        empleadosFab1 = archivo.leerPorDefecto2Fab1(diaFab1,empleadosFab1,colaLibrePantallaFab1,ColaOcupadoPantallaFab1,colaLibreBotonesFab1,colaOcupadoBotonesFab1,colaLibrePinesCFab1,colaOcupadoPinesCFab1,colaLibreCamarasFab1,colaOcupadoCamarasFab1,productoresPFab1,productoresBFab1,productoresPCFab1,productoresCFab1,colaEnsambladoresLibresFab1,colaEnsambladoresOcupadosFab1,ensambladoresFab1,cantidadPFab1,cantidadBFab1,cantidadPCFab1,cantidadCFab1,telefonosProducidosFab1,sem1Fab1,sem2Fab1,sem3Fab1,sem4Fab1,almacenPantallasFab1,almacenBotonesFab1,almacenPinesCFab1,almacenCamarasFab1,pFab1,BFab1,PcFab1,CFab1,mutex4Fab1,mutex3Fab1,mutex2Fab1,mutex1Fab1,CountdownFab1);
        }else{
            diaFab1=archivo.leerPorDefectoFab1(diaFab1, CountdownFab1, maxPFab1, maxBFab1, maxPCFab1, maxCFab1);
        }
        diasFab1=Integer.parseInt(CountdownFab1.getText());
        ProcesosFab1 pagosFab1 = new ProcesosFab1(productoresPFab1, productoresBFab1, productoresPCFab1, productoresCFab1, sueldoPFab1, sueldoBFab1, sueldoPCFab1, sueldoCFab1,ensambladoresFab1,sueldoEFab1,0,diaFab1,sueldoJFab1,sueldoGFab1,CountdownFab1);
        pagosFab1.start();
        ProcesosJGFab1 jefeFab1 = new ProcesosJGFab1(1,diaFab1,modCountdown, CountdownFab1, estadoJefeFab1);
        jefeFab1.start();
        ProcesosJGFab1 gerenteFab1 = new ProcesosJGFab1(diaFab1, 3, modCountdown, estadoGerenteFab1, CountdownFab1,telefonosProducidosFab1,estadoJefeFab1,sueldoJFab1);
        gerenteFab1.start();
        ProcesosJGFab1 totalFab1 = new ProcesosJGFab1(4,sueldoPFab1, sueldoBFab1, sueldoPCFab1, sueldoCFab1, sueldoJFab1, sueldoGFab1, telefonosProducidosFab1, gastosfab1, gananciasfab1, netofab1,CountdownFab1,sueldoEFab1,Reiniciar,aggDashboard,dashboardButton,Parametros,iniciarFabricas);
        totalFab1.start();
        Total = totalFab1;
        ProcesosJGFab1 diasRestantesFab1 = new ProcesosJGFab1(diaFab1, CountdownFab1, 2);
        diasRestantesFab1.start();
        //Fabrica 2
        if (colaEnsambladoresOcupadosFab2.esta_vacia()) {
        empleadosFab2 = archivo.leerPorDefecto2Fab2(diaFab2,empleadosFab2,colaLibrePantallaFab2,ColaOcupadoPantallaFab2,colaLibreBotonesFab2,colaOcupadoBotonesFab2,colaLibrePinesCFab2,colaOcupadoPinesCFab2,colaLibreCamarasFab2,colaOcupadoCamarasFab2,productoresPFab2,productoresBFab2,productoresPCFab2,productoresCFab2,colaEnsambladoresLibresFab2,colaEnsambladoresOcupadosFab2,ensambladoresFab2,cantidadPFab2,cantidadBFab2,cantidadPCFab2,cantidadCFab2,telefonosProducidosFab2,sem1Fab2,sem2Fab2,sem3Fab2,sem4Fab2,almacenPantallasFab2,almacenBotonesFab2,almacenPinesCFab2,almacenCamarasFab2,pFab2,BFab2,PcFab2,CFab2,mutex4Fab2,mutex3Fab2,mutex2Fab2,mutex1Fab2,CountdownFab2);
        }else{
            diaFab2=archivo.leerPorDefectoFab2(diaFab2, CountdownFab2, maxPFab2, maxBFab2, maxPCFab2, maxCFab2);
        }
        diasFab2=Integer.parseInt(CountdownFab2.getText());
        Procesos pagosFab2 = new Procesos(productoresPFab2, productoresBFab2, productoresPCFab2, productoresCFab2, sueldoPFab2, sueldoBFab2, sueldoPCFab2, sueldoCFab2,ensambladoresFab2,sueldoEFab2,0,diaFab2,sueldoJFab2,sueldoGFab2,CountdownFab2);
        pagosFab2.start();
        ProcesosJG jefeFab2 = new ProcesosJG(1,diaFab2,modCountdown, CountdownFab2, estadoJefeFab2);
        jefeFab2.start();
        ProcesosJG gerenteFab2 = new ProcesosJG(diaFab2, 3, modCountdown, estadoGerenteFab2, CountdownFab2,telefonosProducidosFab2,estadoJefeFab2,sueldoJFab2);
        gerenteFab2.start();
        ProcesosJG totalFab2 = new ProcesosJG(4,sueldoPFab2, sueldoBFab2, sueldoPCFab2, sueldoCFab2, sueldoJFab2, sueldoGFab2, telefonosProducidosFab2, gastosfab2, gananciasfab2, netofab2,CountdownFab2,sueldoEFab2,Reiniciar,aggDashboard,dashboardButton,Parametros,iniciarFabricas);
        totalFab2.start();
        Total = totalFab2;
        ProcesosJG diasRestantesFab2 = new ProcesosJG(diaFab2, CountdownFab2, 2);
        diasRestantesFab2.start();
        
        
        
    }//GEN-LAST:event_iniciarFabricasActionPerformed

    private void eliminarEF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEF2ActionPerformed
        if (colaEnsambladoresOcupadosFab2.getSize()>1) {
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
        }else{
           JOptionPane.showMessageDialog(rootPane, "No puede dejar este departamento sin productores (Despedirian al Gerente)");
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
            ProcesosFab1 siguiente = colaEnsambladoresOcupadosFab1.getPfirst().getproceso();
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

    private void ParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParametrosActionPerformed
        this.dispose();
        VentanaParametros param = new VentanaParametros();
        param.setVisible(true);
    }//GEN-LAST:event_ParametrosActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
//        Countdown.setText(Integer.toString(dias));
//        sueldoPFab2.setText("0");
//        sueldoBFab2.setText("0");
//        sueldoPCFab2.setText("0");
//        sueldoCFab2.setText("0");
//        sueldoJFab2.setText("0");
//        sueldoGFab2.setText("0");
//        cantidadPFab2.setText("0");
//        cantidadBFab2.setText("0");
//        cantidadPCFab2.setText("0");
//        cantidadCFab2.setText("0");
//        sueldoEFab2.setText("0");
//        telefonosProducidosFab2.setText("0");
//        for (int i = 0; i < ColaOcupadoPantallaFab2.getSize(); i++) {
//            ColaOcupadoPantallaFab2.Desencolar();
//        }
//        for (int i = 0; i < colaOcupadoBotonesFab2.getSize(); i++) {
//            colaOcupadoBotonesFab2.Desencolar();
//        }
//        for (int i = 0; i < colaOcupadoPinesCFab2.getSize(); i++) {
//            colaOcupadoPinesCFab2.Desencolar();
//        }
//        for (int i = 0; i < colaOcupadoCamarasFab2.getSize(); i++) {
//            colaOcupadoCamarasFab2.Desencolar();
//        }
//        for (int i = 0; i < colaEnsambladoresOcupadosFab2.getSize(); i++) {
//            colaEnsambladoresOcupadosFab2.Desencolar();
//        }
//        int cant = almacenPantallasFab2.availablePermits();
//        almacenPantallasFab2.release(cant);
//        System.out.println(almacenPantallasFab2.availablePermits());
//        cant = almacenBotonesFab2.availablePermits();
//        almacenBotonesFab2.release(cant);
//        cant = almacenPinesCFab2.availablePermits();
//        almacenPinesCFab2.release(cant);
//        cant = almacenPantallasFab2.availablePermits();
//        almacenCamarasFab2.release(cant);
        this.dispose();
        VentanaFabrica ventananueva = new VentanaFabrica();
        ventananueva.setVisible(true);
        archivo.vaciarCsvHistorico("");
        
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void aggDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggDashboardActionPerformed
        String diasDespacho = archivo.leerCsvParametrosPorDefecto();
        archivo.escribirCsvHistorico(diasDespacho,telefonosProducidosFab1.getText() , telefonosProducidosFab2.getText(),gastosfab1.getText() , gastosfab2.getText(), gananciasfab1.getText(), gananciasfab2.getText());
    }//GEN-LAST:event_aggDashboardActionPerformed

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
    private javax.swing.JLabel CountdownFab1;
    private javax.swing.JLabel CountdownFab2;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Parametros;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton aggDashboard;
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
    private javax.swing.JLabel gananciasfab1;
    private javax.swing.JLabel gananciasfab2;
    private javax.swing.JLabel gastosfab1;
    private javax.swing.JLabel gastosfab2;
    private javax.swing.JButton iniciarFabricas;
    private javax.swing.JButton irSimulacionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel maxBFab1;
    private javax.swing.JLabel maxBFab2;
    private javax.swing.JLabel maxCFab1;
    private javax.swing.JLabel maxCFab2;
    private javax.swing.JLabel maxPCFab1;
    private javax.swing.JLabel maxPCFab2;
    private javax.swing.JLabel maxPFab1;
    private javax.swing.JLabel maxPFab2;
    private javax.swing.JLabel netofab1;
    private javax.swing.JLabel netofab2;
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
