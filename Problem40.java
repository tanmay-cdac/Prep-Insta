public class Problem40 {
    public static void main(String[] args) {
        int x = -5, y = 7;  

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else if (x == 0 && y != 0) {
            System.out.println("On Y-axis");
        } else if (y == 0 && x != 0) {
            System.out.println("On X-axis");
        } else {
            System.out.println("Origin");
        }
    }
}
