package Observer;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("GOOG", 1500.00);
        StockTrader trader1 = new StockTrader("John", stockMarket);
        StockTrader trader2 = new StockTrader("Alice", stockMarket);

        // Register observers
        stockMarket.registerObserver(trader1);
        stockMarket.registerObserver(trader2);

        // Update stock price
        stockMarket.priceChange(1520.50);

        // Remove one observer
        stockMarket.removeObserver(trader2);

        // Update stock price again
        stockMarket.priceChange(1540.25);
    }
}
