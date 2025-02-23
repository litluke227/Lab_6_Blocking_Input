import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double f = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.println("What is the temperature in celsius?");
            if(in.hasNextDouble())
            {
                  f = in.nextDouble();
                  in.nextLine();
                System.out.println("The converted temperature is: " + (f * 1.8 + 32));
                  done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid Input. Must be a number");
            }
        }
        while(!done);

    }
}