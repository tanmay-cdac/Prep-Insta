public class Problem27 {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum = sum + i;
            } 
        }

        if(sum > num) {
            System.out.println("Abundant Number");
        }    
        else {
            System.out.println("Not Abundant Number");
        }    
    }
}
