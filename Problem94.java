public class Problem94 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        boolean disjoint = true;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    disjoint = false;
                    break;
                }
            }
        }

        if (disjoint) {
            System.out.println("Arrays are disjoint");
        } else {
            System.out.println("Arrays are not disjoint");
        }
    }
}
