/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author baxl2873
 */
public class A7Q5 {

  public static void chaotic(int lines){
  for (int i = 0; i < lines; i++) {
  System.out.println("");
  double c = Math.floor(Math.random()*5)+ 1;  
  for (int j = 0; j < c; j++) {
  System.out.print("*");
   }}}


    public static void main(String[] args) {
        // TODO code application logic here
    chaotic(100);
    }}
