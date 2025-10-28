public class Problem70 {
    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    static void partition(String s, int start, String result) {
        if (start == s.length()) {
            System.out.println(result.trim());
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                partition(s, i + 1, result + s.substring(start, i + 1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "aab";
        partition(s, 0, "");
    }
}
