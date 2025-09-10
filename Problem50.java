public class Problem50 {
    static String[] ones = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void main(String[] args) {
        int num = 507;  
        String str = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            result.append(ones[digit]).append(" ");
        }

        System.out.println("In words: " + result.toString().trim());
    }
}
