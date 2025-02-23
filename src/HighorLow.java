import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int num = generator.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        String trash = "";
        do{
            System.out.println("Guess the number!");
            if(in.hasNextInt())
            {
                guess = in.nextInt();
                if(guess == num)
                {
                    System.out.println("On the money!");
                } else if (guess > num) {
                    System.out.println("Too high!");
                } else if (guess < num) {
                    System.out.println("Too low!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Wrong input. Must be a number.");
            }
            done = true;

        }while(!done);

    }
}
