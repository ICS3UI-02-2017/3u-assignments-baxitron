/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author baxl2873
 */
public class ConditionsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// create a city
        City kw = new City();
        
        // create a robot
          RobotSE quavis = new RobotSE(kw, 2, 1, Direction.EAST);
    // create a wall infront
          new Wall(kw, 2, 5, Direction.EAST);
          
    // place a few things
          new Thing(kw, 2, 2);
          new Thing(kw, 2, 4);
          
        
          //move until front is not clear
          while (quavis.frontIsClear()){
              // if front is clear, do this
              quavis.move();
              
              //is there something to pick up
              if(quavis.canPickThing())
                  quavis.pickThing();
             
          }
           quavis.turnRight();
        // do you have one thing in your backpack
         if (quavis.countThingsInBackpack() == 1) {
             quavis.move();
         }else if(quavis.countThingsInBackpack() == 2){
         quavis.move(2);
         }else{ 
          quavis.turnAround();
         }
                   
    }
}
