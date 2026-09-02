public class Dado {
    private int valorFace;

    public int getValorFace() {
        return valorFace;
    }
    public void rolar(){
        valorFace = (int)(Math.random() * 6) + 1;
    }
}
