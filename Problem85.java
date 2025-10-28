public class Problem85 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 3, 7, 5};
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                count++;
            }
        }

        System.out.println("Number of distinct elements: " + count);
    }
}
