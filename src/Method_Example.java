
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarra7926
 */
public class Method_Example {

    //void method type means perform an action
    //inside round btackets needs extra variable to run
    //sometijmes called a procedure
    public void sayHello(String name) {
        System.out.println("Hello " + name);

    }

    public int addFive(int a) {
        a = a + 5;
        return a;
    }
    //double return type = needs tp send awnser
    // sometimes called a function

    public double areaOfRect(double length, double width) {
        double answer = length * width;

        //send back the answer
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Method_Example test = new Method_Example();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you name: ");

        String name = input.nextLine();

        test.sayHello(name);

        System.out.println("Please enter the length and width of a rectangle");

        double a = input.nextDouble();
        double b = input.nextDouble();

        double area = test.areaOfRect(a, b);

        System.out.println("The area is: " + area);

        int num = 10;
        num = test.addFive(num);
        System.out.println("The number is: " + num);


    }
}
