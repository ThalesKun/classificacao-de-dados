public class Jogador {
    private String nome;

    public Jogador(String nome){
        this.nome = nome;

    }
    public Jogador(){
       this.nome = "desconhecido";
    }
    public String getNome(){
        return this.nome;
    }
}
