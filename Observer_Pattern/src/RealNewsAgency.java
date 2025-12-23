import java.util.ArrayList;
import java.util.List;

public class RealNewsAgency implements NewsAgency {

    private List<Subscriber> subscribers;
    private String latestNews;

    public RealNewsAgency() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}
