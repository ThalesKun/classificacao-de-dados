public class Bateria{
    private int carga;

    public Bateria(){
        carga = 1;
    }
public boolean temEnergia(){
    if (carga <= 0){
        System.out.println("Sem energia");
        return false;
    }
    else{
        System.out.println("Temos energia ainda");
        return true;
    }
}
public void consumir(){
    carga--;
}
}