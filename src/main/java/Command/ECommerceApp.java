package Command;

// Client
public class ECommerceApp {
    public static void main(String[] args) {
        OrderReceiver receiver = new OrderReceiver();
        PlaceOrderCommand placeOrderCommand = new PlaceOrderCommand(receiver);

        User user = new User();
        user.takeOrder(placeOrderCommand);

        // User places all orders
        user.placeOrders();
    }
}
