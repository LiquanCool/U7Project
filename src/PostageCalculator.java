public class PostageCalculator {
    public static double calculatePostage(int originZip, int destinationZip, double weight, double length, double width, double height)
    {
        double total = 3.75;
        total = total + 0.5*weight;
        double originCountryCode = Integer.parseInt(Integer.toString(originZip).substring(0,3));
        double destinationCountryCode = Integer.parseInt(Integer.toString(destinationZip).substring(0,3));
        total = total + ((destinationCountryCode-originCountryCode)/100);
        return total;
    }



}
