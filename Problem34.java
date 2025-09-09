public class Problem34 {
    public static void main(String[] args) {
        String hex = "1A3";
        int decimal = 0, base = 1;
        for(int i = hex.length()-1; i >= 0; i--) {
            char c = hex.charAt(i);
            int val;
            if(c >= '0' && c <= '9') {
                val = c - '0';
            }    
            else {
                val = c - 'A' + 10;
            }    
            decimal += val * base;
            base *= 16;
        }
        System.out.println(decimal);
    }
}
