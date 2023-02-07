package String;

import java.util.Scanner;

public class CardPair1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        for (int i = 0; i < 5; i++) {
            int min = 9999999;
            String text = scan.next();
            for (int j = 0; j < 2; j++) {
                if ((int) text.charAt(j) < min) {
                    min = (int) text.charAt(j);
                }
            }
            int min2 = 9999999;
            String text2 = scan.next();
            for (int j = 0; j < 2; j++) {
                if ((int) text2.charAt(j) < min2) {
                    min2 = (int) text2.charAt(j);
                }
            }
            if (min < min2) {
                answer += 'W';
            } else if (min > min2) {
                answer += 'L';
            } else {
                answer += 'D';
            }
        }
        System.out.println(answer);
    }
}
