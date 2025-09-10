public class Problem56 {
    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        } 
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }   
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(n + (isPrime(n, 2) ? " is Prime" : " is Not Prime"));
    }
}
