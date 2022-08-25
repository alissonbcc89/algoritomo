import java.util.ArrayList;

public class PesquisaTudo {

    public boolean igual(){}

    public void buscar(String maior, String menor){

        char[] min = menor.toCharArray();
        char[] max = maior.toCharArray();

        ArrayList<String> array = new ArrayList<>();

        int tamanho = maior.length();
        int tmin = menor.length();
        String aux;


        for(int i = 0; i < tamanho ; i++) {
            for (int j = 0; j < tmin; j++) {
                if (min[j] == max[i]){
                    aux += max[i];
                    break;
                }
                else {
                    aux = null;
                    break;
                }
                        //guarda posicao inicial pois ela retorna no verto caso verificado que
                        // as palavras sao iguais
                        array.add(i);

                    }
                    else break;
                }

        }
    }

}

