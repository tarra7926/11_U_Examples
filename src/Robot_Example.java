
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Demonstrate how to use a robot
 *
 * @author tarra7926
 */
public class Robot_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City flavourtown = new City();

        //create Robot
        Robot karel = new Robot(flavourtown, 3, 2, Direction.EAST);
        // create a second robot named tina
        Robot tina = new Robot(flavourtown, 3, 5, Direction.WEST);

        // create a wall and a thing to interact with
        new Wall(flavourtown, 3, 2, Direction.NORTH);
        new Thing(flavourtown, 3, 3);

        // place a label on tina
        tina.setLabel("Tina");

        // move to thing
        karel.move();
        // have karel pick up the thing
        karel.pickThing();

        // have karel turn
        karel.turnLeft();

        // get karel to move
        karel.move();
        karel.move();

        // make karel drop the thing he's carrying
        karel.putThing();

        // change tina's colour to magenta
        tina.setColor(Color.MAGENTA);

    }
}
