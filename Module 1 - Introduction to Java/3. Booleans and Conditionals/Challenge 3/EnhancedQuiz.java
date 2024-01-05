import java.util.Scanner;

public class EnhancedQuiz {

    // Constants for scores and questions
    private static final int CORRECT_ANSWER_SCORE = 5;
    private static final int TOTAL_QUESTIONS = 4;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Array of questions, options, and correct answers
        String[] questions = {
                "Which country held the 2016 Summer Olympics?",
                "Which planet is the hottest?",
                "What is the rarest blood type?",
                "Which one of these characters is friends with Harry Potter?"
        };

        String[][] options = {
                { "a) China", "b) Ireland", "c) Brazil", "d) Italy" },
                { "a) Venus", "b) Saturn", "c) Mercury", "d) Mars" },
                { "a) O", "b) A", "c) B", "d) AB-Negative" },
                { "a) Ron Weasley", "b) Hermione Granger", "c) Draco Malfoy" }
        };

        String[] answers = { "c", "a", "d", "a" };

        // Task 1: Get user answers
        String[] userAnswers = new String[TOTAL_QUESTIONS];

        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            userAnswers[i] = getUserAnswer(scan, questions[i], options[i]);
        }

        // Task 2: Calculate the score based on user answers
        int score = calculateScore(userAnswers, answers);

        // Task 3: Print the final score and a message based on the score
        printFinalScore(score);

        scan.close();
    }

    // Function to get user's answer for a question
    private static String getUserAnswer(Scanner scanner, String question, String[] options) {
        System.out.println(question);
        for (String option : options) {
            System.out.println("\t" + option);
        }
        return scanner.next();
    }

    // Function to calculate the score based on user answers
    private static int calculateScore(String[] userAnswers, String[] correctAnswers) {
        int score = 0;
        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score += CORRECT_ANSWER_SCORE;
            }
        }
        return score;
    }

    // Function to print the final score and a message based on the score
    private static void printFinalScore(int score) {
        System.out.printf("Your final score is: %d/%d%n", score, TOTAL_QUESTIONS * CORRECT_ANSWER_SCORE);

        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
