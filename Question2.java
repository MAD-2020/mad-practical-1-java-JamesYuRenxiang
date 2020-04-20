import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your height:");
    double Height = in.nextDouble();
    System.out.println("Enter your weight:");
    double Weight = in.nextDouble();
    System.out.println("Height: " + Height);
    System.out.println("Weight: " + Weight);
  }
}
