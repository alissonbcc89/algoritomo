import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConcatenaInteiros {
    private static int cont=0;

    public  ArrayList<Integer> p;
    public int permuta(int[] num) {



       for(int i = 0; i < num.length;i++){
           String palavranumerica = "";
            for(int j = 0; j< num.length; j++){
                if( i == j){

                    //atribui  o conjunto de inteiros a uma unica variavel string
                    for(int a = 0; a< num.length; a++){ palavranumerica += num[a];}

                    //transforma a palavra em inteiro
                    int a = Integer.parseInt(palavranumerica);

                    //adc ao repositorio
                    p.set(cont,a);
                    palavranumerica ="";
                    cont ++;
                    //System.out.println(cont+":\t" + palavranumerica);

                    //para a interacao e faz com que o j seja maior que o i
                    break;
                }//troca voltando
                if(i != j){
                    int aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;

                    for(int a = 0; a < num.length; a++){
                        palavranumerica += num[a];
                    }
                    int a = Integer.parseInt(palavranumerica);
                    p.set(cont, a);
                    palavranumerica = "";
                    cont++;
                   // System.out.println(cont+":\t" + palavranumerica);

                }
                else{

                    int aux = num[j];
                    num[j] = num[j+1];
                    num[j+1] = aux;

                    for(int a = 0; a< num.length; a++){ palavranumerica += num[a];}

                    int a = Integer.parseInt(palavranumerica);

                    //adc ao repositorio
                    p.set(cont, a);
                    palavranumerica +="";
                    //para a interacao e faz com que o j eja maior que o i
                    //                    break;s


                }

            }
       }
            return imprime();

    }
    public int imprime() {


        return maiorAbs(p);


    } //--imprime



    public int maiorAbs(ArrayList<Integer> arr){

        // Create maxValue variable and initialize with 0
        int maxValue = 0;

        // Check maximum element using for loop
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxValue)
                maxValue = arr.get(i);
        }
        return maxValue;
    }



}
