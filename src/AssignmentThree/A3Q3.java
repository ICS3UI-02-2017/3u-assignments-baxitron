/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentThree;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author baxl2873
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Create a city for the Robots
        City kw = new City();    
        kw.showThingCounts(true);
       
        // put robot in KW
        RobotSE bo = new RobotSE(kw, 0, 0, Direction.EAST, 20);
    
          // use a for loop to move
        for (int count = 0; count < 4; count++){
            bo.putThing();
        bo.move();
        bo.putThing();
        bo.move();
        bo.putThing();
        bo.move();
        bo.putThing();
        bo.move();
        bo.putThing();
        bo.turnRight();
        bo.move();
        bo.turnRight();
        bo.move(4);
        bo.turnAround();
   
        }
        
    }
   
    
}
