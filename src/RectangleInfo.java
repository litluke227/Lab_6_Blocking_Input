import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          double width = 0;
          double height = 0;
          String trash = "";
          boolean done = false;
          do {
              System.out.println("What is the height of the rectangle?");
              if(in.hasNextDouble())
              {
                  height = in.nextDouble();
                  System.out.println("What is the width of the rectangle?");
                  width= in.nextDouble();
                  System.out.println("The area of the rectangle is: " + width * height);
                  System.out.println("The perimeter of the rectangle is: " + ((width + height) * 2) );
                  double diag = (width*width) + (height*height);
                  double diagg = java.lang.Math.sqrt(diag);
                  System.out.println("The diagonal of the rectangle is: "+ diagg);
                  done = true;
              }
              else {
                  trash = in.nextLine();
                  System.out.println("Wrong input. Must be a number");
              }
          }while(!done);

    }
}
