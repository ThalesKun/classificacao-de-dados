public class Vehicle {
    private int passengers;
    private float fuelCap;
    private float mpg;

    public Vehicle(int passengers, float fuelCap, float mpg){
        this.passengers = passengers; //this.passengers = atributo, passengers = parâmetro
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    public int getPassengers(){
        return this.passengers;
    }

    public void setPassengers(int passengers){
        this.passengers = passengers;
    }

    public float getFuelCap(){
        return this.fuelCap;
    }

    public void setFuelCap(float fuelCap){
        this.fuelCap = fuelCap;
    }

    public float getMpg(){
        return this.mpg;
    }

    public void setMpg(float mpg){
        this.mpg = mpg;
    }

    public String toString(){
        return "Número de passageiros: " + this.passengers + ", combustível: " + this.fuelCap + ", milhas por galão: " + this.mpg;
    }
}
