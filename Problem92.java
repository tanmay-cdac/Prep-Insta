public class Problem92 {
    public static void main(String[] args) {
        int[][] arr = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println("Symmetric Pair: (" + arr[i][0] + ", " + arr[i][1] + ")");
                }
            }
        }
    }
}
