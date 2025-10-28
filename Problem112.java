public class Problem112 {
    public static void main(String[] args) {
        String str = "Beautiful Day";
        String result = "";
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1) result += c;
        }
        System.out.println("Without vowels: " + result);
    }
}
