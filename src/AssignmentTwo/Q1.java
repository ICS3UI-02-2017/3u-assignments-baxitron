/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentTwo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author baxl2873
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create a city for the Robots
        City kw = new City();

        // put robot in KW
        RobotSE grute = new RobotSE(kw, 1, 1, Direction.EAST);

        // create a line of things 
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);


        // make robot pick up 7 things
        grute.move();
        while (grute.frontIsClear()) {
            if (grute.canPickThing()) {
                if (grute.countThingsInBackpack() <= 6) {
                    grute.pickThing();
                }

                grute.move();

            }
        }



    }
}
