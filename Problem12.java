public class Problem12 {
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;
        
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10;
            rev = rev + digit;
            num = num / 10;
        }
        
        System.out.println(rev);
    }
}
