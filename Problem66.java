public class Problem66 {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int lastNonZeroDigit(int n) {
        int fact = factorial(n);
        while (fact % 10 == 0) {
            fact /= 10;
        }
        return fact % 10;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Last non-zero digit of " + n + "! = " + lastNonZeroDigit(n));
    }
}
