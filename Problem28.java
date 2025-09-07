public class Problem28 {
    public static void main(String[] args) {
        int a = 6, b = 28;
        int sumA = 0, sumB = 0;

        for(int i = 1; i < a; i++) {
            if(a % i == 0) sumA += i;
        }

        for(int i = 1; i < b; i++) {
            if(b % i == 0) sumB += i;
        }

        double ratioA = (double)sumA / a;
        double ratioB = (double)sumB / b;

        if(ratioA == ratioB) {
            System.out.println("Yes, they are a Friendly Pair");
        }
        else {
            System.out.println("Not a Friendly Pair");
        }
    }
}
