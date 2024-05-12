package Mediator;

import java.util.ArrayList;
import java.util.List;

interface AirTrafficControl {
    void sendMessage(Airplane sender, String message);
    void registerAirplane(Airplane airplane);
}

class AirTrafficControlTower implements AirTrafficControl {
    private List<Airplane> airplanes = new ArrayList<>();

    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void sendMessage(Airplane sender, String message) {
        for (Airplane airplane : airplanes) {
            if (airplane != sender) {
                airplane.receiveMessage(message);
            }
        }
    }
}

class Airplane {
    private String name;
    private AirTrafficControl atc;

    public Airplane(String name, AirTrafficControl atc) {
        this.name = name;
        this.atc = atc;
        this.atc.registerAirplane(this);
    }

    public void sendMessage(String message) {
        atc.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}


