public class Problem88 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 3, 7, 20};
        int n = arr.length;
        int[] unique = new int[n];
        int size = 0;

        for(int i = 0; i < n; i++) {
            boolean found = false;
            for(int j = 0; j < size; j++) {
                if(arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                unique[size] = arr[i];
                size++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < size; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
