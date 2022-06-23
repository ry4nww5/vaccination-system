
package javadegreeassignment;

//Center class

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Center {
    
    //Attributes that will be used
    private String Name;
    private String Address;
    
    
    //Center constructor
    public Center(){
        
    }
    
    //Overload of constructor used in reading files 
    public Center(String File){
        
        //Reads the data from the file using the created function
        try{
            
            ReadReport("./Center" + "/" + File);
            
        }catch(Exception e){
            
             //Displays a popup box if any error were to occur during the process
       JOptionPane.showMessageDialog(null, "Failed to load data.", "Error: Load Failed.", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
     //Function that reads the center report
    public void ReadReport(String CenterFolder) throws IOException{
        
        //Represents the folder that stores the textfiles 
        File file = new File(CenterFolder);

        //Sets the contents of the file to their respective attributes
        Scanner readfile = new Scanner(file);
        
        while (readfile.hasNext()){
            
            this.Name = readfile.nextLine();
            this.Address = readfile.nextLine();
         
        }
        
        readfile.close();
        
    }
    //Getters and Setters of the center class
    public String GetName(){
        return Name;
        
    }
    
    public String GetAddress(){
        return Address;
        
    }
    
    public void SetAddress(String Address){
        this.Address = Address;
        
    }
    
    public void SetName(String Name){
        this.Name = Name;
        
    }
}
