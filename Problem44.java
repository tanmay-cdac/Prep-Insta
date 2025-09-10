public class Problem44 {
    public static void main(String[] args) {
        int num = 102040;  
        int result = 0, place = 1;

        if (num == 0) {
            result = 1;
        } else {
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0) {
                    digit = 1;
                }
                result = digit * place + result;
                place *= 10;
                num /= 10;
            }
        }

        System.out.println("Updated number: " + result);
    }
}
