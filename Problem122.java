public class Problem122 {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int[] freq = new int[256];
        for (char c : s1.toCharArray()) {
            freq[c]++;
        }
        for (char c : s2.toCharArray()) {
            freq[c]--;
        }
        for (int i : freq) {
            if (i != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
