public class Problem32 {
    public static void main(String[] args) {
        int binary = 1011, decimal = 0, base = 1;
        int temp = binary;
        while(temp > 0) {
            int last = temp % 10;
            decimal += last * base;
            base *= 2;
            temp /= 10;
        }
        System.out.println(decimal);
    }
}
