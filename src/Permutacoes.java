public class Permutacoes {

    //numero da permutacao atual
    private static int cont=0;

    //armazena a permutacao corrente
    private static int[] p;


    /**
     * metodo principal: recebe o vetor cujos elementos que serao permutados
     * @param vet
     */
    public static void permuta(int[] vet) {

        p = new int[vet.length];
        permuta(vet,0);
    }


    /**
     * método recursivo que implementa as permutacoes
     * @param vet
     * @param n
     */
    private static void permuta(int[]vet, int n) {

        if (n==vet.length) {
            cont++;
            imprime();

        } else {

            for (int i=0; i < vet.length; i++) {

                boolean achou = false;

                for (int j = 0; j < n; j++) {

                    if (p[j]==vet[i]) achou = true;
                }

                if (!achou) {

                    p[n] = vet[i];
                    permuta(vet,n+1);
                }

            } //--for

        } //--if/else

    } //--permuta


    /** imprime a permutacao corrente */
    private static void imprime() {

        System.out.println();
        System.out.print("(" + cont + ") : ");
        for (int i=0; i < p.length; i++) System.out.print(p[i] + " ");

    } //--imprime


    /** metodo principal para teste da classe */
    public static void main(String[] args) {

        int[] array = new int[]{ 10,11,20,30,3 };
        Permutacoes.permuta(array);
    }

}