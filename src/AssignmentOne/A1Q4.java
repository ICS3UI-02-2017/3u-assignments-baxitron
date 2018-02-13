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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a city for the Robot
        City kw = new City();

        // put a robot in KW
        RobotSE jequavis = new RobotSE(kw, 0, 0, Direction.SOUTH);

        // put a 2nd robot in KW
        final RobotSE demario = new RobotSE(kw, 0, 1, Direction.SOUTH);

        // make walls inbetween demario and jequavis
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);

        // move demario to collision point
        new Thread() {
            public void run() {
                demario.move();
                demario.turnLeft();
                demario.move();
                demario.turnRight();
                demario.move();
                demario.turnRight();
                demario.move();
            }
        }.start();
        
        
        // move jequavis to collision point
        jequavis.move(2);
        jequavis.turnLeft();
        jequavis.move();

        




    }
}
