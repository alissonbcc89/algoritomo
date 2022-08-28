import java.lang.reflect.Array;
import java.util.ArrayList;

public class PesquisaTudo {

    //public boolean igual(){}

    public ArrayList<Integer> buscar(String frase, String palavra) {

        char[] min = palavra.toCharArray();
        char[] max = frase.toCharArray();

        ArrayList<String> array = new ArrayList<>();

        int tamanho = frase.length();
        int tmin = palavra.length();
        String aux = "";
        int inicio;
        //int[] vetor = new int[];
        ArrayList<Integer> vetor = new ArrayList<>();

        for(int i = 0; i < tamanho; i++) {
            if(max[i] == min[0]){
                inicio = i;
                aux = String.valueOf(max[i]);
                for(int j = 1; j<tmin; j++){
                    if(max[inicio+j] == min[j]){
                        aux += max[inicio+j];
                        if(aux == palavra){
                            vetor.add(inicio);
                        }
                    }
                    else{
                        inicio = 0;
                        break;
                    }
                }
            }
        }
        return vetor;
    }
}



