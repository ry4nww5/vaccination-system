package javadegreeassignment;

//Appointment class

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Appointment  {

    //Attributes that will be used 
    
    private String date;
    private String SpecialRequest;
    private String Time;
    private Vaccines Vaccine;
    private People Acc;
    private String TempName;
    private String TempIC;
    private String TempVax;
    
    //Aggregation relationship between Vaccine class, Appointment class & People class
    //Appointment Constructors
    public Appointment(String date, String SpecialRequest, String Time, Vaccines vaccine,People Acc){
        
        
        this.Acc = Acc;
        this.date = date;
        this.SpecialRequest = SpecialRequest;
        this.Time = Time;
        this.Vaccine = vaccine;
        this.Acc = Acc;
        
    }

    //Overload of constructor used in reading files 
    public Appointment(String File){
        
        //Reads the data from the file using the created function
        try{
            
            ReadReport("./Appointment" + "/" + File);
            
        }catch(Exception e){
            
             //Displays a popup box if any error were to occur during the process
       JOptionPane.showMessageDialog(null, "Failed to load data.", "Error: Load Failed.", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    //Function that creates the appointment report
    public void CreateReport(){
        
        String File = "./Appointment/" + Acc.GetName() + "_" + Acc.GetIC() + ".txt";
        
        //combines both filewriter and buffered writer in order to increase the performance of the filewriter.
        //https://zetcode.com/java/filewriter/
        
        try {
                
                FileWriter fr = new FileWriter(File,StandardCharsets.UTF_8); 
                BufferedWriter br = new BufferedWriter(fr);
                  
                br.write(Acc.GetName());
                br.newLine();
                  br.write(Acc.GetIC());
                br.newLine();
                  br.write(date);
                br.newLine();
                  br.write(Time);
                br.newLine();
                  br.write(Vaccine.GetName());
                br.newLine();
                  br.write(SpecialRequest);
                br.newLine();
                
                br.close();
                 fr.close();
                
            }  catch (IOException ex) {
                        
                     JOptionPane.showMessageDialog(null, "I/O ERROR", "Failed to save the file", JOptionPane.ERROR_MESSAGE);
                  
            }
        
        
    }
    
    //Function that reads the appointment report
    public void ReadReport(String AppointmentFolder) throws IOException{
        
        //Represents the folder that stores the textfiles 
        File file = new File(AppointmentFolder);

        //Sets the contents of the file to their respective attributes
        Scanner readfile = new Scanner(file);
        
        while (readfile.hasNext()){
            
            this.TempName = readfile.nextLine();
            this.TempIC = readfile.nextLine();
            this.date = readfile.nextLine();
            this.Time = readfile.nextLine();
            this.TempVax = readfile.nextLine();
            this.SpecialRequest = readfile.nextLine();   
         
        }
        readfile.close();
    }
    
    //The code below are the getters and setters 
   
    public String GetDate() {
        return date;

    }

    public String GetTime() {
        return Time;

    }

    public String GetSpecialRequest() {
        return SpecialRequest;

    }

    public People GetAcc(){
        return Acc;
    }
    
    public Vaccines GetVaccine(){
        return Vaccine;
        
    }
    
    public String GetTempName(){
        return TempName;
        
    }

    public String GetTempIC(){
        return TempIC;
        
    }
    
    public String GetTempVax(){
        return TempVax;
        
    }
    public void SetDate(String date) {
        this.date = date;

    }

    public void SetTime(String time) {
        this.Time = time;

    }

    public void SetSpecialRequest(String request) {
        this.SpecialRequest = request;

    }
    
    public void SetTempVax(String TempVax){
        this.TempVax = TempVax;
        
    }
    
    public void SetTempName(String TempName){
        this.TempName = TempName;
        
    }
    
    public void SetTempIC(String TempIC){
        this.TempIC = TempIC;
        
    }

    public void SetAccount(People Acc){
        this.Acc = Acc;
    }
}
