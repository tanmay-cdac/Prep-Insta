import java.util.Arrays;

public class Problem127 {
    static void permute(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(new String(str));
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(str, l, i);
            permute(str, l + 1, r);
            swap(str, l, i);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "CAB";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        permute(chars, 0, chars.length - 1);
    }
}
