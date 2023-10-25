import java.util.Scanner;
public class MatrixWorld {
    public static boolean areCollinear(int[] x , int[] y) {
        return (y[0] - y[1]) * (x[0] - x[2]) == (y[0] - y[2]) * (x[0] - x[1]);
    }
    public static void main(String[] args) {
        int[] x = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt();
        }
        int[] y = new int[3];
        for (int i = 0; i < x.length; i++) {
            y[i] = input.nextInt();
        }

        if (areCollinear(x, y)) {
            System.out.println("Escape");
        }
        else {
            System.out.println("Stay");
        }
    }
}
