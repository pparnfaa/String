package String;

import java.util.Scanner;

public class CharCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String code = scan.next();
        int pos = code.charAt(0);
        System.out.println(pos);
    }
}
