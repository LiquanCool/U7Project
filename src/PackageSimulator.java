import java.util.ArrayList;

public class PackageSimulator {
    private ArrayList<Package> packages = new ArrayList<Package>();
    private final ArrayList<Address> addresses = DataBuilder.getAddresses("src/zip_code_database.csv");
    public void generatePackages(int num)
    {
        for (int i = 0;i<num;i++)
        {
            Address originAddress = addresses.get((int)(Math.random()*addresses.size()-1));
            Address destinationAddress = addresses.get((int)(Math.random()*addresses.size()-1));
            double weight = (int)(Math.random()*150+.1)+1;
            double length = (int)(Math.random()*106+2)+1;
            double width = (int)(Math.random()*12+2)+1;
            double height = (int)(Math.random()*12+2)+1;//plus 1 since US packages round up for measurements
            Package p = new Package(originAddress,destinationAddress,weight,length,width,height);
        }
    }
    public double getTotalCost()
    {

    }
    public String getSimulationInfo()
    {

    }
    public void resetSimulation()
    {

    }

}
