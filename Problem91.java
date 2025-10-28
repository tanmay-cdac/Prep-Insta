public class Problem91 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3, 14, 9};
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
