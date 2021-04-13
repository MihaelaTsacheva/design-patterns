package observer2;

public class NewsSubscriber implements NewsObserver {

	private String name;
	private SubjectObservable subscribedTo;

	public NewsSubscriber(String name) {
		this.name = name;
		
	}

	@Override
	public void create() {
		
		if(this.subscribedTo == null) {
			System.out.println(this.getName() + " has no news set ");
			return;
		}
		
		String newNews = this.subscribedTo.getCreate();
		System.out.println(this.getName() + " created: " + newNews);

	}

	@Override
	public void setNews(SubjectObservable news) {
		this.subscribedTo = news;
		
	}
	
	public String getName() {
		return name;
	}

}
