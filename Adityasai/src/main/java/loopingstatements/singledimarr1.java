package loopingstatements;

import java.util.Arrays;
import java.util.Scanner;

public class singledimarr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arrsize = scanner.nextInt();
        int[] arr = new int[arrsize];
        System.out.println("please enter array values:");
        for(int i = 0; i<arrsize; i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("input:"+ Arrays.toString(arr));
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            sum+= arr[i];
        }
        System.out.println("output:"+sum/arr.length);


        scanner.close();
    }
}
