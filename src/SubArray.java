import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


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

    public int[] minDiffer(int[] vetor1, int[] vetor2)
    {
        int diferenca = 0;
        int n = vetor1.length;
        int m = vetor2.length;
        ArrayList<Integer> array = new ArrayList<>();


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                diferenca =  Math.abs((vetor1[i] - vetor2[j]));
                array.add(vetor1[i]);
                array.add(vetor2[j]);
                array.add(diferenca);
            }
        }

        int minValor = Collections.min(array);
        int[] v = new int[2];

        for(int i = 0; i < array.size(); i++){
            if (minValor == array.get(i)){
                v[0] = array.get(i-2);
                v[1] = array.get(i-1);

            }
        }


        return v ;
    }
}