import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = { 34, 43, 45, 65, 21, 54 };
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

        System.out.println("Ticket 1 numbers: ");
        // Task 3 - Call printTicketNumbers for int[] ticket.
        printTicketNumbers(ticket);

        System.out.println("Ticket 2 numbers: ");
        // Task 3 - Call printTicketNumbers for int[] ticket2.
        printTicketNumbers(ticket2);
    }

    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.println("\n");
    }

}
