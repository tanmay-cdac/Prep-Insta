public class Problem84 {
    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if(s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"abc", "level", "deed", "world"};
        String longest = "";

        for(int i = 0; i < arr.length; i++) {
            if(isPalindrome(arr[i]) && arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }

        System.out.println("Longest palindrome: " + longest);
    }
}
