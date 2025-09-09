public class Problem39 {
    public static void main(String[] args) {
        String octal = "127";  
        int decimal = 0, base = 1;

        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * base;
            base *= 8;
        }

        String binary = "";
        int num = decimal;
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println("Binary: " + binary);
    }
}
