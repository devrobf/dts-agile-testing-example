package mmu.coffeeshop;

import java.util.List;
import java.util.ArrayList;

public class Basket {

    private int totalPrice = 0;
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        totalPrice += item.getPrice();
        items.add(item);
    }

    public void clear() {
        items.clear();
    }

    public Item removeItem(int index) {
        Item removedItem = items.remove(index);
        totalPrice -= removedItem.getPrice();
        return removedItem;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}