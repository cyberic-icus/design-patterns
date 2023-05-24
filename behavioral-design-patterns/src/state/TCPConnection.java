package state;

import state.state.State;

public class TCPConnection implements State {

    private State tvState;

    public State getState() {
        return this.tvState;
    }

    public void setState(State state) {
        this.tvState = state;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}