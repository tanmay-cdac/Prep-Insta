public class Problem105 {
    static boolean isBalanced(String expr) {
        char[] stack = new char[expr.length()];
        int top = -1;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } 

            else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) return false;
                char open = stack[top--];
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        String expr = "{[()]}";
        if (isBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
