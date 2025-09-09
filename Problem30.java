public class Problem30 {
    public static void main(String[] args) {
        int a = 60, b = 48;
        int lcm = (a * b);
        for(int i = 1; i <= lcm; i++) {
            if(i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
