package javadegreeassignment;

import java.io.File;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    //Gets the list of Appointment text files to scan
    File Appointmentfolder = new File("./Appointment");
    File[] AppointmentList = Appointmentfolder.listFiles();

    //Gets the list of Vaccine Text files to scan
    File Vaccinefolder = new File("./Vaccine");
    File[] VaccineList = Vaccinefolder.listFiles();

    //Gets the list of Center Text files to scan
    File Centerfolder = new File("./Center");
    File[] CenterList = Centerfolder.listFiles();

    public CreateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        BtnCncl = new keeptoo.KButton();
        LblAccName = new javax.swing.JLabel();
        TxtContactNumber = new javax.swing.JTextField();
        LblIC = new javax.swing.JLabel();
        LblCntctNum = new javax.swing.JLabel();
        TxtAccName = new javax.swing.JTextField();
        TxtIC = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        BtnCreate = new keeptoo.KButton();
        TxtEmail = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        LblPgeTtle3 = new javax.swing.JLabel();
        LblIC1 = new javax.swing.JLabel();
        LblPgeTtle4 = new javax.swing.JLabel();
        LblPgeTtle5 = new javax.swing.JLabel();
        LblIC2 = new javax.swing.JLabel();
        TxtUsername = new javax.swing.JTextField();
        LblIC3 = new javax.swing.JLabel();
        LblIC4 = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JTextField();
        RdBtnCitizen = new javax.swing.JRadioButton();
        RdBtnNotCitizen = new javax.swing.JRadioButton();

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
        jPanel7.add(BtnCncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, 150, -1));

        LblAccName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblAccName.setForeground(new java.awt.Color(0, 0, 0));
        LblAccName.setText("Account Name");
        jPanel7.add(LblAccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        TxtContactNumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtContactNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtContactNumber.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtContactNumber.setOpaque(false);
        jPanel7.add(TxtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 356, 38));

        LblIC.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC.setForeground(new java.awt.Color(0, 0, 0));
        LblIC.setText("IC/Passport No");
        jPanel7.add(LblIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        LblCntctNum.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblCntctNum.setForeground(new java.awt.Color(0, 0, 0));
        LblCntctNum.setText("Contact Number");
        jPanel7.add(LblCntctNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        TxtAccName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtAccName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtAccName.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtAccName.setOpaque(false);
        jPanel7.add(TxtAccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 342, 38));

        TxtIC.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtIC.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtIC.setOpaque(false);
        jPanel7.add(TxtIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 342, 38));

        LblEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblEmail.setForeground(new java.awt.Color(0, 0, 0));
        LblEmail.setText("Email");
        jPanel7.add(LblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 40, -1));

        BtnCreate.setText("Create");
        BtnCreate.setToolTipText("");
        BtnCreate.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnCreate.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnCreate.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnCreate.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnCreate.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnCreate.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });
        jPanel7.add(BtnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 690, 150, -1));

        TxtEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtEmail.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtEmail.setOpaque(false);
        jPanel7.add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 358, 38));

        jPanel8.setBackground(new java.awt.Color(81, 163, 250));

        LblPgeTtle3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LblPgeTtle3.setForeground(new java.awt.Color(255, 255, 255));
        LblPgeTtle3.setText("Create Account");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPgeTtle3)
                .addContainerGap(485, Short.MAX_VALUE))
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
        LblIC1.setText("Citizen");
        jPanel7.add(LblIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        LblPgeTtle4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle4.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle4.setText("Account Details ");
        jPanel7.add(LblPgeTtle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 310, -1));

        LblPgeTtle5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle5.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle5.setText("Personal Info");
        jPanel7.add(LblPgeTtle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, -1));

        LblIC2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC2.setForeground(new java.awt.Color(0, 0, 0));
        LblIC2.setText("Username");
        jPanel7.add(LblIC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        TxtUsername.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtUsername.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtUsername.setOpaque(false);
        jPanel7.add(TxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 342, 38));

        LblIC3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC3.setForeground(new java.awt.Color(0, 0, 0));
        LblIC3.setText("Citizen");
        jPanel7.add(LblIC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        LblIC4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC4.setForeground(new java.awt.Color(0, 0, 0));
        LblIC4.setText("Password");
        jPanel7.add(LblIC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        TxtPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtPassword.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtPassword.setOpaque(false);
        jPanel7.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 342, 38));

        RdBtnCitizen.setBackground(new java.awt.Color(255, 255, 255));
        RdBtnCitizen.setForeground(new java.awt.Color(0, 0, 0));
        RdBtnCitizen.setText("Citizen");
        RdBtnCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdBtnCitizenActionPerformed(evt);
            }
        });
        jPanel7.add(RdBtnCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        RdBtnNotCitizen.setBackground(new java.awt.Color(255, 255, 255));
        RdBtnNotCitizen.setForeground(new java.awt.Color(0, 0, 0));
        RdBtnNotCitizen.setText("Not Citizen");
        RdBtnNotCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdBtnNotCitizenActionPerformed(evt);
            }
        });
        jPanel7.add(RdBtnNotCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCnclActionPerformed
        // Changes the frame back to the Personnel Home page:

        new Personnel_Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCnclActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed

        String AccountName = TxtAccName.getText().trim();
        String Email = TxtEmail.getText().trim();
        String IC = TxtIC.getText().trim();
        String ContactNumber = TxtContactNumber.getText().trim();
        String Username = TxtUsername.getText().trim();
        String Password = TxtPassword.getText().trim();
        Boolean Citizen = true;

        if (RdBtnCitizen.isSelected()) {
            Citizen = true;

        } else if (RdBtnNotCitizen.isSelected()) {
            Citizen = false;
        }

        //Validation is set to ensure that the data entered is correct
        //Used for phone number validation
        String RegexPhone = "^(01)[0-46-9]*[0-9]{7,8}$";

        //Used for email validation
        String RegexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";

        //Ensures that there are no empty data fields
        if (AccountName.isBlank() || Email.isBlank() || IC.isBlank() || ContactNumber.isBlank()
                || Username.isBlank() || Password.isBlank() || (RdBtnCitizen.isSelected() == false && RdBtnNotCitizen.isSelected() == false)) {

            JOptionPane.showMessageDialog(this, "Please ensure that all the data fields are filled in.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

            //Ensures that the username is of the correct length
        } else if ((Username.length() >= 19 || Username.length() <= 5)) {

            JOptionPane.showMessageDialog(this, "Please ensure that that your username is between 6 - 18 characters.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

            //Ensures that the email entered is of the correct format
            //https://www.tutorialspoint.com/validate-email-address-in-java
        } else if (!(Email.matches(RegexEmail))) {

            JOptionPane.showMessageDialog(this, "The email entered is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

            //Ensures that the contact number entered is of the correct format
        } else if (!(ContactNumber.matches(RegexPhone))) {

            JOptionPane.showMessageDialog(this, "The phone number entered is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            //Gets the list of Account text files to scan
            File Accountfolder = new File("./Accounts");
            File[] AccountList = Accountfolder.listFiles();

            //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
            //loops the scanning to get the Name and IC of the textfile
            for (File AccountList1 : AccountList) {
                People AccountFiles = new People(AccountList1.getName());
                //Checks if the account exists
                if ((!AccountFiles.GetName().equals(AccountName))) {
                    if (!AccountFiles.GetIC().equals(IC)) {

                        //Creates People Object that is to be saved in a text file
                        People newPpl = new People(AccountName, IC, Citizen, Email, ContactNumber, Username, Password);

                        //Invokes the CreateAccount function which save the data into a text file
                        newPpl.CreateReport();

                    }
                } else if ((AccountFiles.GetName().equals(AccountName))) {
                    if (AccountFiles.GetIC().equals(IC)) {

                        JOptionPane.showMessageDialog(this, "This account already exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;

                    }
                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Failed to create account.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        new Personnel_Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void RdBtnCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdBtnCitizenActionPerformed
        RdBtnNotCitizen.setSelected(false);

    }//GEN-LAST:event_RdBtnCitizenActionPerformed

    private void RdBtnNotCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdBtnNotCitizenActionPerformed
        RdBtnCitizen.setSelected(false);
    }//GEN-LAST:event_RdBtnNotCitizenActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnCncl;
    private keeptoo.KButton BtnCreate;
    private javax.swing.JLabel LblAccName;
    private javax.swing.JLabel LblCntctNum;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblIC;
    private javax.swing.JLabel LblIC1;
    private javax.swing.JLabel LblIC2;
    private javax.swing.JLabel LblIC3;
    private javax.swing.JLabel LblIC4;
    private javax.swing.JLabel LblPgeTtle3;
    private javax.swing.JLabel LblPgeTtle4;
    private javax.swing.JLabel LblPgeTtle5;
    private javax.swing.JRadioButton RdBtnCitizen;
    private javax.swing.JRadioButton RdBtnNotCitizen;
    private javax.swing.JTextField TxtAccName;
    private javax.swing.JTextField TxtContactNumber;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtIC;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
