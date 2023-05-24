package mediator.user;

import mediator.mediator.SimpleChatMediator;

public class UserImpl extends User {

    public UserImpl(SimpleChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ":" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ":" + msg);
    }

}