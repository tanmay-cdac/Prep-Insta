public class Problem100 {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int n = arr.length;
        int totalSum = 0, leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                System.out.println("Equilibrium index: " + i);
                return;
            }
            leftSum += arr[i];
        }
        System.out.println("No equilibrium index found");
    }
}
