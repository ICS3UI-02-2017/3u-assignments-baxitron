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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a city for the Robot
        City kw = new City();    
        
        // put a robot in KW
        RobotSE jequavis = new RobotSE(kw, 1, 2, Direction.SOUTH);
   
        // create square of walls with door
 new Wall (kw, 1, 2, Direction.EAST);
  new Wall (kw, 2, 1, Direction.SOUTH);
    new Wall (kw, 1, 2, Direction.SOUTH);
     new Wall (kw, 1, 2, Direction.NORTH);
      new Wall (kw, 1, 1, Direction.NORTH);
       new Wall (kw, 1, 1, Direction.WEST);
         new Wall (kw, 2, 1, Direction.WEST);
         
         // put the mail outside
         new Thing(kw, 2, 2);
         
         //get jequavis out of bed and retrieve mail
         jequavis.turnRight();
         jequavis.move();
         jequavis.turnLeft();
         jequavis.move();
         jequavis.turnLeft();
         jequavis.move();
  
         // get jequavis to pick up mail and return to bed
         jequavis.pickThing();
         jequavis.turnAround();
         jequavis.move(1);
         jequavis.turnRight();
         jequavis.move();
         jequavis.turnRight();
         jequavis.move();
         jequavis.turnRight();
         jequavis.putThing();
         
         
   
         
    }
}
