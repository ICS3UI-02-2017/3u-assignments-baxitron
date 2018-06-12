/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentSix;

/**
 *
 * @author baxl2873
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // array for 999 spaces
        int nums[] = new int [999];
        
     // start at two and get all the factors of two
        for (int i = 2; i < 999; i++) {
        nums[i] = i;
         
     // make two integers to multiply by themselves to find numbers that aren't prime
        for (int j = 2; j < 999; j++) {
        for (int p = 2; p < 999; p++) {
        int prime = j * p; 
            
     // set non prime numbers to -1
        if (prime < 999);
        nums[prime] = -1;
     }}}
        
     // find all prime numbers and output to user
        for (int q = 0; q < 999; q++) {
        if (nums[q] != -1){
        System.out.println(nums[q]);
      }}}}
   

