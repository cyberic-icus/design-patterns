package state.state;

public class ConnectionClosedState implements State {

    @Override
    public void doAction() {
        System.out.println("Connection is closed!");
    }

}