import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int integer = in.nextInt();
    int i = 0;
    while (integer > 0){
      while (i < integer){
        System.out.print("*");
        i++;
      }
      System.out.println();
      integer--;
      i = 0;
    }
  }
}
