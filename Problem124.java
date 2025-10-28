public class Problem124 {
    public static void main(String[] args) {
        String str = "java is fun, java is powerful";
        String oldWord = "java";
        String newWord = "python";
        String[] words = str.split(" ");
        String result = "";
        for (String w : words) {
            if (w.equals(oldWord)) {
                result += newWord + " ";
            }
            else {
                result += w + " ";
            }
        }
        System.out.println(result.trim());
    }
}
