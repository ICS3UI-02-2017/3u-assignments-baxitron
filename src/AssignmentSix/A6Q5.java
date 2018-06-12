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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner for input
        // scanner for input
        Scanner input = new Scanner(System.in);


        // ask for marks and store them

         System.out.println("How many marks are there?");
        int numMarks = input.nextInt();
        System.out.println("What are the marks?");
        double[] marks = new double[numMarks];
        double cletus = 0;
        double two = 2;
        for (int i = 0; i < marks.length; i++) {
        marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length - 1; i++) {
        for (int j = i + 1; j < marks.length; j++) {
        if (marks[i] > marks[j]) {
         // put marks in ascending order
         cletus = marks[i];
         marks[i] = marks[j];
         marks[j] = cletus;
  }}}
        // if its an even number
            if (marks.length % 2 == 0) {
            int posOne = ((marks.length / 2) - 1);
            int posTwo = (marks.length / 2);
            int pos = ((posOne + posTwo) / 2);
            double p = marks[posOne];
            double r = marks[posTwo];
            double medium = ((p + r) / 2);
            System.out.println("The medium mark is " + medium);
        } 
            // if its an odd number
            else {
            int pos = (marks.length / 2);
            double p = marks[pos];
            int plus = ((marks.length / 2) - 1);
            double q = marks[plus];
            double medium = ((q + p) / 2);

            System.out.println("The medium mark is " + medium);
        }
        // output the marks
            System.out.println("The marks in ascending order are ");
            for (int q = 0; q < marks.length; q++) {
            System.out.println("" + marks[q] + ", ");
            }}}
