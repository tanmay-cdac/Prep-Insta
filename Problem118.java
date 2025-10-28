public class Problem118 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sum += (c - '0');
            }
        }
        System.out.println("Sum of digits: " + sum);
    }
}
