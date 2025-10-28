public class Problem79 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        int n = arr.length;
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.print("Reversed array: ");
        for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
