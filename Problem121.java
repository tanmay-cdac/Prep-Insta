public class Problem121 {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        System.out.print("Non-repeating: ");
        for (char c : str.toCharArray()) {
            if (freq[c] == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
