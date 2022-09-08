import java.util.ArrayList;

public class ContaStringInt {
    private int contador = 0;
    public static void funcao(String myString){
            char[] myChars = myString.toCharArray();
            String aux;
            ArrayList<String> array;
            array = new ArrayList<>();

            int contador = 1;

            for (int i=0; i < myChars.length; i++){
                aux = String.valueOf(myChars[i]);
                for(int j = 1; j < myChars.length; j++) {
                    if ((aux == String.valueOf(myChars[j]))) {
                        contador++;

                    } else {
                        array.add(aux);
                        array.add(String.valueOf(contador));
                        contador = 0;
                        aux = "";
                    }
                }
            }

            for(int j = 0; j < array.size(); j++){
                System.out.print(j);
            }


        }

    public static void main(String[] args) {

      //  bbbaaaadexxxxxx
        //
        //        abc

        String a = "bbbaaaadexxxxxx";
        //Permutacoes.permuta(array);
        ContaStringInt.funcao(a);
    }
    }




