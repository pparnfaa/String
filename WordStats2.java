package String;

import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[10000];
        int max = 0;
        int min = 999999;
        for (int i = 0; i < n + 1; i++) {
            String text = scan.nextLine();
            for (int j = (int) 'A'; j < (int) 'Z' + 1; j++) {
                for (int k = 0; k < text.length(); k++) {
                    if ((int) text.charAt(0) == j) {
                        arr[j]++;
                        break;
                    }

                }
            }
        }

    }
}
