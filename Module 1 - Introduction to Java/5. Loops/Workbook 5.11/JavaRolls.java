import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
        scan.nextLine();
        while (true) {
            diceRoll = rollDice();
            if (diceRoll == 6) {
                System.out.print("You rolled a " + diceRoll + ". End of game\n");
                break;
            } else if (diceRoll == 4) {
                System.out.print("You rolled a " + diceRoll + ". Zero points. Keep rolling.\n");
            } else if (diceRoll == 0) {
                continue;
            } else {
                System.out.print("You rolled a " + diceRoll + ". One point. Keep rolling.\n");
                score++;
            }
        }
        if (score > 3) {
            System.out.println("You have " + score + " score" + ". Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 7);
    }

}
