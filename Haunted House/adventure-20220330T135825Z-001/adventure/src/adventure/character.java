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

import java.util.Random;

import java.util.ArrayList;

public class character
{
  Random rand = new Random();
    
  Scanner input = new Scanner(System.in);
    
  static int characterhealth = 100;
   
  ArrayList<String> inventory = new ArrayList<>();
  
  public void addSmokes()
  {
      inventory.add("Pack of Smokes");
  }
  
  public void addKnife()
  {
      inventory.add("Butcher Knife");
  }
  
  public void addBook()
  {
      inventory.add("Book on Insects");
  }
  
  public void addNecklace()
  {
      inventory.add("Silver Necklace");
  }
  
  public void addGlasses()
  {
      inventory.add("Glasses");
  }
  
  public void addPrayerBeads()
  {
      inventory.add("Prayer Beads");
  }
  public void showHealth()
  {
      System.out.printf("You have %d health\n", characterhealth);
  }
  
  public void setHealth(int health)
  {
      characterhealth = health;
  }
  
  public void getInventory()
  {
      System.out.print("You currently have: ");
      System.out.println(inventory);
  }
  
  public int getHealth()
  {
      return characterhealth;
  }
  
  public void combat()
  {

      int enemyhealth = 100;
      int health = 100;
     
      do
      {
        System.out.println("Would you like to fight or run?");
        System.out.println("1. Figth");
        System.out.println("2. Run");
          
        int decision = input.nextInt();
          
        switch(decision)
        {
            case 1:
                health -= rand.nextInt(15);
                enemyhealth -= rand.nextInt(2) + 1 * 25;
                System.out.printf("Your health: %d\n", health);
                System.out.printf("Ghost health: %d\n", enemyhealth);
                break;
            case 2:
                return;
            default:
                System.out.println("Incorrect input please enter again");
                break;
              }
          }while(health > 0 && enemyhealth > 0);
          
          System.out.println("The ghost has left the house and its curse is broken");   
          setHealth(health);     
                  
          
                  
      }
      
        
      
          

        
      
          
      
  }
