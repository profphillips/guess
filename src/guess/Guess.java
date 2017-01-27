package guess;

import java.util.Scanner;

/**
 * Have the user guess a number between 1 and 10. Loop until they get the right
 * answer. More to come.
 *
 * @author Administrator
 */
public class Guess {

    public static void main(String[] args) {
        int answer = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("John's Guessing Game");
        System.out.println("Guess a number between 1 and 10");

        while (true) {
            System.out.print("Enter a number: ");
            if (sc.nextInt() == answer) {
                break;
            } else {
                System.out.println("Sorry, try again");
            }
        }
        System.out.println("You got it!!!");
    }

}
