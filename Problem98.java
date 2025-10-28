public class Problem98 {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};

        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n];
        int index = 0;
        boolean[] used = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[j] == arr2[i] && !used[j]) {
                    result[index++] = arr1[j];
                    used[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                result[index++] = arr1[i];
            }
        }

        for (int i = m; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
