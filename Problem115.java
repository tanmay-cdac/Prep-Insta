public class Problem115 {
    public static void main(String[] args) {
        String str = "He110 W0rld!@#";
        String result = "";
        for (char c : str.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                result += c;
            }
        }
        System.out.println("Alphabets only: " + result);
    }
}
