package observer2;

public interface SubjectObservable {
	
	void subscribe(NewsObserver newsobserver);
	void unsubscribe(NewsObserver newsobserver);
	void notifyNewsObservers();
	
	String getCreate();

}
