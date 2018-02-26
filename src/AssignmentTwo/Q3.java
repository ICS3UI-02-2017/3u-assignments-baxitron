/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author baxl2873
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create a city for the Robots
        City kw = new City();

        // put robot in KW
        RobotSE grute = new RobotSE(kw, 7, 8, Direction.EAST);

// make grute always return to point (0, 0)
        while (!grute.isFacingNorth()) {
            // if not facing north do this
            grute.turnRight();
        }
        
        do {
            grute.move();
        } while (grute.getStreet() != 0);





        while (!grute.isFacingWest()) {
            grute.turnLeft();
        }

        do { 
            grute.move();
        } while (grute.getAvenue()!=0);
        }



    }
