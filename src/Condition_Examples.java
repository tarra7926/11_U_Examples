
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tarra7926
 */
public class Condition_Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City flavourtown = new City();

        //create robot
        Robot alec = new Robot(flavourtown, 2, 1, Direction.EAST);

        //create wall and thing
        new Wall(flavourtown, 2, 5, Direction.EAST);
        new Thing(flavourtown, 2, 4);

        if (alec.frontIsClear()) {
            //move forward
            alec.move();

        } else {
            //if alec is blocked turn
            alec.turnLeft();

        }

        //move up until the wall
        while (alec.frontIsClear()) {
            alec.move();
            if (alec.canPickThing()) {
                alec.pickThing();
            }
            
        }
        if (alec.frontIsClear()) {
            alec.move();

        } else {

            //turn robot away from the wall
            alec.turnLeft();

        }
    }
}