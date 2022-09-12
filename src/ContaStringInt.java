import java.util.ArrayList;

public class ContaStringInt {
    private static int contador = 1;
    private static ArrayList<String> array = new ArrayList<>();

    public static void funcao(String myString) {
        char[] myChars = myString.toCharArray();
        String aux;




        for (int i = 0; i < myChars.length; i++) {

                funcao(myString,i);
        }

        for(int a = 0; a < array.size(); a++){
            System.out.print(array.get(a));
        }




    }

    public static void funcao(String palavra, int i){
        char[] myChars = palavra.toCharArray();

        int aux = i;

        while (aux == i){
            if(i+1 < myChars.length && myChars[i] == myChars[i+1]){
                contador++;

            }
            else {
                array.add(String.valueOf(myChars[i]));
                array.add(String.valueOf(contador));
                contador = 1;
            }
            aux++;
        }




    }

    public static void main (String[]args){

        //  bbbaaaadexxxxxx
        //
        //        abc

        String a = "bbbaaaadexxxxxx";
        //Permutacoes.permuta(array);
        ContaStringInt.funcao(a);
    }
}



