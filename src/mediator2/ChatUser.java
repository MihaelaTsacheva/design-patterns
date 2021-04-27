package mediator2;

public class ChatUser extends User {
	
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}
	
	public void setMediator(MessageMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		
		if (this.mediator != null) {
			this.mediator.sendMessage(message, this);
			
		}
		
	}
	

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);
		
		
	}

}
