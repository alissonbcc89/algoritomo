import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConcatenaInteiros {

    public void ordenaV(int[] num){
        ArrayList<Integer> array = new ArrayList<>();
        int indice,numerica;
        String concat = "";
        int tamanho = num.length;
        //int indice = 0;

        for(int i = 0; i < tamanho; i++){

            for(int j = 1; j < tamanho; j++){
                indice = num[i];
                num[i] = num[j];
                num[j] = indice;
                int a = concatena(num);
                array.add(a);

            }

        }

        System.out.println(array);

    }

    public int concatena(int[] vetor){
        ArrayList<Integer> array = new ArrayList<>();
        String concat = "";
        int tamanho = vetor.length;
        for(int i = 0;i < tamanho; i++){
            concat += vetor[i];
        }

        //array.add(Integer.valueOf(concat));
        //System.out.println(array);
        int a = Integer.valueOf(concat);
        return  a;
    }

}
