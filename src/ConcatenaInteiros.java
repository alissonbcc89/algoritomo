import java.lang.reflect.Array;
/*import java.util.ArrayList;

public class ConcatenaInteiros {

    public void ordenaV(int[] num){
        ArrayList<Integer> array = new ArrayList<>();
        int aux,numerica;
        String concat = "";
        int tamanho = num.length;
               // int indice;
        int c = concatena(num);
        array.add(c);
        int index;

        for(int i = 0; i < tamanho; i++){
            if(i == 0){
                for(int j = 1; j < tamanho; j++){

                    aux = num[j+1];
                    num[j+1] = num[j];
                    num[j] = aux;
                    int a = concatena(num);
                    array.add(a);
                    break;
                }
            }
            else {
                for (int j = 1; j < tamanho; j++) {

                    aux = num[i];
                    num[i] = num[j+1];
                    num[j] = aux;
                    int a = concatena(num);
                    array.add(a);
                }
            }

        }

        System.out.println(array+"\n");


        int a = maiorAbs(array);

        System.out.println(a);

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

        // Create maxValue variable and initialize with 0
        int maxValue = 0;

        // Check maximum element using for loop
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxValue)
                maxValue = arr.get(i);
        }
        return maxValue;
    }

    public void permuta(int[] vetor){
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i = 0; i < vetor.length; i++){

        }
    }

}
*/