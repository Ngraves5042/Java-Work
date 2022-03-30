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

public class rooms
{
   Scanner input = new Scanner(System.in);
   
   character myCharacter = new character();
   
   int ghost1 = 1;
   int ghost2 = 1;
   int ghost3 = 1;
   int ghost4 = 1;
   int ghost5 = 1;
   int ghost6 = 1;
   
   int ghosts = 6;
   
   public int getGhostsLeft()
   {
       return ghosts;
   }
   
   
   public void GuestBedroom()
   {
      
       System.out.println("You look around the room and notice nothing of interest"
               + "besides a dresser and a nightstand. You also notice a ghost sitting"
               + "on a chair looking very upset.");
      
       int selection = 1;
       
       do
       {
         System.out.println("1. Check inventory and health");
         System.out.println("2. Speak with ghost");
         System.out.println("3. Search Dresser");
         System.out.println("4. Search Night Stand");
         System.out.println("5. Look around room again");
         System.out.println("0. Leave room");
         
         selection = input.nextInt();
         
         switch(selection)
         {
           case 1:
              break;
           case 2:
               if(ghost1 == 1)
               {
                   System.out.println("The ghost looks to be billowing smoke"
                           + "from his nose and mouth and looks very cranky. He "
                           + "yells out 'GIVE ME SOMETHING TO CALM MY NERVES AND"
                           + "ILL LEAVE!");
                   System.out.println("Do you want to try and calm the ghost "
                           + "with an item or fight?");
                   System.out.println("1. Calm the ghost with an item");
                   System.out.println("2. Fight the ghost");
                           
                   int decision = input.nextInt();
                   if(decision == 1)
                   {
                       System.out.println("What item would you like to use?");
                       myCharacter.getInventory();
                       String choice = input.next();
                       String PackofSmokes = "Pack of Smokes";
                       if(choice.equals(PackofSmokes))
                       {
                           System.out.println("Thank you for helping me!");
                           ghost1 = 0;
                           ghosts -= 1;
                           return;
                           
                                   
                       }
                       else
                       {
                           System.out.println("The ghost looks upset and kicks you out of the room.");
                           return;
                       }
                       
                       
                   }
                   if(decision == 2)
                   {
                       System.out.println("Prepare for a fight!");
                       myCharacter.combat();
                       ghosts -= 1;
                       ghost1 = 0;
                       return;
                   }
               }
               else
                   System.out.println("This ghost is already gone pick another "
                           + "option");
               
               
               
              break;
           case 3:
               System.out.println("Searching the Dresser you find nothing of interest.");
              break;
           case 4:
               System.out.println("Searching the Night Stand you find some Prayer Beads.");
               myCharacter.addPrayerBeads();
              break;
           case 5:
               System.out.println("You look around the room and notice nothing of interest"
               + "besides a dresser and a nightstand. You also notice a ghost sitting"
               + "on a chair looking very upset.");
           case 0:
              break;
           default:
              System.out.println("Enter another choice");
         }     
       }while(selection !=0);
       
       
       

   }
   
   public void Entrance()
   {
       System.out.println("You find the entrance to the house to be bare, except"
               + "a bookshelf and notice a small glint in the corner of the room."
               + "You also notice a ghost that looks to be upset.");
      
       int selection = 1;
       
       do{
         System.out.println("1. Check inventory and health");
         System.out.println("2. Speak with ghost");
         System.out.println("3. Search corner");
         System.out.println("4. Search bookshelf");
         System.out.println("5. Look around room again");
         System.out.println("0. Leave room");
         
         selection = input.nextInt();
         
         switch(selection)
         {
           case 1:
              myCharacter.showHealth();
              myCharacter.getInventory();
              break;
           case 2:
               
               if(ghost2 == 1)
               {
                   System.out.println("You notice the ghost is squinting around"
                           + "having trouble moving around and notices you. The "
                           + "ghost screams out asking for you to help it.\n"
                           + "Plese I can't see if you could help me find my "
                           + "glasses I would be ever so gratefl");
                   System.out.println("Do you want to try and calm the ghost "
                           + "with an item or fight?");
                   System.out.println("1. Calm the ghost with an item");
                   System.out.println("2. Fight the ghost");
                           
                   int decision = input.nextInt();
                   if(decision == 1)
                   {
                       System.out.println("What item would you like to use?");
                       myCharacter.getInventory();
                       String glasses = "Glasses";
                       String choice = input.next();
                       if(choice.equals(glasses))
                       {
                           System.out.println("Thanks a lot!");
                           ghosts -=1;
                           ghost2 = 0;
                           return;
                       }
                       else
                       {
                           System.out.println("The ghost looks upset and kicks you out of the room.");
                           return;
                       }
                   }
                   if(decision == 2)
                   {
                       System.out.println("Prepare for a fight!");
                       myCharacter.combat();
                       ghosts -= 1;
                       ghost2 = 0;
                       return;
                   }
               }
               else
                   System.out.println("This ghost is already gone pick another "
                           + "option");
               
              break;
            case 3:
                System.out.println("You find a silver necklace.");
                myCharacter.addNecklace();
                break;
            case 4:
                System.out.println("You find nothing of interest");
                break;
            case 5:
               System.out.println("You notice the ghost is squinting around"
                           + "having trouble moving around and notices you. The "
                           + "ghost screams out asking for you to help it.\n"
                           + "Plese I can't see if you could help me find my "
                           + "glasses I would be ever so grateful");
               break;
            case 0:
              break;
            default:
                System.out.println("Enter another choice");
          }     
       }while(selection != 0);
       
   }
   
   public void DiningRoom()
   {
      System.out.println("You enter the Dining Room and find there is only a table"
              + "with chairs around it and some shelves. You notice a ghost looking distraut"
              + "sitting on one of the chairs.");
      
       int selection = 1;
       
       
       do
       {
         System.out.println("1. Check inventory and health");
         System.out.println("2. Speak with ghost");
         System.out.println("3. Search Table");
         System.out.println("4. Search Shelves");
         System.out.println("5. Look around room again");
         System.out.println("0. Leave room");
         
         selection = input.nextInt();
         
         switch(selection)
         {
           case 1:
               myCharacter.showHealth();
               myCharacter.getInventory();
               break;
           case 2:               
               if(ghost3 == 1)
               {
                   System.out.println("You approach the ghost and he seems to be "
                           + "playing with some beetles and looks depressed. He looks at you"
                           + "and confesses 'I have lived here all my life and never knew what"
                           + "any kind of bug was, sigh unfortunatly my mind has gone a bit rusty."
                           + "if only I could find out what kind of beetle this is I could rest easy.'");
                   System.out.println("Do you want to try and calm the ghost "
                           + "with an item or fight?");
                   System.out.println("1. Calm the ghost with an item");
                   System.out.println("2. Fight the ghost");
                           
                   int decision = input.nextInt();
                   if(decision == 1)
                   {
                       System.out.println("What item would you like to use?");
                       myCharacter.getInventory();
                       String choice = input.next();
                       String book = "Book of Insects";
                       if(choice.equals(book))
                       {
                           System.out.println("The ghost looks estatic and replies"
                                   + "'Thank you so much I can rest easy now!");
                           ghost3 = 0;
                           ghosts -= 1;
                           return;
                       }
                       else
                       {
                           System.out.println("The ghost looks upset and kicks you out of the room.");
                           return;
                       }
                   }
                   if(decision == 2)
                   {
                       System.out.println("Prepare for a fight!");
                       myCharacter.combat();
                       ghosts -= 1;
                       ghost3 = 0;
                       return;
                   }
               }
               else
                   System.out.println("This ghost is already gone pick another "
                           + "option");
               
               
               
              break;
           case 3:
               System.out.println("You search the table and find a pack of smokes!");
               myCharacter.addSmokes();
              break;
           case 4:
              System.out.println("You find nothing of interest on the Shelves.");
               break;
               
           case 5:
               System.out.println("You enter the Dining Room and find there is only a table"
              + "with chairs around it and some shelves. You notice a ghost looking distraut"
              + "sitting on one of the chairs.");
           case 0:
              break;
           default:
              System.out.println("Enter another choice");
         }     
       }while(selection !=0);
   }
   
   public void Study()
   {
      System.out.println("You notice a Desk and a Bookshelf, there is a ghost sitting "
              + "in a chair looking upset.");
      
       int selection = 1;
         
       
       do
       {
         System.out.println("1. Check inventory and health");
         System.out.println("2. Speak with ghost");
         System.out.println("3. Search Desk");
         System.out.println("4. Search Bookshelf");
         System.out.println("5. Look around room again");
         System.out.println("0. Leave room");
         
         selection = input.nextInt();
         
         switch(selection)
         {
           case 1:
               myCharacter.showHealth();
               myCharacter.getInventory();
               break;
           case 2:
               if(ghost4 == 1)
               {
                   System.out.println("The ghost looks like an old nun that looks upset."
                           + "She looks at you and asks 'Have you found anything to help me"
                           + "with my daily prayers?'");
                   System.out.println("Do you want to try and calm the ghost "
                           + "with an item or fight?");
                   System.out.println("1. Calm the ghost with an item");
                   System.out.println("2. Fight the ghost");
                           
                   int decision = input.nextInt();
                   if(decision == 1)
                   {
                       System.out.println("What item would you like to use?");
                       myCharacter.getInventory();
                       String choice = input.next();
                       String beads = "Prayer Beads";
                       if(choice.equals(beads))
                       {
                           System.out.println("The ghost chants a few religious prayers"
                                   + " and disapears.");
                           ghost4 = 0;
                           ghosts -= 1;
                       }
                       else
                       {
                           System.out.println("The ghost looks upset and kicks you out of the room");
                           return;
                       }
                   }
                   if(decision == 2)
                   {
                       System.out.println("Prepare for a fight!");
                       myCharacter.combat();
                       ghosts -= 1;
                       ghost4 = 0;
                   }
               }
               else
                   System.out.println("This ghost is already gone pick another "
                           + "option");
               
              
              break;
           case 3:
              System.out.println("You search the Desk and find nothing of interest.");
              break;
           case 4:
               System.out.println("You search the Bookshelf and find a book about insects.");
               myCharacter.addBook();
              break;
           case 5:
               System.out.println("You notice a Desk and a Bookshelf, there is a ghost sitting "
              + "in a chair looking upset.");
               break;
           case 0:
              break;
           default:
              System.out.println("Enter another choice");
         }     
       }while(selection !=0);
   }
   
   public void Kitchen()
   {
      System.out.println("You look around the kitchen and find a glint in the Sink and some cupboards that may hold something of interest."
              + " You also notice a ghost pacing around looking upset.");
      
       int selection = 1;
       

         
       
       
       do
       {
         System.out.println("1. Check inventory and health");
         System.out.println("2. Speak with ghost");
         System.out.println("3. Search Sink");
         System.out.println("4. Search Cupboards");        
         System.out.println("5. Look around room again");
         System.out.println("0. Leave room");
         
         selection = input.nextInt();
         
         switch(selection)
         {
           case 1:
               myCharacter.showHealth();
               myCharacter.getInventory();
               break;
           case 2:
               if(ghost5 == 1)
               {
                   System.out.println("The ghost looks like a young women that is upset."
                           + " She looks at you and asks if you have found something of hers"
                           + " that was a gift.");
                   System.out.println("Do you want to try and calm the ghost "
                           + "with an item or fight?");
                   System.out.println("1. Calm the ghost with an item");
                   System.out.println("2. Fight the ghost");
                           
                   int decision = input.nextInt();
                   if(decision == 1)
                   {
                       System.out.println("What item would you like to use?");
                       myCharacter.getInventory();
                       String choice = input.next();
                       String necklace = "Silver Necklace";
                       if(choice.equals(necklace))
                       {
                           System.out.println("The ghost thanks you for the item and disapears.");
                           ghost5 = 0;
                           ghosts -= 1;
                           return;
                       }
                       else
                       {
                           System.out.println("The ghost looks upset and kicks you out of the room");
                           break;
                       }
                   }
                   if(decision == 2)
                   {
                       System.out.println("Prepare for a fight!");
                       myCharacter.combat();
                       ghosts -= 1;
                       
                       ghost5 = 0;
                   }
               }
               else
                   System.out.println("This ghost is already gone pick another "
                           + "option");
               
              break;
           case 3:
               System.out.println("You search the sink and find a Butcher Knife in it!");
               myCharacter.addKnife();
              break;
           case 4:
               System.out.println("You search the cupboards and find nothing of interest.");
              break;
           case 5:
               System.out.println("You look around the kitchen and find a glint in the Sink and some cupboards that may hold something of interest."
              + " You also notice a ghost pacing around looking upset.");
               break;
           case 0:
              break;
           default:
              System.out.println("Enter another choice");
         }     
       }while(selection !=0);
   }
   
   public void MasterBedroom()
   {
      System.out.println("You notice a Bed in the corner of the room and a door leading to a bathroom with a ghost in it.");
      
       int selection = 1;

         

       
       do
       {
                  
         System.out.println("1. Check inventory and health");
         System.out.println("2. Speak with ghost");
         System.out.println("3. Search Bed");
         System.out.println("4. Search Bathroom");
         System.out.println("5. Look around room again");
         System.out.println("0. Leave room");
         
         
         selection = input.nextInt();
         
         switch(selection)
         {
           case 1:
               myCharacter.showHealth();
               myCharacter.getInventory();
               break;
           case 2:
               if(ghost6 == 1)
               {
                   System.out.println("You notice the ghost has a cloth apron around her and is looking franticly around the bathroom."
                           + "She is complaining about not being able to finish her meal without her tools.");
                   System.out.println("Do you want to try and calm the ghost "
                           + "with an item or fight?");
                   System.out.println("1. Calm the ghost with an item");
                   System.out.println("2. Fight the ghost");
                           
                   int decision = input.nextInt();
                   if(decision == 1)
                   {
                       System.out.println("What item would you like to use?");
                       myCharacter.getInventory();
                       String choice = input.next();
                       String knife = "Butcher Knife";
                       if(choice.equals(knife))
                       {
                           System.out.println("The ghost looks excited and runs off.");
                           ghost6 = 0;
                           ghosts -= 1;
                       }
                       else
                       {
                           System.out.println("The ghost looks upset and chases you out of the room!");
                       }
                   }
                   if(decision == 2)
                   {
                       System.out.println("Combat text");
                       myCharacter.combat();
                       ghosts -= 1;
                       ghost6 = 0;
                       
                   }
               }
               else
                   System.out.println("This ghost is already gone pick another "
                           + "option");
               
               
              break;
           case 3:
               System.out.println("You notice nothing of interest on the bed.");
              break;
           case 4:
               System.out.println("In the bathroom you spot a pair of Glasses.");
               myCharacter.addGlasses();
              break;
           case 5:
               System.out.println("You notice a Bed in the corner of the room and a door leading to a bathroom with a ghost in it.");
               break;
           case 0:
              break;
           default:
              System.out.println("Enter another choice");
         }     
       }while(selection !=0);
   }
}