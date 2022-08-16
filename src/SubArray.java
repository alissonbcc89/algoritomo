import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SubArray {

    public int maxSubArray(int[] vetor) {
        int n = vetor.length;
        int soma = 0;
        ArrayList<Integer> somas = new ArrayList<Integer>();


        for (int i = 0; i < n; i++) {
            soma += vetor[i];

            if (soma < 0) {
                soma = 0;
            } else {
                somas.add(soma);
            }

        }
        int maxValor = Collections.max(somas);
        return maxValor;

    }

    public void minDiffer(int[] vetor1, int[] vetor2)
    {

        int n1,n2,n3;
        int t1 = vetor1.length;
        int t2 = vetor2.length;
        ArrayList<Integer> aux = new ArrayList<>();
        int soma = 0;

        for(int i = 0; i < t1; i++){
            System.out.print("Entrada:" + i);
            for (int j = 0; j < t2; j++) {

                System.out.print("\nEntrada: " + j);

                System.out.print("\nConjunto numerico :" + vetor1[i]);
                System.out.print("\tConjunto numerico : " + vetor2[j]);
                System.out.print("\nSoma : " + Math.abs(vetor1[i]+vetor2[j]));
                soma = 0;
                //n1 =  Math.abs((vetor1[i] - vetor2[j])  ;
                //adicao = vetor1[i] + vetor[j];
                soma = Math.abs(vetor1[i] - vetor2[j]);
                aux.add(vetor1[i]);
                aux.add(vetor2[j]);
                aux.add(soma);

            }
        }

        ArrayList<Integer> arr = new ArrayList<>();


        int minList = Collections.min(aux);



        for(int i = 2; i < aux.size(); i+=3){
            if( aux.get(i).equals(minList) ){
                System.out.print("\nConjunto primeiro par : " + aux.get(i-2));
                System.out.print("\tConjunto primeiro par : " + aux.get(i-1));
                arr.add(aux.get(i-2));
                arr.add(aux.get(i-1));
            }
        }

       // maiorSoma.t

        //System.out.print(arr);
    }

}