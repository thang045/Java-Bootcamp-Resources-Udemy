import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        /*
         * Task 1
         * 1. Pick up a username and password from the user.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        // pick up username
        String userName = scan.nextLine();
        System.out.print("- Password: ");
        // pick up password
        String passWord = scan.nextLine();

        // see Learn the Part for the remaining instructions.

        /*
         * will be useful for task 2
         * 
         * System.out.println("\nIncorrect, please try again!\n");
         * System.out.print("- Username: ");
         * usernameEntry = scan.nextLine();
         * System.out.print("- Password: ");
         * passwordEntry = scan.nextLine();
         * 
         * 
         */
        while ((!username.equals(userName)) || (!password.equals(passWord))) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username:");
            userName = scan.next();
            System.out.print("\n- Password:");
            passWord = scan.next();
        }
        System.out.println("Sign in successul! Welcome");
        scan.close();

    }
}
