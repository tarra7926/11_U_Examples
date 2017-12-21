
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 * Examples for using variables
 *
 * @author tarra7926
 */
public class Variable_Example {

    public static void main(String[] args) {
        City flavourtown = new City();
        Robot alec = new Robot(flavourtown, 1, 1, Direction.EAST);

        //create a move counting vairable
        int moveCounter = 0;
        //continue when couter is less than 10
        while (moveCounter < 10) {
            alec.move();
            //add one to move counter
            moveCounter = moveCounter + 1;
        }
        alec.turnLeft();
        alec.turnLeft();
        alec.turnLeft();


        // counted for loop
        for (int count = 0; count < 10; count = count + 1) {
            alec.move();

        }
    }
}



//note: * = multiplying, + = adding, - = subtraction, / = dividing.