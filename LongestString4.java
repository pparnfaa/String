package String;

import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String longestStr = " ";
        int max = 0;
        for (;;) {
            String str = scan.nextLine();
            if (str.length() >= max) {
                max = str.length();
                longestStr = str;
            }
            if (str.length() == 0) {
                break;
            }
        }
        System.out.println(longestStr);
    }
}
