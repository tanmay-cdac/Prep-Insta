public class Problem81 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
