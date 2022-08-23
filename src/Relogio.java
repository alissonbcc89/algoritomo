public class Relogio {

    public String hora(int numero){
        int minutos = 0;
        int horas = 0;

        if(numero > 60){
            horas = numero/60;
            minutos = numero - (60*horas);

        }
        String tempo = Integer.toString(horas) +":"+Integer.toString(minutos);
        return tempo;
    }

}
