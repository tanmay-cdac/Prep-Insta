public class Problem36 {
    public static void main(String[] args) {
        int decimal = 100;
        String octal = "";
        int temp = decimal;
        while(temp > 0) {
            octal = (temp % 8) + octal;
            temp /= 8;
        }
        System.out.println(octal);
    }
}
