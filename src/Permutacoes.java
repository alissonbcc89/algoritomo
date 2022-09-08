import java.util.ArrayList;

public class Permutacoes {

    //numero da permutacao atual
    private static int cont=0;

    //armazena a permutacao corrente
    private static int[] p;

    private static ArrayList<Integer> array;


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
    private static void permuta(int []vet, int n) {

        if (n==vet.length) {
            //concatena(p);
            cont++;
            imprime();

        } else {

            for (int i=0; i < vet.length; i++) {

                boolean achou = false;

                for (int j = 0; j < n; j++) {

                    if (p[j]==vet[i]) achou = true;
                }

                if (!achou) {

                    p[n] =  vet[i];
                    permuta(vet,n+1);
                }

            } //--for

        } //--if/else

    } //--permuta


    /** imprime a permutacao corrente */
    private static void imprime() {

        System.out.println();
        System.out.println(p.length);
        //System.out.print("(" + cont + ") : ");

      //  for (int i=0; i < p.length; i++) System.out.print( + " ");
       // System.out.print(p[0]);
    } //--imprime

    private static void concatena(){
        for(int j = 0; j < p.length; j++){
            array.add(p[j]);
        }

        String concat = "";

        int tam =
        for(int i = 0; i < vet.length; i++){
            concat+= vet[i];
        }
        int i = Integer.parseInt(concat);
        array.add(i);

    }

    private static int maior(ArrayList<Integer> array){
        int max = 0;
        for(int i = 0; i < array.size(); i++){
            if(max > array.get(i)){
                max = array.get(i);
            }
        }
        return max;

    }




    /** metodo principal para teste da classe */
    public static void main(String[] args) {

        int[] array = new int[]{ 10,11,20,30,3 };
        Permutacoes.permuta(array);
    }

}