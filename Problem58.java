public class Problem58 {
    static int smallest(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], smallest(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        System.out.println("Smallest element: " + smallest(arr, arr.length));
    }
}
