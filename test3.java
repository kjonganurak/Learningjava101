import java.util.Arrays;

public class test3 {
    public static void main(String[] args) { 
        int[] input = new int[args.length];
        for(int i = 0 ; i < args.length ; i++){
            input[i] = Integer.parseInt(args[i]);
        }
        int[] a = new int[input[0]];
        int[] a2 = new int[input[0]];
        for(int i = 1 ; i < (input[0]+1) ; i++){
            a[i-1] = input[i];
            a2[i-1] = input[input[0]+i];
        }
        for(int i = 0 ; i< a.length ; i++){
            System.out.println(a[i]);
        }
        for(int i = 0 ; i< a2.length ; i++){
            System.out.println(a2[i]);
        } 
            if(Arrays.equals(a, a2)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        
    }
}
