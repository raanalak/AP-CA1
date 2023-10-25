import java.util.Scanner;
public class NaughtyStudent {
    public static void main(String[] args){
        int stuNum;
        Scanner input = new Scanner(System.in);
        stuNum = input.nextInt();
        int[] height = new int[stuNum];
        for (int i = 0; i < height.length;i++){
            height[i] = input.nextInt();
        }
        int counter = 0;
        int courentMax = height[0];
        for (int i = 1; i < height.length; i++){
            if (height[i] < courentMax) {
                counter++;
            }
            else {
                courentMax = height[i];
            }
        }
        System.out.println(counter);
    }
}
