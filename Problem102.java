public class Problem102 {
    static void swap(int[] arr, int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    static void leftRotate(int[] arr, int d, int n) {
        if (d == 0 || d == n) return;

        if (d < n - d) {
            swap(arr, 0, n - d, d);
            leftRotate(arr, d, n - d);
        } else if (d > n - d) {
            swap(arr, 0, d, n - d);
            leftRotate(arr, 2 * d - n, d);
        } else {
            swap(arr, 0, n - d, d);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        leftRotate(arr, d, arr.length);
        for (int x : arr) 
        {
            System.out.print(x + " ");
        }
    }
}
