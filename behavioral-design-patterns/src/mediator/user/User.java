package mediator.user;

import mediator.mediator.SimpleChatMediator;

public abstract class User {
    protected SimpleChatMediator mediator;
    protected String name;

    public User(SimpleChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}