import java.util.ArrayList;

public class ContaStringInt {
    private int contador = 0;
    public static void funcao(String myString){
            char[] myChars = myString.toCharArray();
            String aux;
            private ArrayList<Char> array;
        array = new ArrayList<>();

        int contador = 0;
            for (int i=0; i<myChars.length; i++){
                aux = String.valueOf(myChars[i]);
                contador ++;
                if(aux == String.valueOf(myChars[i+1]) ){
                    contador++;

                }
                else {
                    array.add(myChars[i]);
                    if(contador > 1)
                        array.add((char) contador);
                    System.out.print(aux + myChars[i]);
                    aux = "";
                    contador = 0;
                }
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




