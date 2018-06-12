/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentFour;

import java.util.Scanner;

/**
 *
 * @author baxl2873
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // use a scanner to read info
        Scanner input = new Scanner(System.in);
      
       //get all expenses and store them
        System.out.println("How much does one ticket cost?");
        float Tix = input.nextFloat();
        System.out.println("How much does the food for prom cost?");
        float Food = input.nextFloat();
        System.out.println("How much does the DJ cost?");
        float DJ = input.nextFloat();
        System.out.println("How much does it cost to rent the hall?");
        float Hall = input.nextFloat();
        System.out.println("How much do the decorations cost?");
        float Decor = input.nextFloat();
        System.out.println("How much does it cost for staff?");
        float Staff = input.nextFloat();
        System.out.println("How much for miscellaneous costs?");
        float Misc = input.nextFloat();
     
     // calculate the total cost
        float Cost = ( Food + DJ + Hall + Decor + Staff + Misc);
                
         // calculate the number of tickets that need to be sold       
        System.out.println("The total cost is " + Cost);
        System.out.print("You will need to sell " + Cost / Tix);
        System.out.print(" Tickets");
   
        
        
    }
}
