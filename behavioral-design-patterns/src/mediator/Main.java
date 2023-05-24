package mediator;

import mediator.mediator.SimpleChatMediator;
import mediator.mediator.SimpleChatMediatorImpl;
import mediator.user.User;
import mediator.user.UserImpl;

public class Main {

    public static void main(String[] args) {
        SimpleChatMediator mediator = new SimpleChatMediatorImpl();
        User user1 = new UserImpl(mediator, "asf");
        User user2 = new UserImpl(mediator, "dfg");
        User user3 = new UserImpl(mediator, "hfg");
        User user4 = new UserImpl(mediator, "jgh");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("asfasf");

    }

}