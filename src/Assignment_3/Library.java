package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            item.displayInfo();  // better than just item.toString()
        }
    }
}
