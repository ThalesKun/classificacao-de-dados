public class OffRoad extends Vehicle{
    private float groundClearance;

    public OffRoad(int passengers, float fuelCap, float mpg, float groundClearence){
        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearence;
    }

    public float getGroundClearance(){
        return this.groundClearance;
    }
    public void setGroundClearance(float groundClearance){
        this.groundClearance = groundClearance;
    }
    public String toString(){
        return super.toString() + ", distância entre o veiculo e o solo: "+ this.groundClearance;
    }

}
