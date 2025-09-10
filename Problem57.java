public class Problem57 {
    static int largest(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], largest(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        System.out.println("Largest element: " + largest(arr, arr.length));
    }
}
