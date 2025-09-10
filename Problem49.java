public class Problem49 {
    public static void main(String[] args) {
        int num = 1234567;  
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println("Number of digits: " + count);
    }
}
