package String;

import java.util.Scanner;

public class CardPair2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        for (int i = 0; i < 5; i++) {
            int min = 9999999;
            int min2 = 9999999;
            int min_eq = 0;
            int min_eq2 = 0;
            String text = scan.next();
            for (int j = 0; j < text.length(); j++) {
                if ((int) text.charAt(j) < min) {
                    min = (int) text.charAt(j);
                } else if ((int) text.charAt(j) == min) {
                    min_eq = (int) text.charAt(0);
                }
            }
            String text2 = scan.next();
            for (int j = 0; j < text2.length(); j++) {
                if ((int) text2.charAt(j) < min2) {
                    min2 = (int) text2.charAt(j);
                } else if ((int) text2.charAt(j) == min2) {
                    min_eq2 = (int) text2.charAt(0);
                }
            }
            if (min_eq > 0 && min_eq2 == 0) {
                answer += "W";
            } else if (min_eq2 > 0 && min_eq == 0) {
                answer += "L";
            } else if (min_eq == min_eq2 && min_eq != 0 && min_eq2 != 0) {
                answer += "D";
            } else if (min_eq < min_eq2) {
                answer += "W";
            } else if (min_eq > min_eq2) {
                answer += "L";
            } else if (min < min2) {
                answer += "W";
            } else if (min > min2) {
                answer += "L";
            } else if (min == min2) {
                answer += "D";
            }
        }
        System.out.println(answer);
    }
}
