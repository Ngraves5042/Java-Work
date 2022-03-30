import java.util.Scanner;
public class RectangleMenu
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
       
       Rectangle myRectangle = new Rectangle(5, 4);
       
       int selection;
       
       do{
         menuPrompt();
         selection = input.nextInt();
         
         switch(selection)
         {
            case 1: 
               System.out.printf("The area of the rectangle is: %d\n\n",myRectangle.area());
               break;
            case 2:
               System.out.printf("The perimeter of the rectangle is: %d\n\n", myRectangle.perimeter());
               break;
            case 3:
               System.out.printf("The length of the rectangle is: %d\n", myRectangle.getLength());
               System.out.printf("The width of the rectangle is: %d\n\n", myRectangle.getWidth());
               break;
            case 0:
               break;
            default:
               System.out.printf("Invalid input please enter another number\n\n");
               break;
               
         }
         
         
       }while(!(selection == 0));
       
       System.out.print("good bye");
       
       
  	}
	
	private static void menuPrompt()
	{
	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}