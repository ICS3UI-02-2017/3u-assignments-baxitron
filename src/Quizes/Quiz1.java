/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author baxl2873
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         // Create a city for the Robot
        City kw = new City();    
        
        // put a robot in KW
        RobotSE bo = new RobotSE(kw, 4, 0, Direction.EAST);
   
       // create a staircase for bo
  new Wall (kw, 4, 2, Direction.WEST);
  new Wall (kw, 4, 2, Direction.NORTH);
  new Wall (kw, 3, 3, Direction.WEST);
  new Wall (kw, 3, 3, Direction.NORTH);
  new Wall (kw, 2, 4, Direction.NORTH);
  new Wall (kw, 2, 4, Direction.WEST);
  new Wall (kw, 2, 5, Direction.NORTH);
  new Wall (kw, 2, 5, Direction.EAST);
  new Wall (kw, 3, 6, Direction.EAST);
  new Wall (kw, 3, 6, Direction.NORTH);
  new Wall (kw, 4, 7, Direction.NORTH);
  new Wall (kw, 4, 7, Direction.EAST);
 
    
          // set up lights for bo to pick up
         new Thing(kw, 4, 1);
         new Thing(kw, 3, 2);
         new Thing(kw, 2, 3);
         new Thing(kw, 1, 4);
         
         // get bo to climb staircase and pick up lights
         bo.move();
         bo.pickThing();
         bo.turnLeft();
         bo.move();
         bo.turnRight();
         bo.move();
         bo.pickThing();
         bo.turnLeft();
         bo.move();
         bo.turnRight();
         bo.move();
         bo.pickThing();
         bo.turnLeft();
         bo.move();
         bo.turnRight();
         bo.move();
         bo.pickThing();
      
         // get bo to climb down staircase and drop lights on the way
         bo.move();
         bo.putThing();
         bo.move();
         bo.turnRight();
         bo.move();
         bo.putThing();
         bo.turnLeft();
         bo.move();
         bo.turnRight();
         bo.move();
         bo.putThing();
         bo.turnLeft();
         bo.move();
         bo.turnRight();
         bo.move();
         bo.putThing();
         bo.turnLeft();
         bo.move();
         
    }
}
