package mediator2;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		try {
			if (message == "addBot"){
	        	   Bot.getInstance();
	        	   System.out.println("Bot is add to chat");
				
				}
	           
	           else if (message == "cat") {
	        	   
	        	   Bot.getInstance().postMessage(user.name + " is removed from the chat");
	        	   Bot.getInstance().postMessage("Cat is not a allowed word");
	        	   
	        	   users.remove(user);
	        	   user.setMediator(null);
	        	  
	           }
			
			
		
			for(User chatUser: this.users) {
			// Skip the one who sends the message
			
				
	           
	            if(chatUser != user) {
				chatUser.receive(message);
	           }
				}
			
		}
		catch(Exception e)
  	   
    	   {
    		   Bot.getInstance().postMessage(user.name + " is removed from the chat");
    	   }
				
		   
	           }
		

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	

	
	@Override
	public void addBot (Bot bot) {
			
		}

	}
