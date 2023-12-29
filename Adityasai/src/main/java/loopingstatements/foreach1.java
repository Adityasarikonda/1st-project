package loopingstatements;

public class foreach1 {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {2,3,4},
                {4,5,6}
        };
        int sum = 0;
        int noofelements = 0;
        for (int[] singledimarr:arr) {
            for(int value : singledimarr ){
                sum+=value;
                noofelements++;
               /* System.out.println(value);*/

            }
               System.out.println(sum);
            System.out.println(sum/noofelements);
        }
    }
}
