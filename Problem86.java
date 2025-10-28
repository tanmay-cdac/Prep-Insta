public class Problem86 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 3, 7, 5};
        int n = arr.length;
        boolean[] printed = new boolean[n];

        System.out.print("Repeating elements: ");
        for(int i = 0; i < n; i++) {
            if(printed[i]) continue;
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count > 1) {
                System.out.print(arr[i] + " ");
                printed[i] = true;
            }
        }
    }
}
