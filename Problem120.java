public class Problem120 {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256]; 
        for (char c : str.toCharArray()) freq[c]++;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0){
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}
