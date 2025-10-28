public class Problem62 {
    static int length(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + length(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "Tanmay";
        System.out.println("Length of \"" + s + "\" = " + length(s));
    }
}
