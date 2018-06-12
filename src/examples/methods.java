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
public class methods {
// the hello word method to say hello
    public static void helloWorld(){
        System.out.println("Hello world");
    }
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    // calculates the positive version of quadratic formula
    public static double posQuadForm(double a, double b, double c){
        double disc = b*b - 4*a*c;
        double root = (-b + Math.sqrt(disc)) / (2*a);
        // send back the root
        return root;
    }
    
   public static double[] QuadForm(double a, double b, double c){
    // create an array to store both roots
       double[] roots = new double[2];
       // calculate the roots
        double discim = b*b - 4*a*c;
        roots[0] = (-b + Math.sqrt(discim)) / (2*a);
       roots[1] = (-b - Math.sqrt(discim)) / (2*a);
        // send back the root
        return roots;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        
        // calls the hello world method
        helloWorld();
    
        System.out.println("What is your name?");
        String user = input.nextLine();
        sayHello(user);
    
        // calculate the quadratic formula of these numbers
   double posRoot = posQuadForm(3, 7, 1.5);
        System.out.println("The positive root is " + posRoot);
   
       double[] roots = QuadForm (3, 7, 1.5);
        System.out.println("The roots are " + roots[0] + " " + roots[1]);
        
    }
    

}
