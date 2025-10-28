public class Problem82 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 3, 7, 5};
        int n = arr.length;
        boolean[] counted = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(counted[i]) {
                continue;
            }
            int freq = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    freq++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + freq + " times");
        }
    }
}
