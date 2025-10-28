public class Problem80 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 7, 5, 10, 2};
        int n = arr.length;

        for(int i = 0; i < n/2; i++) {
            for(int j = i+1; j < n/2; j++) {
                if(arr[i] > arr[j]) {
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }

        for(int i = n/2; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }

        System.out.print("Modified array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
