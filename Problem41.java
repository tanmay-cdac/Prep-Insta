public class Problem41 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5, r = 3;  
        int nPr = factorial(n) / factorial(n - r);
        System.out.println("Permutations: " + nPr);
    }
}
