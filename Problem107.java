public class Problem107 {
    public static void main(String[] args) {
        char ch = '#';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is NOT an Alphabet");
        }
    }
}
