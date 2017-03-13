
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class KarelSolution {
    public static void main(String[] args) {
        
        
        //create city
        City kw = new City();
        
        //create robot 
        RobotSE karel = new RobotSE(kw, -1,-1, Direction.SOUTH);
        
        //as long as robot is not at avenue 0
        while(karel.getAvenue() != 0 ){
            //toggles robot to keep turning left til he's facing west and avenue is > 0
            while(karel.getAvenue() > 0 && karel.getDirection() != Direction.WEST ){
                karel.turnLeft();
            }
            //toggles robot to keep turning left til he's facing EAST and avenue is < 0
               while(karel.getAvenue() < 0 && karel.getDirection() != Direction.EAST ){
                karel.turnLeft();
            }
            //robot moves
            karel.move();
            
        }
        //as long as robot is not at street 0
        while(karel.getStreet() != 0){
            //toggles robot to keep turning left til he's facing NORTH and street is > 0
            while(karel.getStreet() > 0 && karel.getDirection() != Direction.NORTH){
                karel.turnLeft();
            }
            
            //toggles robot to keep turning left til he's facing SOUTH and Street is < 0
             while(karel.getStreet() < 0 && karel.getDirection() != Direction.SOUTH){
                karel.turnLeft();
            }
            //robot moves
            karel.move();
        }
        
        
        
    }
}
