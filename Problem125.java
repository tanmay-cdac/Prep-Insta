public class Problem125 {
    static String lcs(String a, String b, int m, int n) {
        if (m == 0 || n == 0) {
            return "";
        }
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return lcs(a, b, m - 1, n - 1) + a.charAt(m - 1);
        } else {
            String s1 = lcs(a, b, m - 1, n);
            String s2 = lcs(a, b, m, n - 1);
            return (s1.length() > s2.length()) ? s1 : s2;
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde", s2 = "ace";
        String result = lcs(s1, s2, s1.length(), s2.length());
        System.out.println("Longest Common Subsequence: " + result);
        System.out.println("Length: " + result.length());
    }
}
