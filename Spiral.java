import java.util.Scanner;
public class Spiral {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num < 3){
            System.out.println(1);
            System.exit(0);
        }
        int a = 2,counter = 0, sum = 1;
        for (int i = 3; i <= Math.pow(num, 2); i+= a) {
            sum += i;
            counter ++;
            if (counter % 4 == 0) {
                a += 2;
            }
        }
        System.out.println(sum);
    }
}
