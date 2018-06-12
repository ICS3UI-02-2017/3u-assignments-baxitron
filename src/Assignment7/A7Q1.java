/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author baxl2873
 */
public class A7Q1 {

 public static double areacalc(double r){
 double area = Math.PI * Math.pow(r, 2);
 // send back the area
 return area;
}
 
    public static void main(String[] args) {
        // TODO code application logic here
     // scanner for input
        Scanner input = new Scanner(System.in);
    
    // ask for radius and calculate area
        System.out.println("What is the radius?");
        double r = input.nextDouble();
        double totalarea = areacalc(r);
       
        // tell the user the area
        System.out.println("The area of the circle is " + totalarea);
   }}
