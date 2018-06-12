/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentFive;

import java.util.Scanner;

/**
 *
 * @author baxl2873
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // TODO code application logic here
        Scanner input = new Scanner(System.in);
         while (true) {
        
        System.out.println("Enter a word to translate to Ubbi Dubbi");
        String origWord = input.nextLine();
          // sanitize the input
            origWord = origWord.toLowerCase();
        String newWord = " " + origWord;
     
  
    
             // walk down the word looking for the vowel
        int length = newWord.length();
                // use a for loop to go through characters
         for (int i = 0; i < length; i++) {
                  
       
            
             // look at the character at position i, find if its a vowel
         if (newWord.charAt(i) == 'a'
                            || newWord.charAt(i) == 'e'
                            || newWord.charAt(i) == 'i'
                            || newWord.charAt(i) == 'o'
                            || newWord.charAt(i) == 'u') {
             // if there are two vowels in a row dont add ub
              if (!(newWord.charAt(i - 1) == 'a'
                            || newWord.charAt(i - 1) == 'e'
                            || newWord.charAt(i - 1) == 'i'
                            || newWord.charAt(i - 1) == 'o'
                            || newWord.charAt(i - 1) == 'u')) {
   // add ub before the vowel
                  String start = newWord.substring(0, i);
                  String end = newWord.substring(i);
                  newWord = start + "ub" + end;
                  
                  // update the new length of translated word
                  length = newWord.length();
                  // keep updating the position of the vowel
                  i = i + 2;
         }}}
         // tell the user their translated word
             System.out.println("Your translated word is " + newWord);
    }}}