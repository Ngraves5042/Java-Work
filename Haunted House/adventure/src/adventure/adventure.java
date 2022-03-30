/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author ngraves2
 */
import java.util.Scanner;

public class adventure
{
   public static void main(String[] args)
   {
       System.out.println("Game intro\n");
       
       System.out.println("You enter the room and find...");
       
       Scanner input = new Scanner(System.in);
       
       rooms myrooms = new rooms();
       
       myrooms.Entrance();       
       
       
       int roomselection = 1;
       
       do
       {
         System.out.println("Where would you like to go or would you like to "
                 + "try and leave the house?");
         System.out.println("1. Guest Bedroom");
         System.out.println("2. Entrance");
         System.out.println("3. Dining Room");
         System.out.println("4. Study");
         System.out.println("5. Kitchen");
         System.out.println("6. Master Bedroom");
         System.out.println("7. Try to leave house");
         System.out.println("0. Exit Game");
         
         roomselection = input.nextInt();
         
         System.out.println();
         
         switch(roomselection)
         {
            case 1:
               myrooms.GuestBedroom();
               break;
            case 2:
               myrooms.Entrance();
               break;
            case 3:
               myrooms.DiningRoom();
               break;
            case 4:
               myrooms.Study();
               break;
            case 5:
               myrooms.Kitchen();
               break;
            case 6:
               myrooms.MasterBedroom();
               break;
            case 7:
               
               int ghostsleft = myrooms.getGhostsLeft();
                
               if(ghostsleft == 0)
               {
                  System.out.println("Congratulations you have exited "
                          + "the house nice job!");
                  System.exit(1);
               }
               else
               System.out.println("The door is locked you cannot leave\n");
               
               break;
            case 0:
               System.out.println("Thanks for playing");
               break;
            default:
               System.out.println("Incorrect input");
               break;
               
           
         }
       }while(roomselection != 0);
       }
}