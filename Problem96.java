public class Problem96 {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int g = arr[0];
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
        }

        if (g > 1) {
            System.out.println("Yes, all numbers can be made equal");
        } else {
            System.out.println("No, all numbers cannot be made equal");
        }
    }
}
