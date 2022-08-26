import java.lang.reflect.Array;
import java.util.ArrayList;

public class PesquisaTudo {

    //public boolean igual(){}

    public void buscar(String maior, String menor){

        char[] min = menor.toCharArray();
        char[] max = maior.toCharArray();

        ArrayList<String> array = new ArrayList<>();

        int tamanho = maior.length();
        int tmin = menor.length();
        String aux = "";
        int inicio;
        //int[] vetor = new int[2];
        ArrayList<Integer> vetor =  new ArrayList<>();

        for(int i = 0; i < tamanho ; i++) {
            if(max[i] == min[0]){
                inicio = i;
                aux += max[i];
                for(int j = inicio+1; j < tmin-1; j++){
                    for( int a = 1 ; a < tmin-1; a++){
                        if(max[j] == min[a]){
                            aux += max[j];
                            break;
                        }
                    }

                }

                if(aux.equals(min)) {

                        vetor.add(i);

                }
                else break;


            }

        }
        for(int m = 0; m < vetor.size(); m++){
            System.out.println(vetor.get(m));
        }

    }


}




