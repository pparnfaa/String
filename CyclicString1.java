package String;

import java.util.Scanner;

public class CyclicString1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        int num = scan.nextInt();
        int count_num = 0;
        String count = "";
        for (int i = 0; i < num; i++) {
            if (count_num == text.length()) {
                count_num = 0;
            }
            count += text.charAt(count_num);
            count_num++;
        }
        System.out.print(count);
    }
}
