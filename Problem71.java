public class Problem71 {
    static void generate(int n, int ones, int zeros, String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        generate(n, ones + 1, zeros, s + "1");
        if (zeros + 1 <= ones) {
            generate(n, ones, zeros + 1, s + "0");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate(n, 0, 0, "");
    }
}
