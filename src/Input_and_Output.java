import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class Input_and_Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //say hello
        System.out.println("hello world");
        //say hellow world in 2 lines
        System.out.print("Hello");
        System.out.println("World");
        
        //say type in a word
        System.out.print("Type in a word");
        
        //create a Scanner for input
        Scanner input = new Scanner(System.in);
        
        // name variable
        String firstName = input.nextLine();
        
        //output the variable to the screen
        System.out.println("Hello " + firstName);
        
        //say type in a word
        System.out.print("Please enter the year you were born in:");
        
       
        //get Year
        int birthYear = input.nextInt();
        
        while (birthYear > 2017) {
        System.out.println("Try Again");
        birthYear = input.nextInt();
        }
        //calculate age
        int age = 2017 - birthYear;
        
       System.out.println("you are " + age + "years old");
    }
}
