public class Problem35 {
    public static void main(String[] args) {
        int decimal = 13;
        String binary = "";
        int temp = decimal;
        while(temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }
        System.out.println(binary);
    }
}
