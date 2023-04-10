package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                rsl[count] = item;
                count++;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl2 = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                rsl2[count] = item;
                count++;
            }
        }
        rsl2 = Arrays.copyOf(rsl2, count);
        return rsl2;
    }

    public boolean replace(int id, Item item) {
        int temp = indexOf(id);
        if (temp != -1) {
            item.setId(id);
            items[temp] = item;
            return true;
        }
        return false;
    }
}