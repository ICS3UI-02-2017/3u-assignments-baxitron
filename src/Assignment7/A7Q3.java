/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;



public class A7Q3 {

 public static void factors(int factor){
System.out.println("The factors are:");
// find the factors of the given number
for (int i = 1; i <= factor; i++) {
if (factor % i == 0){ 
    System.out.println("" + i);
}}}
   
public static void main(String[] args) {
        // TODO code application logic here
   // use a scanner to read info
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number you need the factors of? ");
        int num = input.nextInt();
        factors(num);
    }}
