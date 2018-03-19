/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentThree;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author baxl2873
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // Create a city for the Robots
        City kw = new City();    
        kw.showThingCounts(true);
       
        // put robot in KW
        RobotSE bo = new RobotSE(kw, 0, 0, Direction.EAST);
        
        // create two piles of things
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5); 
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 5);
     
   
        //counted while loop
        int numberOfMoves = 19;
        
        // if there are still moves to do
        while (numberOfMoves > 0) {
           numberOfMoves = numberOfMoves - 1;
           if (bo.canPickThing()) {
            bo.pickThing();
            bo.move(5);
            bo.putThing();
            bo.turnAround();
            bo.move(5);
            bo.turnAround();
            numberOfMoves = numberOfMoves - 1;
        }
           else {
            
        } }
        
        bo.move(5);
                  
    }

    }