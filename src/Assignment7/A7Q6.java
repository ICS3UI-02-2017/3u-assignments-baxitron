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
public class A7Q6 {

  public static int lastDigit(int number){
    // seperate the last digit
      number = number % 10;
   // if number is negative change it to positive
      if (number < 0){
      number = number * -1;
      }
    // tell the user the last digit
      System.out.println("The last digit is " + number);
      return number;
  }
    public static void main(String[] args) {
        // TODO code application logic here
    // use a scanner to read info
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number?");
        int number = input.nextInt();
        lastDigit(number);
    }}
