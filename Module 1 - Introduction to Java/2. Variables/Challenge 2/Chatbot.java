//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions.

        // set up scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        // Pick up user's name and store it.
        String userName = scanner.next();

        // add new a line before asking next question.
        System.out.println("\nHi " + userName + "!" + " I'm Javabot. Where are you from?");
        // Pick up user's home and store it.
        String userHome = scanner.next();

        // add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + userHome + "!" + " I'm from a place called Oracle");
        System.out.println("How old are you?");
        // Pick up age and store it.
        int userAge = scanner.nextInt();

        // add new a line before asking next question.
        System.out.println("\nSo you're " + userAge + "," + " cool! I'm 400 years old.");
        int chatBotAge = 400;

        System.out.println("This means I'm " + ((double) chatBotAge / userAge) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        // Pick up language and store it.
        String favUserProgrammingLanguage = scanner.next();

        // add new a line here.
        System.out.println("\n" + favUserProgrammingLanguage
                + ", that's great! Nice chatting with you " + userName + "." + " I have to log off now. See ya!");

        // close scanner.
        scanner.close();

    }
}
