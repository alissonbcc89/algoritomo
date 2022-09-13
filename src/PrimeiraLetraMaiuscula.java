public class PrimeiraLetraMaiuscula {

    public static void altera(String palavra){
        char[] aux = palavra.toCharArray();
        String str = "";
        String str1 = "" ;

        for(int i = 0; i < aux.length; i++){
            if(i == 0){
                str += String.valueOf(aux[i]).toUpperCase();
               str1 += str;

            }
            else
            {
                str+= String.valueOf(aux[i]).toLowerCase();
                str1 += str;


            }
        }


        System.out.print(str);


    }

    public static void main(String[] args) {


        String aux = "ISSO É MUITO DIVERTIDO!";

        PrimeiraLetraMaiuscula.altera(aux);
    }



}
