package jsd1;

import java.util.Scanner;

class NumberGame {
    protected int numberToGuess;
    protected int maxTrials;

    public NumberGame() {
        numberToGuess = 1 + (int)(100 * Math.random());
        maxTrials = 5;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A number is chosen between 1 to 100. Guess the number within " + maxTrials + " trials.");

        for (int i = 0; i < maxTrials; i++) {
            System.out.println("Guess the number:");
            int guess = sc.nextInt();

            if (numberToGuess == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (numberToGuess > guess && i != maxTrials - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (numberToGuess < guess && i != maxTrials - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (maxTrials == 5) {
            System.out.println("You have exhausted " + maxTrials + " trials.");
            System.out.println("The number was " + numberToGuess);
        }
    }
}

public class GuessingNumberGame extends NumberGame {
    public GuessingNumberGame() {
        super();
    }

    public static void main(String[] args) {
        GuessingNumberGame game = new GuessingNumberGame();
        game.play();
    }
}
