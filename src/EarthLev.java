public class EarthLev {

    public static int earthLev(int num){
        int n = num / 2;
        int retorno = 0;

        if(num%2 == 0){
            retorno = n;
        }
        if(num<2){
            retorno = 1;
        }
        else {
             retorno = n+1;
            }

        return retorno;
    }



    public static void main(String[] args) {

      System.out.println(EarthLev.earthLev(5));
    }
}
