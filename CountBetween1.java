package String;

import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = scan.nextInt();
        }
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 1; i < n + 1; i++) {
            if (arr[i] >= x1 && arr[i] <= x2) {
                count1++;
            } else if (arr[i] >= y1 && arr[i] <= y2) {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
