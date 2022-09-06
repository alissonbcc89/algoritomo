import java.util.ArrayList;

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
    public static ArrayList<Integer> concatena(int[] array){
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        String aux = "";
            for(int i =0; i < array.length;i++){
                aux+= array[i];
            }
            int i = Integer.parseInt(aux);
            vetor.add(i);
            return vetor;

    }
    public static int maiorAbs(ArrayList<Integer> arr){

        // Create maxValue variable and initialize with 0
        int maxValue = 0;

        for(int i = 0; i < arr.size(); i++){

        }

        // Check maximum element using for loop
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxValue)
                maxValue = arr.get(i);
        }
        return maxValue;
    }




    /** imprime a permutacao corrente */
    private static void imprime() {

       // System.out.println();
        //System.out.print("(" + cont + ") : ");
        //for (int i=0; i < p.length; i++) {System.out.print(p[i] );}

        System.out.println(maiorAbs(concatena(p)));
       // System.out.println(p.length);


       // System.out.println(maiorAbs(p));

    } //--imprime


    /** metodo principal para teste da classe */
    public static void main(String[] args) {

        int[] array = new int[]{ 10,11,20,30,3 };
        Permutacoes.permuta(array);
    }

}