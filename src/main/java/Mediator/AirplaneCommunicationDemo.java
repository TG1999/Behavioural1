package Mediator;

public class AirplaneCommunicationDemo {
    public static void main(String[] args) {
        AirTrafficControlTower atc = new AirTrafficControlTower();

        Airplane airplane1 = new Airplane("Flight 1", atc);
        Airplane airplane2 = new Airplane("Flight 2", atc);
        Airplane airplane3 = new Airplane("Flight 3", atc);

        airplane1.sendMessage("Traffic alert: Please adjust altitude.");
        airplane2.sendMessage("Roger, adjusting altitude.");
        airplane3.sendMessage("Roger, adjusting altitude.");
    }
}
