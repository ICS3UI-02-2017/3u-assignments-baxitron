/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author baxl2873
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
        // print a line of text
  System.out.println("Hellow World");
  System.out.println("hey");
        System.out.println("");
        // print a blank line
        System.out.println("");
       // printing on the same line
        System.out.print("i like ");
        System.out.print("cake");
        
       //printing special characters
        //quotation marks
        System.out.println(" \"im inside quotation marks\" ");
        // slash \\
        System.out.println("A slash \\");
        // a tab \t
        System.out.println("pop\tpizza\t");
        
        // a new line \n
        System.out.println("One line\nSecond line");
        
        // make an integer storing 10
        int number = 10;
        System.out.println(number);
        System.out.println("number = " + number);
        System.out.println("number = " + number + ". YAY!");
        
        // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your name");
        // make a string to store a name
        String name = input.nextLine();
        // say hello
        System.out.println("Hello " + name);
        
        // ask what year they were born
        System.out.println("What year were you born?");
        //make a variable to store the year
        int birthYear = input.nextInt();
        int age = 2018 - birthYear;
        while(age < 0){
            System.out.println("wtf bro thats not possible");
        }
        // tell the user
        System.out.println("You are " + age + " years old");
        if (age < 0) {
            System.out.println(" I dont think so");
        }else if(age >30){
            System.out.println("You old fuck");
        }
        
                
                
    }
}
