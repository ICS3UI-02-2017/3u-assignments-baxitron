/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentOne;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author baxl2873
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // Create a city for the Robot
        City kw = new City();    
        
        // put a robot in KW
        RobotSE jequavis = new RobotSE(kw, 3, 0, Direction.EAST);
        
        // put a flag in front of jequavis
        new Thing(kw, 3, 1);
        
        // create mountain for jequavis 
  new Wall (kw, 3, 2, Direction.WEST);
  new Wall (kw, 3, 2, Direction.NORTH);
  new Wall (kw, 2, 3, Direction.WEST);
  new Wall (kw, 1, 3, Direction.WEST);
  new Wall (kw, 1, 3, Direction.NORTH);
  new Wall (kw, 1, 3, Direction.EAST);
  new Wall (kw, 2, 4, Direction.NORTH);
  new Wall (kw, 2, 4, Direction.EAST);
  new Wall (kw, 3, 4, Direction.EAST);
           
           // move jequavis forward and pick up flag
  jequavis.move();
  jequavis.pickThing();
  
  // move jequavis up the mountain and drop flag
  jequavis.turnLeft();
  jequavis.move();
  jequavis.turnRight();
  jequavis.move();
  jequavis.turnLeft();
  jequavis.move(2);
  jequavis.turnRight();
  jequavis.move(1);
  jequavis.putThing();
  
  // get jequavis to the bottom of the mountain
  jequavis.move();
  jequavis.turnRight();
  jequavis.move();
  jequavis.turnLeft();
  jequavis.move();
  jequavis.turnRight();
  jequavis.move(2);
  jequavis.turnLeft();
  
           
        
    }
}
