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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // Create a city for the Robots
        City kw = new City();    
        
        // put 2 robots in KW
        RobotSE jequavis = new RobotSE(kw, 0, 1, Direction.WEST);
        RobotSE demario = new RobotSE(kw, 3, 3, Direction.EAST);
        
        // create walls around demario
          new Wall(kw, 3, 3, Direction.EAST);
          new Wall(kw, 3, 3, Direction.SOUTH);
          new Wall(kw, 2, 3, Direction.EAST);
          new Wall(kw, 2, 3, Direction.WEST);
          new Wall(kw, 2, 3, Direction.NORTH);
          
          // place groceries around
          new Thing (kw, 0, 0);
          new Thing (kw, 1, 0);
          new Thing (kw, 1, 1);
          new Thing (kw, 1, 2);
          new Thing (kw, 2, 2);
          
          // get jequavis to pick up three groceries
          jequavis.move();
          jequavis.pickThing();
          jequavis.turnLeft();
          jequavis.move();
          jequavis.pickThing();
          jequavis.turnLeft();
          jequavis.move();
          jequavis.pickThing();
          
          // get demario to pick up the other two groceries and meet jequavis
          demario.turnAround();
          demario.move();
          demario.turnRight();
          demario.move();
          demario.pickThing();
          demario.move();
          demario.pickThing();
          demario.turnLeft();
         
          
          
          

  }
}
