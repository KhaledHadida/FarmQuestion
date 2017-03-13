
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hadida
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city
        City kw = new City();

        //knowing how many things are in the city
        kw.showThingCounts(true);

        //creating the robot
        RobotSE karel = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //creating the things
        //First batch of things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        //second batch of things
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        //third batch of things
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        //fourth batch of things
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //making a counter
        int counter = 0;

        //moving karel
        karel.move();

        //while loop functioning as long as karel can pick thing
        while (karel.canPickThing()) {

            //karel picks thing and counts up!
            if (karel.canPickThing()) {
                karel.pickAllThings();
                counter++;
            }

            //store counter as karel's backpack amount
            counter = karel.countThingsInBackpack();
            karel.turnLeft();
            //karel put thing as he goes along
            for (int i = 0; i < counter; i++) {
                karel.putThing();
                karel.move();
            }
            //turns around once he's done a row
            karel.turnAround();

            //a counter variable used to move back X amount of things 
            for (int i = 0; i < counter;) {
                karel.move();
                counter--;
            }

            //moves on to the next row
            karel.turnLeft();
            karel.move();

        }
    }

}
