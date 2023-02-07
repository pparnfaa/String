package String;

import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str_2 = scan.nextLine();
        int j = -2;
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(str_2, i);
            if (index != j && index != -1) {
                j = index;
                System.out.print((index + 1) + " ");
                check = true;
            }
        }
        if (check == false) {
            System.out.println("string not found");
        }
    }
}
