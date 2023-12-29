package loopingstatements;

public class foreach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,5,3,6};
       /* for(int i= 0;i<arr.length;i++)
            System.out.println(arr[i]);*/
        int sum = 0;
        for(int value:arr)
        //    System.out.println(value);
            sum+=value;
            System.out.println(sum);
            System.out.println(sum/arr.length);
    }
}
