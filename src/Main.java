import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
       // fizzBuzz.fb(5);
       int[] array;
        array = new int[]{- 1,2,3,4,-2,6,-8,3};

       //System.out.print((array[0]+1)  );

        SubArray subs = new SubArray();
        //System.out.println(subs.maxSubArray(array));

        int[] array1 = new int[]{23,5,10,17,30};
        int[] array2 = new int[]{26,134, 135, 14, 19};


        subs.minDiffer(array1,array2);

        /*for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }*/
    }
}