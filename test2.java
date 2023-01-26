import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int i = 0;
        char ch;
        String inpuString;
        boolean charBoolean = true;
        Scanner sc = new Scanner(System.in);
        inpuString = sc.nextLine();
        int inpuStringLength = inpuString.length();
        while (i < inpuStringLength) {
            ch = inpuString.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A'
                    && ch <= 'Z')) {
                System.out.print(ch);
                charBoolean = false;

            } else {
                if (charBoolean == false) {
                    System.out.println();
                    charBoolean = true;
                }
            }
            i++;
        }
    }
}
