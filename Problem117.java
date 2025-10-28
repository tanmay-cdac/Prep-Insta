public class Problem117 {
    public static void main(String[] args) {
        String expr = "(a+b)*(c-d)";
        String result = "";
        for (char c : expr.toCharArray()) {
            if (c != '(' && c != ')' && c != '{' && c != '}' && c != '[' && c != ']'){
                result += c;
            }
        }
        System.out.println("Without brackets: " + result);
    }
}
