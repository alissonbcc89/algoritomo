import java.lang.reflect.Array;
import java.util.ArrayList;

public class PesquisaTudo {

    //public boolean igual(){}

    public void buscar(String frase, String palavra) {

       // System.out.print("Bem vindo ao caca palavra");

        char[] min = palavra.toCharArray();
        char[] max = frase.toCharArray();

        //System.out.print("\nA strings de entradas foram transformadas em char  para poder se trabalhar com estrutura de repeticao nela");

        ArrayList<String> array = new ArrayList<>();


        //System.out.print("\nArrayList de String criado acima");


        int tamanho = frase.length();
        int tmin = palavra.length();
        String aux = null;
        int inicio;
        //int[] vetor = new int[];
        ArrayList<Integer> vetor = new ArrayList<>();
        //System.out.print("\nCapturando tamanho da frase e palavra, criando variavel int inicio da posicao ");

        for (int i = 0; i < tamanho; i++) {
           // System.out.print("\nEntrando na iteracao de percorrer a frase"+ i + max[i]);
            if (max[i] == min[0]) {
             //   System.out.print("\nCondicao de igualdade entre primeira letra da palavra e texto");
                inicio = i;
            //    System.out.print("\nCondicao de atribuicao da posicao da primeira letra a uma variavel");
                aux = Character.toString(max[i]);
            //    System.out.print("\nAtribuiu a primeira letra a um vetor de caracter para comparacao final\t"+ aux);
                for (int j = 1; j < tmin; j++) {
              //      System.out.print("\nEntrou na estrutura de repeticao com intuito de fazer frase e palavra andarem em sincronia"+ j);
                    if (max[inicio + j] == min[j]) {
             //           System.out.print("\nSe a posicao consecutiva for igual ENTROU \n");
                        aux += Character.toString(max[inicio + j]);
                        //System.out.print(aux);
               //         System.out.println(aux.length());
              //          System.out.println(palavra.length());
                        //System.out.println(vetor.get(i));
                        //posso deifinir se max[]


                            //System.out.println(vetor);


                    }
                    if (aux.length() == palavra.length()){
                       vetor.add(i);
                        //System.out.println(vetor);
                        break;

                    }



                }
           }
        }


        System.out.println(vetor);

    }

}



