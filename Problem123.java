public class Problem123 {
    public static void main(String[] args) {
        String str = "hello world";
        String oldSub = "world";
        String newSub = "java";
        String result = "";
        
        for (int i = 0; i <= str.length()-oldSub.length(); i++) {
            if (str.substring(i, i+oldSub.length()).equals(oldSub)) {
                result += newSub;
                i += oldSub.length()-1;
            } 
            else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
