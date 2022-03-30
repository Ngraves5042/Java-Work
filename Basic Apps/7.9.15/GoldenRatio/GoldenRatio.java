import java.util.Scanner;
public class GoldenRatio
{
   public static void main(String[] args)
      {
         double n1 = 61.8;
         double n2 = 38.2;
         
         isGoldenRatio(n1, n2);
         
      
      }

   private static boolean isGoldenRatio(double number1, double number2)
   {
      if(number1 >= number2)
      {
         double ratio = number1 / number2;
         ratio = Math.round((ratio * 1000));
         ratio /= 1000;
         
         if(ratio == 1.618)
         {
            System.out.print("The two numbers are a golden ratio");
            return true;
         }
         else
         {
            System.out.print("The two numbers are not a golden ratio");
            return false;
         }
      }  
      else
      {
         double ratio = number2 / number1;
         ratio = Math.round((ratio * 1000));
         ratio /= 1000;
         if(ratio == 1.618)
         {
            System.out.print("The two numbers are a golden ratio");
            return true;
         }
         else
         {
            System.out.print("The two numbers are not a golden ratio");
            return false;
         }   
      }     
   
         
   
   
   }
   


}