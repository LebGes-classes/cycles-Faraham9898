import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int x = -9;
        while (x >= -9 && x <= 9) {
            double g = chetY(x);
            System.out.println(g);
            x++;
        }
    }
    public static double chetY(int x){
        double y = 0;
        if (x <= -6) {
            y = -Math.sqrt(9 - Math.pow((x + 6), 2));
        }
        if (x > -6 && x <= -3) {
            y = x + 3;
        }
        if (x > -3 && x <= 0) {
            y = Math.sqrt(9 - Math.pow((x), 2));
        }
        if (x > 0 && x <= 3) {
            y = -x + 3;
        }
        if (x > 3 && x <= 9){
            y = x * 0.5 - 3 * 0.5;
        }
        return y;
    }
}
