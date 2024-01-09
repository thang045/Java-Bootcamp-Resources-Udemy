import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("Hi Tommy, Choose a number to count to: ");
        int chosenNumber = scan.nextInt();
        for (int i = 0; i <= chosenNumber; i++) {
            System.out.print(i + "\t");
        }
        scan.close();
    }
}
