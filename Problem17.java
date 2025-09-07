public class Problem17 {
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1, term = 0;
        if(n == 1) term = a;
        else if(n == 2) term = b;
        else {
            for(int i = 3; i <= n; i++) {
                term = a + b;
                a = b;
                b = term;
            }
        }
        System.out.println(term);
    }
}
