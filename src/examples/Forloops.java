/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author baxl2873
 */
public class Forloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city
        City kw = new City();

        // create a robot
        RobotSE quavis = new RobotSE(kw, 1, 1, Direction.EAST);
        //counted while loop
        int numberOfMoves = 5;
        // if there are still moves to do
        while (numberOfMoves > 0) {
            quavis.move();
            numberOfMoves = numberOfMoves - 1;
        }
        quavis.move();
        // counting the other way
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            quavis.move();
            numberOfMoves = numberOfMoves + 1;
        }
        quavis.turnAround();
        // use a for loop to move
        for (int count = 0; count < 10; count++) {
            quavis.move();
        }
    }
}
