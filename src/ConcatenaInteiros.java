import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConcatenaInteiros {

    private static int cont=0;
    private static int[] p;
    public void permuta(int[] vet) {
        p = new int[vet.length];
        permuta(vet,0);
    }

    private static void permuta(int[]vet, int valor) {
        if (valor==vet.length) {
            //cont++;
           // imprime();


        } else {

            for (int i = 0; i < vet.length; i++) {

                boolean achou = false;

                for (int j = 0; j < valor; j++) {

                    if (p[j]==vet[i]) achou = true;
                }

                if (!achou) {

                    p[valor] = vet[i];
                    permuta(vet,valor+1);
                }

            } //--for

        } //--if/else


    }
    private static void imprime() {

        System.out.println();
        System.out.print("(" + cont + ") : ");
      //  for (int i=0; i < p.length; i++) {concatena(p);}
        for(int i = 0; i < p.length; i++){ maiorAbs(p);}


        System.out.print(p[0]);
        // System.out.println(maiorAbs(p));

        //System.out.println(maiorAbs(p));

    } //--imprime

    public static int concatena(int[] vetor){
        ArrayList<Integer> array = new ArrayList<>();
        String concat = "";
        int tamanho = vetor.length;
        for(int i = 0;i < tamanho; i++){
            concat += vetor[i];
        }

        int a = Integer.valueOf(concat);
        return  a;
    }

    public static int maiorAbs(int[] arr){

        // Create maxValue variable and initialize with 0
        int maxValue = 0;

        // Check maximum element using for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue)
                maxValue = arr[i];
        }
        return maxValue;
    }



}
