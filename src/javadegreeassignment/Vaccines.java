package javadegreeassignment;

//Vaccine class
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Vaccines {

    //Attributes that will be used
    private String Name;
    private int SupplyLeft;
    private Center Center;
    private String TempCenter;

    //Vaccine Constructor used to read the files 
    public Vaccines(String File) {

        //Reads the data from the file using the created function
        try {

            ReadReport("./Vaccine/" + File);

        } catch (Exception e) {

            //Displays a popup box if any error were to occur during the process
            JOptionPane.showMessageDialog(null, "Failed to load data.", "Error: Load Failed.", JOptionPane.ERROR_MESSAGE);

        }

    }

    public Vaccines(String Name, int Supply, Center center) {

        this.Name = Name;
        this.SupplyLeft = Supply;
        this.Center = center;

    }

    public void CreateReport() {

        String File = "./Vaccine/" + Name + ".txt";

        //combines both filewriter and buffered writer in order to increase the performance of the filewriter.
        //https://zetcode.com/java/filewriter/
        try {

            FileWriter fr = new FileWriter(File, StandardCharsets.UTF_8);
            BufferedWriter br = new BufferedWriter(fr);

            br.write(Name);
            br.newLine();
            br.write(Center.GetName());
            br.newLine();
            br.write(Integer.toString(SupplyLeft));
            br.newLine();
            
            br.close();
            fr.close();


            
        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, "I/O ERROR", "Failed to save the file", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ReadReport(String VaccineFolder) throws IOException {

        //Represents the folder that stores the textfiles 
        File file = new File(VaccineFolder);

        //Sets the contents of the file to their respective attributes
        Scanner readfile = new Scanner(file);

        while (readfile.hasNext()) {

            this.Name = readfile.nextLine();
            this.TempCenter = readfile.nextLine();
            this.SupplyLeft = Integer.parseInt(readfile.nextLine());

        }
        readfile.close();
    }

    // The code below are the getters and setters
    public String GetName() {
        return Name;

    }

    public int GetSupplyLeft() {
        return SupplyLeft;

    }

    public String GetCenterName() {
        return Center.GetName();

    }

    public String GetTempCenter() {
        return TempCenter;

    }

    public Center GetCenter() {
        return Center;
    }

    public void SetSupplyLeft(int Supply) {
        this.SupplyLeft = Supply;

    }

    public void SetName(String Name) {
        this.Name = Name;

    }
    
    public void SetCenter(Center Center){
        this.Center = Center;
    }
}
