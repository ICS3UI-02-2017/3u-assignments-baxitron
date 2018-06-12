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
public class A7Q4 {

   public static double compInt(double p, double r, double n){
  r = r/100;
       double b = p*Math.pow(1 + r, n);
   // return the final amount
  return b;
   }
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        System.out.println("What is your initial amount?");
        double p = input.nextDouble();
        System.out.println("What is the interest rate?");
        double r = input.nextDouble();
        System.out.println("How many years was it compunded for?");
        double n = input.nextDouble();
        double b = compInt(p, r, n);
        System.out.println("Your final amount is " + b);
    }}
