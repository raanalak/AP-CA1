import java.util.Scanner;

public class MinimumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minSum = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }
        System.out.println(minIndex + 1);
    }
}

