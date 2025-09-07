public class Problem26 {
    public static void main(String[] args) {
        int num = 18;
        int temp = num;
        int sum = 0;

        while(temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if(num % sum == 0) {
            System.out.println("Harshad Number");
        }    
        else {
            System.out.println("Not Harshad Number");
        }
    }
}
