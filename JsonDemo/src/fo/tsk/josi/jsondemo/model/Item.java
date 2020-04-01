package fo.tsk.josi.jsondemo.model;

public class Item {
    private String name;
    private ItemType itemType;

    public static Item Item(String name, ItemType itemType) {
        Item i = new Item();
        i.setName(name);
        i.setItemType(itemType);
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
