public class Problem73 {
    static String removeDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String rest = removeDuplicates(s.substring(1));
        if (s.charAt(0) == rest.charAt(0)) {
            return rest;
        }
        return s.charAt(0) + rest;
    }

    public static void main(String[] args) {
        String s = "aabbccaad";
        System.out.println("After removing duplicates: " + removeDuplicates(s));
    }
}
