public class Problem14 {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        while(temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
    }
}
