package fo.tsk.josi.jsondemo.model;

import java.util.ArrayList;

public class Note {
    private ArrayList<Item> items;

    public Note() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem(Integer index) {
        return items.get(index);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
