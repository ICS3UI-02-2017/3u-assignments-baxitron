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
public class A5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
     // find if/how much they rae exceeding the speed limit
        System.out.println("Enter the speed limit");
        int SpeedLim = input.nextInt();
        
        System.out.println("What is your speed");
          int Speed = input.nextInt();
          int Fine = (Speed - SpeedLim);
          
        // tell the user if he is speeding and what their fine is
          if (Fine >= 1 && Fine <= 20) {
                  System.out.println("Your are speeding and your fine is $100");
    }
          if (Fine < 1) {
             System.out.println("Congratulations! You are in the speed limit");
          }
          if (Fine >= 21 && Fine <= 30) {
            System.out.println("You are speeding and your fine is $270");
          }
          if (Fine >= 31) {
          System.out.println("You are speeding and your fine is $500");
    } }
}
