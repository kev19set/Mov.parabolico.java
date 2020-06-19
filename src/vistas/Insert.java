
package vistas;

import clases.Angulo;
import clases.Fisica;
import clases.Vfinal;

import clases.Vinicial;
import clases.hmax;
import javax.swing.JOptionPane;

public class Insert extends javax.swing.JFrame {

 
    public Insert() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/imagenes/fisica2.jpg");
        txtarea.setEnabled(false);
        txtarea2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CloseButton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtangulo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtaltfinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        typeprob = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtangulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtaltura = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtdespla = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtiempo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        vfinal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea2 = new javax.swing.JTextArea();
        btnResolver = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtaltura1 = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeicon.png"))); // NOI18N
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 40, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("AHORA A PRACTICAR !!!!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 540, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setText("RESULTADOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("VELOCIDAD INICIAL :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, 160, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("°");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 80, 30));
        jPanel1.add(txtVo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 160, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ACELERACION :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 130, 30));
        jPanel1.add(txtangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 160, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("m");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 80, 30));
        jPanel1.add(txtaltfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, 160, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("m/S");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 80, 30));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 150, 70));

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        txtarea.setRows(5);
        txtarea.setMinimumSize(new java.awt.Dimension(40, 80));
        jScrollPane1.setViewportView(txtarea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 400, 130));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("9.81 m/s^2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 160, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ALTURA FINAL:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 780, 130, 30));

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 810, 190, 70));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel12.setText("RESOLVIENDO PROBLEMAS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 470, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(14, 156, 156));
        jLabel13.setText("De Datos Tengo(Si no tienes el dato de la variable no rellenes el espacio , si el valor es cero ingrese 0 en la casilla correspondiente,insertar por lo menos tres valores )");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 830, 40));

        typeprob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "TiempoVuelo", "VelocidadInicial", "VelocidadFinal", "Angulo", "Desplazamiento", "AlturaInicial", "AlturaMaxima" }));
        typeprob.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeprobItemStateChanged(evt);
            }
        });
        typeprob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeprobActionPerformed(evt);
            }
        });
        jPanel1.add(typeprob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 190, 40));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("VELOCIDAD FINAL:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, 160, 30));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel15.setText("INGRESA LOS VALORES ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(14, 156, 156));
        jLabel16.setText("Deseo Hallar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 190, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("ANGULO :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 30));
        jPanel1.add(txtangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("VELOCIDAD INICIAL :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 160, 30));
        jPanel1.add(txtVo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 229, 160, 30));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("ACELERACION :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 130, 30));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("9.81 m/s^2");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 160, 30));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("ALTURA :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 80, 30));
        jPanel1.add(txtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, 30));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("ANGULO :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 80, 30));
        jPanel1.add(txtdespla, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 170, 30));

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("DESZPLAZAMIENTO:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 160, 30));
        jPanel1.add(txtiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, 170, 30));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("TIEMPO:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 70, 30));
        jPanel1.add(vfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 730, 170, 30));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel24.setText("RESULTADOS");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        txtarea2.setColumns(20);
        txtarea2.setRows(5);
        jScrollPane2.setViewportView(txtarea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 620, 380, 140));

        btnResolver.setText("RESOLVER");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 770, 250, 60));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("ALTURA :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 80, 30));
        jPanel1.add(txtaltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, 160, 30));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 150, -1));

        btnLimpiar2.setText("LImpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 80, 30));

        btnprev.setText("PREV");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });
        jPanel1.add(btnprev, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 170, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
   Animacion p=new Animacion();
            p.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
     
   Double alt=Double.parseDouble(txtaltura.getText());
   Double ang=Double.parseDouble(txtangulo.getText());
   Double vo=Double.parseDouble(txtVo.getText());
   Fisica p = new Fisica(alt,vo,ang);
   txtarea.setText(p.mostrar());
    
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void typeprobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeprobActionPerformed
   
     
    }//GEN-LAST:event_typeprobActionPerformed

    private void typeprobItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeprobItemStateChanged
     //CUANDO SE SELECCIONE UN ITEM SE ACTIVARA EL CAMPO DE TEXTO SOLO DE LAS VARAIBALES NECESARIAS 
        String tipo=(String)typeprob.getSelectedItem();
     if(tipo.equals("AlturaInicial")){
         txtaltfinal.setEnabled(false);
         txtiempo.setEnabled(true);
         txtangulo1.setEnabled(true);
         txtdespla.setEnabled(true);
         txtVo1.setEnabled(true);
         vfinal.setEnabled(true);
         txtaltura1.setEnabled(false);
     }
     if(tipo.equals("AlturaMaxima")){
         txtiempo.setEnabled(false);
         txtaltfinal.setEnabled(false);
         txtangulo1.setEnabled(true);
         txtdespla.setEnabled(false);
         txtVo1.setEnabled(true);
         vfinal.setEnabled(false);
         txtaltura1.setEnabled(false);
         
     }
     if(tipo.equals("TiempoVuelo")){
         txtiempo.setEnabled(false);
         txtaltfinal.setEnabled(true);
         txtangulo1.setEnabled(true);
         txtdespla.setEnabled(true);
         txtVo1.setEnabled(true);
         vfinal.setEnabled(true);
     }
     if(tipo.equals("Angulo")){
         txtangulo1.setEnabled(false);
         txtiempo.setEnabled(false);
         txtaltfinal.setEnabled(true);
         txtdespla.setEnabled(true);
         txtVo1.setEnabled(true);
         vfinal.setEnabled(false);
         txtaltura1.setEnabled(true);
     }
     if(tipo.equals("Desplazamiento")){
         txtdespla.setEnabled(false);
         txtangulo1.setEnabled(true);
         txtiempo.setEnabled(false);
         txtaltfinal.setEnabled(false);
         txtVo1.setEnabled(true);
         vfinal.setEnabled(false);
         txtaltura1.setEnabled(true);
     }
     if(tipo.equals("VelocidadInicial")){
         txtVo1.setEnabled(false);
         txtdespla.setEnabled(true);
         txtangulo1.setEnabled(true);
         txtiempo.setEnabled(false);
         txtaltfinal.setEnabled(true);
         vfinal.setEnabled(false);
         txtaltura1.setEnabled(true);
         
     }
     if(tipo.equals("VelocidadFinal")){
         vfinal.setEnabled(false);
         txtVo1.setEnabled(true);
         txtdespla.setEnabled(true);
         txtangulo1.setEnabled(true);
         txtiempo.setEnabled(false);
         txtaltura1.setEnabled(true);
         txtaltfinal.setEnabled(true);
         
     }
    }//GEN-LAST:event_typeprobItemStateChanged
//Calcular Problemas
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
      //DEPENDEIENDO DEL ITEM SELCCIONADO SE SELECCIONA LA CLASE CORRESPONDIENTE 
        String tipo=(String)typeprob.getSelectedItem();
      if(tipo.equals("VelocidadInicial")){
          
          Double despla= Double.parseDouble(txtdespla.getText());
          Double angulo= Double.parseDouble(txtangulo1.getText());
          Double altfinal= Double.parseDouble(txtaltfinal.getText());
          Double alturaini= Double.parseDouble(txtaltura1.getText());
        Vinicial x=new Vinicial(alturaini, altfinal, angulo, despla); 
        txtarea2.setText(x.mostrar());
      }
      if(tipo.equals("VelocidadFinal")){
         Double vini=Double.parseDouble(txtVo1.getText());
         Double ang=Double.parseDouble(txtangulo1.getText());
         Double altura=Double.parseDouble(txtaltura1.getText());
         Double altfinal=Double.parseDouble(txtaltfinal.getText());
         Vfinal x = new Vfinal(vini, ang, altura, altfinal);
         txtarea2.setText(x.mostrarvfinal());
          
      }
      if(tipo.equals("Angulo")){
        Double vini=Double.parseDouble(txtVo1.getText());
        Double despla=Double.parseDouble(txtdespla.getText());
        Double alturafinal=Double.parseDouble(txtaltfinal.getText());
        Double alturaini=Double.parseDouble(txtaltura1.getText());
        Angulo z1= new Angulo(vini, alturafinal, alturaini,despla);
        txtarea2.setText(z1.mostrar());
      }
      if(tipo.equals("AlturaMaxima")){
          Double ang=Double.parseDouble(txtangulo1.getText());
          Double vini=Double.parseDouble(txtVo1.getText());
          hmax h=new hmax(vini, ang);
          txtarea2.setText(h.mostrar());
      }
      if(tipo.equals("TiempoVuelo")){
         Double alt=Double.parseDouble(txtaltura1.getText());
         Double vini=Double.parseDouble(txtVo1.getText());
         Double ang=Double.parseDouble(txtangulo1.getText());
         Fisica x = new Fisica(alt, vini, ang);
         txtarea2.setText(x.despla());
      }
      if(tipo.equals("Desplazamiento")){
         Double alt=Double.parseDouble(txtaltura1.getText());
         Double vini=Double.parseDouble(txtVo1.getText());
         Double ang=Double.parseDouble(txtangulo1.getText());
         Fisica x = new Fisica(alt, vini, ang);
         txtarea2.setText(x.despla());
      }
    }//GEN-LAST:event_btnResolverActionPerformed
//Limpiar txtfield
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
     txtVo.setText("");
     txtangulo.setText("");
     txtaltura.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
      txtVo1.setText("");
      txtaltfinal.setText("");
      txtaltura1.setText("");
      txtangulo1.setText("");
      txtdespla.setText("");
      txtiempo.setText("");
      vfinal.setText("");
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        try{
            int dialogbutton =JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea Cerrar la aplicacion?","EXIT",dialogbutton);
            if(result==0){
                System.exit(0);
            }} catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
     Principal p =new Principal();
        p.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnprevActionPerformed


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseButton;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnResolver;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtVo;
    private javax.swing.JTextField txtVo1;
    private javax.swing.JTextField txtaltfinal;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtaltura1;
    private javax.swing.JTextField txtangulo;
    private javax.swing.JTextField txtangulo1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextArea txtarea2;
    private javax.swing.JTextField txtdespla;
    private javax.swing.JTextField txtiempo;
    private javax.swing.JComboBox<String> typeprob;
    private javax.swing.JTextField vfinal;
    // End of variables declaration//GEN-END:variables
}
