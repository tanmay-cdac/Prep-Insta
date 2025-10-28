public class Problem111 {
    public static void main(String[] args) {
        String str = "Hello Java";
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) count++;
        }
        System.out.println("Vowels: " + count);
    }
}
