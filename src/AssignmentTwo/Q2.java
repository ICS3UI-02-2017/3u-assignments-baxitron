/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author baxl2873
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        // Create a city for the Robots
        City kw = new City();    
        
        // put robot in KW
        RobotSE grute = new RobotSE(kw, 1, 1, Direction.EAST); 
        
        //create a reward at the end of the race
  new Thing (kw, 1, 10);
    
  // create an obstacle course for the robot
        new Wall (kw, 1, 2, Direction.SOUTH);
        new Wall (kw, 1, 3, Direction.SOUTH);
        new Wall (kw, 1, 4, Direction.SOUTH);
        new Wall (kw, 1, 5, Direction.SOUTH);
        new Wall (kw, 1, 6, Direction.SOUTH);
        new Wall (kw, 1, 7, Direction.SOUTH);
        new Wall (kw, 1, 8, Direction.SOUTH);
        new Wall (kw, 1, 9, Direction.SOUTH);
        new Wall (kw, 1, 1, Direction.SOUTH);
        new Wall (kw, 1, 3, Direction.WEST);
        new Wall (kw, 1, 5, Direction.WEST);
        new Wall (kw, 1, 7, Direction.WEST);
        new Wall (kw, 1, 9, Direction.WEST);
   
        do{
    // move if front is clear
        if (grute.frontIsClear())
        {
          // if front is clear do this
         grute.move();
        } else {
        grute.turnLeft();
        grute.move();
        grute.turnRight();
        grute.move();
        grute.turnRight();
        grute.move();
        grute.turnLeft();
    }}
        while(!grute.canPickThing());
        grute.pickThing();
        
}
        }
