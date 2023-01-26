import java.util.*;

public class Letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLease input word : ");
        String words = scanner.nextLine();
        String[] wordNum = words.split(" ");
        for (int i = 0; i < wordNum.length; i++) {
            for (int j = 0; j < wordNum[i].length(); j++) {
                char lastCH = wordNum[i].charAt(wordNum[i].length() - 1);
                char firstCH = wordNum[i].charAt(0);
                char ch = wordNum[i].charAt(j);
                if (Character.isLetter(ch)) {
                    System.out.print(ch);
                    if (ch == lastCH) {
                        System.out.println();
                    }
                } else {
                    if (ch != lastCH) {
                        if (ch == firstCH) {
                            continue;
                        } else {
                            if (i == wordNum.length - 1 ) {
                                break;
                            }
                            System.out.println();
                        }

                    } else {
                        if ( i == wordNum.length - 1) {
                            break;
                        }
                        System.out.println();
                    }
                }
            }
        }
        scanner.close();
    }
}
