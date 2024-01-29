import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = { 1.99, 2.99, 3.99, 4.99 };
        // taxed price = 100% (original price) + 13% (tax) = 113% => tax = 1.13
        double tax = 1.13;
        System.out.println("\nThe original prices are: " + Arrays.toString(price));
        double[] taxedPrice = new double[4];
        for (int i = 0; i < price.length; i++) {
            price[i] *= tax;
            taxedPrice[i] = price[i];
        }
        // See instructions on Learn the Part (Workbook 6.9)
        System.out.println("\nThe prices after tax are: " + Arrays.toString(taxedPrice));

    }
}
