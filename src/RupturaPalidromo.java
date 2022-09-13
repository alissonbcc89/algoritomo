public class RupturaPalidromo {


    private static String alfabeto = "abcdefghihklmnopqrstuwvxyz";

    public static void quebra(String palavra){

        char[] myChars = palavra.toCharArray();
        char[] alfa = alfabeto.toCharArray();

        if(palidromo(myChars) == true){
            for(int i = 0; i < myChars.length; i++){
                if(myChars[i] == alfa[i]){
                 if(i == 0)
                 {
                     myChars[i] = alfa[i+1];
                 }
                 if(i == myChars.length -1){
                    myChars[i] = alfa[i-1];
                 }
                 else {
                     myChars[i] = alfa[i+1];

                 }
                }
            }

        }

        String str = String.valueOf(myChars);

        System.out.print(str);
    }

    private static boolean palidromo(char[] mychar){
        boolean existe = false;
        String aux = String.valueOf(mychar);
        String str = "";
        int tam = mychar.length;

            for (int i = tam -1; i >= 0; i--) {
                str += String.valueOf(mychar[i]);
            }

            if(str == aux){
                existe = true;
            }

            return existe;

    }


    public static void main (String[]args){

        //  bbbaaaadexxxxxx
        //
        //        abc
        String palidromo = "aba";
        //String a = "abc";
        //Permutacoes.permuta(array);
        //ContaStringInt.funcao(a);

        RupturaPalidromo.quebra(palidromo);
    }

}
