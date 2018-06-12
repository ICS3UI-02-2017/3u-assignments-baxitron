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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // use a scanner to read info
        Scanner input = new Scanner(System.in);
    
        // create integer for dice and position
       int posi = 1 ;
       while (posi != 100) {
        System.out.println("What was your roll?");
        int roll = input.nextInt();
          if (roll <= 1) {
             System.out.println("Invalid Roll!");
             roll = 0 ;
    }
         if (roll > 12) {
             System.out.println("Invalid Roll!");
             roll = 0 ;
         } 
         
       
            posi = (posi + roll);
          
      
        // create snakes and ladders
       if (posi > 100) { 
            roll = 0 ;
        }
       
           if (posi == 54) {
             posi = 19 ;
         }
         if (posi == 90) {
            posi = 48;
         }
         if (posi == 99) {
             posi = 77 ;
         }
         if (posi ==9 ) {
             posi =34  ;
         }
         if (posi ==40 ) {
             posi = 64 ;
         }
         if (posi == 67) {
             posi = 86 ;
         }
        if (posi > 100) { 
            roll = 0 ;
        
        }
        // tell the user it's position
       posi = (posi);
           System.out.println("Your position is " + posi); 
    }
       // if the user reaches 100, tell them they have won
       if (posi == 100) {
            System.out.println("You win!");
        }  
    } 
    }
    
    
