public class Prices {
    public static void main(String[] args) {
        // The instructions for this workbook are on Learn the Part (workbook 6.13)
        double[][] prices = {
                { 12.99, 8.99, 9.99, 10.49, 11.99 },
                { 0.99, 1.99, 2.49, 1.49, 2.99 },
                { 8.99, 7.99, 9.49, 9.99, 10.99 }
        };

        // System.out.println("Baking: " + prices[0][0] + "\t" + prices[0][1] + "\t" +
        // prices[0][2] +
        // "\nBeverage: " + prices[1][0] + "\t" + prices[1][1] + "\t" + prices[1][2] +
        // "\nCereals: " + prices[2][0] + "\t" + prices[2][1] + "\t" + prices[2][2]);

        for (int i = 0; i < prices.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Baking: ");
                    break;
                case 1:
                    System.out.println("\n\nBeverage: ");
                    break;
                case 2:
                    System.out.println("\n\nCereals: ");
                    break;
            }
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");

            }

        }
    }
}
