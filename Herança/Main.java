public class Main {
    public static void main(String[] args) {

        Vehicle veiculo = new Vehicle(3, 50, 40);
        Truck caminhao = new Truck(veiculo.getPassengers(), veiculo.getFuelCap(), veiculo.getMpg(), 40);
        OffRoad estrada = new OffRoad(veiculo.getPassengers(), veiculo.getFuelCap(), veiculo.getMpg(), 0.30f);

        System.out.println(veiculo);
        System.out.println(caminhao);
        System.out.print(estrada);

    }
}