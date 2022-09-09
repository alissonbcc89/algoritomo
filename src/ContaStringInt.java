import java.util.ArrayList;

public class ContaStringInt {
    private int contador = 0;
    public static void funcao(String myString){
            char[] myChars = myString.toCharArray();
            String aux;
            ArrayList<String> array;
            array = new ArrayList<>();

            int contador = 0;

            for(int i=0; i < myChars.length; i++){
                aux = String.valueOf(myChars[i]);
                for(int j = 1; j < myChars.length; j++) {
                    if (aux == String.valueOf(myChars[j])) {
                        contador++;
                        aux = String.valueOf(myChars[i+1]);
                        break;
                    }
                    if (aux != String.valueOf(myChars[j])) {
                        array.add(aux);
                        if (contador > 1) {
                            array.add(String.valueOf(contador));
                        }
                        contador = 0;

                    }
                }



            }


            for (int i = 0; i < array.size(); i++){
                System.out.println(array.get(i));
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




