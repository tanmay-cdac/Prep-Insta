public class Problem78 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}
