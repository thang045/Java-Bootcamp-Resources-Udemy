public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.
        for (int i = 0; i < 19; i++) {
            int result = 0;
            result += i;
            if (result % (3 * 5) == 0) {
                System.out.println(i + ". FizzBuzz\n");
            } else if (result % 5 == 0) {
                System.out.println(i + ". Buzz\n");
            } else if (result % 3 == 0) {
                System.out.println(i + ". Fizz\n");
            }
        }
    }

}
