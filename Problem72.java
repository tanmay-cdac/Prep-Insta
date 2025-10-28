public class Problem72 {
    static void subsets(int[] arr, int index, String curr) {
        if (index == arr.length) {
            System.out.println(curr.trim());
            return;
        }
        subsets(arr, index + 1, curr + arr[index] + " ");
        subsets(arr, index + 1, curr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsets(arr, 0, "");
    }
}
