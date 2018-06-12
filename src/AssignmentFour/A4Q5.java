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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // use a scanner to read info
        Scanner input = new Scanner(System.in);
       
        // ask for name
        System.out.println("Please enter your name");
        String Name = input.nextLine();
        
        
        // ask for test scores and store them
        System.out.println("What was your first test out of?");
        float Testone = input.nextFloat();
        System.out.println("What was your mark?");
        float TestOneMark = input.nextFloat();
        float TestyOne = (TestOneMark / Testone);
        
        System.out.println("What was your second test out of?");
        float Testtwo = input.nextFloat();
        System.out.println("What was your mark?");
        float TestTwoMark = input.nextFloat();
         float TestyTwo = (TestTwoMark / Testtwo);
        
        
        System.out.println("What was your third test out of?");
        float Testthree = input.nextFloat();
        System.out.println("What was your mark?");
        float TestThreeMark = input.nextFloat();
         float TestyThree = (TestThreeMark / Testthree);
        
        System.out.println("What was your fourth test out of?");
        float Testfour = input.nextFloat();
        System.out.println("What was your mark?");
        float TestFourMark = input.nextFloat();
         float TestyFour = (TestFourMark / Testfour);
        
        System.out.println("What was your fifth test out of?");
        float Testfive = input.nextFloat();
        System.out.println("What was your mark?");
        float TestFiveMark = input.nextFloat();
        float TestyFive = (TestFiveMark / Testfive);
        
        // output to user
        System.out.println("Test scores for " + Name);
        System.out.println("Test one: " + TestyOne);
        System.out.println("Test Two: " + TestyTwo);
        System.out.println("Test Three: " + TestyThree);
        System.out.println("Test four: " + TestyFour);
        System.out.println("Test five: " + TestyFive);
      
        // find average and output to user
      float average = ( (TestyOne + TestyTwo + TestyThree + TestyFour + TestyFive)/ 5);
        System.out.println("Your average is " + average);
    
    }
}
