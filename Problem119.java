public class Problem119 {
    public static void main(String[] args) {
        String str = "java is fun";
        String[] words = str.split(" ");
        String result = "";
        for (String w : words) {
            if (w.length() > 1){
                result += Character.toUpperCase(w.charAt(0)) +
                          w.substring(1, w.length()-1) +
                          Character.toUpperCase(w.charAt(w.length()-1)) + " ";
            }
            else{
                result += Character.toUpperCase(w.charAt(0)) + " ";
            }
        }
        System.out.println(result.trim());
    }
}
