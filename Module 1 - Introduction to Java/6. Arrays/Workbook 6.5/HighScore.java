public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] randomScore = { randomIntNumber(), randomIntNumber(), randomIntNumber(), randomIntNumber(),
                randomIntNumber(),
                randomIntNumber(),
                randomIntNumber(), randomIntNumber(), randomIntNumber(), randomIntNumber(), randomIntNumber() };
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

    public static int randomIntNumber() {
        int randomNumber = (int) (Math.random() * 50000);
        return randomNumber;
    }

}
