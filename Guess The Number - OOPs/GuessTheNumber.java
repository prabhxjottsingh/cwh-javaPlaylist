import java.util.*;

public class GuessTheNumber{
    public static void main(String args[]){
        /*
         * Create a class Game, which allows a user to play "Guess The Number" game once.
         * Game should have following methods:
         * 1. Constructor to generate a random Number
         * 2. TakeUserInput - Take user number input
         * 3. isCorrectNumber() -> Detect whether the number guessed is true
         * 4. Getters and Setters for for numberOfGuesses.
         * Use properties such as numberOgGuessesl, etc. to get this task done
         */
        System.out.println("Hello, Welcome to GuessTheNumber Game!!");
        Game obj = new Game();
        boolean numberFound = false;
        do{
            obj.takeUserInput();
            numberFound = obj.isNumberCorrect();
        }while( numberFound == false );
        System.out.println("You have completed the game... Well Played.");
    }
}

class Game{
    private int generatedRandomNumber;
    private int numberEnteredByUser;
    private static int countGuessingAttempts = 0;

    public Game(){
        generatedRandomNumber = (int)(Math.random() * 100);
    }

    public void takeUserInput(){
        countGuessingAttempts++;
        System.out.print("Guess the Number: ");
        Scanner sc = new Scanner(System.in);
        numberEnteredByUser = sc.nextInt();
    }

    public boolean isNumberCorrect(){
        if( numberEnteredByUser < generatedRandomNumber ){
            System.out.println("The number you have guessed is smaller than the required number.");
            return false;
        }else if( numberEnteredByUser > generatedRandomNumber ){
            System.out.println("The number you have entered is greater than the required number.");
            return false;
        }
        System.out.println("Hurray!! you have guessed the right number. It took you " + countGuessingAttempts + " guesses.");
        return true;
    }

}