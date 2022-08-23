import java.util.ArrayList;
import java.util.Scanner;

public class Vida {

    public int viver(int[] array){
        int qnt = 0;
        int n = array.length;
        int hi,hf;
        int valorMaximo = 0;

        ArrayList<Integer> vetor = new ArrayList<>();


        for(int i = 0; i < n; i+=2){

            hi = array[i];
            hf =  array[i+1];
            if(i == 0) {
                if (hi < hf) {
                    qnt += 1;
                    continue;
                }
            }
            if(i > 0){
                if(array[i-1] < hf && hf <=11 || hf == 0){
                    qnt+= 1;
                }
                if(array[i-1] > hf){
                    vetor.add(qnt);
                    qnt = 1;
                }
            }

        }

        for(int i = 0; i < vetor.size(); i++){
            if(vetor.get(i) > valorMaximo)
            {
                valorMaximo = vetor.get(i);
            }
        }

        return valorMaximo;
    }



}
