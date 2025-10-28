public class Problem89 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 1};
        int n = a.length;
        
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(a[i] > a[j]) {
                    int t = a[i]; a[i] = a[j]; a[j] = t;
                }
            }
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(b[i] < b[j]) {
                    int t = b[i]; b[i] = b[j]; b[j] = t;
                }
            }
        }

        int product = 0;
        for(int i = 0; i < n; i++) {
            product += a[i] * b[i];
        }

        System.out.println("Minimum Scalar Product: " + product);
    }
}
