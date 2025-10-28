public class Problem113 {
    public static void main(String[] args) {
        String str = "madam";
        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++; 
            j--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
