import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println("Please enter an integer:");
    int integer = in.nextInt();
    int z = 0;
    int highest = 0;
    while (z < integer){
      System.out.println("Please enter an integer:");
      int number = in.nextInt();
      numbers.add(number);
      z++;
    }
    int maxCount = 0;
    int maxValue = 0;
    for (int i = 0; i < numbers.size(); i++) {
        int count = 0;
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == numbers.get(i)) {
              count++;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = numbers.get(i);
        }
        }
    }
       System.out.println(maxValue);
    
  }
}
