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
        System.out.println(subs.maxSubArray(array));

        /*for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }*/
    }
}