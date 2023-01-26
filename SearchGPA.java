package Extra;

import java.util.Arrays;
import java.util.Scanner;

public class SearchGPA {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the value : ");
        double gpa = sc.nextDouble();
        Double[] a = new Double[] {3.7, 3.4, 3.6, 3.9, 3.5};
        System.out.println("Given GPAs are "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted GPAs are "+ Arrays.toString(a));
        // วิธี 1
        /*boolean found = false;
        for (double n : a) {
            if (n == gpa) {
                found = true;
                break;
            }
        }
        if(found)
        System.out.println(gpa + " is found.");
        else
        System.out.println(gpa + " is not found.");
        sc.close();*/
        // วิธี 2
        int find = Arrays.binarySearch(a , gpa);
        if(find > 0){
            System.out.println(gpa + " is found.");
        }else{
            System.out.println(gpa + " is not found.");
        }
        sc.close();
    }
}