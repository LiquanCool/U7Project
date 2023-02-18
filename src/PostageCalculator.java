public class PostageCalculator {
    public static double calculatePostage(String originZip, String destinationZip, double weight, double length, double width, double height)
    {
        double total = 3.75;
        total = total + 0.5*weight;
        double originCountryCode = Integer.parseInt((originZip).substring(0,3));
        double destinationCountryCode = Integer.parseInt((destinationZip).substring(0,3));
        total = total + Math.abs((destinationCountryCode-originCountryCode)/100);
        if (height+length+width>36)
        {
            total = total +(height+length+width)*.10;
        }
        if (weight>40)
        {
            total = total + (weight-40)/10*0.1;
        }
        total = (double)((int)(total*100))/100;
        return total;
    }
    public static double calculatePostageWithAddress(Address originAddress, Address destinationAddress, double weight, double length, double width, double height)
    {
        double total = 3.75;
        total = total + 0.5*weight;
        double originCountryCode = Integer.parseInt(originAddress.getZipCode().substring(0,3));
        double destinationCountryCode = Integer.parseInt(destinationAddress.getZipCode().substring(0,3));
        total = total + Math.abs((destinationCountryCode-originCountryCode)/100);
        if (height+length+width>36)
        {
            total = total +(height+length+width)*.10;
        }
        if (weight>40)
        {
            total = total + (weight-40)/10*0.1;
        }
        total = (double)((int)(total*100))/100;
        return total;
    }
    public static double calculatePostageWithPackage(Package pakage)
    {
        double total = 3.75;
        total = total + 0.5*pakage.getWeight();
        double originCountryCode = Integer.parseInt(Integer.toString(Integer.parseInt(pakage.getOrigin().getZipCode())).substring(0,3));
        double destinationCountryCode = Integer.parseInt(Integer.toString((Integer.parseInt(pakage.getOrigin().getZipCode()))).substring(0,3));
        total = total + Math.abs((destinationCountryCode-originCountryCode)/100);
        if (pakage.getHeight()+pakage.getLength()+pakage.getWidth()>36)
        {
            total = total +(pakage.getHeight()+pakage.getLength()+pakage.getWidth())*.10;
        }
        if (pakage.getWeight()>40)
        {
            total = total + (pakage.getWeight()-40)/10*0.1;
        }
        total = (double)((int)(total*100))/100;
        return total;
    }



}
