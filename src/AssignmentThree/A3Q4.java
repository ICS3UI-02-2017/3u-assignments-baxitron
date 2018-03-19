/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentThree;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author baxl2873
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Create a city for the Robots
        City kw = new City();    
        
        // put robot in KW
        RobotSE bo = new RobotSE(kw, 3, 3, Direction.SOUTH);
        
      // create 4 squares of walls for bo
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.EAST);
        
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.WEST);
        new Wall (kw, 1, 5, Direction.NORTH);
        new Wall (kw, 1, 5, Direction.EAST);
        new Wall (kw, 2, 4, Direction.WEST);
        new Wall (kw, 2, 4, Direction.SOUTH);
        new Wall (kw, 2, 5, Direction.SOUTH);
        new Wall (kw, 2, 5, Direction.EAST);
        
        new Wall (kw, 4, 1, Direction.NORTH);
        new Wall (kw, 4, 1, Direction.WEST);
        new Wall (kw, 4, 2, Direction.NORTH);
        new Wall (kw, 4, 2, Direction.EAST);
        new Wall (kw, 5, 1, Direction.WEST);
        new Wall (kw, 5, 1, Direction.SOUTH);
        new Wall (kw, 5, 2, Direction.SOUTH);
        new Wall (kw, 5, 2, Direction.EAST);
        
        new Wall (kw, 4, 4, Direction.NORTH);
        new Wall (kw, 4, 4, Direction.WEST);
        new Wall (kw, 4, 5, Direction.NORTH);
        new Wall (kw, 4, 5, Direction.EAST);
        new Wall (kw, 5, 4, Direction.WEST);
        new Wall (kw, 5, 4, Direction.SOUTH);
        new Wall (kw, 5, 5, Direction.SOUTH);
        new Wall (kw, 5, 5, Direction.EAST);
  
    // get bo around the first square
        bo.move(3);
        bo.turnLeft();
        bo.move(3);
        bo.turnLeft();
        bo.move(3);
        bo.turnLeft();
        
        // create a for loop for the other squares
         for (int count = 0; count < 3; count++){
             bo.move(6);
             bo.turnLeft();
             bo.move(3);
             bo.turnLeft();
             bo.move(3);
             bo.turnLeft();
         }
        // get bo back to starting position
         bo.move(3);
         
    }
}
