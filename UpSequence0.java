package String;

import java.util.Scanner;

public class UpSequence0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num + 1];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] >= arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }

    }
}
