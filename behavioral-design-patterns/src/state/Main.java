package state;

import state.state.ConnectionClosedState;
import state.state.ConnectionEstablishedState;
import state.state.State;

public class Main {

    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        State closed = new ConnectionClosedState();
        State established = new ConnectionEstablishedState();

        connection.setState(closed);
        connection.doAction();

        connection.setState(established);
        connection.doAction();
    }

}