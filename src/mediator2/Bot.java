package mediator2;

public class Bot {
		
		private static Bot instance;

		private Bot() {
			// TODO Auto-generated constructor stub
		}
		
	public static Bot getInstance() {
			
			if(instance == null) {
				instance = new Bot();
			}
			
			return instance;
		}
		
		public void postMessage(String message) {
			System.out.println("Bot: " + message);

	}
			
		}



