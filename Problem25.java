public class Problem25 {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;
        int tempNum = num;
        boolean isAutomorphic = true;

        while(tempNum != 0) {
            int digitNum = tempNum % 10;
            int digitSquare = square % 10;

            if(digitNum != digitSquare) {
                isAutomorphic = false;
                break;
            }

            tempNum = tempNum / 10;
            square = square / 10;
        }

        if(isAutomorphic) {
            System.out.println("Automorphic");
        }    
        else {
            System.out.println("Not Automorphic");
        }    
    }
}
