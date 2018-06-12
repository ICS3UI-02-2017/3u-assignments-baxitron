/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentSix;

import java.util.Scanner;

/**
 *
 * @author baxl2873
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // scanner for input
        Scanner input = new Scanner(System.in);
             // ask user for number of students
        System.out.println("How many students are in your class?");
        // make an array to store number of students
      int stud = input.nextInt();
     double[] marks = new double[stud];
        System.out.println("Enter your marks");
         // use a for loop for input
        for(int i = 0; i < marks.length; i++){
         marks[i] = input.nextDouble();
        
        }
          double markss = 0;
            double avg = 0;
                    
        for(int j = 0; j < marks.length; j++){
       
     markss = markss + marks [j];
    // find average by dividing the sum of marks by the number of students
            avg = (markss/stud);
        }
        // output to user the average
            System.out.println("Your average is " + avg);
}}
