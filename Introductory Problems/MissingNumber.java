import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] != i) {
                System.out.print(i);
                break;

            }
            if (i == n - 1)
                System.out.print(i + 1);

        }

    }

}