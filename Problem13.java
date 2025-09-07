public class Problem13 {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;

        while(temp != 0) {
            int digit = temp % 10;
            rev = rev * 10;
            rev = rev + digit;
            temp = temp / 10;
        }

        if(num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
