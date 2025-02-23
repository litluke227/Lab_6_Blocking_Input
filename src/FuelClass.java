import java.util.Scanner;
public class FuelClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallon = 0;
        double fe = 0;
        double gp = 0;
        double driveCost = 0;
        double distance = 0;
        String trash = "";
        boolean done = false;
        do {
            {
                System.out.println("What is the number of gallons of gas in the tank?");
                if(in.hasNextDouble())
                {
                    gallon = in.nextDouble();
                    System.out.println("What is the fuel efficiency in mpg?");
                    fe = in.nextDouble();
                    System.out.println("What is the price of gas per gallon?");
                    gp = in.nextDouble();
                    driveCost = (100/fe * gp);
                    distance = fe * gallon;
                    System.out.println("The cost to drive 100 miles is: "+ driveCost);
                    System.out.println("The car can go " + distance + "with a full tank of gas");
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Wrong input. Must be a number");
                }

            }
        }
        while(!done);
    }
}
