package String;

import java.util.Scanner;

public class LongestString3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String longestStr = " ";
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            String str = scan.nextLine();
            if (str.length() >= max) {
                max = str.length();
                longestStr = str;
            }
        }
        System.out.println(longestStr);
    }
}
