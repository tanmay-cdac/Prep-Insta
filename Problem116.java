public class Problem116 {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != ' ') result += c;
        }
        System.out.println("Without spaces: " + result);
    }
}
