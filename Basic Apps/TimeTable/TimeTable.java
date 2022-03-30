import java.util.Scanner;

public class TimeTable
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Time Table:");
      System.out.print("Number (1-10): ");
      int number = input.nextInt();
      System.out.println();
      
      if(number >0 & number < 10)
      {
      
         for (int i = 1; i < 11; i++)
         {  
            int total = number * i;
            
            System.out.printf("%2d * %d = %d\n", i, number, total);
         }
      }
      else
      {
         System.out.println("Incorect input");
      }
   }


}