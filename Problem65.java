public class Problem65 {
    static void subsetSums(int[] arr, int n, int index, int sum) {
        if (index == n) {
            System.out.print(sum + " ");
            return;
        }
        subsetSums(arr, n, index + 1, sum + arr[index]);
        subsetSums(arr, n, index + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsetSums(arr, arr.length, 0, 0);
    }
}
