package loopingstatements;

public class singledimarr {
    public static void main(String[] args) {
        int[]j = new int[5];
        j[0]=2;
        j[1]=3;
        j[2]=4;
        j[3]=5;
        j[4]=9;

        System.out.println(j[1]);
        for(int i=0; i<j.length; i++){
            System.out.println(j[i]);
          }
      /*  int i=0;
        while(i<j.length){
            System.out.println(j[i]);
            i++;*/
       // }
    }
}
// this is when we dont know values. if we know values we can give like this

   /*   int[]j = {2,3,4,5,6,};

       int[]j = new int[]{2,3,4,5,6,}; // can do like this also.

        int[]j;
        j= new int[]{2,3,4,5,6,};// even like this.
*/