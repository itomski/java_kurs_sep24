package de.lubowiecki.basics.factory;

public class FactoryTest {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("VW", "Polo", Color.GREEN);
        Vehicle v2 = new Vehicle("VW", "Polo", Color.GREEN);
        Vehicle v3 = new Vehicle("VW", "Polo", Color.GREEN);
        Vehicle v4 = new Vehicle("VW", "Polo", Color.GREEN);

        Factory vwPoloFactory = new Factory("VW", "Polo");

        Vehicle v5 = vwPoloFactory.createRedVehicle();
        Vehicle v6 = vwPoloFactory.createRedVehicle();
        Vehicle v7 = vwPoloFactory.createRedVehicle();
        Vehicle v8 = vwPoloFactory.createRedVehicle();
        Vehicle v9 = vwPoloFactory.createRedVehicle();

        Factory fordKaFactory = new FordKaFactory();
        Vehicle v10 = fordKaFactory.createVehicle(Color.GREEN);
        System.out.println(v10);

    }
}
