public class Problem19 {
    public static void main(String[] args) {
        int base = 2, exp = 3, result = 1;
        for(int i = 1; i <= exp; i++) {
             result *= base;
        }
        System.out.println(result);
    }
}
