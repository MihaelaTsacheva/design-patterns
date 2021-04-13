package observer2;

import java.util.ArrayList;
import java.util.List;

public class News implements SubjectObservable {

	private List<NewsObserver> subscribers;
	private String news;
	
	public News() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(NewsObserver newsobserver) {
		this.subscribers.add(newsobserver);
		newsobserver.setNews(this);

	}

	@Override
	public void unsubscribe(NewsObserver newsobserver) {
		this.subscribers.remove(newsobserver);
		
		

	}

	@Override
	public void notifyNewsObservers() {
		for(NewsObserver newsobserver: this.subscribers) {
			newsobserver.create();
		}

	}

	@Override
	public String getCreate() {
		return this.news;
	}

	public void setNews(String news) {
		this.news = news;
		this.notifyNewsObservers();
	}
}
