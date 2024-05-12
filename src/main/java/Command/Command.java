package Command;

import java.util.ArrayList;
import java.util.List;

// Command interface
public interface Command {
    void execute();
}

// Receiver
class OrderReceiver {
    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }
}

// Concrete Command
class PlaceOrderCommand implements Command {
    private OrderReceiver receiver;

    public PlaceOrderCommand(OrderReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.placeOrder();
    }
}

// Invoker
class User {
    private List<Command> commands = new ArrayList<>();

    public void takeOrder(Command command) {
        commands.add(command);
    }

    public void placeOrders() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}

