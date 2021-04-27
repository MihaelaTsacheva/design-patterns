package mediator2;

public abstract class User {
	
	protected MessageMediator mediator;
	protected String name;
	
	public User(MessageMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);
	
	public abstract void setMediator(MessageMediator mediator);

}
