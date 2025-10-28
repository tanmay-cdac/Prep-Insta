public class Problem109 {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println("Length: " + length);
    }
}
