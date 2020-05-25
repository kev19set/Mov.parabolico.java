
package vistas;


import java.awt.Frame;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
   initComponents();
   this.setLocationRelativeTo(null);
       
   rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/imagenes/letrafondo2.gif");
   rsscalelabel.RSScaleLabel.setScaleLabel(CloseButton, "src/imagenes/closeicon.png");
   rsscalelabel.RSScaleLabel.setScaleLabel(MinimizeButton, "src/imagenes/minimize.png");
    btnStart.setIcon(setIcono("/imagenes/startbtn.png", btnStart));
    btnStart.setPressedIcon(setIconpres("/imagenes/ingresar2.png", btnStart, 20, 20));
       
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        jPanel1.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(MinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 50, 40));

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar2.png"))); // NOI18N
        btnStart.setBorder(null);
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 60, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INICIAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 50, -1));

        nombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        nombre.setText("INGRESA TU NOMBRE");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 330, 40));

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 320, 70));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
     Principal p=new Principal();
            p.setVisible(true);
            dispose();
           
    }//GEN-LAST:event_btnStartActionPerformed

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
   this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    public Icon setIcono(String url, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho= boton.getWidth();
        int alto =boton.getHeight();
        ImageIcon icono= new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon setIconpres(String url , JButton boton,int ancho,int altura){
        ImageIcon icon =new ImageIcon(getClass().getResource(url));
        int width= boton.getWidth()-ancho;
        int height =boton.getHeight()-altura;
        ImageIcon icono=new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icono;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseButton;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
