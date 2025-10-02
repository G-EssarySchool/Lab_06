import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userGuess;
        int randomNum;
        boolean mango67 = false;

        do {
            System.out.println("Welcome! Let's play a game.\nTry to guess my number!\nEnter a number [1-10]:");
            userGuess = scan.nextInt();

            if (userGuess <= 1 && 10 <= userGuess) {
                System.out.println("");

            }
            else{
                System.out.println("Sorry, you're guess is invalid. Please try again");
                scan.nextLine();
            }




























        } while (!mango67);
    }
}
