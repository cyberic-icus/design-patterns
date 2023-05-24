package observer;

import observer.listener.EventListener;

import java.io.File;
import java.util.*;

public class EventManager {
    private final Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        Arrays.stream(operations).toList().forEach(op -> this.listeners.put(op, new ArrayList<>()));
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, File file) {
        listeners.get(eventType).forEach(listener -> listener.update(eventType, file));
    }
}