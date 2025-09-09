public class Problem09 {
    public static void main(String[] args) {
        int num = 13, flag = 0;
        if(num <= 1) {
            flag = 1;
        } 
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0) {
                flag = 1;
            }
        } 
        System.out.println(flag == 0 ? "Prime" : "Not Prime");
    }
}
