import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConcatenaInteiros {


    private static int cont=0;
    String palavra;
    private static int[] p;
    public int permuta(int[] num) {

        p = new int[num.length];

       for(int i = 0; i < num.length;i++){
           String palavranumerica = "";
            for(int j = 0; j< num.length; j++){
                if( i == j){

                    //atribui  o conjunto de inteiros a uma unica variavel string
                    for(int a = 0; a< num.length; a++){ palavranumerica += num[a];}

                    //transforma a palavra em inteiro
                    int a = Integer.parseInt(palavranumerica);

                    //adc ao repositorio
                    p[cont] =  a;
                    palavranumerica +="";
                    cont ++;

                    //para a interacao e faz com que o j seja maior que o i
                    break;
                }//troca voltando
                if(i>=1){
                    int aux = num[j];
                    num[j] = num[i];
                    num[i] = aux;

                    for(int a = 0; a < num.length; a++){
                        palavranumerica += num[a];
                    }
                    int a = Integer.parseInt(palavranumerica);
                    p[cont] = a;
                    cont++;
                    break;
                }
                else{

                    int aux = num[j];
                    num[j] = num[j+1];
                    num[j+1] = aux;

                    for(int a = 0; a< num.length; a++){ palavranumerica += num[a];}

                    int a = Integer.parseInt(palavranumerica);

                    //adc ao repositorio
                    p[i] =  a;
                    palavranumerica +="";
                    //para a interacao e faz com que o j seja maior que o i
                    break;


                }

            }
       }
            return imprime();

    }
    private static int imprime() {


        return maiorAbs(p);


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



}
