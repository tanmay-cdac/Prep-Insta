public class Problem43 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int n1 = 1, d1 = 2;  
        int n2 = 3, d2 = 4;  

        int num = n1 * d2 + n2 * d1;
        int den = d1 * d2;
        int g = gcd(num, den);

        System.out.println("Result: " + (num / g) + "/" + (den / g));
    }
}
