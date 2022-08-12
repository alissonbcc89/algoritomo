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
            }
            else
            {
                somas.add(soma);
            }

        }
        int maxValor = Collections.max(somas);
        return maxValor;

    }
}