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
            double weight = (Math.random()*77+.1)+1;
            double length = (Math.random()*53+2)+1;
            double width = (Math.random()*12+2)+1;
            double height = (Math.random()*12+2)+1;
            Package p = new Package(originAddress,destinationAddress,weight,length,width,height);
            packages.add(p);
        }
    }
    public double getTotalCost()
    {
        double total = 0;
        for (int i = 0;i<packages.size();i++)
        {
            total = total + PostageCalculator.calculatePostageWithPackage(packages.get(i));
        }
        total = (double)((int)(total*100))/100;
        return total;
    }
    public String getSimulationInfo()
    {
        String ans = "__________________________________________________\nRandomly generated packages info:\n";
        for (int i = 0;i<packages.size();i++)
        {
            ans = ans + "Package " + (i+1) +": __________________________________________________\n" +
                    "Origin Address: " + packages.get(i).getOrigin()
                    + "\nDestination Address: " + packages.get(i).getDestination()
                    + "\nWeight: " + packages.get(i).getWeight() + " pounds"
                    + "\nHeight: " + packages.get(i).getHeight() + " inches"
                    + "\nLength: " + packages.get(i).getLength() + " inches"
                    + "\nWidth: " + packages.get(i).getWidth() + " inches"
                    + "\nCost: " + PostageCalculator.calculatePostageWithPackage(packages.get(i)) + "\n";
        }
        return ans;
    }
    public void resetSimulation()
    {
        packages.clear();
    }

}
