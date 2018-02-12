
package examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *Learning How to Use the Robots
 * @author baxl2873
 */
public class RobotExample {
    
    
       public static void main(String[] args) {
         // Create a city for the Robot
        City kw = new City();    
        
        // put a robot in KW
        RobotSE jequavis = new RobotSE(kw, 2, 3, Direction.EAST);
     
     
  
        new Wall (kw, 2, 5, Direction.WEST);
       
      // create a thing
        new Thing(kw, 2, 4); 
        
        
  // move forward one space
        jequavis.move(1);
        
        // kick the thing
        jequavis.pickThing();
        
      // turn right
        jequavis.turnAround();
        
        // move left 5 spaces
        jequavis.move(5);
        
        //put the thing down
        jequavis.putThing();
        

// set the color of the robot
jequavis.setColor(Color.MAGENTA);



                                                     
                                                     
                                                     
                                                     
                                                     
                                                     
                          
                          
                                  
                          
          
        
    }
 
       
        
}