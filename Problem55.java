public class Problem55 {
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        int base = 2, exp = 5;
        System.out.println(base + "^" + exp + " = " + power(base, exp));
    }
}
