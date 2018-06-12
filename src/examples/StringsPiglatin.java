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
public class StringsPiglatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);


        while (true) {
            // get the word to translate
            System.out.println("Enter a word to translate");
            String origWord = input.nextLine();
            // sanitize the input
            origWord = origWord.toLowerCase();

            // do we start with a vowel
            if (origWord.startsWith("a")
                    || origWord.startsWith("e")
                    || origWord.startsWith("i")
                    || origWord.startsWith("o")
                    || origWord.startsWith("u")) {

                //stick ay at the end

                String transWord = origWord + "ay";
                System.out.println(origWord + " in Pig latin is ");

            } else {
                // walk down the word looking for the vowel
                int length = origWord.length();
                // use a for loop to go through characters
                for (int i = 0; i < length; i++) {
                    // look at the character at position i, find if its a vowel
                    if (origWord.charAt(i) == 'a'
                            || origWord.charAt(i) == 'e'
                            || origWord.charAt(i) == 'i'
                            || origWord.charAt(i) == 'o'
                            || origWord.charAt(i) == 'u') {

                        // i ia the position of the vowel
                        String start = origWord.substring(0, i);
                        String end = origWord.substring(i);

                        //complete a translated word
                        String transWord = end + start + "ay" ;
                        System.out.println(transWord + " in Pig Latin");
                        // done looking so stop the for loop
                        break; 
                    }



                }
            }
        }
    }
}
