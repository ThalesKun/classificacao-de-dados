public class Main{
    public static void main(String[] args){
        Lampada l = new Lampada();
        Interruptor i = new Interruptor();

        i.adicionarLampada(l);
        i.ligar();
        i.desligar();
    }
}
