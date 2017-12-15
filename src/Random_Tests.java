
import java.util.Scanner;


/**
 *
 * @author tarra7926
 */
public class Random_Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        

        
        boolean allOdd = false;
        for(int i = 0; num >0; i++){
           int digit = num %10;
            if (digit % 2 == 0) {
                allOdd = false;
                break;
            } else {
                allOdd = true;
            }
            num = num/10;
        }
            if (allOdd == true) {
            System.out.println("All digits are odd");
        } else {
            System.out.println("All digits aren't odd");
        }
        }
        
    }
/**
 * boolean allOdd = false;
        
        int digit = integer % ((int) Math.pow(10, 1));
        //figure out one of the digits and check to see if it is even or odd
        for (int i = 2; digit < integer; i++) {
            while (digit > 9.9) {
                digit = digit / 10;
            }
            if (digit % 2 == 0) {
                allOdd = false;
                break;
            } else {
                allOdd = true;
            }
            digit = integer % ((int) Math.pow(10, i));
        }
        //return the all odd variable
        return allOdd;
 */
