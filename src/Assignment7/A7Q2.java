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
public class A7Q2 {

  public static void examGrade (double mark){
 // find what grade the user has and output it 
  if (mark < 50){
      System.out.println("F");
  }  
  if (mark >= 50 && mark <= 59){
          System.out.println("D");
  }
  if (mark >= 60 && mark <= 69){
          System.out.println("C");
  }
  if (mark >= 70 && mark <= 79){
          System.out.println("B");
  }
  if (mark > 80){
          System.out.println("A");
  }
  }
    public static void main(String[] args) {
        // TODO code application logic here
         // scanner for input
        Scanner input = new Scanner(System.in);
    
        
        // ask the user for their mark 
        System.out.println("What was your mark?");
        double mark = input.nextDouble();
                examGrade(mark);
 }}
