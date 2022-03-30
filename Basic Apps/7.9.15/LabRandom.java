import java.util.Random;

public class LabRandom
{
   public static void main(String [] args)
   {
      Random rand = new Random();
      
      int number1;
      int number2;
      int number3;
      
      int i = 1;
      int j = 1;
      int k = 1;
      
      for (i = i; i <= 100; i++)
      {
         number1 = rand.nextInt(4) + 4;
         System.out.printf("%-5d", number1);
         
         if((i % 10) == 0)
         {
            System.out.println();
         }
      }  
      
      System.out.println();
       
      for (j = j; j <= 100; j++)
      {
         number2 = (rand.nextInt(9) + 1) * 10 ;
         System.out.printf("%-5d", number2);
         
         if((j % 10) == 0)
         {
            System.out.println();
         }
      }   
      
      System.out.println();
      
      for (k = k; k <= 100; k++)
      {
         number3 = rand.nextInt(99) + 901;
         System.out.printf("%-5d", number3);
         
         if((k % 10) == 0)
         {
            System.out.println();
         }
      }

         
         
      
      
      
      
   }      
}