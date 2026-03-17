class Event {
    String eventName;
    int participants;
    boolean hasCustomName;

    public Event() {
        eventName = "General Assembly";
        participants = 50;
        hasCustomName = false;
    }

    public Event(String eventName) {
        this.eventName = eventName;
        participants = 50;
        hasCustomName = true;
    }

    public Event(String eventName, int participants) {
        this.eventName = eventName;
        this.participants = participants;
        hasCustomName = true;
    }

    public void displayEventDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Participants: " + participants);
    }
}

public class Main_Event {
    public static void main(String[] args) {
        Event event1 = new Event();
        Event event2 = new Event("Tech Conference");
        Event event3 = new Event("Charity Run", 300);

        event1.displayEventDetails();
        event2.displayEventDetails();
        event3.displayEventDetails();
    }
}
