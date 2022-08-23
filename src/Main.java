import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  FizzBuzz fizzBuzz = new FizzBuzz();
       // fizzBuzz.fb(5);
      // int[] array;
        //array = new int[]{- 1,2,3,4,-2,6,-8,3};

       //System.out.print((array[0]+1)  );

       // SubArray subs = new SubArray();
        //System.out.println(subs.maxSubArray(array));

       // int[] array1 = new int[]{23,5,10,17,30};
        //int[] array2 = new int[]{26,134, 135, 14, 19};


       // subs.minDiffer(array1,array2);

        /*for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }*/
       /* ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i <=100; i++)
        {
            if(i % 5 == 0 && i%2 == 0){
                array.add(i);
            }

        }
        System.out.print(array);*/

        Date data = new Date();
        //System.out.println("Data Agora: "+data);


       // Calendar c = Calendar.getInstance();

        //int hora = c.get(Calendar.HOUR_OF_DAY);

        //System.out.println(hora);

        //System.out.println("\nData/Hora atual: "+c.getTime());

        int[] vetor = {7,9,0,10,4,5,8,9,4,10,5,7};

        Vida vida = new Vida();

        System.out.println(vida.viver(vetor));


    }
}