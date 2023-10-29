import java.util.Arrays;
import java.util.Scanner;
public class ParisStreets {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numBuild = input.nextInt();
        int[] height = new int[numBuild];
        for (int i = 0; i < height.length; i++){
            height[i] = input.nextInt();
        }
        int[] smaller = new int[height.length];
        boolean foundSmaller = false;
        for (int i = height.length - 1; i >= 0; i--) {
            foundSmaller = false;
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] < height[i]) {
                    smaller[i] = j + 1;
                    foundSmaller = true;
                    break;
                }

            }
            if (!foundSmaller) {
                smaller[i] = 0;
            }
        }
        for (int d: smaller) {
            System.out.print(d + " ");
        }
    }
}









