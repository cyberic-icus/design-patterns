package state.state;

public class ConnectionEstablishedState implements State {

    @Override
    public void doAction() {
        System.out.println("PING PONG");
    }

}