public class Problem99 {
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        int n = arr.length;
        int[] sorted = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            sorted[i] = arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == sorted[j]) {
                    rank[i] = j + 1;
                    break;
                }
            }
        }

        System.out.print("Array elements replaced by their rank: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
