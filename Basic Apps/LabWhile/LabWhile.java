import java.util.Scanner;

public class LabWhile
{
   public static void main(String[] args)
   {
      multiplyNumbers();
   }

   public static void multiplyNumbers()
   {
      Scanner input = new Scanner(System.in);
      
      int product = 1;
      
      System.out.print("Please enter a number or type 0 to quit: ");
      
      int number = input.nextInt();
      
      while(number != 0)
      {
         product *= number;
         
         System.out.print("Please enter another number or type 0 to receive total");
         
         number = input.nextInt();
         
      
      }
      
      System.out.printf("The total is: %d", product);
   }


}