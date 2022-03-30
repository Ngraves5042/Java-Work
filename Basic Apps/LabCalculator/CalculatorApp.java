import java.util.Scanner;

public class CalculatorApp
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      Calculator myCalculator = new Calculator();
      
      System.out.print("number1: ");
      int number1 = input.nextInt();
      
      System.out.print("number2: ");
      int number2 = input.nextInt();
      
      System.out.printf("\nsum: %d", myCalculator.add(number1, number2));
      
      System.out.printf("\ndifference: %d", myCalculator.subtract(number1, number2));
      
      System.out.printf("\nproduct: %d", myCalculator.multiply(number1, number2));
   }

}