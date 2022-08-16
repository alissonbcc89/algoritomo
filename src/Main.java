import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //fizzBuzz.fb(16);
       int[] array;
        array = new int[]{- 1,2,3,4,-2,6,-8,3};

       //System.out.print((array[0]+1)  );

        SubArray subs = new SubArray();
        //System.out.println(subs.maxSubArray(array));

        int[] array1 = new int[]{23,5,10,17,30};
        int[] array2 = new int[]{26,134,135,14,19};

        //int n = array1.length;
        //System.out.println(n);

        //System.out.print
        //subs.minDiffer(array1,array2);

        //ArrayList<Integer> lista = subs.minDiffer(array1,array2);


        // List listInClassA = m1.myNumbers();
        //System.out.println("The List is "+listInClassA);

        //List listaInClass = subs.minDiffer(array1,array2);
        //System.out.println(listaInClass);
        subs.minDiffer(array1,array2);


        //System.out.print(subs.minDiffer(array1,array2));

      //  int minValor = Collections.min(array1);

      // System.out.println();

        /*for(int i = 0; i < array.length; i++){

        }*/
    }
}