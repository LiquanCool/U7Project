import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //A package cannot be less than a tenth of a pound or smaller than 2 inches on each side
        Address yes = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        System.out.println(yes);
        Scanner scan = new Scanner(System.in);
        String input = "";//
        while (!(input.equals("4")))
        {
            System.out.println("What would you like to do?\n1. Calculate cost of one package\n2. Simulate package\n3. How package costs are calculated\n4. Exit\nInput:");
            input = scan.nextLine();
            if (input.equals("1"))
            {
                boolean acceptable = false;
                while (!acceptable)
                {
                    System.out.println("Enter the zip code of the origin package:");
                    int origin = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the zip code of the destination package:");
                    int destination = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the weight of the package:");
                    double weight = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the height of the package:");
                    double height = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the length of the package:");
                    double length = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the width of the package:");
                    double width = Integer.parseInt(scan.nextLine());
                    System.out.println("Cost: " + PostageCalculator.calculatePostage(origin,destination,weight,length,width,height));
                }
            }
            else if (input.equals("2"))
            {

            }
            else if (input.equals("3"))
            {

            }
            else if (input.equals("4"))
            {

            }
            else
            {
                System.out.println("That is not one of the options. Try again.");
            }

        }
    }
}
