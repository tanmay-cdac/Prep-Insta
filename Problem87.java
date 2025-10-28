public class Problem87 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 3, 7, 20};
        int n = arr.length;

        System.out.print("Non-repeating elements: ");
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
