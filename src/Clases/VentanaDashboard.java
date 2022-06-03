/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sebas
 */
public class VentanaDashboard extends javax.swing.JFrame {
    String[] despacho;
    
    public VentanaDashboard() {
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        archivoCsv archivodash = new archivoCsv();
        despacho = archivodash.leerCsvHistorico();
        if (despacho!= null) {
            int diasTotales        = Integer.parseInt(despacho[0]);
            int tlfProducidosFab1  = Integer.parseInt(despacho[1]);
            int tlfProducidosFab2  = Integer.parseInt(despacho[2]);
            int gastosSalariosFab1 = Integer.parseInt(despacho[3]);
            int gastosSalariosFab2 = Integer.parseInt(despacho[4]);
            int gananciasTlfFab1      = Integer.parseInt(despacho[5]);
            int gananciasTlffab2      = Integer.parseInt(despacho[6]);
        
            //Grafica 1
            DefaultCategoryDataset datosGrafica1 = new DefaultCategoryDataset();
            datosGrafica1.setValue(tlfProducidosFab1, "Fabrica 1", "Xperia 1 IV");
            datosGrafica1.setValue(tlfProducidosFab2, "Fabrica 2", "Xperia 10 IV");

            JFreeChart graficoBarrasGrafica1 = ChartFactory.createBarChart3D(
                    "Cantidad de Telefonos Producidos en " + diasTotales + " dias",                      //nombre grafico
                    "",        //nombre barras 
                    "Cantidad",            //nombre numeracion
                    datosGrafica1,                      //datos graficos
                    PlotOrientation.VERTICAL,   //orientacion
                    true,          //leyenda de barras individuales por columna 
                    true,             // herramientas
                    false                      // url del grafico
            );

            ChartPanel panelGrafica1 = new ChartPanel(graficoBarrasGrafica1);
            panelGrafica1.setMouseWheelEnabled(true);
            panelGrafica1.setPreferredSize(new Dimension(230, 380));


            grafica1.setLayout(new BorderLayout());
            grafica1.add(panelGrafica1, BorderLayout.NORTH);
            pack();
            repaint();

            //Grafica 2
            DefaultCategoryDataset datosGrafica2 = new DefaultCategoryDataset();
            datosGrafica2.setValue(gastosSalariosFab1, "Fabrica 1", "");
            datosGrafica2.setValue(gastosSalariosFab2, "Fabrica 2", "");

            JFreeChart graficoBarrasGrafica2 = ChartFactory.createBarChart3D(
                    "Gastos por salarios en " + diasTotales + " dias",                      //nombre grafico
                    "",        //nombre barras 
                    "Salario($)",            //nombre numeracion
                    datosGrafica2,                      //datos graficos
                    PlotOrientation.VERTICAL,   //orientacion
                    true,          //leyenda de barras individuales por columna 
                    true,             // herramientas
                    false                      // url del grafico
            );

            ChartPanel panelGrafica2 = new ChartPanel(graficoBarrasGrafica2);
            panelGrafica2.setMouseWheelEnabled(true);
            panelGrafica2.setPreferredSize(new Dimension(230, 380));


            grafica2.setLayout(new BorderLayout());
            grafica2.add(panelGrafica2, BorderLayout.NORTH);
            pack();
            repaint();
            
            //Grafica 3
            DefaultCategoryDataset datosGrafica3 = new DefaultCategoryDataset();
            datosGrafica3.setValue(gananciasTlfFab1, "Fabrica 1", "");
            datosGrafica3.setValue(gananciasTlffab2, "Fabrica 2", "");

            JFreeChart graficoBarrasGrafica3 = ChartFactory.createBarChart3D(
                    "Ganancias en " + diasTotales + " dias",                      //nombre grafico
                    "",        //nombre barras 
                    "Cantidad($)",            //nombre numeracion
                    datosGrafica3,                      //datos graficos
                    PlotOrientation.VERTICAL,   //orientacion
                    true,          //leyenda de barras individuales por columna 
                    true,             // herramientas
                    false                      // url del grafico
            );

            ChartPanel panelGrafica3 = new ChartPanel(graficoBarrasGrafica3);
            panelGrafica3.setMouseWheelEnabled(true);
            panelGrafica3.setPreferredSize(new Dimension(230, 380));


            grafica3.setLayout(new BorderLayout());
            grafica3.add(panelGrafica3, BorderLayout.NORTH);
            pack();
            repaint();
        } else {
            mensajeG1.setText("No hay graficas disponibles");
            mensajeG2.setText("No hay graficas disponibles");
            mensajeG3.setText("No hay graficas disponibles");

        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        irSimulacionButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        Parametros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        grafica2 = new javax.swing.JPanel();
        grafica1 = new javax.swing.JPanel();
        mensajeG1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        mensajeG2 = new javax.swing.JLabel();
        grafica3 = new javax.swing.JPanel();
        mensajeG3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SONYC");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 460));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("DASHBOARD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 770, 20));

        grafica2.setPreferredSize(new java.awt.Dimension(400, 200));
        grafica2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(grafica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 230, 380));

        grafica1.setPreferredSize(new java.awt.Dimension(400, 200));
        grafica1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grafica1.add(mensajeG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 380));

        jPanel1.add(grafica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 380));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 770, 10));

        mensajeG2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mensajeG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 220, 380));

        grafica3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeG3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grafica3.add(mensajeG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 380));

        jPanel1.add(grafica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 230, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irSimulacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irSimulacionButtonActionPerformed
        this.dispose();
        VentanaFabrica fabrica = new VentanaFabrica();
        fabrica.setVisible(true);
    }//GEN-LAST:event_irSimulacionButtonActionPerformed

    private void ParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParametrosActionPerformed
        this.dispose();
        VentanaParametros param = new VentanaParametros();
        param.setVisible(true);
    }//GEN-LAST:event_ParametrosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Parametros;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JPanel grafica1;
    private javax.swing.JPanel grafica2;
    private javax.swing.JPanel grafica3;
    private javax.swing.JButton irSimulacionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mensajeG1;
    private javax.swing.JLabel mensajeG2;
    private javax.swing.JLabel mensajeG3;
    // End of variables declaration//GEN-END:variables
}
