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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // scanner for input
        Scanner input = new Scanner(System.in);


        // ask for marks and store them
        double[] marks = new double[10];
        System.out.println("What are the 10 marks?");
        double cletus = 0;
        for (int i = 0; i < marks.length; i++) {
        marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length - 1; i++) {
        for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j])
                {
       // put marks in ascending order
        cletus = marks[i];
        marks[i] = marks[j];
        marks[j] = cletus;
 }}}
        // output the marks
        System.out.println("The marks in ascending order are ");
        for (int q = 0; q < marks.length; q++) {
        System.out.println("" + marks[q] + ", ");
 }}}
