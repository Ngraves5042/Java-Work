/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

import java.util.Scanner;

public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("number1: ");
        
        int number1 = input.nextInt();
        
        System.out.print("number2: ");
        
        int number2 = input.nextInt();
        
        if (number1 > number2)
            System.out.printf("%d is greater than %d", number1, number2);
        
        if (number1 < number2)
            System.out.printf("%d is less than %d", number1, number2);
        
        if (number1 == number2)
            System.out.printf("%d is equal to %d", number1, number2);
        
        
        
    }
    
}
