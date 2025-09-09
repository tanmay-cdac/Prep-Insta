public class Problem37 {
    public static void main(String[] args) {
        int decimal = 419;
        String hex = "";
        int temp = decimal;
        while(temp > 0) {
            int rem = temp % 16;
            if(rem < 10) {
                hex = rem + hex;
            }    
            else {
                hex = (char)('A' + rem - 10) + hex;
            }
            temp /= 16;
        }
        System.out.println(hex);
    }
}
