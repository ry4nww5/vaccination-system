package javadegreeassignment;


import javax.swing.JOptionPane;
import java.io.File;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.MutableComboBoxModel;

public class CreateAppointment extends javax.swing.JFrame {

    //Gets the list of Account text files to scan
    File Accountfolder = new File("./Accounts");
    File[] AccountList = Accountfolder.listFiles();

    //Gets the list of Appointment text files to scan
    File Appointmentfolder = new File("./Appointment");
    File[] AppointmentList = Appointmentfolder.listFiles();

    //Gets the list of Vaccine Text files to scan
    File Vaccinefolder = new File("./Vaccine");
    File[] VaccineList = Vaccinefolder.listFiles();

    //Gets the list of Center Text files to scan
    File Centerfolder = new File("./Center");
    File[] CenterList = Centerfolder.listFiles();

    static String[] stripExtension(String str) {
        // Handle null case specially.

        if (str == null) {
            return null;
        }

        // Get position of last '.'.
        int pos = str.lastIndexOf(".");
        
        String[] ToBeReturn = new String[2];
        ToBeReturn[0] = str.substring(0,pos);
        ToBeReturn[1] = str;
        
        // Otherwise return the string, up to the dot.
        return ToBeReturn;
    }
    
    public CreateAppointment() {
        initComponents();

        //Filling the combobox
        //Looping the creation of the array needed for the combo box model
        String[] CbModel = new String[VaccineList.length];
        String[] CbIndex = new String[VaccineList.length];
        for (int s = 0; s < VaccineList.length; s++) {
            
            CbModel[s] = stripExtension(VaccineList[s].getName())[0];
            CbIndex[s] = stripExtension(VaccineList[s].getName())[1];
        }

        MutableComboBoxModel model = new DefaultComboBoxModel(CbModel);

        CbBxVx.setModel(model);
        
        System.out.println(CbIndex[1]);
        System.out.println(CbIndex[2]);
        System.out.println(CbIndex[3]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        BtnCncl = new keeptoo.KButton();
        LblAccName = new javax.swing.JLabel();
        TxtAccName = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        BtnCrt = new keeptoo.KButton();
        TxtIC = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        LblPgeTtle3 = new javax.swing.JLabel();
        LblPgeTtle5 = new javax.swing.JLabel();
        LblPgeTtle6 = new javax.swing.JLabel();
        LblIC2 = new javax.swing.JLabel();
        LblIC3 = new javax.swing.JLabel();
        CbBxTime = new javax.swing.JComboBox<>();
        LblIC4 = new javax.swing.JLabel();
        TxtSpecialRequest = new javax.swing.JTextField();
        LblIC5 = new javax.swing.JLabel();
        CbBxVx = new javax.swing.JComboBox<>();
        TxtBx = new com.github.lgooddatepicker.components.DatePicker();

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
        jPanel7.add(BtnCncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 150, -1));

        LblAccName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblAccName.setForeground(new java.awt.Color(0, 0, 0));
        LblAccName.setText("Account Name");
        jPanel7.add(LblAccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        TxtAccName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtAccName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtAccName.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtAccName.setOpaque(false);
        jPanel7.add(TxtAccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 342, 38));

        LblEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblEmail.setForeground(new java.awt.Color(0, 0, 0));
        LblEmail.setText("IC/Passport No");
        jPanel7.add(LblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 80, -1));

        BtnCrt.setText("Create");
        BtnCrt.setToolTipText("");
        BtnCrt.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnCrt.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnCrt.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnCrt.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnCrt.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnCrt.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnCrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCrtMouseClicked(evt);
            }
        });
        jPanel7.add(BtnCrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 150, -1));

        TxtIC.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtIC.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtIC.setOpaque(false);
        jPanel7.add(TxtIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 358, 38));

        jPanel8.setBackground(new java.awt.Color(81, 163, 250));

        LblPgeTtle3.setText("Create Appointment");
        LblPgeTtle3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LblPgeTtle3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPgeTtle3)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LblPgeTtle3)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        LblPgeTtle5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle5.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle5.setText("Appointment Info");
        jPanel7.add(LblPgeTtle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, -1));

        LblPgeTtle6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPgeTtle6.setForeground(new java.awt.Color(51, 51, 51));
        LblPgeTtle6.setText("Account Info");
        jPanel7.add(LblPgeTtle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, -1));

        LblIC2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC2.setForeground(new java.awt.Color(0, 0, 0));
        LblIC2.setText("Date");
        jPanel7.add(LblIC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        LblIC3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC3.setForeground(new java.awt.Color(0, 0, 0));
        LblIC3.setText("Time");
        jPanel7.add(LblIC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        CbBxTime.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        CbBxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.00 a.m", "2.00 p.m", "5.00 p.m" }));
        CbBxTime.setOpaque(false);
        jPanel7.add(CbBxTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 350, 40));

        LblIC4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC4.setForeground(new java.awt.Color(0, 0, 0));
        LblIC4.setText("Special Request");
        jPanel7.add(LblIC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        TxtSpecialRequest.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtSpecialRequest.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtSpecialRequest.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtSpecialRequest.setOpaque(false);
        jPanel7.add(TxtSpecialRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 342, 38));

        LblIC5.setText("Vaccine");
        LblIC5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LblIC5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(LblIC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        CbBxVx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stadium Bukit Jalil (Astrazaneca)", "WPCC  (Phizer)", "KL Convention Center(Moderna)" }));
        CbBxVx.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        CbBxVx.setOpaque(false);
        jPanel7.add(CbBxVx, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 350, 40));
        jPanel7.add(TxtBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCrtMouseClicked

        String AccountName = TxtAccName.getText().trim();
        String IC = TxtIC.getText().trim();
        String Request = TxtSpecialRequest.getText().trim();
        String time = String.valueOf(CbBxTime.getSelectedItem());
        
        
        String location = String.valueOf(CbBxVx.getSelectedItem()) + ".txt";
        

        //Ensures that there are no empty data fields
        if (AccountName.isBlank() || IC.isBlank() || TxtBx.getDate() == null 
                || time.isBlank() || location.isBlank()) {

            JOptionPane.showMessageDialog(this, "Please ensure that all the data fields are filled in.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String date = TxtBx.getDate().format(DateTimeFormatter.ISO_DATE);
        try {
            try {

                //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
                //loops the scanning to see if there are duplicates
                for (int i = 0; i < AppointmentList.length; i++) {

                    Appointment AppointmentFiles = new Appointment(AppointmentList[i].getName());

                    //Checks if there is already a record of the account
                    if ((AppointmentFiles.GetTempName().equals(AccountName))) {
                        if (AppointmentFiles.GetTempIC().equals(IC)) {

                            JOptionPane.showMessageDialog(this, "This account already has an appointment", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;

                        }
                    }
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to check for duplicate data.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            try {

                //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
                //loops the scanning to get the Name and IC of the textfile
                for (int i = 0; i < AccountList.length; i++) {

                    People AccountFiles = new People(AccountList[i].getName());

                    //Checks if the account exists
                    if ((AccountFiles.GetName().equals(AccountName))) {
                        if (AccountFiles.GetIC().equals(IC)) {

                            //loops the scanning of the vaccine text files to find a match
                            for (int n = 0; n < VaccineList.length; n++) {

                                Vaccines VaxFiles = new Vaccines(VaccineList[i].getName());

                                //Creates People Object that is to be saved in a text file
                                Appointment newAppt = new Appointment(date, Request, time, VaxFiles, AccountFiles);

                                //Invokes the CreateAccount function which save the data into a text file
                                newAppt.CreateReport();

                            }
                        } else if ((!AccountFiles.GetName().equals(AccountName)) || (!AccountFiles.GetIC().equals(IC))) {

                            JOptionPane.showMessageDialog(this, "This account does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;

                        }
                    }
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to write data in textfile.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Failed to create the appointment.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        new Personnel_Home().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnCrtMouseClicked

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
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnCncl;
    private keeptoo.KButton BtnCrt;
    private javax.swing.JComboBox<String> CbBxTime;
    private javax.swing.JComboBox<String> CbBxVx;
    private javax.swing.JLabel LblAccName;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblIC2;
    private javax.swing.JLabel LblIC3;
    private javax.swing.JLabel LblIC4;
    private javax.swing.JLabel LblIC5;
    private javax.swing.JLabel LblPgeTtle3;
    private javax.swing.JLabel LblPgeTtle5;
    private javax.swing.JLabel LblPgeTtle6;
    private javax.swing.JTextField TxtAccName;
    private com.github.lgooddatepicker.components.DatePicker TxtBx;
    private javax.swing.JTextField TxtIC;
    private javax.swing.JTextField TxtSpecialRequest;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
