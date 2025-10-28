public class Problem67 {
    static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("Row " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(binomialCoeff(n, i) + " ");
        }
    }
}
