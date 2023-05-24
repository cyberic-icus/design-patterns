package mediator.mediator;

import mediator.user.User;

import java.util.ArrayList;
import java.util.List;

public class SimpleChatMediatorImpl implements SimpleChatMediator {

    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        users.stream()
                .filter(user1 -> !user1.equals(user))
                .forEach(user1 -> user.receive(msg));
    }

}