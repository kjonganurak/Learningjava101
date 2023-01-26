import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char ch;
        String inpuString;
      boolean charBoolean = true;
      Scanner sc = new Scanner(System.in);
      inpuString = sc.nextLine();
        for ( int i = 0;  i < inpuString.length();  i++ ) {
            ch = inpuString.charAt(i);
            if ( Character.isLetter(ch) ) {
               System.out.print(ch);
               charBoolean = false;
            }
            else {
               if ( charBoolean == false ) {
                  System.out.println();
                  charBoolean = true;
               }
            }
         }
    }
}