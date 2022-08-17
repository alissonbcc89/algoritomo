import java.util.ArrayList;

public class ProdutoMatriz {
    public void productoMatris(int[] vetor){
        int n = vetor.length;

        int[] aux = new int[n];
        aux = vetor;
        int produto = 1;
        ArrayList<Integer> arrayAux = new ArrayList<>();
        for(int i = 0; i < n; i++){
            produto = 1;
            for(int j = 0; j < n; j++ ){
                if (i == j  )
                {
                        continue;
                }
                else {
                    produto *= vetor[j];
                }

            }
            arrayAux.add(produto);
        }
        System.out.print(arrayAux);

    }
}
