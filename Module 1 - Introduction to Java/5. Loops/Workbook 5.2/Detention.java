import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String bartStatment = scan.nextLine();
        // See Learn the Part for the instructions.
        if (bartStatment.equals("I will not forget semi-colons.")) {
            for (int i = 1; i <= 99; i++) {
                System.out.println(i + "." + " I will not forget semi-colons.\n");
            }
        } else {
            System.out.println("Good!");
        }
    }
}
