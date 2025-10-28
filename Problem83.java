public class Problem83 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 3, 7, 5};
        int n = arr.length;
        int[] freq = new int[n];
        boolean[] counted = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(counted[i]) continue;
            int f = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    f++;
                    counted[j] = true;
                }
            }
            freq[i] = f;
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(freq[i] < freq[j]) {
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                    int f = freq[i]; freq[i] = freq[j]; freq[j] = f;
                }
            }
        }

        System.out.print("Array sorted by frequency: ");
        for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
