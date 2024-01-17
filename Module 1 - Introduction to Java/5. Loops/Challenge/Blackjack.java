import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        // Task 3 – Wait for the user to press enter.
        // Task 4 – Get two random cards.
        // – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        scan.nextLine();
        int firstDraw = drawRandomCard();
        int secondDraw = drawRandomCard();
        System.out.println(
                "\nYou get a \n" + cardString(firstDraw) + "\n and a \n" + cardString(secondDraw));

        // Task 5 – Print the sum of your hand value.
        // – print: your total is: <hand value>
        int totalDraw = (Math.min(firstDraw, 10) + Math.min(secondDraw, 10));
        System.out.println("Your total is: " + totalDraw);

        // Task 6 – Get two random cards for the dealer.
        // – Print: The dealer shows \n" + <first card> + "\nand has a card facing down
        // \n" + <facedown card>
        // – Print: \nThe dealer's total is hidden
        int dealerCard = drawRandomCard();
        System.out.println("\nThe dealer shows \n" + cardString(dealerCard) +
                "\nand has a card facing down \n" + faceDown());
        System.out.println("The dealer's total is hidden:");

        // Task 8 – Keep asking the player to hit or stay (while loop).
        // 1. Every time the player hits
        // – draw a new card.
        // – calculate their new total.
        // – print: (new line) You get a (new line) <show new card>.
        // - print: your new total is <total>
        while (true) {
            String option = hitOrStay();
            // 2. Once the player stays, break the loop.
            if (option.equalsIgnoreCase("stay")) {
                int newDealerCard = drawRandomCard();
                System.out.println("\nDealer's turn");
                System.out.println("\nThe dealer's cards are \n" + cardString(dealerCard) + "\n and a \n"
                        + cardString(newDealerCard));

                int totalDealerCard = dealerCard + newDealerCard;
                if (totalDealerCard >= 17) {
                    System.out.println("Dealer gets a \n" + cardString(newDealerCard));
                    System.out.println("\nDealer's total is: " + totalDealerCard);
                    if (totalDealerCard > totalDraw) {
                        System.out.println("Dealer wins!");
                    } else {
                        System.out.println("Player wins!");
                    }

                    break;
                }

                while (totalDealerCard < 17) {
                    newDealerCard = drawRandomCard();
                    totalDealerCard += newDealerCard;

                }

            }
            int newCard = drawRandomCard();
            totalDraw += (Math.min(newCard, 10));
            System.out.println("\nYou get a \n" + cardString(newCard));
            System.out.println("Your new total is: " + totalDraw);

            // For tasks 9 to 13, see the article: Blackjack Part II.
            if (totalDraw > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }
        scan.close();

    }

    /**
     * Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */
    public static int drawRandomCard() {
        int card = (int) (Math.random() * 13);
        return card += 1;
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";

            default:
                return "This is never get called!";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String playerChoice = scan.nextLine();

        while (!(playerChoice.equalsIgnoreCase("hit") || (playerChoice.equalsIgnoreCase("stay")))) {
            System.out.println("Please write 'hit' or 'stay'");
            scan.nextLine();
        }
        return playerChoice;

    }
}
