package mediator2;

public class MediatorMain {

	public static void main(String[] args) {
		
MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Dimitar");
		User user2 = new ChatUser(chat, "Petq");
		User user3 = new ChatUser(chat, "Plamen");
		
		user2.send("Hi, guys");
		user3.send("addBot");
		user3.send("Hi");
		user2.send("cat");
		user2.send("How are you?");
		user1.send("What are you doing?");
		
	}

}
