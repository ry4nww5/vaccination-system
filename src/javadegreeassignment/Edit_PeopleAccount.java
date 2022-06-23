/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadegreeassignment;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author USER
 */
public class Edit_PeopleAccount extends javax.swing.JFrame {

    String Username;
    String Status;
    
    People AccData;
    
    /**
     * Creates new form Edit_PeopleAccount
     */
    public Edit_PeopleAccount(People Account) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.AccData=Account;
        this.Username=AccData.GetUsername();
        
        TxtAccName.setText(AccData.GetName());
        TxtEmail.setText(AccData.GetEmail());
        TxtIC.setText(AccData.GetIC());
        TxtContactNumber.setText(AccData.GetContactNumber());
        TxtUsername.setText(AccData.GetUsername());
        TxtPassword.setText(AccData.GetPassword());
        
        if ("true".equals(String.valueOf((AccData.GetCitizen())))){
            
            RdBtnCitizen.setSelected(true);
            RdBtnNotCitizen.setSelected(false);
            
        }else if ("false".equals(String.valueOf((AccData.GetCitizen())))){
            
            RdBtnCitizen.setSelected(false);
            RdBtnNotCitizen.setSelected(true);
            
        }
        
        TxtIC.setEditable(false);
        RdBtnCitizen.setEnabled(false);
        RdBtnNotCitizen.setEnabled(false);
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
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        BtnCncl = new keeptoo.KButton();
        LblAccName = new javax.swing.JLabel();
        TxtContactNumber = new javax.swing.JTextField();
        LblIC = new javax.swing.JLabel();
        LblCntctNum = new javax.swing.JLabel();
        TxtAccName = new javax.swing.JTextField();
        TxtIC = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        BtnModify = new keeptoo.KButton();
        TxtEmail = new javax.swing.JTextField();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Edit Account");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(642, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

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

        LblAccName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblAccName.setText("Account Name");

        TxtContactNumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtContactNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtContactNumber.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtContactNumber.setOpaque(false);

        LblIC.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC.setText("IC/Passport No");

        LblCntctNum.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblCntctNum.setText("Contact Number");

        TxtAccName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtAccName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtAccName.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtAccName.setOpaque(false);

        TxtIC.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtIC.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtIC.setOpaque(false);

        LblEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblEmail.setText("Email");

        BtnModify.setText("Save");
        BtnModify.setToolTipText("");
        BtnModify.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnModify.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnModify.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnModify.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnModify.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnModify.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifyActionPerformed(evt);
            }
        });

        TxtEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtEmail.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtEmail.setOpaque(false);

        LblIC1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC1.setText("Citizen");

        LblPgeTtle4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle4.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle4.setText("Account Details ");

        LblPgeTtle5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle5.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle5.setText("Personal Info");

        LblIC2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC2.setText("Username");

        TxtUsername.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtUsername.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtUsername.setOpaque(false);

        LblIC3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC3.setText("Citizen");

        LblIC4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC4.setText("Password");

        TxtPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtPassword.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtPassword.setOpaque(false);

        RdBtnCitizen.setBackground(new java.awt.Color(255, 255, 255));
        RdBtnCitizen.setText("Citizen");

        RdBtnNotCitizen.setBackground(new java.awt.Color(255, 255, 255));
        RdBtnNotCitizen.setText("Not Citizen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(BtnCncl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BtnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPgeTtle5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblAccName)
                        .addGap(371, 371, 371)
                        .addComponent(LblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblIC)
                        .addGap(371, 371, 371)
                        .addComponent(LblCntctNum))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(TxtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblIC1)
                    .addComponent(LblIC3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(RdBtnCitizen)
                        .addGap(93, 93, 93)
                        .addComponent(RdBtnNotCitizen))
                    .addComponent(LblPgeTtle4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblIC2)
                        .addGap(395, 395, 395)
                        .addComponent(LblIC4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LblPgeTtle5)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAccName)
                    .addComponent(LblEmail))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIC)
                    .addComponent(LblCntctNum))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIC1)
                    .addComponent(LblIC3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RdBtnCitizen)
                    .addComponent(RdBtnNotCitizen))
                .addGap(17, 17, 17)
                .addComponent(LblPgeTtle4)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIC2)
                    .addComponent(LblIC4))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCncl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void BtnCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCnclActionPerformed

        // Changes the frame back to the Personnel Home page:
        new View_PeopleAccount(this.AccData).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnCnclActionPerformed

    private void BtnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifyActionPerformed
        String AccountName = TxtAccName.getText().trim();
        String Email = TxtEmail.getText().trim();
        String IC = TxtIC.getText().trim();
        String ContactNumber = TxtContactNumber.getText().trim();
        String Username = TxtUsername.getText().trim();
        String Password = TxtPassword.getText().trim();
        Boolean Citizen = true;

        if(RdBtnCitizen.isSelected()){
            Citizen = true;

        }else if(RdBtnNotCitizen.isSelected()){
            Citizen = false;
        }

        //Validation is set to ensure that the data entered is correct
        //Used for phone number validation
        String RegexPhone = "^(01)[0-46-9]*[0-9]{7,8}$";

        //Used for email validation
        String RegexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";

        //Ensures that there are no empty data fields
        if(AccountName.isBlank()||Email.isBlank()||IC.isBlank()||ContactNumber.isBlank()
            ||Username.isBlank()||Password.isBlank()||(RdBtnCitizen.isSelected()== false && RdBtnNotCitizen.isSelected() == false)){

            JOptionPane.showMessageDialog(this, "Please ensure that all the data fields are filled in.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

            //Ensures that the username is of the correct length
        } else if ((Username.length() >= 19 || Username.length() <= 5)){

            JOptionPane.showMessageDialog(this, "Please ensure that that your username is between 6 - 18 characters.", "ERROR", JOptionPane.ERROR_MESSAGE);
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

        String PreFileName = AccData.GetName() + "_" + AccData.GetIC() + ".txt";

        try{

            //Gets the list of Account text files to scan
            File Accountfolder = new File("./Accounts");
            File[] AccountList = Accountfolder.listFiles();

            //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
            //loops the scanning to get the Name and IC of the textfile
            for (int i = 0; i < AccountList.length; i++){

                if (PreFileName.equals(AccountList[i].getName())){
                    continue;
                }

                People AccountFiles = new People(AccountList[i].getName());

                //Checks if the account exists
                if((!AccountFiles.GetName().equals(AccountName))){
                    if (!AccountFiles.GetIC().equals(IC)){

                        File Delete = new File("./Accounts/" + PreFileName);
                        Delete.delete();

                        //Creates People Object that is to be saved in a text file
                        People newPpl = new People(AccountName,IC,Citizen,Email,ContactNumber,Username,Password);

                        //Invokes the CreateAccount function which save the data into a text file
                        newPpl.CreateReport();
                        
                        new View_PeopleAccount(newPpl).setVisible(true);
                        this.dispose();

                    }}else if((AccountFiles.GetName().equals(AccountName)) ){
                        if (AccountFiles.GetIC().equals(IC)){

                            JOptionPane.showMessageDialog(this, "This account already exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;

                        }}}

                    }catch (Exception e){

                        JOptionPane.showMessageDialog(this, "Failed to save booking data.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }

                    //Changes the frame back to the StaffHome page
                    
    }//GEN-LAST:event_BtnModifyActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_PeopleAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_PeopleAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_PeopleAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_PeopleAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Edit_PeopleAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnCncl;
    private keeptoo.KButton BtnModify;
    private javax.swing.JLabel LblAccName;
    private javax.swing.JLabel LblCntctNum;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblIC;
    private javax.swing.JLabel LblIC1;
    private javax.swing.JLabel LblIC2;
    private javax.swing.JLabel LblIC3;
    private javax.swing.JLabel LblIC4;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}