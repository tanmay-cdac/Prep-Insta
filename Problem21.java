public class Problem21 {
    public static void main(String[] args) {
        int num = 28;
        int temp = num;

        for(int i = 2; i <= temp; i++) {
            while(temp % i == 0) {
                System.out.print(i + " ");
                temp = temp / i;
            }
        }
    }
}
