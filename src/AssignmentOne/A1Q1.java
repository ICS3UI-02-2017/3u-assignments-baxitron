/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentOne;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author baxl2873
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    // Create a city for the Robot
        City kw = new City();    
        
        // put a robot in KW
        RobotSE jequavis = new RobotSE(kw, 0, 2, Direction.WEST);
   // create a square of walls  
 new Wall (kw, 1, 2, Direction.EAST);
  new Wall (kw, 2, 2, Direction.EAST);
   new Wall (kw, 2, 2, Direction.SOUTH);
    new Wall (kw, 2, 1, Direction.SOUTH);
     new Wall (kw, 1, 2, Direction.NORTH);
      new Wall (kw, 1, 1, Direction.NORTH);
       new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        
        // move jequavis around square
        jequavis.move(2);
        jequavis.turnLeft();
        jequavis.move(3);
        jequavis.turnLeft();
        jequavis.move(3);
        jequavis.turnLeft();
        jequavis.move(3);
        jequavis.turnLeft();
        jequavis.move();
        
     
    }
}