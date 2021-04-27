package mediator2;

public interface MessageMediator {
	
	void sendMessage(String message, User user);
	void addUser(User user);
	void addBot(Bot bot);

}
