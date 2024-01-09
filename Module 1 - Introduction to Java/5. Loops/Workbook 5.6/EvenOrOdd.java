public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        for (int i = 0; i <= 19; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ": Even\n");
            } else if (i % 2 == 1) {
                System.out.println(i + ": Odd\n");
            } else {
                System.out.println("Nothing");
            }
        }
    }
}
