public class Problem15 {
    public static void main(String[] args) {
        int start = 100, end = 999;
        for(int num = start; num <= end; num++) {
            int sum = 0, temp = num;
            while(temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if(sum == num) {
                System.out.print(num + " ");
            }    
        }
    }
}
