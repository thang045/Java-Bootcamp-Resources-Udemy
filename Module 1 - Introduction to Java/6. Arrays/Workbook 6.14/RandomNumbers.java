import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {

        // The instructions for this workbook are on Learn the Part (Workbook 6.14)

        int[][] array = new int[4][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumbers();
            }
        }

        print2DArray(array);
    }

    public static int randomNumbers() {
        int numbers = ((int) (Math.random() * 100));
        return numbers;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Line " + (i + 1) + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
