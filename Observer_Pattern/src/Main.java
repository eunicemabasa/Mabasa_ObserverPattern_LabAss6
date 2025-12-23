public class Main {
    public static void main(String[] args) {

        RealNewsAgency agency = new RealNewsAgency();

        Subscriber alice = new NewsSubscriber("Alice");
        Subscriber bob = new NewsSubscriber("Bob");
        Subscriber charlie = new NewsSubscriber("Charlie");

        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(charlie);

        agency.publishNews("Breaking: Major earthquake hits Japan!");

        agency.unsubscribe(bob);

        agency.publishNews("Update: Stock markets react to global events.");
    }
}
