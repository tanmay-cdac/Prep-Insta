public class Problem101 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;

        System.out.print("Left Rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + k) % n] + " ");
        }
        System.out.println();

        System.out.print("Right Rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i - k + n) % n] + " ");
        }
    }
}
