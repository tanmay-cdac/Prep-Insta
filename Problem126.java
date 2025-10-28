public class Problem126 {
    static boolean isMatch(String text, String pattern, int n, int m) {
        if (m == 0) return n == 0;

        if (pattern.charAt(m - 1) == '*') {
            return isMatch(text, pattern, n, m - 1) || (n > 0 && isMatch(text, pattern, n - 1, m));
        }

        if (n > 0 && (pattern.charAt(m - 1) == '?' || text.charAt(n - 1) == pattern.charAt(m - 1))) {
            return isMatch(text, pattern, n - 1, m - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        String text = "abcdef";
        String pattern = "a*e?f";
        if (isMatch(text, pattern, text.length(), pattern.length())) {
            System.out.println("Strings Match");
        } 
        else {
            System.out.println("Strings Do Not Match");
        }
    }
}
