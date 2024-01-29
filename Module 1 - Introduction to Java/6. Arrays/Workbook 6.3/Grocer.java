public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String[] gorceries = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        System.out.println("\nDo you sell banana?");
        for (int grocer = 0; grocer < gorceries.length; grocer++) {
            if (gorceries[grocer] == "bananas") {
                System.out.println("\nWe have that in aisle: " + grocer);
            }
        }

    }
}
