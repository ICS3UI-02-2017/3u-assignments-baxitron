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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // scanner for input
        Scanner input = new Scanner(System.in);
        
        // make an array to store expenses
        double[] expenses = new double[6];
        // array to store expense names
        String[] names = {"food", "DJ", "hall rental", "decorations", "staff", "miscellaneous"};
        // let the user know how to get the costs
        System.out.println("Please enter the 6 costs");
        // use a for loop for input
        for(int i = 0; i < expenses.length; i++){
           String costName = names[i];
            System.out.println(" How much did " + costName " cost?") ;
            expenses[i] = input.nextDouble();
        }   
        // add all the expenses
       double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
           // get the expense
            double expense = expenses[i];
            // add it to the sum
            sum = sum = expense;
        }
        // output stuff
        System.out.println("Prom costs " + sum);
        double ticketNeeded = Math.ceil(sum/35);
        System.out.println("You need to sell " + ticketNeeded);
}}
