package ru.job4j.tracker;

public final class SingleTracker {

    private Tracker tracker = new Tracker();

    private static SingleTracker instanse = null;

    private SingleTracker() {

    }

    public static SingleTracker getInstanse() {
        if (instanse == null) {
            instanse = new SingleTracker();
        }
        return instanse;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String name) {
        return tracker.findByName(name);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}