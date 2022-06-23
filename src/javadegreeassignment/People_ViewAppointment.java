/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadegreeassignment;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class People_ViewAppointment extends javax.swing.JFrame {

    String Username;
    People AccData;
    String Status;
    Appointment ApptData;
    
    /**
     * Creates new form People_ViewAppointment
     */
    
//    public People_ViewAppointment(People Account){
//        this.AccData=Account;
//    }
    
    public People_ViewAppointment(Appointment Appt,People Account) {
        initComponents();
        this.setLocationRelativeTo(null);
                
        this.ApptData=Appt;
        this.AccData=Account;
        
        
        LblApptDate.setText(ApptData.GetDate());
        LblApptTime.setText(ApptData.GetTime());
        LblLocation.setText(ApptData.GetTempVax());
        LblSpecialRequest.setText(ApptData.GetSpecialRequest());
        LblAccIC.setText(ApptData.GetTempIC());
        LblAccName.setText(ApptData.GetTempName());
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
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        LblSpecialRequest = new javax.swing.JLabel();
        LblLocation = new javax.swing.JLabel();
        BtnBack = new keeptoo.KButton();
        LblAccIC = new javax.swing.JLabel();
        LblAccName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LblApptDate = new javax.swing.JLabel();
        LblApptTime = new javax.swing.JLabel();
        btnDltAppt = new keeptoo.KButton();
        btnPrint = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Appointment");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        LblSpecialRequest.setText("jLabel10");

        LblLocation.setText("jLabel10");

        BtnBack.setText("Back");
        BtnBack.setToolTipText("");
        BtnBack.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnBack.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnBack.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnBack.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnBack.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnBack.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        LblAccIC.setText("jLabel10");

        LblAccName.setText("jLabel10");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Appointment Date :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Account IC :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Vaccine:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setText("Account Name :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("Appointment Time: ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Special Request :");

        LblApptDate.setText("jLabel10");

        LblApptTime.setText("jLabel10");

        btnDltAppt.setText("Cancel Appointment");
        btnDltAppt.setToolTipText("");
        btnDltAppt.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        btnDltAppt.setkEndColor(new java.awt.Color(30, 51, 102));
        btnDltAppt.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        btnDltAppt.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        btnDltAppt.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        btnDltAppt.setkStartColor(new java.awt.Color(81, 83, 250));
        btnDltAppt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDltApptMouseClicked(evt);
            }
        });
        btnDltAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltApptActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.setToolTipText("");
        btnPrint.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        btnPrint.setkEndColor(new java.awt.Color(30, 51, 102));
        btnPrint.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        btnPrint.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        btnPrint.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        btnPrint.setkStartColor(new java.awt.Color(81, 83, 250));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnDltAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(LblApptTime, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(LblApptDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LblSpecialRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(LblAccIC, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblApptDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblApptTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblLocation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblSpecialRequest)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAccIC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAccName))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDltAppt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // Changes the frame back to the Personnel Home page:

        People_Home people_home = new People_Home(this.AccData);
        people_home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void btnDltApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltApptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDltApptActionPerformed

    private void btnDltApptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDltApptMouseClicked
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this appointment?", "Confirmation for deletion of appointment",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirmation == JOptionPane.YES_OPTION) {
            try {

                String ToDeleteFileName = ApptData.GetTempName() + "_" + ApptData.GetTempIC() + ".txt";

                File Delete = new File("./Appointment/" + ToDeleteFileName);
                Delete.delete();
                new People_Home(AccData).setVisible(true);
                this.dispose();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to delete Appointment data.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (confirmation == JOptionPane.NO_OPTION) {
            return;
        } else {
            return;
        }
    }//GEN-LAST:event_btnDltApptMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        // TODO add your handling code here:
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");

        pj.setPrintable (new Printable() {    
         public int print(Graphics pg, PageFormat pf, int pageNum){
          if (pageNum > 0){
          return Printable.NO_SUCH_PAGE;
          }

          Graphics2D g2 = (Graphics2D) pg;
          g2.translate(pf.getImageableX(), pf.getImageableY());
          jPanel1.paint(g2);
          return Printable.PAGE_EXISTS;
         }
        });
        if (pj.printDialog() == false)
        return;

        try {
           pj.print();
        } catch (PrinterException ex) {
           // handle exception
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(People_ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(People_ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(People_ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(People_ViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new People_ViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnBack;
    private javax.swing.JLabel LblAccIC;
    private javax.swing.JLabel LblAccName;
    private javax.swing.JLabel LblApptDate;
    private javax.swing.JLabel LblApptTime;
    private javax.swing.JLabel LblLocation;
    private javax.swing.JLabel LblSpecialRequest;
    private keeptoo.KButton btnDltAppt;
    private keeptoo.KButton btnPrint;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
