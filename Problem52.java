public class Problem52 {
    public static void main(String[] args) {
        int num = 122352, digit = 2;
        int count = 0;

        while (num > 0) {
            int d = num % 10;
            if (d == digit) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Digit " + digit + " occurs " + count + " times");
    }
}
