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
public class A7Q8 {
    public static boolean allnumodd(int x) {
   while (x>10){
   if (x % 2 == 0){
   return false; }
   if (x % 2 !=0){
   x=x/10;
   }}
   if(x<10 && x%2 !=0){
   return true;
   }else{
   return false;
}}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
        System.out.println("What is the number");
        int x = input.nextInt();
        System.out.println("" + allnumodd(x));
    }
}
