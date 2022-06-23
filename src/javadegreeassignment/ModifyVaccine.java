package javadegreeassignment;

import java.io.File;
import javax.swing.JOptionPane;

public class ModifyVaccine extends javax.swing.JFrame {

    Vaccines PreVxInfo;

    //Gets the list of Account text files to scan
    File Accountfolder = new File("./Accounts/");
    File[] AccountList = Accountfolder.listFiles();

    //Gets the list of Appointment text files to scan
    File Appointmentfolder = new File("./Appointment/");
    File[] AppointmentList = Appointmentfolder.listFiles();

    //Gets the list of Vaccine Text files to scan
    File Vaccinefolder = new File("./Vaccine/");
    File[] VaccineList = Vaccinefolder.listFiles();

    //Gets the list of Center Text files to scan
    File Centerfolder = new File("./Center/");
    File[] CenterList = Centerfolder.listFiles();

    public ModifyVaccine(Vaccines Info) {

        initComponents();

        PreVxInfo = Info;

        TxtVccneNme.setText(Info.GetName());
        TxtVccneSpplyLft.setText(String.valueOf(Info.GetSupplyLeft()));
        TxtCenter.setText(Info.GetTempCenter());

        TxtVccneNme.setEditable(false);

        TxtCenter.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        BtnCncl = new keeptoo.KButton();
        LblAccName = new javax.swing.JLabel();
        TxtCenter = new javax.swing.JTextField();
        LblCntctNum = new javax.swing.JLabel();
        TxtVccneNme = new javax.swing.JTextField();
        BtnModify = new keeptoo.KButton();
        jPanel8 = new javax.swing.JPanel();
        LblPgeTtle3 = new javax.swing.JLabel();
        LblIC1 = new javax.swing.JLabel();
        TxtVccneSpplyLft = new javax.swing.JTextField();
        LblPgeTtle6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCncl.setText("Cancel");
        BtnCncl.setToolTipText("");
        BtnCncl.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnCncl.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnCncl.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnCncl.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnCncl.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnCncl.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnCncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCnclActionPerformed(evt);
            }
        });
        jPanel7.add(BtnCncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 150, -1));

        LblAccName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblAccName.setForeground(new java.awt.Color(0, 0, 0));
        LblAccName.setText("Vaccine Name");
        jPanel7.add(LblAccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        TxtCenter.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtCenter.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtCenter.setOpaque(false);
        jPanel7.add(TxtCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 356, 38));

        LblCntctNum.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblCntctNum.setForeground(new java.awt.Color(0, 0, 0));
        LblCntctNum.setText("Vaccine Center");
        jPanel7.add(LblCntctNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        TxtVccneNme.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtVccneNme.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtVccneNme.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtVccneNme.setOpaque(false);
        jPanel7.add(TxtVccneNme, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 342, 38));

        BtnModify.setText("Modify");
        BtnModify.setToolTipText("");
        BtnModify.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnModify.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnModify.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnModify.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnModify.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnModify.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModifyMouseClicked(evt);
            }
        });
        jPanel7.add(BtnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 150, -1));

        jPanel8.setBackground(new java.awt.Color(81, 163, 250));

        LblPgeTtle3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LblPgeTtle3.setForeground(new java.awt.Color(255, 255, 255));
        LblPgeTtle3.setText("Modify Vaccine");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPgeTtle3)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LblPgeTtle3)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        LblIC1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC1.setForeground(new java.awt.Color(0, 0, 0));
        LblIC1.setText("Vaccine Supply Left");
        jPanel7.add(LblIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        TxtVccneSpplyLft.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtVccneSpplyLft.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtVccneSpplyLft.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtVccneSpplyLft.setOpaque(false);
        jPanel7.add(TxtVccneSpplyLft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 342, 38));

        LblPgeTtle6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle6.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle6.setText("Vaccine Info");
        jPanel7.add(LblPgeTtle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModifyMouseClicked

        String VxName = TxtVccneNme.getText().trim();
        String VxSpplyLft = TxtVccneSpplyLft.getText().trim();
        String Center = TxtCenter.getText();

        int Num;

        if (VxName.isBlank() || VxSpplyLft.isBlank()) {

            JOptionPane.showMessageDialog(this, "Please ensure that all the data fields are filled in.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Checks if input is a number
        try {
            Num = Integer.parseInt(VxSpplyLft);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Please ensure that the supply entered is a number.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Checks if input is negative
        if (Num < 0) {

            JOptionPane.showMessageDialog(this, "Please ensure that the amount that you have entered is positive.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

        }

        
            String PreFileName = PreVxInfo.GetName() + ".txt";

            try {

                for (int i = 0; i < CenterList.length; i++) {

                    Center CenterFiles = new Center(CenterList[i].getName());

                    if(CenterFiles.GetName().equals(Center)){
                    File Delete = new File("./Vaccine/" + PreFileName);
                    Delete.delete();

                    //Creates Vaccine Object that is to be saved in a text file
                    Vaccines newVx = new Vaccines(VxName, Num, CenterFiles);

                    //Invokes the CreateAccount function which save the data into a text file
                    newVx.CreateReport();
                    break;
                    }
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to write data in textfile.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
       
        //Changes the frame back to the StaffHome page
        new Personnel_Home().setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BtnModifyMouseClicked

    private void BtnCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCnclActionPerformed
        // Changes the frame back to the Personnel Home page:

        new Personnel_Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCnclActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnCncl;
    private keeptoo.KButton BtnModify;
    private javax.swing.JLabel LblAccName;
    private javax.swing.JLabel LblCntctNum;
    private javax.swing.JLabel LblIC1;
    private javax.swing.JLabel LblPgeTtle3;
    private javax.swing.JLabel LblPgeTtle6;
    private javax.swing.JTextField TxtCenter;
    private javax.swing.JTextField TxtVccneNme;
    private javax.swing.JTextField TxtVccneSpplyLft;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
