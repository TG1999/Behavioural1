package Observer;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete subject
class StockMarket implements Subject {
    private List<Observer> observers;
    public double price;
    public String stockName;

    public StockMarket(String stockName, double price) {
        this.observers = new ArrayList<>();
        this.stockName = stockName;
        this.price = price;
    }

    public void priceChange(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer interface
interface Observer {
    void update();
}

// Concrete Observer
class StockTrader implements Observer {
    private String name;
    public Subject stockMarket;

    public StockTrader(String name, Subject stockMarket) {
        this.name = name;
        this.stockMarket = stockMarket;
        this.stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        String stockName = ((StockMarket) stockMarket).stockName;
        double price = ((StockMarket) stockMarket).price;
        System.out.println(name + " received update: " + stockName + " price is now " + price);
    }
}

