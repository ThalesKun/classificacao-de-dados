public class Truck extends Vehicle{
    private int cargoCap;

    public Truck(int passengers, float fuelCap, float mpg, int cargoCap){
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    public int getCargoCap(){
        return this.cargoCap;
    }
    public void setCargoCap(int cargoCap){
        this.cargoCap = cargoCap;
    }
   public String toString(){
        return super.toString() + ", carga: "+ this.cargoCap;
    }
}
