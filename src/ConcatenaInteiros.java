import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConcatenaInteiros {

    public void ordenaV(int[] num){
        ArrayList<Integer> array = new ArrayList<>();
        int indice,numerica;
        String concat = "";
        int tamanho = num.length;
        //int indice = 0;
                int c = concatena(num);
                array.add(c);
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

        int a = Integer.valueOf(concat);
        return  a;
    }
    public int maiorAbs(ArrayList<Integer> arr){
        int indice;
        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i) < arr.get(i+1)) {
                indice = arr.get(i);
                arr.set(i,arr.get(i+1));
                arr.set(i+1,indice);
            }
        }
    }
}
