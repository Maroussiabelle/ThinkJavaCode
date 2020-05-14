import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {

        System.out.println("I 'm thinking of a number between 1 and 100");
        System.out.println("(including both).Can you guess what it is?");
        System.out.println("Type a number:");
        //scan input
        Scanner in = new Scanner(System.in);
        int insertNumber = in.nextInt();
        // pick a random number
        insertNumber = in.nextInt();
        System.out.println("Your guess is:" + insertNumber);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is:" + number);
        System.out.println("You were off by: " + (insertNumber - number));

    }
}
