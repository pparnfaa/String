package String;

import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int count = 0;
        for (;;) {
            String str = scan.nextLine();
            if (str.length() == 0) {
                break;
            }
            if (str.length() > max) {
                max = str.length();
                count = 0;
            }
            if (str.length() == max) {
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
