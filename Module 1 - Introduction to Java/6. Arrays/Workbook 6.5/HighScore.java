public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] randomScore = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };
        System.out.print("Here are the scores: ");
        for (int score = 0; score < randomScore.length; score++) {
            System.out.print(randomScore[score] + " ");
        }

        int seat = 0;
        for (int highestScore = 0; highestScore < randomScore.length; highestScore++) {
            if (randomScore[highestScore] > highScore) {
                highScore = randomScore[highestScore];
                seat = highestScore;
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give man at position " + seat + " a cookie!");

    }

    public static int randomNumber() {
        double ranNumber = Math.random() * 49999;
        int intNumber = (int) ranNumber;
        return intNumber;
    }

}
