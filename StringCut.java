package String;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str_2 = scan.nextLine();
        String want = "";
        int count = 0;
        int count_sp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str_2.charAt(0)) {
                System.out.println(want);
                want = "";
                count_sp++;
            } else if (str.charAt(i) != str_2.charAt(0)) {
                want += str.charAt(i);
                count++;
            }
            if (i == str.length() - 1 && count != str.length()) {
                System.out.println(want);
            }
        }
        if (count == str.length()) {
            System.out.println("no target character found");
        }
    }
}
