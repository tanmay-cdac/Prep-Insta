public class Problem10 {
    public static void main(String[] args) {
        int start = 10, end = 20;
        for(int num = start; num <= end; num++) {
            boolean prime = true;
            if(num <= 1) {
                prime = false;
            }
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    prime = false;
                }   
            }
            if(prime) {
                    System.out.print(num + " ");
            }
        }
    }
}