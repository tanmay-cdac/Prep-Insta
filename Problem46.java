public class Problem46 {
    static int countDecodings(String digits, int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int count = 0;

        if (digits.charAt(n - 1) > '0') {
            count = countDecodings(digits, n - 1);
        }

        if (digits.charAt(n - 2) == '1' || 
           (digits.charAt(n - 2) == '2' && digits.charAt(n - 1) < '7')) {
            count += countDecodings(digits, n - 2);
        }

        return count;
    }

    public static void main(String[] args) {
        String digits = "123";  
        System.out.println("Count of decodings: " + countDecodings(digits, digits.length()));
    }
}
