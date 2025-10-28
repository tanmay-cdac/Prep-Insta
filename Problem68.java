public class Problem68 {
    static void generateParenthesis(String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (open < n) {
            generateParenthesis(s + "(", open + 1, close, n);
        }
        if (close < open) {
            generateParenthesis(s + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generateParenthesis("", 0, 0, n);
    }
}
