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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
      // use a scanner to read info
        Scanner input = new Scanner(System.in);
       // ask for 4 numbers
        System.out.println("Please enter 4 numbers on seperate lines"); 
  
   // make a float for each number
    float numberOne = input.nextFloat();
    float numberTwo = input.nextFloat();
    float numberThree = input.nextFloat();
    float numberFour = input.nextFloat();
    
       // output the numbers
        System.out.print("Your numbers were ");
        System.out.print(numberOne + " ,");
        System.out.print(numberTwo + " ,");
        System.out.print(numberThree + " ,");
        System.out.print(numberFour);

       
            
    }
}
