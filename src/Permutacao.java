import java.util.ArrayList;

public class Permutacao {
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

            for (int i = 0; i < vet.length; i++) {

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
        for (int i=0; i < p.length; i++) {System.out.print(p[i]);}

        System.out.print(p[0]);
       // System.out.println(maiorAbs(p));

      //System.out.println(maiorAbs(p));

    } //--imprime

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


    /** metodo principal para teste da classe */
    public static void main(String[] args) {

        int[] array = new int[]{ 10,11,20,30,3 };
        //char v[] = {'A','B','C', 'D'};
        Permutacao.permuta(array);
    }


 /*   public void ordenaV(int[] num){
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

    }*/

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





}
