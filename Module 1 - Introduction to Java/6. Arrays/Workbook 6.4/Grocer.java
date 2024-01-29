import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.4).

        Scanner scan = new Scanner(System.in);

        String[] store = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        System.out.print("I am looking for ");
        String userChoice = scan.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (userChoice.equals(store[i])) {
                System.out.println("\nWe have that in aisle: " + i);
            }

        }

        scan.close();

        // Compare your result to what's on Learn the Part.

    }
}
