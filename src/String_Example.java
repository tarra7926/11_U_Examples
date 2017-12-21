
import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class String_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = input.nextLine();

        word = word.toLowerCase();
        //see if word starts witha vowel
        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
            // add "way" ot the end of the word
            String translated = word + "way";
            System.out.println(word + " in pig latin is " + translated);


        } else {
            //find the first vowel by going through each letter
            for (int i = 0; i < word.length(); i++) {
                //look for a vowel at spot 5
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    //chop word up at vowel
                    String front = word.substring(0, i);
                    String ending = word.substring(i);
                    String translated = ending + front + "ay";
                    System.out.println(word + " in pig latin is " + translated);

                    break;

                }
            }

        }
    }
}
//satrt looking for an i and start at 2
//int e = word.indexOf("i",2)
//StringBuilder builder = new String Builder
//builder.insert(1,"ub")
//string newWord = builder.toString();