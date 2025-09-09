public class Problem33 {
    public static void main(String[] args) {
        int octal = 157, decimal = 0, base = 1;
        int temp = octal;
        while(temp > 0) {
            int last = temp % 10;
            decimal += last * base;
            base *= 8;
            temp /= 10;
        }
        System.out.println(decimal);
    }
}
