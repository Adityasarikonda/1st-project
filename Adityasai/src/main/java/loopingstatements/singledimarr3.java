package loopingstatements;

import java.util.Arrays;
import java.util.Scanner;

public class singledimarr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arrsize = scanner.nextInt();
        boolean[] arr = new boolean[arrsize];
        System.out.println("enter tha array values");
        for (int i=0; i<arrsize;i++){
            arr[i]= scanner.nextBoolean();
        }
        System.out.println(Arrays.toString(arr));
        boolean[]revarr = new boolean[arr.length];
        for(int i = 0; i<arr.length;i++){
            revarr[arr.length-i -1] = arr[i];
        }
          System.out.println(Arrays.toString(revarr));
        scanner.close();
    }
}
