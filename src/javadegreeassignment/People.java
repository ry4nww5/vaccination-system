package javadegreeassignment;

//People class 

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class People extends Report {

    //Attributes that will be used
    private String Username;
    private String Password;
    private Boolean Citizen;
    private Status Status; 
    
    
    //People Constructors
    public People(String Name, String IC, Boolean Citizen, String Email, String ContactNumber, String Username, String Password) {

        this.Name = Name;
        this.IC = IC;
        this.Email = Email;
        this.ContactNumber = ContactNumber;
        this.Username = Username;
        this.Password = Password;
        this.Citizen = Citizen;
        
        this.Status = new Status("None");
        
    }

    //Overload of constructor used in reading files 
    public People(String File){
        
        //Reads the data from the file using the created function
        try{
            
            ReadReport("./Accounts" + "/" + File);
            
        }catch(Exception e){
            
             //Displays a popup box if any error were to occur during the process
       JOptionPane.showMessageDialog(null, "Failed to load data.", "Error: Load Failed.", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
   //Function that creates the account report into textfiles
    public void CreateReport(){
        
        String File = "./Accounts" + "/" +  Name + "_" + IC + ".txt";
        
        //combines both filewriter and buffered writer in order to increase the performance of the filewriter.
        //https://zetcode.com/java/filewriter/
        
        try {
                
                FileWriter fr = new FileWriter(File,StandardCharsets.UTF_8); 
                BufferedWriter br = new BufferedWriter(fr);
                  
                br.write(Name);
                br.newLine();
                  br.write(IC);
                br.newLine();
                  br.write(Boolean.toString(Citizen));
                br.newLine();
                  br.write(Email);
                br.newLine();
                  br.write(ContactNumber);
                br.newLine();
                  br.write(Username);
                br.newLine();
                  br.write(Password);
                br.newLine();
                br.write(this.Status.GetStatus());
                br.newLine();
                
                br.close();
                 fr.close();
                
            }  catch (IOException ex) {
                        
                     JOptionPane.showMessageDialog(null, "I/O ERROR", "Failed to save the file", JOptionPane.ERROR_MESSAGE);
                        }
    }

    //Function that reads the account report
    public void ReadReport(String AccountFolder) throws IOException{
        
        this.Status = new Status();
        
        //Represents the folder that stores the textfiles 
        File file = new File(AccountFolder);

        //Sets the contents of the file to their respective attributes
        Scanner readfile = new Scanner(file);
        
        while (readfile.hasNext()){
            
            this.Name = readfile.nextLine();
            this.IC = readfile.nextLine();
            this.Citizen = Boolean.parseBoolean(readfile.nextLine());
            this.Email = readfile.nextLine();
            this.ContactNumber = readfile.nextLine();
            this.Username = readfile.nextLine();
            this.Password = readfile.nextLine();
            this.Status.SetStatus(readfile.nextLine());
            
        }
        
        readfile.close();
        
    }
    
    //The code below are the setters and getters
    public String GetUsername() {
        return Username;

    }

    public String GetPassword() {
        return Password;

    }

    public Boolean GetCitizen() {
        return Citizen;

    }
    
    public String GetStatus(){
        return Status.GetStatus();
        
    }
    public void SetUsername(String Username) {
        this.Username = Username;

    }

    public void SetPassword(String Password) {
        this.Password = Password;

    }

    public void SetCitizen(Boolean Citizen) {
        this.Citizen = Citizen;

    }
    
    public void SetStatus (String Status){
        this.Status.SetStatus(Status);
    }}
