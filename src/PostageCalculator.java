public class PostageCalculator {
    public static double calculatePostage(int originZip, int destinationZip, double weight, double length, double width, double height)
    {
        double total = 3.75;
        total = total + 0.5*weight;
        double originCountryCode = Integer.parseInt(Integer.toString(originZip).substring(0,3));
        double destinationCountryCode = Integer.parseInt(Integer.toString(destinationZip).substring(0,3));
        total = total + ((destinationCountryCode-originCountryCode)/100);
        if (height+length+width>36)
        {
            total = total +(height+length+width)*.10;
        }
        if (weight>40)
        {
            total = total + (weight-40)/10*0.1;
        }
        return total;
    }
    public static double calculatePostageWithAddress(Address originAddress, Address destinationAddress, double weight, double length, double width, double height)
    {
        double total = 3.75;
        total = total + 0.5*weight;
        double originCountryCode = Integer.parseInt(Integer.toString(originAddress.getZipCode()).substring(0,3));
        double destinationCountryCode = Integer.parseInt(Integer.toString(destinationAddress.getZipCode()).substring(0,3));
        total = total + ((destinationCountryCode-originCountryCode)/100);
        if (height+length+width>36)
        {
            total = total +(height+length+width)*.10;
        }
        if (weight>40)
        {
            total = total + (weight-40)/10*0.1;
        }
        return total;
    }
    public static double calculatePostageWithPackage(Package pakage)
    {
        double total = 3.75;
        total = total + 0.5*pakage.getWeight();
        double originCountryCode = Integer.parseInt(Integer.toString(pakage.getOrigin().getZipCode()).substring(0,3));
        double destinationCountryCode = Integer.parseInt(Integer.toString(pakage.getOrigin().getZipCode()).substring(0,3));
        total = total + ((destinationCountryCode-originCountryCode)/100);
        if (pakage.getHeight()+pakage.getLength()+pakage.getWidth()>36)
        {
            total = total +(pakage.getHeight()+pakage.getLength()+pakage.getWidth())*.10;
        }
        if (pakage.getWeight()>40)
        {
            total = total + (pakage.getWeight()-40)/10*0.1;
        }
        return total;
    }



}
