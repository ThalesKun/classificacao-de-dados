import java.util.Scanner;

public class Main{
    public static void main(String[] args){


        Jogador jogador = new Jogador();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        JogoDados jogoDados = new JogoDados(jogador, dado1, dado2);

        System.out.println("Digite quantas vezes você quer jogar:");
        Scanner scanner = new Scanner(System.in);
        int vezes = scanner.nextInt();
        int ganhou =0;
        int perdeu =0;

        System.out.println("\n");

        for (int i = 0; i < vezes; i++){
            Resultado resultado = jogoDados.jogar();
            System.out.println(resultado);

            if (resultado == Resultado.GANHOU){
                ganhou++;
            }else{
                perdeu++;
            }
        }

        System.out.println("\nVocê ganhou: "+ ganhou + "x");
        System.out.println("Você perdeu: "+ perdeu + "x");



    }
}
