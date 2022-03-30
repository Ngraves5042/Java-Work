/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labvariables;

import java.util.Scanner;

public class LabVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Favorite destination: ");
        
        String destination = input.nextLine();
        
        System.out.printf("Welcome to %s%n%n%n", destination);
        
        int kingsPeak = 4124;
        int timpanogos = 3581;
        
        System.out.printf("Elevation of Kings Peak: %d%n", kingsPeak);
        
        System.out.printf("Elevation of Timpanogos: %d", timpanogos);
        }
    
}
