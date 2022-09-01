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

        //int[] vetor = {7,9,0,10,4,5,8,9,4,10,5,7};

        //Vida vida = new Vida();

        //System.out.println(vida.viver(vetor));

        //Relogio relogio = new Relogio();

        //System.out.print(relogio.hora(125));

        //String a = "alisson";
        // char[] chars = a.toCharArray();

        //int tamanho = chars.length;
        //String bigString = "Eu gostei do filme, atuar em filme foi ótimo!";

        //int t = bigString.length();

        //System.out.println(t);


        //  String bigString = "I liked the movie, acting in movie was great!";

        //char[] palavra = bigString.toCharArray();

        //int a = palavra.length;

        //System.out.print(palavra[12]);

        String frase = "Eu gostei do filme, atuar em filme foi ótimo!";
        String palavra = "filme";

        //String frase = "Hoje o sol está forte, sol";
        //String palavra = "sol";

        /*System.out.println(texto.toLowerCase().contains(procurarPor.toLowerCase()));
        int i = texto.toLowerCase().indexOf(procurarPor.toLowerCase());

        System.out.print(i);
        char[] letra = texto.toCharArray();

        System.out.print(letra[7]);*/

        PesquisaTudo pt = new PesquisaTudo();


        //pt.buscar(frase, palavra);

        ConcatenaInteiros ci = new ConcatenaInteiros();

        int[] array = new int[]{ 10,11,20,30,3 };

        System.out.println(ci.concatena(array));
      // ci.maiorAbs(array);

      //  ci.concatena(array);

        //ci.ordenaV(array);





       // for(int a = 0; a < frase.length(); a++){
         //   System.out.println(frase[a]);
        //}



    }
}