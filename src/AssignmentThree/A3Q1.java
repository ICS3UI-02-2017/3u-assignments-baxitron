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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        // Create a city for the Robots
        City kw = new City();    
        
        // put robot in KW
        RobotSE bo = new RobotSE(kw, 0, 2, Direction.WEST);
        
        // create a square of walls for bo
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.EAST);
   
       // get bo to turn the first corner
        bo.move(2);
        bo.turnLeft();
        
        //get bo to circle the square exactly two times
        int numberOfMoves = 7;
      
        // if there are still moves to do
        while (numberOfMoves > 0) {
           bo.move(3);
           bo.turnLeft();
            numberOfMoves = numberOfMoves - 1;
        }
        bo.move();
    
    }
}
