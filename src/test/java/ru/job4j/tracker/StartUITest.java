package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    public void whenAddBugItem() {
        String[] answers = {"bugs"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("bugs");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "edited item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    public void whenDeliteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new");
        Item testitem = new Item("testitem");
        tracker.add(item);
        tracker.add(testitem);
        String[] answers = {
                String.valueOf(testitem.getId()),
        };
        StartUI.deliteItem(new StubInput(answers), tracker);
        Item delited = tracker.findById(testitem.getId());
        assertThat(delited).isNull();

    }

    @Test
    public void whenEditItemSecond() {
        Tracker tracker = new Tracker();
        Item item = new Item("new");
        Item seconditem = new Item("second");
        tracker.add(item);
        tracker.add(seconditem);
        String[] answers = {
                String.valueOf(seconditem.getId()), "new item second"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item editted = tracker.findById(seconditem.getId());
        assertThat(editted.getName()).isEqualTo("new item second");
    }
}