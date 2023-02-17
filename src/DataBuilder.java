import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataBuilder {

    public static ArrayList<Address> getAddresses(String fileName)
    {
        ArrayList<Address> Addresses = new ArrayList<Address>();
        try
        {
            File zipCodeData = new File(fileName);
            Scanner reader = new Scanner(zipCodeData);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",");
                if (data.length > 1)
                {
                    Address s = new Address((int)(Math.random()*100+1), "Street", "", data[3], data[data.length-9], data[0]);
                    Addresses.add(s);
                }

            }
        }
        catch (FileNotFoundException noFile) {
            System.out.println("File not found!");
            return null;
        }
        return Addresses;
    }
}