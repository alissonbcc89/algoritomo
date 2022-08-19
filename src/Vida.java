public class Vida {

    private boolean estado = false;





    public void irCrush(){}
    public void cursoCodificacao(){}
    public void assitirFilme(){}
    public void jogarDota(){}
    public void estudarExame(){}
    public void dormir(){ }

    public void executarTarefa(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a opcao desejada:\n1 -Ir Crush\n2 - Curso de Codificacao\n" +
                "3 -Assistir Filme\n4 -jogarDota\n" +
                "5 -estudarExame\n6 -dormir\n0 -Exit");
        int opcao = s.nextInt();

        switch (opcao){
            case 1:
                this.irCrush();
                break;
            case 2:
                this.cursoCodificacao();
            case 3:
                this.assitirFilme();
                break;
            case 4:
                this.jogarDota();
                break;
            case 5:
                this.estudarExame();
                break;
            case 6:
                this.dormir();
                break;

            case 0:


        }


    }

    public void viver(Pessoa p){

    }

}
