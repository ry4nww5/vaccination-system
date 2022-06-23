package javadegreeassignment;

import java.awt.Color;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Personnel_Home extends javax.swing.JFrame {

    People SelectedAcc;
    Appointment SelectedAppt;
    Vaccines SelectedVax;
    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

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

    //Creates the table model for the account table that is to be filled in
    DefaultTableModel AccountModel = new DefaultTableModel(new String[]{"Name", "IC/Passport", "Email", "Contact Number", "Citizen"}, 0) {

        //Ensures that the cells are not editable
        public boolean isCellEditable(int row, int column) {
            return false;

        }
    };

    //Creates the table model for the appointment table that is to be filled in
    DefaultTableModel AppointmentModel = new DefaultTableModel(new String[]{"Name", "IC/Passport", "Date", "Time", "Location"}, 0) {

        //Ensures that the cells are not editable
        public boolean isCellEditable(int row, int column) {
            return false;

        }
    };

    //Creates the table model for the account table that is to be filled in
    DefaultTableModel VaccineModel = new DefaultTableModel(new String[]{"Name", "Center", "SupplyLeft"}, 0) {

        //Ensures that the cells are not editable
        public boolean isCellEditable(int row, int column) {
            return false;

        }
    };

    public Personnel_Home() {
        initComponents();

        //returns the dayofweek as String 
        //https://stackoverflow.com/questions/18882420/want-to-get-day-of-a-week-as-a-string-but-giving-wrong-day
        final LocalDateTime dayOfWeek = LocalDateTime.now();
        String Date = dayOfWeek.format(formatter);

        //Changes the labels so that it displays the day of the week
        LblDte.setText(Date);

        //Invotes the function that sets the tables
        setTableData(AccountModel, "Accounts");

        //The search function
        //Sorts the table according to the search bar text if any
        //https://stackoverflow.com/questions/22066387/how-to-search-an-element-in-a-jtable-java
        //The Accounts table
        TableRowSorter<TableModel> AccountRowSorter = new TableRowSorter<>(AccountModel);
        TblAcc.setRowSorter(AccountRowSorter);
        TxtAcc.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String search = TxtAcc.getText().trim();

                if (search.length() == 0) {
                    AccountRowSorter.setRowFilter(null);
                } else {
                    AccountRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String search = TxtAcc.getText().trim();

                if (search.length() == 0) {
                    AccountRowSorter.setRowFilter(null);
                } else {
                    AccountRowSorter.setRowFilter(RowFilter.regexFilter("(?i" + search));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        //The Appointment table
        TableRowSorter<TableModel> AppointmentRowSorter = new TableRowSorter<>(AppointmentModel);
        TblAppt.setRowSorter(AppointmentRowSorter);
        TxtAppt.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String search = TxtAppt.getText().trim();

                if (search.length() == 0) {
                    AppointmentRowSorter.setRowFilter(null);
                } else {
                    AppointmentRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String search = TxtAppt.getText().trim();

                if (search.length() == 0) {
                    AppointmentRowSorter.setRowFilter(null);
                } else {
                    AppointmentRowSorter.setRowFilter(RowFilter.regexFilter("(?i" + search));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        //The Vaccine table
        TableRowSorter<TableModel> VaccineRowSorter = new TableRowSorter<>(VaccineModel);
        TblVaccine.setRowSorter(VaccineRowSorter);
        TxtVccne.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String search = TxtVccne.getText().trim();

                if (search.length() == 0) {
                    VaccineRowSorter.setRowFilter(null);
                } else {
                    VaccineRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String search = TxtVccne.getText().trim();

                if (search.length() == 0) {
                    VaccineRowSorter.setRowFilter(null);
                } else {
                    VaccineRowSorter.setRowFilter(RowFilter.regexFilter("(?i" + search));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    public void setTableData(DefaultTableModel model, String type) {

        //Gets the List of Files
        File folder = new File("./" + type);
        File[] List = folder.listFiles();

        if (null != type) {
            switch (type) {

                case "Accounts":

                    TblAcc.setModel(AccountModel);
                    //Adding rows of the data to the table per file scanned
                    //https://stackoverflow.com/questions/22371720/how-to-add-row-dynamically-in-jtable
                    for (int i = 0; i < List.length; i++) {

                        People PeopleFiles = new People(List[i].getName());

                        //Displaying the rows of data scanned into the table
                        model.addRow(new Object[]{PeopleFiles.GetName(), PeopleFiles.GetIC(),
                            PeopleFiles.GetEmail(), PeopleFiles.GetContactNumber(), String.valueOf(PeopleFiles.GetCitizen())});

                        model.fireTableDataChanged();
                    }
                    break;

                case "Appointment":

                    TblAppt.setModel(AppointmentModel);
                    for (int i = 0; i < List.length; i++) {

                        Appointment AppointmentFiles = new Appointment(List[i].getName());

                        //Displaying the rows of data scanned into the table
                        model.addRow(new Object[]{AppointmentFiles.GetTempName(), AppointmentFiles.GetTempIC(), AppointmentFiles.GetDate(),
                            AppointmentFiles.GetTime(), AppointmentFiles.GetTempVax()});

                        model.fireTableDataChanged();
                    }
                    break;

                case "Vaccine":

                    TblVaccine.setModel(VaccineModel);
                    for (int i = 0; i < List.length; i++) {

                        Vaccines VaccineFiles = new Vaccines(List[i].getName());

                        //Displaying the rows of data scanned into the table
                        model.addRow(new Object[]{VaccineFiles.GetName(), VaccineFiles.GetTempCenter(),
                            VaccineFiles.GetSupplyLeft()});

                        model.fireTableDataChanged();
                    }

                    break;
                default:
                    break;
            }
        }

        //Creates an action listener that listens for selection event in the Jtable Component
        //https://stackoverflow.com/questions/20327005/jtable-actionlistener-for-select-a-row
        //Account
        TblAcc.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent event) {

                //Checks if the row selected is null or not
                if (TblAcc.getSelectedRow() > -1) {

                    //Gets the list of Account text files to scan
                    //Gets the list of textfiles
                    File Accountfolder = new File("./Accounts");
                    File[] AccountList = Accountfolder.listFiles();

                    SelectedAcc = new People(AccountList[TblAcc.getSelectedRow()].getName());
                }
            }

        });

        //Appointment
        TblAppt.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent event) {

                //Checks if the row selected is null or not
                if (TblAppt.getSelectedRow() > -1) {

                    //Gets the lsit of Account text files to scan
                    //Gets the list of textfiles
                    File Appointmentfolder = new File("./Appointment");
                    File[] AppointmentList = Appointmentfolder.listFiles();

                    SelectedAppt = new Appointment(AppointmentList[TblAppt.getSelectedRow()].getName());
                }
            }

        });

        //Vaccine
        TblVaccine.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent event) {

                //Checks if the row selected is null or not
                if (TblVaccine.getSelectedRow() > -1) {

                    //Gets the lsit of Account text files to scan
                    //Gets the list of textfiles
                    File Vaccinefolder = new File("./Vaccine");
                    File[] VaccineList = Vaccinefolder.listFiles();

                    SelectedVax = new Vaccines(VaccineList[TblVaccine.getSelectedRow()].getName());
                }
            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        LblDte = new javax.swing.JLabel();
        BtnLogout = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        BtnMngPpl = new javax.swing.JPanel();
        LblManagePeople = new javax.swing.JLabel();
        BtnMngVaccine = new javax.swing.JPanel();
        LblBtnMngVaccine = new javax.swing.JLabel();
        BtnMngAppt = new javax.swing.JPanel();
        LblBtnMngAppt = new javax.swing.JLabel();
        PnlSwitch = new javax.swing.JPanel();
        PnlMngAcc = new javax.swing.JPanel();
        Search = new javax.swing.JLabel();
        TxtAcc = new javax.swing.JTextField();
        BtnRefreshAcc = new keeptoo.KButton();
        BtnModifyAccount = new keeptoo.KButton();
        BtnCrtAcc = new keeptoo.KButton();
        BtnViewAcc = new keeptoo.KButton();
        jPanel5 = new javax.swing.JPanel();
        LblPgeTtle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblAcc = new javax.swing.JTable();
        PnlMngAppt = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        LblPgeTtle2 = new javax.swing.JLabel();
        Search1 = new javax.swing.JLabel();
        TxtAppt = new javax.swing.JTextField();
        BtnRefreshAppt = new keeptoo.KButton();
        BtnDltAppt = new keeptoo.KButton();
        BtnCrtAppt = new keeptoo.KButton();
        BtnViewAppt = new keeptoo.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblAppt = new javax.swing.JTable();
        BtnModifyAppointment1 = new keeptoo.KButton();
        BtnResolve = new keeptoo.KButton();
        PnlMngVaccine = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        LblPgeTtle3 = new javax.swing.JLabel();
        Search2 = new javax.swing.JLabel();
        TxtNo = new javax.swing.JTextField();
        BtnRefreshVccne = new keeptoo.KButton();
        BtnModifyVccne = new keeptoo.KButton();
        BtnRmvVccne = new keeptoo.KButton();
        BtnViewVccne = new keeptoo.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblVaccine = new javax.swing.JTable();
        BtnAddVccne = new keeptoo.KButton();
        TxtVccne = new javax.swing.JTextField();
        Search3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblDte.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblDte.setForeground(new java.awt.Color(51, 51, 51));
        LblDte.setText("Date");
        Header.add(LblDte, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 170, -1));

        BtnLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnLogout.setForeground(new java.awt.Color(51, 51, 51));
        BtnLogout.setText("Log Out");
        BtnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLogoutMouseClicked(evt);
            }
        });
        Header.add(BtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 99, -1));

        sidepanel.setBackground(new java.awt.Color(30, 51, 102));
        sidepanel.setPreferredSize(new java.awt.Dimension(270, 240));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMngPpl.setBackground(new java.awt.Color(81, 83, 250));
        BtnMngPpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMngPplMouseClicked(evt);
            }
        });

        LblManagePeople.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblManagePeople.setForeground(new java.awt.Color(204, 204, 204));
        LblManagePeople.setText("Manage People");
        LblManagePeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblManagePeopleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BtnMngPplLayout = new javax.swing.GroupLayout(BtnMngPpl);
        BtnMngPpl.setLayout(BtnMngPplLayout);
        BtnMngPplLayout.setHorizontalGroup(
            BtnMngPplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMngPplLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(LblManagePeople)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BtnMngPplLayout.setVerticalGroup(
            BtnMngPplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnMngPplLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(LblManagePeople)
                .addGap(19, 19, 19))
        );

        sidepanel.add(BtnMngPpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 60));

        BtnMngVaccine.setBackground(new java.awt.Color(81, 83, 250));
        BtnMngVaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMngVaccineMouseClicked(evt);
            }
        });

        LblBtnMngVaccine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblBtnMngVaccine.setForeground(new java.awt.Color(204, 204, 204));
        LblBtnMngVaccine.setText("Manage Vaccine");
        LblBtnMngVaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblBtnMngVaccineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BtnMngVaccineLayout = new javax.swing.GroupLayout(BtnMngVaccine);
        BtnMngVaccine.setLayout(BtnMngVaccineLayout);
        BtnMngVaccineLayout.setHorizontalGroup(
            BtnMngVaccineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMngVaccineLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(LblBtnMngVaccine)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        BtnMngVaccineLayout.setVerticalGroup(
            BtnMngVaccineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMngVaccineLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblBtnMngVaccine)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        sidepanel.add(BtnMngVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 60));

        BtnMngAppt.setBackground(new java.awt.Color(60, 61, 232));
        BtnMngAppt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMngApptMouseClicked(evt);
            }
        });

        LblBtnMngAppt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblBtnMngAppt.setForeground(new java.awt.Color(204, 204, 204));
        LblBtnMngAppt.setText("Manage Appointment");
        LblBtnMngAppt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblBtnMngApptMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BtnMngApptLayout = new javax.swing.GroupLayout(BtnMngAppt);
        BtnMngAppt.setLayout(BtnMngApptLayout);
        BtnMngApptLayout.setHorizontalGroup(
            BtnMngApptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMngApptLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(LblBtnMngAppt)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        BtnMngApptLayout.setVerticalGroup(
            BtnMngApptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMngApptLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblBtnMngAppt)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        sidepanel.add(BtnMngAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 60));

        PnlSwitch.setBackground(new java.awt.Color(255, 255, 255));
        PnlSwitch.setLayout(new java.awt.CardLayout());

        PnlMngAcc.setBackground(new java.awt.Color(255, 255, 255));
        PnlMngAcc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Search.setText("Search :");
        PnlMngAcc.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        TxtAcc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtAcc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtAcc.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtAcc.setOpaque(false);
        PnlMngAcc.add(TxtAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 168, 200, 30));

        BtnRefreshAcc.setText("Refresh");
        BtnRefreshAcc.setToolTipText("");
        BtnRefreshAcc.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnRefreshAcc.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnRefreshAcc.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnRefreshAcc.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnRefreshAcc.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnRefreshAcc.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnRefreshAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshAccActionPerformed(evt);
            }
        });
        PnlMngAcc.add(BtnRefreshAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 150, -1));

        BtnModifyAccount.setText("Modify Account");
        BtnModifyAccount.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnModifyAccount.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnModifyAccount.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnModifyAccount.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnModifyAccount.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnModifyAccount.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnModifyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifyAccountActionPerformed(evt);
            }
        });
        PnlMngAcc.add(BtnModifyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 150, -1));

        BtnCrtAcc.setText("Create Account");
        BtnCrtAcc.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnCrtAcc.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnCrtAcc.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnCrtAcc.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnCrtAcc.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnCrtAcc.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnCrtAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrtAccActionPerformed(evt);
            }
        });
        PnlMngAcc.add(BtnCrtAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 150, -1));

        BtnViewAcc.setText("View Account");
        BtnViewAcc.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnViewAcc.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnViewAcc.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnViewAcc.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnViewAcc.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnViewAcc.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnViewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewAccActionPerformed(evt);
            }
        });
        PnlMngAcc.add(BtnViewAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, -1));

        jPanel5.setBackground(new java.awt.Color(81, 163, 250));

        LblPgeTtle1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LblPgeTtle1.setForeground(new java.awt.Color(255, 255, 255));
        LblPgeTtle1.setText("Manage People");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPgeTtle1)
                .addContainerGap(538, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LblPgeTtle1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PnlMngAcc.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 900, 140));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TblAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TblAcc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "IC", "Email", "Contact Number", "IsCitizen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblAcc.setGridColor(new java.awt.Color(255, 255, 255));
        TblAcc.setRowHeight(25);
        jScrollPane1.setViewportView(TblAcc);

        PnlMngAcc.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 880, 250));

        PnlSwitch.add(PnlMngAcc, "card4");

        PnlMngAppt.setBackground(new java.awt.Color(255, 255, 255));
        PnlMngAppt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(81, 163, 250));

        LblPgeTtle2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LblPgeTtle2.setForeground(new java.awt.Color(255, 255, 255));
        LblPgeTtle2.setText("Manage Appointment");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPgeTtle2)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LblPgeTtle2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PnlMngAppt.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 900, 140));

        Search1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Search1.setText("Search :");
        PnlMngAppt.add(Search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        TxtAppt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtAppt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtAppt.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtAppt.setOpaque(false);
        TxtAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApptActionPerformed(evt);
            }
        });
        PnlMngAppt.add(TxtAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));

        BtnRefreshAppt.setText("Refresh");
        BtnRefreshAppt.setToolTipText("");
        BtnRefreshAppt.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnRefreshAppt.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnRefreshAppt.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnRefreshAppt.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnRefreshAppt.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnRefreshAppt.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnRefreshAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshApptActionPerformed(evt);
            }
        });
        PnlMngAppt.add(BtnRefreshAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 150, -1));

        BtnDltAppt.setText("Delete Appointment");
        BtnDltAppt.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnDltAppt.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnDltAppt.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnDltAppt.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnDltAppt.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnDltAppt.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnDltAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDltApptActionPerformed(evt);
            }
        });
        PnlMngAppt.add(BtnDltAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 150, -1));

        BtnCrtAppt.setText("Create Appointment");
        BtnCrtAppt.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnCrtAppt.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnCrtAppt.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnCrtAppt.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnCrtAppt.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnCrtAppt.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnCrtAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrtApptActionPerformed(evt);
            }
        });
        PnlMngAppt.add(BtnCrtAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 150, -1));

        BtnViewAppt.setText("View Appointment");
        BtnViewAppt.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnViewAppt.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnViewAppt.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnViewAppt.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnViewAppt.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnViewAppt.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnViewAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewApptActionPerformed(evt);
            }
        });
        PnlMngAppt.add(BtnViewAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TblAppt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TblAppt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "IC/Passport No", "Date", "Time", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblAppt.setGridColor(new java.awt.Color(255, 255, 255));
        TblAppt.setRowHeight(25);
        jScrollPane2.setViewportView(TblAppt);

        PnlMngAppt.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 880, 250));

        BtnModifyAppointment1.setText("Modify Appointment");
        BtnModifyAppointment1.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnModifyAppointment1.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnModifyAppointment1.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnModifyAppointment1.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnModifyAppointment1.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnModifyAppointment1.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnModifyAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifyAppointment1ActionPerformed(evt);
            }
        });
        PnlMngAppt.add(BtnModifyAppointment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 150, -1));

        BtnResolve.setText("Resolve");
        BtnResolve.setToolTipText("");
        BtnResolve.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnResolve.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnResolve.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnResolve.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnResolve.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnResolve.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnResolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResolveActionPerformed(evt);
            }
        });
        PnlMngAppt.add(BtnResolve, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 150, -1));

        PnlSwitch.add(PnlMngAppt, "card3");

        PnlMngVaccine.setBackground(new java.awt.Color(255, 255, 255));
        PnlMngVaccine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(81, 163, 250));

        LblPgeTtle3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LblPgeTtle3.setForeground(new java.awt.Color(255, 255, 255));
        LblPgeTtle3.setText("Manage Vaccine");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblPgeTtle3)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LblPgeTtle3)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PnlMngVaccine.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 900, 140));

        Search2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Search2.setText("Supply to be added/removed :");
        PnlMngVaccine.add(Search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        TxtNo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtNo.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtNo.setOpaque(false);
        PnlMngVaccine.add(TxtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 140, -1));

        BtnRefreshVccne.setText("Refresh");
        BtnRefreshVccne.setToolTipText("");
        BtnRefreshVccne.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnRefreshVccne.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnRefreshVccne.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnRefreshVccne.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnRefreshVccne.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnRefreshVccne.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnRefreshVccne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshVccneActionPerformed(evt);
            }
        });
        PnlMngVaccine.add(BtnRefreshVccne, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 150, -1));

        BtnModifyVccne.setText("Modify Vaccine");
        BtnModifyVccne.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnModifyVccne.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnModifyVccne.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnModifyVccne.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnModifyVccne.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnModifyVccne.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnModifyVccne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifyVccneActionPerformed(evt);
            }
        });
        PnlMngVaccine.add(BtnModifyVccne, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 150, -1));

        BtnRmvVccne.setText("Remove Vaccine");
        BtnRmvVccne.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnRmvVccne.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnRmvVccne.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnRmvVccne.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnRmvVccne.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnRmvVccne.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnRmvVccne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRmvVccneActionPerformed(evt);
            }
        });
        PnlMngVaccine.add(BtnRmvVccne, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 150, -1));

        BtnViewVccne.setText("View Vaccine");
        BtnViewVccne.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnViewVccne.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnViewVccne.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnViewVccne.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnViewVccne.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnViewVccne.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnViewVccne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewVccneActionPerformed(evt);
            }
        });
        PnlMngVaccine.add(BtnViewVccne, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, -1));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TblVaccine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TblVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Supply Left", "Supplier", "Center"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblVaccine.setGridColor(new java.awt.Color(255, 255, 255));
        TblVaccine.setRowHeight(25);
        jScrollPane3.setViewportView(TblVaccine);

        PnlMngVaccine.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 880, 250));

        BtnAddVccne.setText("Add Vaccine");
        BtnAddVccne.setkBackGroundColor(new java.awt.Color(30, 51, 102));
        BtnAddVccne.setkEndColor(new java.awt.Color(30, 51, 102));
        BtnAddVccne.setkHoverEndColor(new java.awt.Color(80, 51, 132));
        BtnAddVccne.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        BtnAddVccne.setkHoverStartColor(new java.awt.Color(101, 83, 250));
        BtnAddVccne.setkStartColor(new java.awt.Color(81, 83, 250));
        BtnAddVccne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddVccneActionPerformed(evt);
            }
        });
        PnlMngVaccine.add(BtnAddVccne, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 150, -1));

        TxtVccne.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TxtVccne.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TxtVccne.setCaretColor(new java.awt.Color(204, 0, 255));
        TxtVccne.setOpaque(false);
        PnlMngVaccine.add(TxtVccne, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));

        Search3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Search3.setText("Search :");
        PnlMngVaccine.add(Search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        PnlSwitch.add(PnlMngVaccine, "card4");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PnlSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PnlSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMngVaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMngVaccineMouseClicked
        //sets the color of the selection of the sidebars
        BtnMngPpl.setBackground(new Color(81, 83, 250));
        BtnMngVaccine.setBackground(new Color(60, 61, 232));
        BtnMngAppt.setBackground(new Color(81, 83, 250));
        //changes the panels of the page
        PnlMngAcc.setVisible(false);
        PnlMngAppt.setVisible(false);
        PnlMngVaccine.setVisible(true);

        //Refreshes the table
        AccountModel.setRowCount(0);
        AppointmentModel.setRowCount(0);
        VaccineModel.setRowCount(0);
        setTableData(VaccineModel, "Vaccine");
    }//GEN-LAST:event_BtnMngVaccineMouseClicked

    private void BtnMngApptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMngApptMouseClicked
        //sets the color of the selection of the sidebars
        BtnMngPpl.setBackground(new Color(81, 83, 250));
        BtnMngVaccine.setBackground(new Color(81, 83, 250));
        BtnMngAppt.setBackground(new Color(60, 61, 232));
        //changes the panels of the page
        PnlMngAcc.setVisible(false);
        PnlMngAppt.setVisible(true);
        PnlMngVaccine.setVisible(false);

        //Refreshes the table
        AccountModel.setRowCount(0);
        AppointmentModel.setRowCount(0);
        VaccineModel.setRowCount(0);
        setTableData(AppointmentModel, "Appointment");
    }//GEN-LAST:event_BtnMngApptMouseClicked

    private void TxtApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApptActionPerformed

    private void BtnViewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewAccActionPerformed
        //Views the selected account: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblAcc.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Changes the frame to the View Account page: 
        new ViewAccount(SelectedAcc).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnViewAccActionPerformed

    private void BtnCrtAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrtAccActionPerformed
        //Changes the frame to the Create Account page:

        new CreateAccount().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCrtAccActionPerformed

    private void BtnModifyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifyAccountActionPerformed
        //Deletes the selected appointment: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblAcc.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Changes the frame to the Modify Account page:
        if (!TblAcc.getSelectionModel().isSelectionEmpty()) {
            new ModifyAccount(SelectedAcc).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtnModifyAccountActionPerformed

    private void BtnRefreshAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshAccActionPerformed

        //Refreshes the table
        AccountModel.setRowCount(0);
        setTableData(AccountModel, "Accounts");

    }//GEN-LAST:event_BtnRefreshAccActionPerformed

    private void BtnViewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewApptActionPerformed

        //Deletes the selected appointment: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblAppt.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Changes the frame to the View Appointment page:
        new ViewAppointment(SelectedAppt).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnViewApptActionPerformed

    private void BtnCrtApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrtApptActionPerformed
        //Changes the frame to the Create Account page:

        new CreateAppointment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCrtApptActionPerformed

    private void BtnModifyAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifyAppointment1ActionPerformed

        //Deletes the selected appointment: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblAppt.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Changes the frame to the Modify Account page:
        new ModifyAppointment(SelectedAppt).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnModifyAppointment1ActionPerformed

    private void BtnDltApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDltApptActionPerformed
        //Deletes the selected appointment: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblAppt.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Displays a option pane that asks for the users confirmation before deleting
        //https://www.tutorialspoint.com/swingexamples/show_confirm_dialog_with_yesno.htm
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this appointment?", "Confirmation for deletion of appointment",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirmation == JOptionPane.YES_OPTION) {
            try {

                String ToDeleteFileName = SelectedAppt.GetTempName() + "_" + SelectedAppt.GetTempIC() + ".txt";

                File Delete = new File("./Appointment/" + ToDeleteFileName);
                Delete.delete();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to delete Appointment data.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (confirmation == JOptionPane.NO_OPTION) {
            return;
        } else {
            return;
        }

    }//GEN-LAST:event_BtnDltApptActionPerformed

    private void BtnRefreshApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshApptActionPerformed

        //Refreshes the table
        AppointmentModel.setRowCount(0);
        setTableData(AppointmentModel, "Appointment");

    }//GEN-LAST:event_BtnRefreshApptActionPerformed

    private void BtnViewVccneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewVccneActionPerformed
        //Deletes the selected appointment: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblVaccine.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Changes the frame to the View Vaccine page:
        new ViewVaccine(SelectedVax).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnViewVccneActionPerformed

    private void BtnModifyVccneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifyVccneActionPerformed
        //Deletes the selected Vaccine: 
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblVaccine.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Changes the frame to the Modify Vaccine page:  
        new ModifyVaccine(SelectedVax).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnModifyVccneActionPerformed

    private void BtnAddVccneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddVccneActionPerformed

        String Number = TxtNo.getText().trim();
        int Num;
        String Name = SelectedVax.GetName();
        int SupplyLeft = SelectedVax.GetSupplyLeft();

        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblVaccine.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Data validation
        //Checks if its blank
        if (Number.isBlank()) {

            JOptionPane.showMessageDialog(this, "Please enter the amount you would like to add.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

        }

        //Checks if input is a number
        try {
            Num = Integer.parseInt(Number);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Please ensure that the input is a number.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Checks if input is negative
        if (Num < 0) {

            JOptionPane.showMessageDialog(this, "Please ensure that the amount that you have entered is positive.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

        }

        //Displays a option pane that asks for the users confirmation before deleting
        //https://www.tutorialspoint.com/swingexamples/show_confirm_dialog_with_yesno.htm
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to add " + Number + " vaccine(s) ?", "Confirmation for addition of vaccines",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmation == JOptionPane.YES_OPTION) {

            try {

                //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
                //loops the scanning to get the data of the textfile
                for (int i = 0; i < CenterList.length; i++) {

                    Center CenterFiles = new Center(CenterList[i].getName());

                    if (CenterFiles.GetName().equals(SelectedVax.GetTempCenter())) {
                        String ToDeleteFileName = SelectedVax.GetName() + ".txt";
                        File Delete = new File("./Vaccine/" + ToDeleteFileName);

                        Delete.delete();

                        SupplyLeft += Num;

                        //Creates the vaccine object that is to be saved in a text file
                        Vaccines newvax = new Vaccines(Name, SupplyLeft, CenterFiles);

                        newvax.CreateReport();
                        break;
                    }
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to edit supply.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();

            }
        } else if (confirmation == JOptionPane.NO_OPTION) {
            return;
        } else {
            return;
        }

    }//GEN-LAST:event_BtnAddVccneActionPerformed

    private void BtnRmvVccneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRmvVccneActionPerformed

        String Number = TxtNo.getText().trim();
        int Num;
        String Name = SelectedVax.GetName();
        int SupplyLeft = SelectedVax.GetSupplyLeft();

        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblVaccine.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Data validation
        //Checks if its blank
        if (Number.isBlank()) {

            JOptionPane.showMessageDialog(this, "Please enter the amount you would like to add.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

        }

        //Checks if input is a number
        try {
            Num = Integer.parseInt(Number);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Please ensure that the input is a number.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Checks if input is negative
        if (Num < 0) {

            JOptionPane.showMessageDialog(this, "Please ensure that the amount that you have entered is positive.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;

        }

        //Displays a option pane that asks for the users confirmation before deleting
        //https://www.tutorialspoint.com/swingexamples/show_confirm_dialog_with_yesno.htm
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove " + Number + " vaccine(s) ?", "Confirmation for addition of vaccines",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirmation == JOptionPane.YES_OPTION) {

            try {

                //https://stackoverflow.com/questions/5694385/getting-the-filenames-of-all-files-in-a-folder
                //loops the scanning to get the Name and IC of the textfile
                for (int i = 0; i < CenterList.length; i++) {

                    Center CenterFiles = new Center(CenterList[i].getName());

                    if (CenterFiles.GetName().equals(SelectedVax.GetTempCenter())) {
                        String ToDeleteFileName = SelectedVax.GetName() + ".txt";
                        File Delete = new File("./Vaccine/" + ToDeleteFileName);

                        Delete.delete();

                        SupplyLeft -= Num;

                        //Creates the vaccine object that is to be saved in a text file
                        Vaccines newvax = new Vaccines(Name, SupplyLeft, CenterFiles);

                        newvax.CreateReport();
                        break;
                    }
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to edit supply.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();

            }
        } else if (confirmation == JOptionPane.NO_OPTION) {
            return;
        } else {
            return;
        }

    }//GEN-LAST:event_BtnRmvVccneActionPerformed

    private void BtnRefreshVccneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshVccneActionPerformed

        //Refreshes the table
        VaccineModel.setRowCount(0);
        setTableData(VaccineModel, "Vaccine");

    }//GEN-LAST:event_BtnRefreshVccneActionPerformed

    private void BtnMngPplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMngPplMouseClicked
        //sets the color of the selection of the sidebars
        BtnMngPpl.setBackground(new Color(60, 61, 232));
        BtnMngVaccine.setBackground(new Color(81, 83, 250));
        BtnMngAppt.setBackground(new Color(81, 83, 250));
        //changes the panels of the page
        PnlMngAcc.setVisible(true);
        PnlMngAppt.setVisible(false);
        PnlMngVaccine.setVisible(false);

        //Refreshes the table
        AccountModel.setRowCount(0);
        AppointmentModel.setRowCount(0);
        VaccineModel.setRowCount(0);
        setTableData(AccountModel, "Accounts");
    }//GEN-LAST:event_BtnMngPplMouseClicked

    private void BtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLogoutMouseClicked

        //Logs the user out of the system
        new Login().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnLogoutMouseClicked

    private void LblManagePeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblManagePeopleMouseClicked
        //sets the color of the selection of the sidebars
        BtnMngPpl.setBackground(new Color(60, 61, 232));
        BtnMngVaccine.setBackground(new Color(81, 83, 250));
        BtnMngAppt.setBackground(new Color(81, 83, 250));
        //changes the panels of the page
        PnlMngAcc.setVisible(true);
        PnlMngAppt.setVisible(false);
        PnlMngVaccine.setVisible(false);

        //Refreshes the table
        AccountModel.setRowCount(0);
        AppointmentModel.setRowCount(0);
        VaccineModel.setRowCount(0);
        setTableData(AccountModel, "Accounts");
    }//GEN-LAST:event_LblManagePeopleMouseClicked

    private void LblBtnMngApptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblBtnMngApptMouseClicked
        //sets the color of the selection of the sidebars
        BtnMngPpl.setBackground(new Color(81, 83, 250));
        BtnMngVaccine.setBackground(new Color(81, 83, 250));
        BtnMngAppt.setBackground(new Color(60, 61, 232));
        //changes the panels of the page
        PnlMngAcc.setVisible(false);
        PnlMngAppt.setVisible(true);
        PnlMngVaccine.setVisible(false);

        //Refreshes the table
        AccountModel.setRowCount(0);
        AppointmentModel.setRowCount(0);
        VaccineModel.setRowCount(0);
        setTableData(AppointmentModel, "Appointment");
    }//GEN-LAST:event_LblBtnMngApptMouseClicked

    private void LblBtnMngVaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblBtnMngVaccineMouseClicked
        //sets the color of the selection of the sidebars
        BtnMngPpl.setBackground(new Color(81, 83, 250));
        BtnMngVaccine.setBackground(new Color(60, 61, 232));
        BtnMngAppt.setBackground(new Color(81, 83, 250));
        //changes the panels of the page
        PnlMngAcc.setVisible(false);
        PnlMngAppt.setVisible(false);
        PnlMngVaccine.setVisible(true);

        //Refreshes the table
        AccountModel.setRowCount(0);
        AppointmentModel.setRowCount(0);
        VaccineModel.setRowCount(0);
        setTableData(VaccineModel, "Vaccine");
    }//GEN-LAST:event_LblBtnMngVaccineMouseClicked

    private void BtnResolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResolveActionPerformed

        //Deletes the selected appointment:
        //Checks if any of the rows are selected before proceeding and if not the system will exit out of the function
        if (TblAppt.getSelectionModel().isSelectionEmpty()) {
            return;
        }

        //Displays a option pane that asks for the users confirmation before deleting
        //https://www.tutorialspoint.com/swingexamples/show_confirm_dialog_with_yesno.htm
        int confirmation = JOptionPane.showConfirmDialog(this, "Is this appointment resolved?", "Confirmation for resolve of appointment",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirmation == JOptionPane.YES_OPTION) {
            try {

                for (int i = 0; i < AccountList.length; i++) {

                    People AccountFiles = new People(AccountList[i].getName());

                    if (SelectedAppt.GetTempName().equals(AccountFiles.GetName())) {
                        if (SelectedAppt.GetTempIC().equals(AccountFiles.GetIC())) {

                            SelectedAppt.SetAccount(AccountFiles);
                            String Status = SelectedAppt.GetAcc().GetStatus();
                            People ApptAcc = SelectedAppt.GetAcc();

                            switch (Status) {
                                case "None":

                                    ApptAcc.SetStatus("1st Dose");
                                    break;

                                case "1st Dose":

                                    ApptAcc.SetStatus("2nd Dose");
                                    break;

                                case "2nd Dose":

                                    JOptionPane.showMessageDialog(this, "This user is already at 2 doses.", "Error: User is fully vaccinated", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }

                            AccountFiles.CreateReport();
                            File ApptAccfile = new File("./Accounts/" + ApptAcc.GetName() + ApptAcc.GetIC());
                            ApptAccfile.delete();

                            String ToDeleteFileName = SelectedAppt.GetTempName() + "_" + SelectedAppt.GetTempIC() + ".txt";

                            File Delete = new File("./Appointment/" + ToDeleteFileName);
                            Delete.delete();
                            return;
                        }

                    }
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Failed to delete Appointment data.", "Error: Failed to Save", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        } else if (confirmation == JOptionPane.NO_OPTION) {
            return;
        } else {
            return;
        }

    }//GEN-LAST:event_BtnResolveActionPerformed

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
            java.util.logging.Logger.getLogger(Personnel_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personnel_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personnel_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personnel_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personnel_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private keeptoo.KButton BtnAddVccne;
    private keeptoo.KButton BtnCrtAcc;
    private keeptoo.KButton BtnCrtAppt;
    private keeptoo.KButton BtnDltAppt;
    private javax.swing.JLabel BtnLogout;
    private javax.swing.JPanel BtnMngAppt;
    private javax.swing.JPanel BtnMngPpl;
    private javax.swing.JPanel BtnMngVaccine;
    private keeptoo.KButton BtnModifyAccount;
    private keeptoo.KButton BtnModifyAppointment1;
    private keeptoo.KButton BtnModifyVccne;
    private keeptoo.KButton BtnRefreshAcc;
    private keeptoo.KButton BtnRefreshAppt;
    private keeptoo.KButton BtnRefreshVccne;
    private keeptoo.KButton BtnResolve;
    private keeptoo.KButton BtnRmvVccne;
    private keeptoo.KButton BtnViewAcc;
    private keeptoo.KButton BtnViewAppt;
    private keeptoo.KButton BtnViewVccne;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LblBtnMngAppt;
    private javax.swing.JLabel LblBtnMngVaccine;
    private javax.swing.JLabel LblDte;
    private javax.swing.JLabel LblManagePeople;
    private javax.swing.JLabel LblPgeTtle1;
    private javax.swing.JLabel LblPgeTtle2;
    private javax.swing.JLabel LblPgeTtle3;
    private javax.swing.JPanel PnlMngAcc;
    private javax.swing.JPanel PnlMngAppt;
    private javax.swing.JPanel PnlMngVaccine;
    private javax.swing.JPanel PnlSwitch;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Search1;
    private javax.swing.JLabel Search2;
    private javax.swing.JLabel Search3;
    private javax.swing.JTable TblAcc;
    private javax.swing.JTable TblAppt;
    private javax.swing.JTable TblVaccine;
    private javax.swing.JTextField TxtAcc;
    private javax.swing.JTextField TxtAppt;
    private javax.swing.JTextField TxtNo;
    private javax.swing.JTextField TxtVccne;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
