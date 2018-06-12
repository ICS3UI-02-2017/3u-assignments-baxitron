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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // scanner for input
        Scanner input = new Scanner(System.in);
     
        // make an array to store number of people
        System.out.println("How many people are in your class?");
        int people = input.nextInt();
        double[] heights = new double[people];
        
      // ask for heights
        System.out.println("What are their heights in cm?");
        for(int i = 0; i < heights.length; i++) {
        heights[i] = input.nextDouble();
        }
        // determine the average height
        double totalheight = 0;
       double avg = 0;
        for(int j = 0; j < heights.length; j++) {
        totalheight = totalheight + heights[j];
        }
         avg = totalheight/people ; 
         for(int x = 0; x < heights.length; x++){
 
             // output the heights that are above average
        if (heights [x] > avg){
            System.out.println(heights[x] + " is above average");
        }}}}
