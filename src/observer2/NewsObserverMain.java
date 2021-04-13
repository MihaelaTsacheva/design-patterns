package observer2;

public class NewsObserverMain {

	public static void main(String[] args) {
		
        News news = new News();
		
		NewsObserver obs1 = new NewsSubscriber("News subscriber 01");
		NewsObserver obs2 = new NewsSubscriber("News subscriber 02");
		NewsObserver obs3 = new NewsSubscriber("News subscriber 03");
		
		news.subscribe(obs1);
		news.subscribe(obs2);
		news.subscribe(obs3);
		
		news.setNews("Breaking news: Infected with Covid 19 are declining");
		news.setNews("Breaking news: Students return to school");



	}

}
