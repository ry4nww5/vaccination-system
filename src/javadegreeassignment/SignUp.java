
package javadegreeassignment;

import java.io.File;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        txtPFullName = new javax.swing.JTextField();
        txtPEmail = new javax.swing.JTextField();
        txtPIC = new javax.swing.JTextField();
        txtPUsername = new javax.swing.JTextField();
        txtPContact = new javax.swing.JTextField();
        LblTitle3 = new javax.swing.JLabel();
        LblTitle4 = new javax.swing.JLabel();
        LblTitle5 = new javax.swing.JLabel();
        LblTitle6 = new javax.swing.JLabel();
        LblTitle7 = new javax.swing.JLabel();
        LblTitle8 = new javax.swing.JLabel();
        rdbtnPCitizen = new javax.swing.JRadioButton();
        rdbtnPNotCitizen = new javax.swing.JRadioButton();
        txtPPassword = new javax.swing.JTextField();
        LblTitle9 = new javax.swing.JLabel();
        LblTitle10 = new javax.swing.JLabel();
        LblTitle11 = new javax.swing.JLabel();
        txtPCfmPassword = new javax.swing.JTextField();
        LblTitle12 = new javax.swing.JLabel();
        LblTitle13 = new javax.swing.JLabel();
        btnCreateAcc = new keeptoo.KButton();
        BtnCncl = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPFullName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(txtPFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 365, 30));

        txtPEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(txtPEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 365, 30));

        txtPIC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(txtPIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 365, 30));

        txtPUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(txtPUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 365, 30));

        txtPContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(txtPContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 365, 30));

        LblTitle3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle3.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle3.setText("Full Name");
        jPanel1.add(LblTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        LblTitle4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTitle4.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle4.setText("Account Details");
        jPanel1.add(LblTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 36));

        LblTitle5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle5.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle5.setText("IC/Passport No");
        jPanel1.add(LblTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        LblTitle6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle6.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle6.setText("Email");
        jPanel1.add(LblTitle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        LblTitle7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle7.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle7.setText("Contact No");
        jPanel1.add(LblTitle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        LblTitle8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle8.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle8.setText("Citizen");
        jPanel1.add(LblTitle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        rdbtnPCitizen.setBackground(new java.awt.Color(255, 255, 255));
        rdbtnPCitizen.setText("Citizen");
        rdbtnPCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnPCitizenActionPerformed(evt);
            }
        });
        jPanel1.add(rdbtnPCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        rdbtnPNotCitizen.setBackground(new java.awt.Color(255, 255, 255));
        rdbtnPNotCitizen.setText("Not Citizen");
        rdbtnPNotCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnPNotCitizenActionPerformed(evt);
            }
        });
        jPanel1.add(rdbtnPNotCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        txtPPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(txtPPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 365, 30));

        LblTitle9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle9.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle9.setText("Username");
        jPanel1.add(LblTitle9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        LblTitle10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle10.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle10.setText("Password");
        jPanel1.add(LblTitle10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        LblTitle11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LblTitle11.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle11.setText("Confirm Password");
        jPanel1.add(LblTitle11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        txtPCfmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPCfmPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        txtPCfmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPCfmPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPCfmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 365, 30));

        LblTitle12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTitle12.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle12.setText("SIGN UP");
        jPanel1.add(LblTitle12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 36));

        LblTitle13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTitle13.setForeground(new java.awt.Color(102, 102, 102));
        LblTitle13.setText("Personal Details");
        jPanel1.add(LblTitle13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 36));

        btnCreateAcc.setBorder(null);
        btnCreateAcc.setText("Register");
        btnCreateAcc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateAcc.setkBackGroundColor(new java.awt.Color(12, 91, 160));
        btnCreateAcc.setkBorderRadius(20);
        btnCreateAcc.setkEndColor(new java.awt.Color(255, 0, 255));
        btnCreateAcc.setkHoverEndColor(new java.awt.Color(0, 51, 204));
        btnCreateAcc.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCreateAcc.setkHoverStartColor(new java.awt.Color(12, 91, 160));
        btnCreateAcc.setkSelectedColor(new java.awt.Color(53, 91, 201));
        btnCreateAcc.setkStartColor(new java.awt.Color(12, 91, 160));
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 119, -1));

        BtnCncl.setBorder(null);
        BtnCncl.setText("Cancel");
        BtnCncl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCncl.setkBackGroundColor(new java.awt.Color(12, 91, 160));
        BtnCncl.setkBorderRadius(20);
        BtnCncl.setkEndColor(new java.awt.Color(255, 0, 255));
        BtnCncl.setkHoverEndColor(new java.awt.Color(0, 51, 204));
        BtnCncl.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BtnCncl.setkHoverStartColor(new java.awt.Color(12, 91, 160));
        BtnCncl.setkSelectedColor(new java.awt.Color(53, 91, 201));
        BtnCncl.setkStartColor(new java.awt.Color(12, 91, 160));
        BtnCncl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCnclMouseClicked(evt);
            }
        });
        BtnCncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCnclActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 115, -1));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPCfmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPCfmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPCfmPasswordActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        
        String AccountName = txtPFullName.getText().trim();
        String Email = txtPEmail.getText().trim();
        String IC = txtPIC.getText().trim();
        String ContactNumber = txtPContact.getText().trim();
        String Username = txtPUsername.getText().trim();
        String Password = txtPPassword.getText().trim();
        String CfrmPassword = txtPCfmPassword.getText().trim();
                
        Boolean Citizen = true;
        
        if(rdbtnPCitizen.isSelected()){
            Citizen = true;
            
        }else if(rdbtnPNotCitizen.isSelected()){
            Citizen = false;
        }
        
        //Validation is set to ensure that the data entered is correct 
        //Used for phone number validation
        String RegexPhone = "^(01)[0-46-9]*[0-9]{7,8}$";

        //Used for email validation
        String RegexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        
        //Ensures that there are no empty data fields
        if(AccountName.isBlank()||Email.isBlank()||IC.isBlank()||ContactNumber.isBlank()
           ||Username.isBlank()||Password.isBlank()||(rdbtnPCitizen.isSelected()== false && rdbtnPNotCitizen.isSelected() == false)){
            
            JOptionPane.showMessageDialog(this, "Please ensure that all the data fields are filled in.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
            
        //Ensures that the username is of the correct length
        } else if ((Username.length() >= 19 || Username.length() <= 5)){
            
            JOptionPane.showMessageDialog(this, "Please ensure that that your username is between 6 - 18 characters.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
            
        //Ensures that the password and confirm password textfields are the same
        } else if ((!(Password.equals(CfrmPassword)))){

            txtPPassword.setText("");
            txtPCfmPassword.setText("");

            JOptionPane.showMessageDialog(this, "Please ensure that the passwords entered match.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

        //Ensures that the email entered is of the correct format
        //https://www.tutorialspoint.com/validate-email-address-in-java
        } else if (!(Email.matches(RegexEmail))){
            
            JOptionPane.showMessageDialog(this, "The email entered is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
            
        //Ensures that the contact number entered is of the correct format
        } else if (!(ContactNumber.matches(RegexPhone))){
            
            JOptionPane.showMessageDialog(this, "The phone number entered is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            
           //Gets the list of Account text files to scan
            File Accountfolder = new File("./Accounts");
            File[] AccountList = Accountfolder.listFiles();
            
            //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
            //loops the scanning to get the Name and IC of the textfile
            for (int i = 0; i < AccountList.length; i++){
                
                People AccountFiles = new People(AccountList[i].getName());
                
                //Checks if the account exists
                if((!(AccountFiles.GetName().equals(AccountName)))){
                    if (!(AccountFiles.GetIC().equals(IC))){
                        
                    //Creates People Object that is to be saved in a text file
                    People newPpl = new People(AccountName,IC,Citizen,Email,ContactNumber,Username,Password);

                     //Invokes the CreateAccount function which save the data into a text file
                     newPpl.CreateReport();
                    
                    }}else if((AccountFiles.GetName().equals(AccountName)) ){
                    if (AccountFiles.GetIC().equals(IC)){
                        
                    
                    JOptionPane.showMessageDialog(this, "This account already exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                            
                }
            }
            }
            
            
        }catch (Exception e){
            
             JOptionPane.showMessageDialog(this, "Failed to create account.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
        }
        
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void BtnCnclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCnclMouseClicked
        // changes the frame back to the login frame
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BtnCnclMouseClicked

    private void BtnCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCnclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCnclActionPerformed

    private void rdbtnPNotCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnPNotCitizenActionPerformed
        
        rdbtnPCitizen.setSelected(false);
    }//GEN-LAST:event_rdbtnPNotCitizenActionPerformed

    private void rdbtnPCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnPCitizenActionPerformed
        
        rdbtnPNotCitizen.setSelected(false);
    }//GEN-LAST:event_rdbtnPCitizenActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnCncl;
    private javax.swing.JLabel LblTitle10;
    private javax.swing.JLabel LblTitle11;
    private javax.swing.JLabel LblTitle12;
    private javax.swing.JLabel LblTitle13;
    private javax.swing.JLabel LblTitle3;
    private javax.swing.JLabel LblTitle4;
    private javax.swing.JLabel LblTitle5;
    private javax.swing.JLabel LblTitle6;
    private javax.swing.JLabel LblTitle7;
    private javax.swing.JLabel LblTitle8;
    private javax.swing.JLabel LblTitle9;
    private keeptoo.KButton btnCreateAcc;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rdbtnPCitizen;
    private javax.swing.JRadioButton rdbtnPNotCitizen;
    private javax.swing.JTextField txtPCfmPassword;
    private javax.swing.JTextField txtPContact;
    private javax.swing.JTextField txtPEmail;
    private javax.swing.JTextField txtPFullName;
    private javax.swing.JTextField txtPIC;
    private javax.swing.JTextField txtPPassword;
    private javax.swing.JTextField txtPUsername;
    // End of variables declaration//GEN-END:variables
}
