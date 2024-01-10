import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = generateRandomNumber();
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        int guess = scan.nextInt();
        while (guess != secretNumber) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }
        System.out.println("Got it! " + secretNumber);

        // See Learn the Part for detailed instructions.

        scan.close();

    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 6);
    }

}
