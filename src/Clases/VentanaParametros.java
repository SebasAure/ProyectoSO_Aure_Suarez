/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author gabriel
 */
public class VentanaParametros extends javax.swing.JFrame {
    archivoCsv arch = new archivoCsv();
    /**
     * Creates new form Parametros
     */
    public VentanaParametros() {
        initComponents();
        this.setLocationRelativeTo(null);
        arch.leerPorDefectoParametros(duracionDia,diasDespachados,almacenPantallasFab2,almacenBotonesFab2,almacenPinCargaFab2,almacenCamarasFab2,productoresPantallaFab2,productoresBotonesFab2,productoresPinesCargaFab2,productoresCamaraFab2,ensambladoresFab2);

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
        productoresPinesCargaFab2 = new javax.swing.JTextField();
        almacenBotonesFab2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productoresCamaraFab2 = new javax.swing.JTextField();
        almacenPinCargaFab2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ensambladoresFab2 = new javax.swing.JTextField();
        almacenCamarasFab2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cambiarParam = new javax.swing.JToggleButton();
        duracionDia = new javax.swing.JTextField();
        productoresPantallaFab2 = new javax.swing.JTextField();
        diasDespachados = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productoresBotonesFab2 = new javax.swing.JTextField();
        almacenPantallasFab2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        irSimulacionButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        Parametros = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        almacenPantallasFab1 = new javax.swing.JTextField();
        almacenBotonesFab1 = new javax.swing.JTextField();
        almacenPinCargaFab1 = new javax.swing.JTextField();
        almacenCamarasFab1 = new javax.swing.JTextField();
        ensambladoresFab1 = new javax.swing.JTextField();
        productoresPantallaFab1 = new javax.swing.JTextField();
        productoresBotonesFab1 = new javax.swing.JTextField();
        productoresPinesCargaFab1 = new javax.swing.JTextField();
        productoresCamaraFab1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productoresPinesCargaFab2.setBackground(new java.awt.Color(204, 204, 204));
        productoresPinesCargaFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresPinesCargaFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresPinesCargaFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresPinesCargaFab2.setText("0");
        jPanel1.add(productoresPinesCargaFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 40, 50));

        almacenBotonesFab2.setBackground(new java.awt.Color(204, 204, 204));
        almacenBotonesFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenBotonesFab2.setForeground(new java.awt.Color(0, 0, 0));
        almacenBotonesFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenBotonesFab2.setText("0");
        jPanel1.add(almacenBotonesFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 40, 50));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Productores Pines");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 210, 50));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Almacen botones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, 50));

        productoresCamaraFab2.setBackground(new java.awt.Color(204, 204, 204));
        productoresCamaraFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresCamaraFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresCamaraFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresCamaraFab2.setText("0");
        jPanel1.add(productoresCamaraFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 40, 50));

        almacenPinCargaFab2.setBackground(new java.awt.Color(204, 204, 204));
        almacenPinCargaFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenPinCargaFab2.setForeground(new java.awt.Color(0, 0, 0));
        almacenPinCargaFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenPinCargaFab2.setText("0");
        jPanel1.add(almacenPinCargaFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 40, 50));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Productores Camaras");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 210, 50));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Almacen Pines");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 150, 50));

        ensambladoresFab2.setBackground(new java.awt.Color(204, 204, 204));
        ensambladoresFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        ensambladoresFab2.setForeground(new java.awt.Color(0, 0, 0));
        ensambladoresFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ensambladoresFab2.setText("0");
        jPanel1.add(ensambladoresFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 40, 50));

        almacenCamarasFab2.setBackground(new java.awt.Color(204, 204, 204));
        almacenCamarasFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenCamarasFab2.setForeground(new java.awt.Color(0, 0, 0));
        almacenCamarasFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenCamarasFab2.setText("0");
        jPanel1.add(almacenCamarasFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 40, 50));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fab 2");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 40, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Duracion dia (ms)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 140, 50));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Almacen Camaras");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 180, 50));

        cambiarParam.setBackground(new java.awt.Color(51, 51, 51));
        cambiarParam.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        cambiarParam.setForeground(new java.awt.Color(255, 255, 255));
        cambiarParam.setText("Cambiar parametros");
        cambiarParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarParamActionPerformed(evt);
            }
        });
        jPanel1.add(cambiarParam, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 300, 50));

        duracionDia.setBackground(new java.awt.Color(204, 204, 204));
        duracionDia.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        duracionDia.setForeground(new java.awt.Color(0, 0, 0));
        duracionDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        duracionDia.setText("0");
        jPanel1.add(duracionDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 90, 50));

        productoresPantallaFab2.setBackground(new java.awt.Color(204, 204, 204));
        productoresPantallaFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresPantallaFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresPantallaFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresPantallaFab2.setText("0");
        jPanel1.add(productoresPantallaFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 40, 50));

        diasDespachados.setBackground(new java.awt.Color(204, 204, 204));
        diasDespachados.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        diasDespachados.setForeground(new java.awt.Color(0, 0, 0));
        diasDespachados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        diasDespachados.setText("0");
        jPanel1.add(diasDespachados, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 90, 50));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Productores pantalla");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 210, 50));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dias despacho");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, 50));

        productoresBotonesFab2.setBackground(new java.awt.Color(204, 204, 204));
        productoresBotonesFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresBotonesFab2.setForeground(new java.awt.Color(0, 0, 0));
        productoresBotonesFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresBotonesFab2.setText("0");
        jPanel1.add(productoresBotonesFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 40, 50));

        almacenPantallasFab2.setBackground(new java.awt.Color(204, 204, 204));
        almacenPantallasFab2.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenPantallasFab2.setForeground(new java.awt.Color(0, 0, 0));
        almacenPantallasFab2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenPantallasFab2.setText("0");
        jPanel1.add(almacenPantallasFab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 40, 50));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Productores Botones");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 210, 50));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Almacen Pantallas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 170, 50));

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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SONYC");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jLabel13.setFont(new java.awt.Font("Poor Richard", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("PARAMETROS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 770, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 770, 10));

        almacenPantallasFab1.setBackground(new java.awt.Color(204, 204, 204));
        almacenPantallasFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenPantallasFab1.setForeground(new java.awt.Color(0, 0, 0));
        almacenPantallasFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenPantallasFab1.setText("0");
        jPanel1.add(almacenPantallasFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 40, 50));

        almacenBotonesFab1.setBackground(new java.awt.Color(204, 204, 204));
        almacenBotonesFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenBotonesFab1.setForeground(new java.awt.Color(0, 0, 0));
        almacenBotonesFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenBotonesFab1.setText("0");
        jPanel1.add(almacenBotonesFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 40, 50));

        almacenPinCargaFab1.setBackground(new java.awt.Color(204, 204, 204));
        almacenPinCargaFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenPinCargaFab1.setForeground(new java.awt.Color(0, 0, 0));
        almacenPinCargaFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenPinCargaFab1.setText("0");
        jPanel1.add(almacenPinCargaFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 40, 50));

        almacenCamarasFab1.setBackground(new java.awt.Color(204, 204, 204));
        almacenCamarasFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        almacenCamarasFab1.setForeground(new java.awt.Color(0, 0, 0));
        almacenCamarasFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        almacenCamarasFab1.setText("0");
        jPanel1.add(almacenCamarasFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 40, 50));

        ensambladoresFab1.setBackground(new java.awt.Color(204, 204, 204));
        ensambladoresFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        ensambladoresFab1.setForeground(new java.awt.Color(0, 0, 0));
        ensambladoresFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ensambladoresFab1.setText("0");
        jPanel1.add(ensambladoresFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 40, 50));

        productoresPantallaFab1.setBackground(new java.awt.Color(204, 204, 204));
        productoresPantallaFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresPantallaFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresPantallaFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresPantallaFab1.setText("0");
        jPanel1.add(productoresPantallaFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 40, 50));

        productoresBotonesFab1.setBackground(new java.awt.Color(204, 204, 204));
        productoresBotonesFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresBotonesFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresBotonesFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresBotonesFab1.setText("0");
        jPanel1.add(productoresBotonesFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 40, 50));

        productoresPinesCargaFab1.setBackground(new java.awt.Color(204, 204, 204));
        productoresPinesCargaFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresPinesCargaFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresPinesCargaFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresPinesCargaFab1.setText("0");
        jPanel1.add(productoresPinesCargaFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 40, 50));

        productoresCamaraFab1.setBackground(new java.awt.Color(204, 204, 204));
        productoresCamaraFab1.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        productoresCamaraFab1.setForeground(new java.awt.Color(0, 0, 0));
        productoresCamaraFab1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productoresCamaraFab1.setText("0");
        jPanel1.add(productoresCamaraFab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 40, 50));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ensambladores");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 150, 50));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Fab 1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 40, 40));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Fab 1");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 40, 40));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("NSimSun", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Fab 2");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarParamActionPerformed
        
        //Fab 1
        String cadena1 = "Dato,Valor\n" +
        "Durancion-Dia(mili-segundos),"+duracionDia.getText()+"\n" +
        "Dias-entre-despachos,"+diasDespachados.getText()+"\n" +
        "almacen-pantalla,"+almacenPantallasFab1.getText()+",999\n" +
        "almacen-botones,"+almacenBotonesFab1.getText()+",999\n" +
        "almacen-pin-carga,"+almacenPinCargaFab1.getText()+",999\n" +
        "almacen-camara,"+almacenCamarasFab1.getText()+",999\n" +
        "productores-pantalla,"+productoresPantallaFab1.getText()+"\n" +
        "productores-botones,"+productoresBotonesFab1.getText()+"\n" +
        "prodcutores-pin-carga,"+productoresPinesCargaFab1.getText()+"\n" +
        "productores-camara,"+productoresCamaraFab1.getText()+"\n" +
        "ensambladores,"+ensambladoresFab1.getText()+"\n";
        arch.escribirCvsPorDefectoFab1(cadena1);
        
        //Fab 2
        String cadena = "Dato,Valor\n" +
        "Durancion-Dia(mili-segundos),"+duracionDia.getText()+"\n" +
        "Dias-entre-despachos,"+diasDespachados.getText()+"\n" +
        "almacen-pantalla,"+almacenPantallasFab2.getText()+",999\n" +
        "almacen-botones,"+almacenBotonesFab2.getText()+",999\n" +
        "almacen-pin-carga,"+almacenPinCargaFab2.getText()+",999\n" +
        "almacen-camara,"+almacenCamarasFab2.getText()+",999\n" +
        "productores-pantalla,"+productoresPantallaFab2.getText()+"\n" +
        "productores-botones,"+productoresBotonesFab2.getText()+"\n" +
        "prodcutores-pin-carga,"+productoresPinesCargaFab2.getText()+"\n" +
        "productores-camara,"+productoresCamaraFab2.getText()+"\n" +
        "ensambladores,"+ensambladoresFab2.getText()+"\n";
        arch.escribirCvsPorDefecto(cadena);
        
        
        this.dispose();
        VentanaFabrica fabrica = new VentanaFabrica();
        fabrica.setVisible(true);
    }//GEN-LAST:event_cambiarParamActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaParametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Parametros;
    private javax.swing.JTextField almacenBotonesFab1;
    private javax.swing.JTextField almacenBotonesFab2;
    private javax.swing.JTextField almacenCamarasFab1;
    private javax.swing.JTextField almacenCamarasFab2;
    private javax.swing.JTextField almacenPantallasFab1;
    private javax.swing.JTextField almacenPantallasFab2;
    private javax.swing.JTextField almacenPinCargaFab1;
    private javax.swing.JTextField almacenPinCargaFab2;
    private javax.swing.JToggleButton cambiarParam;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JTextField diasDespachados;
    private javax.swing.JTextField duracionDia;
    private javax.swing.JTextField ensambladoresFab1;
    private javax.swing.JTextField ensambladoresFab2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField productoresBotonesFab1;
    private javax.swing.JTextField productoresBotonesFab2;
    private javax.swing.JTextField productoresCamaraFab1;
    private javax.swing.JTextField productoresCamaraFab2;
    private javax.swing.JTextField productoresPantallaFab1;
    private javax.swing.JTextField productoresPantallaFab2;
    private javax.swing.JTextField productoresPinesCargaFab1;
    private javax.swing.JTextField productoresPinesCargaFab2;
    // End of variables declaration//GEN-END:variables
}
