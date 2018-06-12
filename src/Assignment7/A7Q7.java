/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import static Assignment7.A7Q6.lastDigit;
import java.util.Scanner;

/**
 *
 * @author baxl2873
 */
public class A7Q7 {

    public static int firstDigit(int number){
    while (number >= 10 || number <= -10){
    number = number / 10;
    }
    if (number < 0){
    number = number * -1;
    }
     System.out.println("The first digit is " + number); 
     return number;
    }
     public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
        System.out.println("What is the number?");
        int number = input.nextInt();
        firstDigit(number);
     }}
