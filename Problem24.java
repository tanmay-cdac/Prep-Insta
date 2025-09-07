public class Problem24 {
    public static void main(String[] args) {
        int num = 16;
        boolean isPerfect = false;

        for(int i = 1; i <= num; i++) {
            if(i * i == num) {
                isPerfect = true;
                break;
            }
        }

        if(isPerfect) {
            System.out.println("Perfect Square");
        }    
        else {
            System.out.println("Not Perfect Square");
        }    
    }
}
