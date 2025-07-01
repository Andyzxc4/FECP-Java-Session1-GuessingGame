package org.example;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  generate random secret number with range of 1-5
        int secretNumber = (int) (Math.random() * 5) + 1;

        // scanner object
        Scanner scannerObj = new Scanner(System.in);

        // bool value to determine if user wins or not
        boolean isWinner = false;

        System.out.println("Im thinking of a number between 1 and 5.");
        for (int i = 0; i < 3; i++) {
            System.out.print("Guess " + (i + 1) + ": ");
            int guessNumberInput = scannerObj.nextInt();

            if (guessNumberInput == secretNumber) {
                isWinner = true;
                System.out.println("You Win!");
                break;
            }
            else {
                System.out.println("Wrong Guess!");
            }
        }

        //  handle the loser message
        if (!isWinner) {
            System.out.println("You lose. Correct number is " + secretNumber + ".");
        }

        //  close scanner object
        scannerObj.close();
    }
}