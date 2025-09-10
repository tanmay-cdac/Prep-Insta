public class Problem60 {
    static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("HCF of " + a + " and " + b + " = " + hcf(a, b));
    }
}
