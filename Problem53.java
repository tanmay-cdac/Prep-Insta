public class Problem53 {
    static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20;
        int x = 4;

        System.out.print("Numbers with exactly " + x + " divisors: ");
        for (int i = 1; i <= n; i++) {
            if (countDivisors(i) == x) {
                System.out.print(i + " ");
            }
        }
    }
}
