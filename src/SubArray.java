public class SubArray {

    public int somaSubArray(int[] vetor) {
        int n = vetor.length;
        int[] aux = new int[n];
        int soma = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i + 1].equals(vetor[i] + 1)) {
                soma = vetor[i] + vetor[i + 1];
            }
            if (i != 0 && soma != 0) {
                if (vetor[i + 1].equals(vetor[i] + 1)) {
                        soma += vetor[i+1];
                }
                else {
                    soma = 0;
                }
            }


        }
        return n;
    }
}