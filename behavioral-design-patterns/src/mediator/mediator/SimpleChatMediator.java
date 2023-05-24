package mediator.mediator;

import mediator.user.User;

public interface SimpleChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}