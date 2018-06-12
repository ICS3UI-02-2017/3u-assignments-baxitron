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
public class A6Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two integers");
        
     // make a blabnk integer
        int blank = 0;
        
     // make the array two spaces
        int[] numbers = new int[2];
       
     // set the position
       numbers [0] = input.nextInt();
       numbers [1] = input.nextInt();
       
       
       if (numbers[0] > numbers[1]){
           
           int a = numbers[0];
           int b = numbers[1];
           
           numbers[0] = b;
           
           numbers[1] = a;
 }
   System.out.println("The integers in ascending order are " + numbers[0] + ", " + numbers[1]);
   }}
