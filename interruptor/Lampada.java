public class Lampada{
    private boolean acesa;
    private Bateria bateria;

    public Lampada() {
        bateria = new Bateria();
    }

    public void atualizarEstado(boolean ligado){

        acesa = ligado && bateria.temEnergia();

                if (acesa==true){
                    bateria.consumir();
                }
                else{
                    System.out.println("Sem energia ou interruptor desligado");
                }
}
}
