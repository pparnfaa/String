package String;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        if ((int) code >= (int) 'A' && (int) code <= (int) 'Z') {
            System.out.println((char) code);
        } else {
            System.out.println("unsupported code");
        }
    }
}
