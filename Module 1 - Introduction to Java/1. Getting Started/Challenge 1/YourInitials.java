public class YourInitials {
    static String table1Line1, table1Line2, table1Line3, table1Line4,
            table1Line5, table1Line6, table1Line7;

    static String table2Line1, table2Line2, table2Line3, table2Line4,
            table2Line5, table2Line6, table2Line7;

    public static void main(String[] args) {
        // Instructions for this workbook are on Learn the Part (See the Udemy Video:
        // Your Initials to access the link).

        // Table 01
        table1Line1 = " SSS ";
        table1Line2 = "S   S";
        table1Line3 = "S    ";
        table1Line4 = " SSS ";
        table1Line6 = "S   S";
        table1Line5 = "    S";
        table1Line7 = " SSS ";

        // Table 02
        table2Line1 = "  A";
        table2Line2 = " A A ";
        table2Line3 = "A   A";
        table2Line4 = "AAAAA";
        table2Line5 = "A   A";
        table2Line6 = "A   A";
        table2Line7 = "A   A";

        // Print
        System.out.println(table1Line1 + "  " + table2Line1);
        System.out.println(table1Line2 + "  " + table2Line2);
        System.out.println(table1Line3 + "  " + table2Line3);
        System.out.println(table1Line4 + "  " + table2Line4);
        System.out.println(table1Line5 + "  " + table2Line5);
        System.out.println(table1Line6 + "  " + table2Line6);
        System.out.println(table1Line7 + "  " + table2Line7);
    }
}
