package loopingstatements;

import java.util.Arrays;
import java.util.Scanner;

public class singledimarr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arrsize = scanner.nextInt();
         int[] arr = new int[arrsize];
         System.out.println("enter tha array values");
         for (int i=0; i<arrsize;i++){
             arr[i]= scanner.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         int largestnumber = arr[0];
         int largestnumberindex = 0;
         for(int i=0; i<arr.length;i++){
             if(largestnumber<arr[i]) {
                 largestnumber = arr[i];
                 largestnumberindex = i;
             }
         }
         System.out.println(largestnumber);
         System.out.println(largestnumberindex);
         scanner.close();
    }
}
