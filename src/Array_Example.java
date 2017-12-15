
import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class Array_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creat an array to store costs
        double[] expenses = new double[6];
        String[] expenseNames = new String[6];
        //put names in array
        expenseNames[0] = "food";
        expenseNames[1] = "Dj";
        expenseNames[2] = "Hall Rental";
        expenseNames[3] = "Decorations";
        expenseNames[4] = "Staff Fees";
        expenseNames[5] = "Miscellaneous Things";

        //use a loop to get all the info
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("How much does the " + expenseNames[i] + " cost");
            expenses[i] = input.nextDouble();

        }

        double total = 0;

        for (int i = 0; i < expenses.length; i++) {
            total = total + expenses[i];

        }
        int tickets = (int) Math.ceil(total / 35);
        System.out.println("The prom costs $" + total + " you need to sell " + tickets + " tickets");

    }
}