public class Problem38 {
    public static void main(String[] args) {
        int binary = 101011;
        int decimal = 0, base = 1;
        int temp = binary;
        while(temp > 0) {
            decimal += (temp % 10) * base;
            base *= 2;
            temp /= 10;
        }
        String octal = "";
        while(decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        System.out.println(octal);
    }
}
