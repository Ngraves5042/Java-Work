/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmarbles;

import java.util.Scanner;

public class LabMarbles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String color1;
        
        String color2;
        
        String color3;
        
        Scanner input = new Scanner(System.in);

        System.out.print("color: ");

        color1 = input.nextLine ();
       
        System.out.printf("Number of %s marbles: ", color1);
        
        int number1 = input.nextInt();
        
        System.out.print("color: ");
        
        color2 = input.next();
        
        System.out.printf("Number of %s marbles: ", color2);
        
        int number2 = input.nextInt();
        
        System.out.print("color: ");
        
        color3 = input.next();
        
        System.out.printf("Number of %s marbles: ", color3);
        
        int number3 = input.nextInt();
        
        System.out.printf("%nColor \t    Number of Marbles%n----------- -----------------%n%-12s%d%n%-12s%d%n%-12s%d", color1, number1, color2, number2, color3, number3);
        
    
        }

}
