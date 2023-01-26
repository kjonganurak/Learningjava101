import java.util.Arrays;

public class SimpleArrayComparator {
    public static void main(String[] args) {
        int[] args_int = new int[args.length];
        for (int i = 0;i < args.length; i++) {
            args_int[i] = Integer.parseInt(args[i]);
        }

        int[] arrayFirst = new int[args_int[0]];
        int[] arraySecond = new int[args_int[0]];

        for (int i = 0; i < args_int[0]; i++) {
            arrayFirst[i] = args_int[ i + 1];
            arraySecond[i] = args_int[ (i + 1)+ args_int[0] ];

        }
        System.out.println("Array 1 is " + Arrays.toString(arrayFirst));
        System.out.println("Array 2 is " + Arrays.toString(arraySecond));
        Arrays.sort(arrayFirst);
        Arrays.sort(arraySecond);
        System.out.println("Sorted array1 is ");
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println("Sorted array2 is ");
        System.out.println(Arrays.toString(arraySecond));
        //System.out.println(Arrays.toString(args_int));
        if (Arrays.equals(arrayFirst,arraySecond)) {
            System.out.println(Arrays.toString(arrayFirst) + " is equal to " + Arrays.toString(arraySecond));
        } else {
            System.out.println(Arrays.toString(arrayFirst) + " is not equal to " + Arrays.toString(arraySecond));
        }
    }
}
