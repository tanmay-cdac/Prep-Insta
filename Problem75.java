public class Problem75 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
    }
}
