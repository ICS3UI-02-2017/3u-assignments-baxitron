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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // scanner for input
        Scanner input = new Scanner(System.in);
      
        // ask for number of students and marks and store them
        System.out.println("How many students are in the class?");
        int numStud = input.nextInt();
        System.out.println("What are their marks?");
        double[] marks = new double[numStud];
        double cletus = 0;
        double avg = 0;
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
        marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length - 1; i++) {
        for (int j = i + 1; j < marks.length; j++){ 
        if (marks[i] > marks[j]) {
           // put marks in ascending order
        cletus = marks[i];
        marks[i] = marks[j];
        marks[j] = cletus;
        }}}
        
        // add the marks
         for (int i = 0; i < marks.length; i++){
         total = total + marks[i];}
         
         
         // average out
         avg = total / numStud;
         double high = marks[marks.length-1];
         double low = marks[0];
         System.out.println("The lowest mark is " + low);
         System.out.println("The highest mark is " + high);
         System.out.println("The average is " + avg);
                 
    }}