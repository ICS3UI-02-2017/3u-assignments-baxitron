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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // ask for a number of inches to convert to cm
        System.out.println("Enter any number of inches to convert to centimetres");
         // use a scanner to read info
        Scanner input = new Scanner(System.in);
      
        float numberofinches = input.nextFloat();
               
        // output to the user
        System.out.print("There are " + numberofinches * 2.54);
        System.out.print(" Centimetres in " + numberofinches + " inches");
}}
