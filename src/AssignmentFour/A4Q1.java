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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
      // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your name");
        // make a string to store a name
        String name = input.nextLine();
        // say hello
        System.out.println("Hello " + name + ", How are you today?");
    
    }
}
