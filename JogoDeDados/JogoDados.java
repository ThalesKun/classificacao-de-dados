import java.util.ArrayList;

public class JogoDados {
    private static ArrayList<String> resultados = new ArrayList<>();
    private Resultado resultado;
    private Jogador jogador;
    private Dado dado1;
    private Dado dado2;

    public JogoDados(Jogador jogador, Dado dado1, Dado dado2){
        this.jogador = jogador;
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    public Resultado jogar(){

        dado1.rolar();
        dado2.rolar();

        if (dado1.getValorFace() + dado2.getValorFace() == 7){
            this.resultado = Resultado.GANHOU;
        }else{
            this.resultado = Resultado.PERDEU;
        }

        return this.resultado;
    }

    public static void gravarResultado(String resultado){
        resultados.add(resultado);  //.add()  =  adiciona ao vetor
    }
    public static String retornarResultados(){
       return resultados.toString();  //toString = printa o vetor de strings td
    }

}

