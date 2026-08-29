import java.util.ArrayList;
import java.util.List;

public class Interruptor {
    private List<Lampada> lampadasConectadas;
    private boolean ligado;

    public Interruptor(){
            lampadasConectadas = new ArrayList<>();
    }


    public void adicionarLampada (Lampada l){
        lampadasConectadas.add(l);
    }

    public void ligar(){
        ligado = true;
        notificarLampadas();
    }

    public void desligar(){
        ligado = false;
        notificarLampadas();
    }

    private void notificarLampadas(){
        for (Lampada l : lampadasConectadas) {
            l.atualizarEstado(ligado);
        }
    }
}